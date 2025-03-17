<%-- 
    Document   : insertar_parque_nacional2
    Created on : Mar 17, 2025, 2:17:23 PM
    Author     : Alvaro Mena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar un nuevo parque</title>
    </head>
    <body>
        <h1>Insertar un nuevo parque</h1>
        
        <%-- FORM CON EL METODO GET --%>
        
        <form action="./insertarParque2" method="GET">
            <label for="idParque"> Identificación: </label>
            <input type="text" id="idParque" name="idParque"> <br>
            <label for="nombre"> Nombre del parque: </label>
            <input type="text" id="nombre" name="nombre"> <br>
            <input type="submit" value="Guardar">
        </form>
    </body>
</html>
