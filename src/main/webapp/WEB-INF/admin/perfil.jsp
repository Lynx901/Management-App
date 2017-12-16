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

        <%@include file="/WEB-INF/layout/cabecera.jspf" %> 


        <div class="columns">
            <div class="panel">
                <div class="panel-heading">
                    <h1>Perfil de ${usuario.usuario}</h1>
                </div>
                <div class="columns">
                    <img class="image is-square is-4" src="<c:url value='/img/${usuario.id}.png'/>">
                    <div class="is-8">
                        
                        <form class="panel-content" method="post">
                            <div class="form-group ">
                                <button type="submit" class="button is-primary" name="Enviar" value="Enviar">Eliminar Perfil</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

        </div>
        <%@include file="/WEB-INF/layout/footer.jspf" %>  
    </body>
</html>
