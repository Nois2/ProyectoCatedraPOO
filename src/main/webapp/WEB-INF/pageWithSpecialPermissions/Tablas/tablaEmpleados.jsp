<%--
  Created by IntelliJ IDEA.
  User: Isaias
  Date: 13/5/2024
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Tabla de Empleados</title>
    <link rel="stylesheet" href="../../../css/bootstrap.min.css">

</head>
<body>
<%@include file="../../Utilidades/navbar.jsp"%>


<div class="container mt-5">
    <h1>Tabla de Empleados</h1>
    <table class="table table-striped table-hover">
        <thead class="thead-dark">
        <tr>
            <th scope="col">ID Empleado</th>
            <th scope="col">Nombres</th>
            <th scope="col">Apellidos</th>
            <th scope="col">Correo Electrónico</th>

        </tr>
        </thead>
        <tbody id="employeeTableBody">
        <!-- Aquí se añadirán dinámicamente las filas -->
        <c:forEach items="${tablaEmpleados}" var="empleado">
            <tr>
                <td>${empleado.PK_idEmpleado}</td>
                <td>${empleado.nombres}</td>
                <td>${empleado.apellidos}</td>
                <td>${empleado.mail}</td>

            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%@include file="../../Utilidades/footer.jsp"%>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
