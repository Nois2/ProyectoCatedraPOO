
<%--Gracias a esta barra de navegacion a cualquier pagina de la cual no este logueado no la puedo ver--%>
<%@ page import="Models.Tables.Empleados" %>
<%--
  Created by IntelliJ IDEA.
  User: Isaias
  Date: 10/5/2024
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%
    Empleados datos = (Empleados) session.getAttribute("datosEmpleado");
    if (datos != null) {}else {response.sendRedirect("login.jsp");}
%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">  <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-between" id="navbarColor01">
            <ul class="navbar-nav">  <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Pricing</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About</a>
                </li>
            </ul>
            <span class="nav-link">  Bienvenido: <%= datos.getNombres() + " " + datos.getApellidos() %>
      </span>
            <form class="form-inline" method="post" action="/LogoutController">
                <input class="form-control mr-sm-2" name="CerrarSesion" value="true" type="hidden">
                <button class="btn btn-outline-info my-2 my-sm-0" type="submit">Cerrar Sesion</button>
            </form>
        </div>
    </div>
</nav>



