import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DTO.DisponibilidadDTO;
public class DisponibilidadDAO extends SQLiteDataHelper implements IDAO<DisponibilidadDTO> {
       private Connection connection;

    public DisponibilidadDAO(Connection connection) {
        this.connection = connection;
    }
     @Override
    public DisponibilidadDTO readBy(Integer id) throws Exception {
        DisponibilidadDTO oD = new DisponibilidadDTO();
        String query =" SELECT IdDisponibilidad" 
                     +"IdHorario" 
                     +"IdMedico"
                     +"FechaCreacion"
                     +"FechaModificacion" 
                     +" WHERE   Estado ='A' AND IdSexo =   " + id.toString() ;
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                oD = new DisponibilidadDTO(rs.getInt(1)           // IdSexo
                                ,rs.getInt(2)        // Nombre             
                                ,rs.getInt(3)        // Estado         
                                ,rs.getString(4)        // FechaCrea      
                                ,rs.getString(5)
                                ,rs.getBoolean(6));     // FechaModifica
            }
        } 
        catch (SQLException e) {
            throw e; 
        }
        return oD;
    }
@Override
    public boolean create(DisponibilidadDTO disponibilidad) throws SQLException {
        String query = "INSERT INTO Disponibilidad (IdHorario, IdMedico, FechaCreacion, FechaModificacion, Activo) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, disponibilidad.getIdHorario());
            stmt.setInt(2, disponibilidad.getIdMedico());
            stmt.setString(3, disponibilidad.getFechaCreacion());
            stmt.setString(4, disponibilidad.getFechaModificacion());
            stmt.setBoolean(5, disponibilidad.getActivo());
            stmt.executeUpdate();
        }
                return false;
    }
@Override
    public List<DisponibilidadDTO> readAll() throws SQLException {
        List<DisponibilidadDTO> lista = new ArrayList<>();
        String query = "SELECT * FROM Disponibilidad";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                DisponibilidadDTO disponibilidad = new DisponibilidadDTO(
                        rs.getInt("IdDisponibilidad"),
                        rs.getInt("IdHorario"),
                        rs.getInt("IdMedico"),
                        rs.getString("FechaCreacion"),
                        rs.getString("FechaModificacion"),
                        rs.getBoolean("Activo")
                );
                lista.add(disponibilidad);
            }
        }
        return lista;
    }
@Override
    public boolean update(DisponibilidadDTO disponibilidad) throws SQLException {
        String query = "UPDATE Disponibilidad SET IdHorario = ?, IdMedico = ?, FechaModificacion = ?, Activo = ? WHERE IdDisponibilidad = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, disponibilidad.getIdHorario());
            stmt.setInt(2, disponibilidad.getIdMedico());
            stmt.setString(3, disponibilidad.getFechaModificacion());
            stmt.setBoolean(4, disponibilidad.getActivo());
            stmt.setInt(5, disponibilidad.getIdDisponibilidad());
            stmt.executeUpdate();
        }
                return false;
    }
@Override
public boolean delete(Integer id) throws Exception {
    String query = " UPDATE Disponibilidad SET Estado = ? WHERE IdSexo = ?";
    try {
        Connection          conn = openConnection();
        PreparedStatement  pstmt = conn.prepareStatement(query);
        pstmt.setString(1, "X");
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
        return true;
    } 
    catch (SQLException e) {
        throw e;
    }
}
}
