package Controllers;

import Models.Database.Conexion;
import Models.Queries.ConsultasEmpleados;
import Models.Tables.Empleados;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "TablaEmpleadosController", value = "/TablaEmpleadosController")

public class TablaEmpleadosController extends HttpServlet {
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
                ConsultasEmpleados consultasEmpleados = new ConsultasEmpleados(new Conexion());
                try {
                    ArrayList<Empleados> TablaEmpleados = consultasEmpleados.ObtenerEmpleados();
                    request.setAttribute("tablaEmpleados",TablaEmpleados);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/pageWithSpecialPermissions/Tablas/tablaEmpleados.jsp");
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

