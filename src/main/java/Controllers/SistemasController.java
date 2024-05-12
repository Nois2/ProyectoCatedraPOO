package Controllers;

import Models.Tables.Empleados;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "SistemasController", urlPatterns = {"/SistemasController"})

public class SistemasController extends HttpServlet {
    public void init() {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Declaración del objeto Empleados
        Empleados emp = null;

        // Constante que representa el rol de administrador
        int rolAdministrador = 1; // Esto lo sé gracias a la data de la base de datos

        // Verificar si hay datos de empleado en la sesión
        if (session.getAttribute("datosEmpleado") != null) {
            emp = (Empleados) session.getAttribute("datosEmpleado"); // Corrijo el nombre del atributo de sesión
            System.out.println("emp.getApellidos() = " + emp.getApellidos());
        }

        // Obtener el parámetro recibido
        String parametroRecibidoParaRedireccionDePagina = request.getParameter("pagina");

        // Verificar si el empleado tiene permisos de administrador
        if (emp == null) {
            // Si emp es nulo, significa que no se ha iniciado sesión correctamente o el empleado no está autenticado
            // Aquí podrías redirigir al usuario a una página de inicio de sesión o mostrar un mensaje de error
            response.getWriter().println("No se ha iniciado sesión correctamente");
            return; // Salir del método para evitar procesamiento adicional
        }

// Ahora que hemos verificado que emp no es nulo, podemos continuar verificando los permisos
        /*
        if (emp.getFK_idNivelDeAcceso() == rolAdministrador) {
            // Si el empleado tiene permisos de administrador, lo redirigimos a la página de administrador
            RequestDispatcher rdAdmin = request.getRequestDispatcher("WEB-INF/pageWithSpecialPermissions/Sistemas/panelSistemas.jsp");
            rdAdmin.forward(request, response);
            return; // Salir del método después de redireccionar
        }
        */


        // Manejar el caso en que el parámetro no coincide con el rol de administrador
        RequestDispatcher rd = null;
        System.out.println(parametroRecibidoParaRedireccionDePagina);
        switch (parametroRecibidoParaRedireccionDePagina) {
            case "CreacionDeProyecto":
                rd = request.getRequestDispatcher("WEB-INF/pageWithSpecialPermissions/Sistemas/Funcionalidades/CreacionDeSistema.jsp");
                break;
            case "ModificacionDeFuncionalidad":
                // Lógica para la modificación de funcionalidad
                rd = request.getRequestDispatcher("WEB-INF/pageWithSpecialPermissions/Sistemas/Funcionalidades/modificacionDeFuncionalidad.jsp");

                break;
            case "CreacionFuncionalidad":
                rd = request.getRequestDispatcher("WEB-INF/pageWithSpecialPermissions/Sistemas/Funcionalidades/creacionDeFuncionalidad.jsp");
                break;
            case "principal":
                rd = request.getRequestDispatcher("WEB-INF/pageWithSpecialPermissions/Sistemas/panelSistemas.jsp");
                break;
            default:
                // Manejar otros casos de página no reconocidos
                response.getWriter().println("No tienes permisos para acceder a esta página.");
                return; // Salir del método después de manejar el caso default
        }

        if (rd != null) {
            rd.forward(request, response);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void destroy() {

    }

}

