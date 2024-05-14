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
import static Models.Validations.Tables.EmpleadoValidator.*;
@WebServlet(name = "RegistrarController", value = "/RegistrarController")

public class RegistrarController extends HttpServlet {
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

                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/pageWithSpecialPermissions/registro.jsp");
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
        Empleados emp = new Empleados();
        Empleados empLogueado = (Empleados) request.getSession().getAttribute("datosEmpleado");
        int rolEmpleadoLogueado = empLogueado.getFK_idNivelDeAcceso();
        int rolUsuarioRegistradoComun = 2; //Rol Jefe de area
        try {
            emp.setNombres(request.getParameter("nombres"));
            emp.setApellidos(request.getParameter("apellidos"));
            emp.setMail(request.getParameter("mail"));
            emp.setFK_empleadoEncargado(rolEmpleadoLogueado);
            emp.setPasswd(request.getParameter("passwd"));
            emp.setFK_idNivelDeAcceso(rolUsuarioRegistradoComun);

            if(isDataValidWithOutID(emp)){
                ConsultasEmpleados consultasEmpleados = new ConsultasEmpleados(new Conexion());
                if(consultasEmpleados.InsertarEmpleado(emp)){
                    RequestDispatcher rd = request.getRequestDispatcher("panelDeControl.jsp");
                    rd.forward(request, response);
                }
                else {
                    request.setAttribute("mensajeDeError","Ocurrio Un error a la hora de insertar la data en SQL");

                    RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/pageWithSpecialPermissions/registro.jsp");
                    rd.forward(request, response);
                }

            }else {
                request.setAttribute("mensajeDeError","No revisa el formato de los dato");
                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/pageWithSpecialPermissions/registro.jsp");
                rd.forward(request, response);
            }


        }
        catch (Exception e) {
            request.setAttribute("request","No se supone que deberias de estar viendo esto");
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/PageErrors/errorPage.jsp");
            rd.forward(request, response);
            System.out.println(e.getMessage());
        }

    }

    public void destroy() {

    }

}

