<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form name="formulario" action="insertarProfesor.htm" commandName="profesor" method="get">

		<p align="center">
			<input type="submit" onclick="document.formulario.action='insertarProfesor.htm'"  value='<spring:message code="boton_insertar"/>'/>
			<input type="submit" onclick="document.formulario.action='modificarProfesor.htm'" value='<spring:message code="boton_modificar"/>'/>
		</p>
	
		<form:hidden path="idProfesor"/>

		<table align="center">
			<tr>
				<td><spring:message code="etiqueta_nombre"/></td>
				<td>
					<form:input path="nombre"/>
				</td>			
			</tr>
			<tr>
				<td><spring:message code="etiqueta_apellidos"/></td>
				<td>
					<form:input path="apellidos"/>
				</td>			
			</tr>
			<tr>
				<td><spring:message code="etiqueta_asignaturas"/></td>
				<td>
					<select name="lista">
   						<c:forEach items="${listadoAsignaturas}" var="a">
      						<option value="${a.descripcion}"> ${a.descripcion}</option>
   						</c:forEach>
					</select>
				</td>			
			</tr>
			<tr>
				<td><spring:message code="etiqueta_usuario"/></td>
				<td>
					<form:input path="username"/>
				</td>			
			</tr>
			<tr>
				<td><spring:message code="etiqueta_password"/></td>
				<td>
					<form:input path="password"/>
				</td>			
			</tr>
		</table>
	
	</form:form>
		
	
	<p align="center">
		<a href="/inicio.html"><spring:message code="etiqueta_inicio"/></a>
	</p>
	
</body>
</html>