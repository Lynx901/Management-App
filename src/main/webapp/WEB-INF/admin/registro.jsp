<%-- 
    Document   : registro
    Created on : 11-sep-2017, 9:32:10
    Author     : dani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

                    <form:form modelAttribute="usuario" class="panel-content" method="post">

                        <div class="field">
                            <label class="label">Usuario</label>
                            <div class="control has-icons-left">
                                <form:input path="usuario" class="input" name="usuario" id="usuario" placeholder="Usuario"/>
                                <span class="icon is-small is-left">
                                    <i class="fa fa-user"></i>
                                </span>
                            </div>
                        </div>

                        <div class="field">
                            <label class="label">Contraseña</label>
                            <div class="control has-icons-left">
                                <form:input path="pass" class="input" type="password" placeholder="Contraseña"/>
                                <span class="icon is-small is-left">
                                    <i class="fa fa-key"></i>
                                </span>
                            </div>
                        </div>
                        
                        <div class="field">
                            <label class="label">Grupo que desea administrar:</label>
                            <div class="control has-icons-left">
                                <div class="select">
                                <form:select path="grupo">
                                    <form:option value="1">San Bartolomé</form:option>
                                    <form:option value="2">Los Villares</form:option>
                                </form:select>
                                    <span class="icon is-small is-left">
                                        <i class="fa fa-users"></i>
                                    </span>
                                </div>
                            </div>
                        </div>
                        
                        <div class="form-group ">
                            <button type="submit" class="button is-primary" name="Enviar" value="Enviar">Registrarse</button>
                        </div>
                    </form:form>
                
                </div>
            </main>

        <%@include file="/WEB-INF/layout/footer.jspf" %>       
    </body>
</html>
