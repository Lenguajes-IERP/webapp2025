<%-- 
    Document   : ver_parques
    Created on : Mar 11, 2025, 6:50:14 PM
    Author     : Alvaro Mena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="java.util.LinkedList"%>
<%@page  import="cr.ac.ucr.paraiso.lenguajes.webapp.domain.ParqueNacional"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${titulo}</title>
    </head>
    <body>
       <h1>${titulo}</h1>
       <p>Ejemplo de parque</p>
        <p>ID: ${parqueNacional.idParque}</p>
        <p>Nombre: ${parqueNacional.nombre}</p>
       <h2>Lista de Parques Nacionales</h2>
    <ul>
        <% LinkedList<ParqueNacional> parques = (LinkedList<ParqueNacional>) request.getAttribute("parquesNacionales"); %>
        <% if (parques != null) { %>
            <% for (ParqueNacional parque : parques) { %>
                <li>
                    ID: <%= parque.getIdParque() %>, Nombre: <%= parque.getNombre() %>
                </li>
            <% } %>
        <% } else { %>
            <li>No hay parques nacionales disponibles.</li>
        <% } %>
    </ul>
    
    
    <%-- MOSTRAR LOS PARQUES EN UNA TABLA --%>
        <table border="1">
            <thead>
                <tr>
                    <th>Código</th>
                    <th>Nombre</th>
                </tr>
            </thead>
            <tbody>
                <% for (ParqueNacional parqueActual : parques) { %>
                <tr>
                    <td>
                        <a href="./ver_parque.jsp?idParque=<%= parqueActual.getIdParque() %>&nombre=<%= parqueActual.getNombre() %>">
                            <%= parqueActual.getIdParque() %>
                        </a>
                        </td>
                    <td><%= parqueActual.getNombre()  %></td>
                </tr>
                <% }%>
            </tbody>
        </table>
    </body>
</html>
