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
    <link rel="stylesheet" href="../../../css/bootstrap.min.css">
</head>
<body>
<c:if test="<%= (emp != null && emp.getFK_idNivelDeAcceso() == rolParaVerPanelSistemas) %>">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <div class="card">
                    <img class="card-img-top" src="../../../image/panelDeControl/creacionProyecto.jpeg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">Creacion de proyecto</h5>
                        <p class="card-text">Ponte en marcha con tu nuevo proyecto y haz realidad tus ideas más brillantes. ¡La aventura comienza aquí!</p>
                        <a href="#" class="btn btn-primary">Crear Proyecto!</a>
                    </div>
                </div>
            </div>
            <!-- Repite este bloque para las otras dos tarjetas -->
            <div class="col-md-4">
                <div class="card">
                    <img class="card-img-top" src="../../../image/panelDeControl/creacionFuncionalidad.jpeg" alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">Creacion de Funcionalidad</h5>
                        <p class="card-text">Crea una funcionalidad para un proyecto existente!</p>
                        <a href="#" class="btn btn-primary">Crear Funcionalidad</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <img class="card-img-top" src="..." alt="Card image cap">
                    <div class="card-body">
                        <h5 class="card-title">Card title 3</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn btn-primary">Go somewhere</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</c:if>
</body>
</html>
