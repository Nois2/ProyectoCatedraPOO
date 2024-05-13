<%@ page import="Models.Tables.Empleados" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    int rolParaVerPanelSistemas = 1; // Administrador (esto proviene de la base de datos)
    HttpSession rol = request.getSession();
    Empleados emp = (Empleados) rol.getAttribute("datosEmpleado");
%>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous"></head>
<body>
<c:if test="<%= (emp != null && emp.getFK_idNivelDeAcceso() == rolParaVerPanelSistemas) %>">
    <div class="container"> <!-- Agregado: Envoltorio principal -->
        <h1>Panel de Sistemas</h1> <!-- Agregado: Título -->
        <div class="row mb-4 pb-4"> <!-- Agregado: Clases de margen y relleno inferior -->
                <div class="col-md-3"> <!-- Modificado: Cambio de col-md-4 a col-md-3 -->
                    <div class="card">
                        <img class="card-img-top" src="../../../image/panelDeControl/creacionProyecto.jpeg" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Creacion de proyecto</h5>
                            <p class="card-text">Ponte en marcha con tu nuevo proyecto y haz realidad tus ideas más brillantes. ¡La aventura comienza aquí!</p>
                            <a href="/creacionProyectoController" class="btn btn-primary">Crear Proyecto!</a>
                        </div>
                    </div>
                </div>
                <!-- Repite este bloque para las otras dos tarjetas -->
                <div class="col-md-3"> <!-- Modificado: Cambio de col-md-4 a col-md-3 -->
                    <div class="card">
                        <img class="card-img-top" src="../../../image/panelDeControl/creacionFuncionalidad.jpeg" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Creacion de Funcionalidad</h5>
                            <p class="card-text">Crea una funcionalidad para un proyecto existente!</p>
                            <a href="/creacionFuncionalidadSistemasController" class="btn btn-primary">Crear Funcionalidad</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3"> <!-- Modificado: Cambio de col-md-4 a col-md-3 -->
                    <div class="card">
                        <img class="card-img-top" src="../../../image/panelDeControl/modificacionFuncionalidadExistente.jpeg" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">Modificar Funcionalidad Existente</h5>
                            <p class="card-text">Haz ajustes o mejoras en las funcionalidades de proyectos ya creados.</p>
                            <a href="/modificacionSistemasController" class="btn btn-primary">Modificar</a>

                        </div>
                </div>
        </div>
    </div>
</c:if>
</body>
</html>
