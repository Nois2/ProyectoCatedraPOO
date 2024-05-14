
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
    String mensajeBienvenida = "";
    if (datos != null) { mensajeBienvenida = datos.getNombres() + " " + datos.getApellidos();}else {response.sendRedirect("login.jsp");}
    // Obteniendo la dirección IP del cliente
    String ipAddress = request.getRemoteAddr();

%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="imagenUDB">
    <img src="../../image/images.png" width="100px" height="100px" />
    </div>
    <div class="container-fluid">  <a class="navbar-brand" href="/panelDeControl.jsp">Panel de Control</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
<%=ipAddress%>
        <div class="collapse navbar-collapse justify-content-between" id="navbarColor01">
            <ul class="navbar-nav">  <li class="nav-item active">
                <a class="nav-link" href="#">Ver tabla de empleados<span class="sr-only"></span></a>
            </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Ver tabla de proyectos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Crear Usuarios</a>
                </li>
            </ul>
            <span class="nav-link">  Bienvenido: <%= mensajeBienvenida %>
      </span>
            <form class="form-inline" method="post" action="/LogoutController">
                <input class="form-control mr-sm-2" name="CerrarSesion" value="true" type="hidden">
                <button class="btn btn-outline-info my-2 my-sm-0" type="submit">Cerrar Sesion</button>
            </form>
        </div>
    </div>
</nav>



