package Models.Validations;

import Models.Tables.Empleados;

public class EmpleadoValidator {
    public static boolean validarID(int id){
        return id >= 1;
    }
    public static boolean validarNombre_o_Apellido(String nombre){
        // Expresión regular que verifica si el nombre contiene solo letras, tildes, espacios y apóstrofes
        String regex = "^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ\\s']+$";

        // Verificar si el nombre es diferente de nulo, no está vacío y cumple con el patrón de la expresión regular
        return nombre != null && !nombre.isEmpty() && nombre.matches(regex) && nombre.length() >= 3;
    }


    // Validar que el correo electrónico tenga un formato válido
    public static boolean validarCorreo(String correo) {
        // Patrón simple para verificar el formato de correo electrónico
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return correo != null && correo.matches(regex);
    }

    // Validar que la contraseña tenga al menos 8 caracteres y contenga al menos una letra y un número
    public static boolean validarPassword(String contrasena) {
        return contrasena != null && contrasena.length() >= 8 && contrasena.matches(".*[a-zA-Z]+.*") && contrasena.matches(".*\\d+.*");
    }

    // Validar que el empleado encargado exista en la base de datos
    public static boolean validarEmpleadoEncargado(int idEmpleadoEncargado) {
        // Aquí podrías realizar alguna validación adicional si tienes una lista de empleados disponibles
        // Por simplicidad, en este ejemplo, se asume que cualquier entero positivo es un ID de empleado válido
        return idEmpleadoEncargado >= 1;
    }

    // Validar que el nivel de acceso esté en un rango específico (por ejemplo, 1 a 5)
    public static boolean validarNivelAcceso(int nivelAcceso) {
        return nivelAcceso >= 1 && nivelAcceso <= 20;
    }

    // Validar todos los campos de un objeto Empleado
    public static boolean isDataValidEmpleado(Empleados empleado) {
        return validarID(empleado.getPK_idEmpleado()) &&
                validarNombre_o_Apellido(empleado.getNombres()) &&
                validarNombre_o_Apellido(empleado.getApellidos()) &&
                validarCorreo(empleado.getMail()) &&
                validarPassword(empleado.getPasswd()) &&
                validarEmpleadoEncargado(empleado.getFK_empleadoEncargado()) &&
                validarNivelAcceso(empleado.getFK_idNivelDeAcceso());
    }
    public static boolean isDataValidPasword_and_Email(Empleados empleado) {
        return validarCorreo(empleado.getMail()) && validarPassword(empleado.getPasswd());
    }
    public static boolean isDataValidWithOutID(Empleados empleado) {
        return  validarNombre_o_Apellido(empleado.getNombres()) &&
                validarNombre_o_Apellido(empleado.getApellidos()) &&
                validarCorreo(empleado.getMail()) &&
                validarPassword(empleado.getPasswd()) &&
                validarEmpleadoEncargado(empleado.getFK_empleadoEncargado()) &&
                validarNivelAcceso(empleado.getFK_idNivelDeAcceso());
    }



}
