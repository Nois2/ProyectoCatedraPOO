<%@ page import="Models.Tables.Empleados" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio de Sesion</title>
    <link rel="stylesheet" href="css/estilo.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
    <!--Este sera el inicio de sesion-->

    <form action="/LoginController" method="post">
        <div class="contenedorPadre">
            <div class="contenedorHijo">
                <h1>Inicio de Sesion</h1>
                    <img src="image/images.png" alt="" width="100px" height="100px">
                    <br>
                    <br>
                    <label for="usuarioPrincipal">Nombre: </label><input type="email" name="email" id="usuarioPrincipal" placeholder="Usuario"> <!--Aqui es el inicio de sesion del usuario-->
                    <br>
                    <br>
                    <label for="contraseñaPrincipal">Contraseña: </label><input type="text" name="password" id="contraseñaPrincipal" placeholder="Contraseña">
                    <br>
                    <br>
                <button type="submit" class="btn btn-primary btn-block">Iniciar Sesión</button>
                <p>${mensaje}</p>
                <%--El uso de EL siempre toma la data segun esta prioridad
                1-pageScope
                2-requestScope
                3-sessionScope
                4-applicationScope
                --%>

                <div>
                </div>

            </div>
        </div>
    </form>


</body>
<script src="js/bootstrap.min.js"></script>
</html>