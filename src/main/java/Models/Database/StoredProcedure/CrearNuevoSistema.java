package Models.Database.StoredProcedure;

public class CrearNuevoSistema {
    private int idEmpleado;
    private String nombreProyecto;
    private String urlRequerimientoDocumentoPDF;
    private String descripcionProyecto;
    private String mensaje;

    public CrearNuevoSistema() {
        // Constructor vacío
    }

    // Getters and Setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getUrlRequerimientoDocumentoPDF() {
        return urlRequerimientoDocumentoPDF;
    }

    public void setUrlRequerimientoDocumentoPDF(String urlRequerimientoDocumentoPDF) {
        this.urlRequerimientoDocumentoPDF = urlRequerimientoDocumentoPDF;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripcionProyecto) {
        this.descripcionProyecto = descripcionProyecto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
