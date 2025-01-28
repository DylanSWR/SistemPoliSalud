package DTO;

public class EspecialidadDTO {
    private Integer idEspecialidad;
    private String nombre;
    private String fechaCreacion;
    private String fechaModificacion;
    private Boolean activo;

    public EspecialidadDTO() {}

    public EspecialidadDTO(String nombre) {
        this.nombre = nombre;
    }

    public EspecialidadDTO(Integer idEspecialidad, String nombre, String fechaCreacion, String fechaModificacion, Boolean activo) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.activo = activo;
    }

    public Integer getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Integer idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
                + "\n IdEspecialidad   : " + getIdEspecialidad()
                + "\n Nombre           : " + getNombre()
                + "\n FechaCreacion    : " + getFechaCreacion()
                + "\n FechaModificacion: " + getFechaModificacion()
                + "\n Activo           : " + getActivo();
    }
}
