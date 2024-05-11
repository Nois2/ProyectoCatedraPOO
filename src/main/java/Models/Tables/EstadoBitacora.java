package Models.Tables;

public class EstadoBitacora {
    private int PK_idEstadoBitacora;
    private String nombreEstadoBitacora;
    private String descripcionEstadoBitacora;
    public EstadoBitacora() {}

    public EstadoBitacora(int PK_idEstadoBitacora, String nombreEstadoBitacora, String descripcionEstadoBitacora) {
        this.PK_idEstadoBitacora = PK_idEstadoBitacora;
        this.nombreEstadoBitacora = nombreEstadoBitacora;
        this.descripcionEstadoBitacora = descripcionEstadoBitacora;
    }

    public int getPK_idEstadoBitacora() {
        return PK_idEstadoBitacora;
    }

    public void setPK_idEstadoBitacora(int PK_idEstadoBitacora) {
        this.PK_idEstadoBitacora = PK_idEstadoBitacora;
    }

    public String getNombreEstadoBitacora() {
        return nombreEstadoBitacora;
    }

    public void setNombreEstadoBitacora(String nombreEstadoBitacora) {
        this.nombreEstadoBitacora = nombreEstadoBitacora;
    }

    public String getDescripcionEstadoBitacora() {
        return descripcionEstadoBitacora;
    }

    public void setDescripcionEstadoBitacora(String descripcionEstadoBitacora) {
        this.descripcionEstadoBitacora = descripcionEstadoBitacora;
    }
}
