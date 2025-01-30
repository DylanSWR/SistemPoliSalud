import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import DTO.HorariosDTO;

public class HorariosDAO extends SQLiteDataHelper implements IDAO<HorariosDTO> {
    private Connection connection;

    public HorariosDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public HorariosDTO readBy(Integer id) throws Exception {
        HorariosDTO oH = new HorariosDTO();
        String query = "SELECT IdHorario"
                + "HoraInicio"
                + "HoraFin"
                + "FechaCreacion"
                + "FechaModificacion"
                + "Estado"
                + "WHERE Estado = '1' AND IdHorario = " + id.toString();
        try {
            Connection conn = openConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                oH = new HorariosDTO(rs.getInt(1)
                        , rs.getString(2)
                        , rs.getString(3)
                        , rs.getString(4)
                        , rs.getString(5)
                        , rs.getBoolean(6));
            }
        } catch (SQLException e) {
            throw e;
        }
        return oH;
    }

    @Override
    public boolean create(HorariosDTO oH) throws SQLException {
        String query = "INSERT INTO Horarios (HoraInicio, HoraFin, FechaCreacion, FechaModificacion, Estado) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, oH.getHoraInicio());
            stmt.setString(2, oH.getHoraFin());
            stmt.setString(3, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            stmt.setString(4, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            stmt.setBoolean(5, true);
            stmt.executeUpdate();
        }
        return false;
    }

    @Override
    public List<HorariosDTO> readAll() throws SQLException {
        List<HorariosDTO> lista = new ArrayList<>();
        String query = "SELECT * FROM Horarios";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                HorariosDTO horario = new HorariosDTO(rs.getInt(1)
                        , rs.getString(2)
                        , rs.getString(3)
                        , rs.getString(4)
                        , rs.getString(5)
                        , rs.getBoolean(6));
                lista.add(horario);
            }
        }
        return lista;
    }

    @Override
    public boolean update(HorariosDTO oH) throws SQLException {
        String query = "UPDATE Horarios SET HoraInicio = ?, HoraFin = ?, Fecha
        Modificacion = ?, Estado = ? WHERE IdHorario = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, oH.getHoraInicio());
            stmt.setString(2, oH.getHoraFin());
            stmt.setString(3, LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            stmt.setBoolean(4, oH.isEstado());
            stmt.setInt(5, oH.getIdHorario());
            stmt.executeUpdate();
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) throws SQLException {
        String query = "UPDATE Horarios SET Estado = ? WHERE IdHorario = ?";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setBoolean(1, false);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

}