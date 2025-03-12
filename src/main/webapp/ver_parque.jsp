<%-- 
    Document   : ver_parque
    Created on : Mar 11, 2025, 7:59:04 PM
    Author     : Alvaro Mena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Información del parque nacional</h1>
        <% String id  = request.getParameter("idParque"); 
            String nombre = request.getParameter("nombre");
        %>
        Número de parque <%= id %>
        Nombre  <%= nombre %>
    </body>
</html>
