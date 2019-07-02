<%-- 
    Document   : lista.jsp
    Created on : 30-jun-2019, 23:46:36
    Author     : eibar
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
          }
          th, td {
            padding: 15px;
          }
    </style>
    <body>
        <h1>Lista</h1><br/>
        
        <table>
            <tr>
                <th>Nombre</th>
                <th>Apellido Paterno</th>
                <th>Apellido Materno</th>
                <th>Acción</th>
            </tr>
            <%
                ArrayList<Persona> ls = (ArrayList<Persona>) request.getAttribute("lista"); 
                for (Persona ps: ls) {
            %>
            <tr>
                <td><%= ps.getNombre() %></td>
                <td><%= ps.getApaterno() %></td>
                <td><%= ps.getAmaterno() %></td>
                <td><a href="VerServlet?nombre=<%= ps.getNombre() %>&apaterno=<%= ps.getApaterno() %>&amaterno=<%= ps.getAmaterno() %>"><button>Ver</button></a> <a href="BuscaServlet?id=<%= ps.getid() %>"><button>Borrar</button></a></td>
            </tr>

            <%}%>
        </table>
    </body>
</html>
