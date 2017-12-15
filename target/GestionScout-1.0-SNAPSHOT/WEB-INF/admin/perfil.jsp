<%-- 
    Document   : perfil
    Created on : 08-sep-2017, 14:43:43
    Author     : dani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestión Scout - Ajustes</title>

        <!-- Enlaces a Bootstrap -->
        <%@include file="/WEB-INF/layout/estilos.jspf" %>

        <!-- Website CSS style -->
        <link rel="stylesheet" href="<c:url value='/css/main.css'/>">
    </head>
    <body>
        <h1>Hello ${usuario.usuario}!</h1>
    
</body>
</html>
