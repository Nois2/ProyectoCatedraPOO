package Models.Validations.StoredProcedure;

import Models.Database.StoredProcedure.CrearNuevoSistema;


public class CrearNuevoSistemaValidator {

    // Validar el ID del empleado
    public static boolean validarIDEmpleado(int idEmpleado) {
        return idEmpleado >= 1;
    }

    // Validar el nombre del proyecto
    public static boolean validarNombreProyecto(String nombreProyecto) {
        // Expresión regular que verifica si el nombre del proyecto contiene letras, números y espacios
        String regex = "^[a-zA-Z0-9\\s]+$";
        return nombreProyecto != null && !nombreProyecto.isEmpty() && nombreProyecto.matches(regex) && nombreProyecto.length() >= 3;
    }

    // Validar la URL del documento PDF de requerimientos
    public static boolean validarURLRequerimientoDocumentoPDF(String url) {
        // Aquí podrías incluir una validación más detallada del formato de la URL si es necesario
        return url.endsWith(".pdf");
    }

    // Validar la descripción del proyecto
    public static boolean validarDescripcionProyecto(String descripcionProyecto) {
        // Podrías agregar más condiciones de validación según los requisitos específicos del proyecto
        return descripcionProyecto != null && !descripcionProyecto.isEmpty();
    }

    // Validar todos los campos de un objeto CrearNuevoSistema
    public static boolean isDataValidCrearNuevoSistema(CrearNuevoSistema nuevoSistema) {
        return validarIDEmpleado(nuevoSistema.getIdEmpleado()) &&
                validarNombreProyecto(nuevoSistema.getNombreProyecto()) &&
                validarURLRequerimientoDocumentoPDF(nuevoSistema.getUrlRequerimientoDocumentoPDF()) &&
                validarDescripcionProyecto(nuevoSistema.getDescripcionProyecto());
    }
}
