import Models.Database.Conexion;
import Models.Tables.EstadoBitacora;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import Models.Queries.ConsultasEstadoBitacora;

@WebServlet(name = "ServletDeInicializacion", value = "/ServletDeInicializacion")

public class ServletDeInicializacion extends HttpServlet {
    public void init() {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ConsultasEstadoBitacora consultasEstadoBitacora = new ConsultasEstadoBitacora(new Conexion());
        try {
            ArrayList<EstadoBitacora> TablaEstadoBitacora = consultasEstadoBitacora.ObtenerTablaEstadoBitacora();
            ServletContext context = getServletContext();
            context.setAttribute("tablaEstadoBitacora", TablaEstadoBitacora);
            request.getRequestDispatcher("estadoBitacora.jsp").forward(request, response);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/errorPage.jsp");
        rd.forward(request, response);
    }

    public void destroy() {

    }

}

