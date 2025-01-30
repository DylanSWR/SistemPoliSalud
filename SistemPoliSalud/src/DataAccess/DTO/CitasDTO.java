package DTO;

public class CitasDTO {
    private Integer idCita;
    private Integer idPaciente;
    private Integer idDisponibilidad;
    private String fecha;;
    private String fechaCreacion;
    private String fechaModificacion;
    private Integer idMedico;
    private Boolean activo;

    public CitasDTO() {}    

    public CitasDTO(Integer idPaciente, Integer idDisponibilidad, Integer idMedico) {
        this.idPaciente = idPaciente;
        this.idDisponibilidad = idDisponibilidad;
        this.idMedico = idMedico;
    }

    public CitasDTO(Integer idCita, Integer idPaciente, Integer idDisponibilidad, String fecha, String fechaCreacion, String fechaModificacion, Integer idMedico, Boolean activo) {
        this.idCita = idCita;
        this.idPaciente = idPaciente;
        this.idDisponibilidad = idDisponibilidad;
        this.fecha = fecha;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.idMedico = idMedico;
        this.activo = activo;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdDisponibilidad() {
        return idDisponibilidad;
        }

    public void setIdDisponibilidad(Integer idDisponibilidad) {
        this.idDisponibilidad = idDisponibilidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
            this.fecha = fecha;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
     }
            
    public void setFechaCreacion(String fechaCreacion) {
            this.fechaCreacion = fechaCreacion;
            }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }


    @Override
    public String toString() {
        return getClass().getName()
                + "\n IdCita : " + getIdCita()
                + "\n IdPaciente        : " + getIdPaciente()
                + "\n IdDisponibilidad  : " + getIdDisponibilidad()
                + "\n Fecha    : " + getFecha()
                + "\n FechaCreacion    : " + getFechaCreacion()
                + "\n FechaModificacion: " + getFechaModificacion()
                + "\n IdMedico         : " + getIdMedico()
                + "\n Activo           : " + getActivo();
    }

}
