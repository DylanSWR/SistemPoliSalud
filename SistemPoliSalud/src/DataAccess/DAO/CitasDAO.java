package DataAccess.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DTO.CitasDTO;

public class CitasDAO extends SQLiteDataHelper implements IDAO<CitasDTO>{
    private Connection connection;

    public CitasDAO(Connection connection) {
        this.connection = connection;
    }
    @Override
    public CitasDTO readby(Integer id) throws Exception {
        CitasDTO oC = new CitasDTO();
        String query = "SELECT IdCita"
                        +"IdPaciente"
                        +"IdDisponibilidad"
                        +"Fecha"
                        +"FechaCreacion"
                        +"FechaModificacion"
                        +"IdMedico"
                        +"WHERE activo = '1' AND IdCita = " + id.toString();
        try {
            Connection conn = openConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                oC = new CitasDTO(rs.getInt(1)
                                , rs.getInt(2)
                                , rs.getInt(3)
                                , rs.getString(4)
                                , rs.getString(5)
                                , rs.getString(6)
                                , rs.getInt(7)
                                , rs.getBoolean(8));
            }
        } catch (SQLException e) {
            throw e;
        }
        return oC;
    }

    @Override
    public boolean create(CitasDTO oC) throws Exception {
        String query = "INSERT INTO Citas (IdPaciente, IdDisponibilidad, Fecha, FechaCreacion, FechaModificacion, IdMedico, Activo) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, oC.getIdPaciente());
            stmt.setInt(2, oC.getIdDisponibilidad());
            stmt.setString(3, oC.getFecha());
            stmt.setString(4, oC.getFechaCreacion());
            stmt.setString(5, oC.getFechaModificacion());
            stmt.setInt(6, oC.getIdMedico());
            stmt.setBoolean(7, oC.getActivo());
            stmt.executeUpdate();
        }
        return false;
    }

    @Override
    public boolean update(CitasDTO oC) throws Exception {
        String query = "UPDATE Citas SET IdPaciente = ?, IdDisponibilidad = ?, Fecha = ?, FechaModificacion = ?, IdMedico = ?, Activo = ? WHERE IdCita = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, oC.getIdPaciente());
            stmt.setInt(2, oC.getIdDisponibilidad());
            stmt.setString(3, oC.getFecha());
            stmt.setString(4, oC.getFechaModificacion());
            stmt.setInt(5, oC.getIdMedico());
            stmt.setBoolean(6, oC.getActivo());
            stmt.setInt(7, oC.getIdCita());
            stmt.executeUpdate();
            }
        return false;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
    String query = " UPDATE Citas SET Estado = ? WHERE IdSexo = ?";
    try {
        Connection          conn = openConnection();
        PreparedStatement  pstmt = conn.prepareStatement(query);
        pstmt.setBoolean(id, false);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
        return true;
    } 
    catch (SQLException e) {
        throw e;
    }
}

    @Override
    public List<CitasDTO> readAll() throws Exception {
        List<CitasDTO> lista = new ArrayList<>();
        String query = "SELECT * FROM Citas";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                CitasDTO oC = new CitasDTO(
                        rs.getInt("IdCita"),
                        rs.getInt("IdPaciente"),
                        rs.getInt("IdDisponibilidad"),
                        rs.getString("Fecha"),
                        rs.getString("FechaCreacion"),
                        rs.getString("FechaModificacion"),
                        rs.getInt("IdMedico"),
                        rs.getBoolean("Activo")
                );
                lista.add(oC);
            }
        }
        return lista;
    }


}

