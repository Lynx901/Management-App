<%-- 
    Document   : index
    Created on : 07-sep-2017, 17:48:56
    Author     : DaML
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestión Scout</title>

        <!-- Enlaces a Bootstrap -->
        <%@include file="/WEB-INF/layout/estilos.jspf" %>

        <!-- Website CSS style -->
        <link rel="stylesheet" href="<c:url value='/css/main.css'/>">

    </head>
    <body>
        <%@include file="/WEB-INF/layout/cabecera.jspf" %>       
        
        <c:if test="${empty pageContext.request.remoteUser}">
            <main class="columns is-centered">
                <div class="panel is-8">
                    <a href="<c:url value='/inicio/admin/registro'/>" class="button is-info is-outlined">Registro</a>
                    <a href="<c:url value='/inicio/admin/perfil'/>" class="button is-info is-outlined">Iniciar Sesión</a>
                </div>
            </main>
        </c:if>
        <c:if test="${not empty pageContext.request.remoteUser}">
            <main class="columns">
                <div class="panel is-8">
                    <table class="table is-hoverable is-fullwidth">
                    <thead>
                        <tr>
                            <th>Columna 1</th>
                            <th>Columna 2</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <c:forEach var="u" items="${usuarios}">
                                <td></td>
                            </c:forEach>
                        </tr>
                    </tbody>
                </table>
                </div>
            </main>
        </c:if>
        

        <%@include file="/WEB-INF/layout/footer.jspf" %>       
    </body>
</html>
