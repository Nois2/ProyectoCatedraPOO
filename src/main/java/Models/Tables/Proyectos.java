package Models.Tables;

public class Proyectos {
    private int PK_idProyecto;
    private String nombreProyecto;
    private String URL_requerimientoP_documentoDF;
    private int FK_idEmpleado;
    public Proyectos() {}

    public Proyectos(int PK_idProyecto, String nombreProyecto, String URL_requerimientoP_documentoDF, int FK_idEmpleado) {
        this.PK_idProyecto = PK_idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.URL_requerimientoP_documentoDF = URL_requerimientoP_documentoDF;
        this.FK_idEmpleado = FK_idEmpleado;
    }

    public int getPK_idProyecto() {
        return PK_idProyecto;
    }

    public void setPK_idProyecto(int PK_idProyecto) {
        this.PK_idProyecto = PK_idProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getURL_requerimientoP_documentoDF() {
        return URL_requerimientoP_documentoDF;
    }

    public void setURL_requerimientoP_documentoDF(String URL_requerimientoP_documentoDF) {
        this.URL_requerimientoP_documentoDF = URL_requerimientoP_documentoDF;
    }

    public int getFK_idEmpleado() {
        return FK_idEmpleado;
    }

    public void setFK_idEmpleado(int FK_idEmpleado) {
        this.FK_idEmpleado = FK_idEmpleado;
    }
}
