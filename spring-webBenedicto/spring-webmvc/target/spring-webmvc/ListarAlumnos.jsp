<%-- 
    Document   : ListarAlumnos
    Created on : 05/10/2013, 02:36:28 AM
    Author     : jose_cerna
--%>
<%@page import="edu.upc.clase.demo.entity.Alumno"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de Alumnos</title>

        <link rel="stylesheet" href="rcr_css/css/smoothness/jquery-ui-1.10.3.custom.css" />
        <link rel="stylesheet" href="Estilos/Estilos.css" />
        <script language="javascript" src="js/jquery-1.9.1.js"></script>
        <script language="javascript" src="js/jquery-ui.js"></script>
        <script>
            $(function() {
                $("#tbFechaEmision").datepicker();
                $("#tbFechaVencimiento").datepicker();
                $("#tbFechaPago").datepicker();
            });

            function Salir() {
                window.location = "Default.jsp";
                return false;
            }
            function Ingresar()
            {
                window.location = "MantenimientoAlumno.jsp";
                return false;
            }
        </script>

    </head>
    <body>
        <div name="page" class="page">
            <form name="form1" action="" method="POST" >
                </br>
                <%@include file="/Menu.jsp" %>
                <p></p>
                <h1>Mantenimiento de Alumnos</h1>
                <table class="stlPanelBusqueda">
                    <tr>
                        <td>
                            Nombres 
                        </td>
                        <td>:                        
                        </td>
                        <td>
                            <input name="tbNumeroCompra" type="text" maxlength="10" width="80px">  
                        </td>
                        <td></td>
                        <td>Apellido Paterno</td>
                        <td>:</td>
                        <td><input name="tbNumeroCompra" type="text" maxlength="10" width="80px"></td>
                    </tr>
                    <tr>
                        <td>Apellido Materno</td>
                        <td>:</td>
                        <td><input name="tbNumeroCompra" type="text" maxlength="10" width="80px">
                        <td></td>
                        <td>Email</td>
                        <td>:</td>
                        <td><input name="tbNumeroCompra" type="text" maxlength="10" width="80px"></td>
                        <td></td>
                        <td>DNI</td>
                        <td>:</td>
                        <td><input id="tbFechaPago" name="tbFechaPago" type="text" maxlength="10" width="80px"></td>
                    </tr>
                    <tr>
                        <td>Telefono</td>
                        <td>:</td>
                        <td><input id="tbFechaPago" name="tbFechaPago" type="text" maxlength="10" width="80px"></td>
                        <td></td>
                        <td>Celular</td>
                        <td>:</td>
                        <td>
                            <input name="tbNumeroCompra" type="text" maxlength="10" width="80px">
                        </td>
                        <td></td>
                        <td>Fecha de Contacto</td>
                        <td>:</td>
                        <td>
                            <input name="tbNumeroCompra" type="text" maxlength="10" width="80px">
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td style=" text-align: right"><input type="submit" value="Buscar" name="btnBuscar" class="stlbutton" </td>
                    </tr>

                </table>
                <p></p>
                <div style="width: 100%; height: 245px;border: 1px solid #999999;">
                    <table name="tblRegistros" style=" width:100%;" class="stlDataGridFixedHeader">
                        <tr>
                            <td style=" width: 20px;"><input type="checkbox" name="chkTodos"  /></td>
                            <td style=" width: 120px;">DNI</td>
                            <td style=" width: 180px;">Nombres</td>
                            <td style=" width: 120px;">Apellidos</td>
                            <td style=" width: 420px;">Email</td>
                            <td style=" width: 420px;" >Telefono</td>
                            <td style=" width: 420px;">Celular</td>
                        </tr>
                    <c:forEach var="alumno" items="${alumno}">
                        <tr>
                            <td>${alumno.nombre}</td>
                            <td>${alumno.nombre}</td>
                            <td>${alumno.nombre}</td>
                            <td>${alumno.nombre}</td>
                            <td>${alumno.nombre}</td>
                            <td><a href="<c:url value='/pages/usuarios/edit?id=${alumno.IdAlumno}'/>">Editar usuario</a></td>
                            <td><a href="<c:url value='/pages/usuarios/delete?id=${alumno.IdAlumno}'/>" onclick="if (deleteUsuario()) { return true; } else { return false; }">Eliminar usuario</a></td>
                        </tr>
                    </c:forEach>
                    </table>
                </div>
                <p></p>
                <div class="stlLinea" ></div>
                <p style=" text-align: right;">
                    <input name="btnIngresar" type="button" value="Ingresar" class="stlbutton" onclick="Ingresar();" />
                    <input name="btnSalir" type="button" value="Salir" class="stlbutton" onclick="Salir();" />
                </p>
            </form>
        </div>
    </body>
</html>
