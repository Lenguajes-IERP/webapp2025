<%-- 
    Document   : insertar_parque_nacional
    Created on : Mar 11, 2025, 8:01:25?PM
    Author     : Alvaro Mena
--%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Insertar Parque Nacional</title>
</head>
<body>
    <%-- FORM CON EL METODO POST --%>
    
    <form method="POST" action="./insertarParqueNacional">
        <p>Ingrese la información:</p>
        <label for="idParque">Identificación:</label>
        <input type="text" id="idParque" name="idParque"><br><br>

        <label for="nombreParque">Nombre del Parque:</label>
        <input type="text" id="nombreParque" name="nombreParque"><br><br>

        <input type="submit" value="Enviar">
    </form>
</body>
</html>
