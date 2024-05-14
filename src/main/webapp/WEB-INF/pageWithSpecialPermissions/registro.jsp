<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Formulario de Empleados</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
      <%@include file="../Utilidades/navbar.jsp"%>
      <div class="container mt-5">
          <h1>Formulario de Empleados</h1>
          <form action="/RegistrarController" method="POST">
              <div class="row mb-3">
                  <div class="col">
                      <label for="nombres" class="form-label">Nombres</label>
                      <input type="text" class="form-control" id="nombres" name="nombres" required>
                  </div>
                  <div class="col"> <!-- Aquí cerramos el div que contiene el campo Apellidos -->
                      <label for="apellidos" class="form-label">Apellidos</label>
                      <input type="text" class="form-control" id="apellidos" name="apellidos" required>
                  </div> <!-- Cerramos el div que contiene el campo Apellidos -->
              </div> <!-- Cerramos el div que contiene la fila de Nombres y Apellidos -->
              <div class="mb-3">
                  <label for="mail" class="form-label">Correo Electronico</label>
                  <input type="email" class="form-control" id="mail" name="mail" required>
              </div>
              <div class="mb-3">
                  <label for="passwd" class="form-label">Password</label>
                  <input type="password" class="form-control" id="passwd" name="passwd" required>
              </div>
              <div class="mb-3">
                  <label for="idNivelDeAcceso" class="form-label">ID del Nivel de Acceso</label>
                  <input type="text" class="form-control" id="idNivelDeAcceso" name="idNivelDeAcceso" required>
              </div>
              <button type="submit" class="btn btn-primary">Enviar</button>
              ${mensajeDeError}
          </form>
      </div> <!-- Cerramos el div principal que contiene el formulario -->

      <%@include file="../Utilidades/footer.jsp"%>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
  </html>
