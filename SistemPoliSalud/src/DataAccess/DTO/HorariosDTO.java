package DTO;

public class HorariosDTO {
    private Integer idHorario;
    private String horaInicio;
    private String horaFin;
    private String FechaCreacion;
    private String FechaModificacion;
    private Boolean Estado;

    public HorariosDTO() {}

    public HorariosDTO(Integer idHorario, String horaInicio, String horaFin, String FechaCreacion, String FechaModificacion, boolean Estado) {
        this.idHorario = idHorario;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.FechaCreacion = FechaCreacion;
        this.FechaModificacion = FechaModificacion;
        this.Estado = Estado;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(String FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public String getFechaModificacion() {
        return FechaModificacion;
    }

    public void setFechaModificacion(String FechaModificacion) {
        this.FechaModificacion = FechaModificacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Horario   :" + getIdHorario()
                + "\n HoraInicio    : " + getHoraInicio()
                + "\n HoraFin       : " + getHoraFin()
                + "\n FechaCreacion : " + getFechaCreacion()
                + "\n FechaModificacion: " + getFechaModificacion()
                + "\n Estado        : " + getEstado();
    }
    

}
