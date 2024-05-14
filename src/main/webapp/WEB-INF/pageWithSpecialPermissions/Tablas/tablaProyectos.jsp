<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabla de proyectos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<%@include file="../../Utilidades/navbar.jsp"%>

<div class="container mt-5">
    <h1>Tabla de Proyectos</h1>
    <table class="table table-striped table-hover">
        <thead class="thead-dark">
        <tr>
            <th scope="col">ID Proyecto</th>
            <th scope="col">Nombre del Proyecto</th>
            <th scope="col">URL del Documento PDF</th>
            <th scope="col">ID del Empleado</th>
        </tr>
        </thead>
        <tbody id="projectTableBody">
        <c:forEach items="${tablaProyectos}" var="proyecto">
            <tr>
                <td>${proyecto.PK_idProyecto}</td>
                <td>${proyecto.nombreProyecto}</td>
                <td>${proyecto.URL_requerimientoP_documentoDF}</td>
                <td>${proyecto.FK_idEmpleado}</td>

            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<%@include file="../../Utilidades/footer.jsp"%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>