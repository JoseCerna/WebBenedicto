<%-- 
    Document   : MantenimientoAlumnos
    Created on : 10/10/2013, 01:56:52 AM
    Author     : jose_cerna
--%>
<%@page import="edu.upc.clase.demo.entity.Alumno" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRM Instituto Benedicto XVI</title>
        <script>
            function Salir() {
                window.location = "ListarAlumnos.jsp";
                return false;
            }

        </script>
    </head>
    <body onload="CargarRegistro();">
        <div name="page" class="page">
            <form name="form1" action="" method="POST" >
                </br>
                <%@include file="Menu.jsp" %>
                <p></p>
                <h1>Mantenimiento de Cursos</h1>
                <table class="stlPanelBusqueda">
                    <tr>
                        <td>
                            Id Curso 
                        </td>
                        <td>:                        
                        </td>
                        <td>
                            <input type="text" id="tbIdCurso" disabled="disabled" name="tbIdCurso" style=" width:250px;">
                        </td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>
                            Nombre 
                        </td>
                        <td>:                        
                        </td>
                        <td>
                            <input type="text" id="tbNombreCurso" name="tbNombreCurso" style=" width:250px;" >
                        </td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>
                            Nro.Horas 
                        </td>
                        <td>:                        
                        </td>
                        <td>
                            <input type="text" id="tbNroHoras" name="tbNroHoras" style=" width:250px;" >
                        </td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Estado</td>
                        <td>:</td>
                        <td>
                            <select id="ddlEstado" name="ddlEstado" style=" width: 120px;" >
                                <option value="A">Activo</option>
                                <option value="I">Inactivo</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>

                </table>
                <p></p>
                <div class="stlLinea" ></div>
                <p></p>
                <div style=" text-align: right;">
                    <input name="btnGrabar" type="button" value="Grabar" class="stlbutton" onclick="" />
                    <input name="btnSalir" type="button" value="Salir" class="stlbutton" onclick="Salir();" />
                    <input type="hidden" id="_Operacion" name="_Operacion">
                    <input type="hidden" id="_CodigoCurso" value="" name="_CodigoCurso" >
                </div>
                <p></p>
            </form>
        </div>
    </body>
</html>
