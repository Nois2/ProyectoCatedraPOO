package Controllers;

import Models.Queries.ConsultasEmpleados;
import Models.Tables.Empleados;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;

import Models.Queries.ConsultasEmpleados.*;
import static Models.Validations.EmpleadoValidator.*;


@WebServlet(name = "LoginController", value = "/LoginController")

public class LoginController extends HttpServlet {
    public void init() {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/errorPage.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Crea un objeto para Realizar las consultas.
        ConsultasEmpleados consulta = new ConsultasEmpleados();

        // Crear un objeto de Empleado con los datos del formulario

        Empleados empleadoActual = new Empleados();
        empleadoActual.setMail(email);
        empleadoActual.setPasswd(password);

        try {
            // Verificar si los datos de inicio de sesión son válidos
            if (isDataValidPasword_and_Email(empleadoActual)) {
                // Verificar si el empleado existe en la base de datos
                if (consulta.existeEmpleado(empleadoActual)) {
                    // Obtener el empleado desde la base de datos
                    empleadoActual = consulta.ObtenerEmpleadoPorCorreoYPassword(email,password);
                    System.out.println("empleadoActual.getFK_idNivelDeAcceso() = " + empleadoActual.getFK_idNivelDeAcceso());

                    // Establecer la sesión con el empleado autenticado
                    HttpSession sesion = request.getSession();
                    sesion.setAttribute("datosEmpleado", empleadoActual);

                    // Redireccionar a la página de formulario
                    RequestDispatcher rd = request.getRequestDispatcher("2-formularioCaso.jsp");
                    rd.forward(request, response);
                } else {
                    // El empleado no existe en la base de datos
                    request.setAttribute("mensaje", "Credenciales incorrectas, por favor intente de nuevo");
                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                    rd.forward(request, response);
                }
            } else {
                // Los datos de inicio de sesión no son válidos
                request.setAttribute("mensaje", "Credenciales incorrectas, por favor intente de nuevo");
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }
        } catch (SQLException e) {
            // Manejar cualquier excepción SQL
            throw new ServletException("Error al procesar la solicitud: " + e.getMessage(), e);
        }
    }

    public void destroy() {

    }

}

