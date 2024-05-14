package Controllers;

import Models.Database.Conexion;
import Models.Queries.ConsultasEmpleados;
import Models.Queries.ConsultasProyectos;
import Models.Tables.Empleados;
import Models.Tables.Proyectos;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "TablaProyectosController", value = "/TablaProyectosController")

public class TablaProyectosController extends HttpServlet {
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
                ConsultasProyectos consultasProyectos = new ConsultasProyectos(new Conexion());
                try {
                    ArrayList<Proyectos> TablaProyectos = consultasProyectos.ObtenerProyectos();
                    request.setAttribute("tablaProyectos",TablaProyectos);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/pageWithSpecialPermissions/Tablas/tablaProyectos.jsp");
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

