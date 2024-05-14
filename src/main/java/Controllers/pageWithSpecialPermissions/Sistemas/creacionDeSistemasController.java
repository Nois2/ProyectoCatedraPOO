package Controllers.pageWithSpecialPermissions.Sistemas;

import Models.Tables.Empleados;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "creacionProyectoController", value = "/creacionProyectoController")

public class creacionDeSistemasController extends HttpServlet {
    public void init() {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Declaración del objeto Empleados
        Empleados emp;

        // Constante que representa el rol de administrador
        int rolAdministrador = 1; // Esto lo sé gracias a la data de la base de datos

        // Verificar si hay datos de empleado en la sesión
        if (session.getAttribute("datosEmpleado") != null) {
            emp = (Empleados) session.getAttribute("datosEmpleado"); // Corrijo el nombre del atributo de sesión
            System.out.println("emp.getFK_idNivelDeAcceso() = " + emp.getFK_idNivelDeAcceso());
            if (emp.getFK_idNivelDeAcceso() == rolAdministrador) {
                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/pageWithSpecialPermissions/Sistemas/Funcionalidades/CreacionDeSistema.jsp");
                rd.forward(request, response);
            }
            else {
                RequestDispatcher rd = request.getRequestDispatcher("panelDeControl.jsp");
                rd.forward(request, response);
                System.out.println("Hubo un error a la hora de redirigir por culpa que no eres administrador");
            }
        }else{
            request.setAttribute("request","No se supone que deberias de estar viendo esto");
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/PageErrors/errorPage.jsp");
            rd.forward(request, response);

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void destroy() {

    }

}

