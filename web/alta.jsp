<%-- 
    Document   : alta.jsp
    Created on : 30-jun-2019, 19:12:40
    Author     : eibar
--%>

<%@page import="java.sql.Connection"%>
<%@page import="DataBase.DBManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Alta</h1><br/>
        
        <form method="POST" action="AltaServlet">
            Nombre: <input type="text" name="nombre" placeholder="Nombre" required><br/><br/>
            Apellido Paterno: <input type="text" name="apaterno" placeholder="Paterno" required><br/><br/>
            Apellido Materno: <input type="text" name="amaterno" placeholder="Materno" required><br/><br/>
            Fecha de Nacimiento: <input type="date" max="2004-12-31" name="fechanac" required><br/><br/>
            Percepción Económica: <input type="number" name="percepcion" placeholder="Percepción" required><br/><br/><br/>
            
            <input type="submit" value="Aceptar">
        </form>
        
    </body>
</html>