package Controllers.pageWithSpecialPermissions.Sistemas;

import Models.Database.Conexion;
import Models.Database.ProcedimientosAlmacenados;
import Models.Database.StoredProcedure.CrearNuevoSistema;
import Models.Tables.Empleados;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import static Models.Validations.StoredProcedure.CrearNuevoSistemaValidator.*;

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
        int idEmpleado = Integer.parseInt(request.getParameter("sp_idEmpleado"));
        String urlRequerimientoPDF = "PDF_POR_DEFECTO.pdf";
        String descripcionProyecto = request.getParameter("descripcionProyecto");
        String nombreProyecto = request.getParameter("sp_nombreProyecto");

        try {
            CrearNuevoSistema nuevoSistema = new CrearNuevoSistema();
            ProcedimientosAlmacenados pa = new ProcedimientosAlmacenados(new Conexion());
            nuevoSistema.setIdEmpleado(idEmpleado);
            nuevoSistema.setNombreProyecto(nombreProyecto);
            nuevoSistema.setDescripcionProyecto(descripcionProyecto);
            nuevoSistema.setUrlRequerimientoDocumentoPDF(urlRequerimientoPDF);

            if (isDataValidCrearNuevoSistema(nuevoSistema)) {
                String resultado = pa.crearSistema(nuevoSistema);
                if ("Proyecto creado correctamente.".equals(resultado)) {
                    request.setAttribute("mensaje", "Proyecto creado exitosamente");
                    response.sendRedirect("panelDeControl.jsp");
                } else {
                    request.setAttribute("mensaje", "El empleado debe de existir o la descripcion/nombre debe de tener mas de 3 caracteres");
                    RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/pageWithSpecialPermissions/Sistemas/Funcionalidades/CreacionDeSistema.jsp");
                    rd.forward(request, response);
                }
            } else {
                request.setAttribute("mensaje", "Datos de proyecto no válidos");
                RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/pageWithSpecialPermissions/Sistemas/Funcionalidades/CreacionDeSistema.jsp");
                rd.forward(request, response);
            }
        } catch (Exception e) {
            request.setAttribute("error", "No se supone que deberías de estar viendo esto");
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/PageErrors/errorPage.jsp");
            rd.forward(request, response);
            System.out.println(e.getMessage());
        }
    }



    public void destroy() {

    }

}

