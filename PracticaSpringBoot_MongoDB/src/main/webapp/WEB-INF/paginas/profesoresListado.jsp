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

	<p align="center">
		<a href="?lang=en">En</a>     |     
		<a href="?lang=es">Es</a> 
	</p>

	<form:form name="formulario" method="get">

		<p align="center">
			<input type="submit" onclick="document.formulario.action='profesorFormulario.htm'"  value='<spring:message code="boton_nuevo"/>'/>
		</p>
	</form:form>
	
	<table align="center" border="1">
		<tr>
			<th><spring:message code="etiqueta_id"/></th>
			<th><spring:message code="etiqueta_nombre"/></th>
			<th><spring:message code="etiqueta_apellidos"/></th>
			<th><spring:message code="etiqueta_borrar_profesor"/></th>
			<th><spring:message code="etiqueta_modificar_profesor"/></th>
		</tr>
			<c:forEach var="p" items="${listadoProfesores}">
			<tr>
				<td>${p.idProfesor}</td>
				<td>${p.nombre}</td>
				<td>${p.apellidos}</td>
				<td><a href="borrarProfesor.htm?idProfesor=${p.idProfesor}"><spring:message code="etiqueta_borrar"/></a></td>
				<td><a href="seleccionarProfesor.htm?idProfesor=${p.idProfesor}"><spring:message code="etiqueta_modificar"/></a></td>
			</tr>
		</c:forEach>	
	</table>



</body>
</html>