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
<!--Este es el primer punto del proyecto de POO-->
<nav class="menu">
    <ul>
        <li><a href="3-solicitudes.jsp">Solicitudes</a></li>
        |
        <li><a href="4-formularioAsign.jsp">Formularios de asignacion</a></li>
        |
        <li><a href="5-bitacoraAvance.jsp">Bitacoras de Avance</a></li>
        |
        <li><a href="6-decisiones.jsp">Toma de decisiones</a></li>
        |
        <li><a href="7-modificaciones.jsp">Modificaciones</a></li>
    </ul>
</nav>