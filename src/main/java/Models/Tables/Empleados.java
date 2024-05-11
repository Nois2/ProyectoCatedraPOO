package Models.Tables;

public class Empleados {
    private int PK_idEmpleado;
    private String nombres;
    private String apellidos;
    private String mail;
    private String passwd;
    private int FK_empleadoEncargado;
    private int FK_idNivelDeAcceso;
    public Empleados() {}

    public Empleados(int PK_idEmpleado, String nombres, String apellidos, String mail, String passwd, int FK_empleadoEncargado, int FK_idNivelDeAcceso) {
        this.PK_idEmpleado = PK_idEmpleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.mail = mail;
        this.passwd = passwd;
        this.FK_empleadoEncargado = FK_empleadoEncargado;
        this.FK_idNivelDeAcceso = FK_idNivelDeAcceso;
    }

    public int getPK_idEmpleado() {
        return PK_idEmpleado;
    }

    public void setPK_idEmpleado(int PK_idEmpleado) {
        this.PK_idEmpleado = PK_idEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getFK_empleadoEncargado() {
        return FK_empleadoEncargado;
    }

    public void setFK_empleadoEncargado(int FK_empleadoEncargado) {
        this.FK_empleadoEncargado = FK_empleadoEncargado;
    }

    public int getFK_idNivelDeAcceso() {
        return FK_idNivelDeAcceso;
    }

    public void setFK_idNivelDeAcceso(int FK_idNivelDeAcceso) {
        this.FK_idNivelDeAcceso = FK_idNivelDeAcceso;
    }
}
