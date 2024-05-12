package Controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "LogoutController", value = "/LogoutController")

public class LogoutController extends HttpServlet {
    public void init() {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/PageErrors/errorPage.jsp");
        rd.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cerrarSesion = request.getParameter("CerrarSesion");
        if (cerrarSesion != null && cerrarSesion.equals("true")) {
            request.getSession().invalidate();
            response.sendRedirect("index.html");
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/PageErrors/errorPage.jsp");
            HttpSession sesion = request.getSession();
            sesion.setAttribute("mensaje", "¿Realmente querías hacer eso?");
            rd.forward(request, response);
        }
    }


    public void destroy() {

    }

}

