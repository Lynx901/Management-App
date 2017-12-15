<%-- 
    Document   : login
    Created on : 08-sep-2017, 16:53:00
    Author     : dani
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

        <main class="columns is-centered">
            <div class="panel is-8">

                    <form class="panel-content" action="j_security_check" method="post">
                        <h1>Algo salió mal</h1>
                        <div class="field">
                            <label for="j_username" class="label">Usuario</label>
                            <div class="control has-icons-left has-icons-right">
                                <input class="input" type="text">
                                <span class="icon is-small is-left">
                                    <i class="fa fa-user"></i>
                                </span>
                            </div>
                        </div>

                        <div class="field">
                            <label for="j_password" class="label">Contraseña</label>
                            <div class="control has-icons-left has-icons-right">
                                <input class="input" type="password">
                                <span class="icon is-small is-left">
                                    <i class="fa fa-key"></i>
                                </span>
                            </div>
                        </div>

                        <div class="form-group ">
                            <button type="submit" class="button is-primary" name="Enviar" value="Enviar">Iniciar sesión</button>
                        </div>
                    </form>

                </div>
            </main>

        <%@include file="/WEB-INF/layout/footer.jspf" %>       
    </body>
</html>
