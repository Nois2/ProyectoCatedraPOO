<%--
  Created by IntelliJ IDEA.
  User: Isaias
  Date: 10/5/2024
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página de Error</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous"></head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6 mt-5">
            <div class="card">
                <div class="card-body">
                    <h1 class="text-center text-danger">¡Error!</h1>
                    <p class="text-center">Lo sentimos, ocurrió un error inesperado.</p>
                    <p class="text-center">Por favor, inténtalo de nuevo más tarde.</p>
                    <p>${mensaje}</p>
                    <div class="text-center mt-4">
                        <a href="../../login.jsp" class="btn btn-primary">Volver a la página principal</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
