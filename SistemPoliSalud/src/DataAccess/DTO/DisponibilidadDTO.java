package DTO;

public class DisponibilidadDTO {
    private Integer idDisponibilidad;
    private Integer idHorario;
    private Integer idMedico;
    private String fechaCreacion;
    private String fechaModificacion;
    private Boolean activo;

    public DisponibilidadDTO() {}

    public DisponibilidadDTO(Integer idHorario, Integer idMedico) {
        this.idHorario = idHorario;
        this.idMedico = idMedico;
    }

    public DisponibilidadDTO(Integer idDisponibilidad, Integer idHorario, Integer idMedico, String fechaCreacion, String fechaModificacion, Boolean activo) {
        this.idDisponibilidad = idDisponibilidad;
        this.idHorario = idHorario;
        this.idMedico = idMedico;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.activo = activo;
    }

    public Integer getIdDisponibilidad() {
        return idDisponibilidad;
    }

    public void setIdDisponibilidad(Integer idDisponibilidad) {
        this.idDisponibilidad = idDisponibilidad;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
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

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return getClass().getName()
                + "\n IdDisponibilidad : " + getIdDisponibilidad()
                + "\n IdHorario        : " + getIdHorario()
                + "\n IdMedico         : " + getIdMedico()
                + "\n FechaCreacion    : " + getFechaCreacion()
                + "\n FechaModificacion: " + getFechaModificacion()
                + "\n Activo           : " + getActivo();
    }
}
