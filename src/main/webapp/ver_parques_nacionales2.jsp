<%-- 
    Document   : ver_parques_nacionales
    Created on : Mar 12, 2025, 11:33:29 AM
    Author     : Alvaro Mena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="java.util.LinkedList"%>
<%@page  import="cr.ac.ucr.paraiso.lenguajes.webapp.domain.ParqueNacional"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${tituloPagina}</title>
    </head>
    <body>
        <h1>${tituloPagina}</h1>
        <p>Ejemplo de parque nacional</p>
        <p>Identificación: ${parqueNacional.idParque} </p>
        <p>Nombre: ${parqueNacional.nombre} </p>

        <% LinkedList<ParqueNacional> parques = (LinkedList<ParqueNacional>)request.getAttribute("parques");  %>
        <table style="border: 5px solid">
            <tr>
                <th>Identificación</th>
                <th>Nombre</th>
            </tr>
            <% for(ParqueNacional parqueActual:parques){ %>
            <tr>
                <td><a href="./ver_parque.jsp?idParque=<%= parqueActual.getIdParque() %>&nombre=<%= parqueActual.getNombre() %>">
                        <%= parqueActual.getIdParque() %>
                    </a>
                </td>
                <td><%= parqueActual.getNombre() %></td>
            </tr>
            <% } // se cierra el foreach %>
        </table>
    </body>
</html>
