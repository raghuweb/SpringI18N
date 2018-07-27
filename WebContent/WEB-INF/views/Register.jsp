<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="../js/myapp.js"></script>
<title>Welcome to Register Page</title>
</head>
<body bgcolor="cyan">
	<a href="?lang=en"><spring:message code="emp.lang.eng" /></a>

	<a href="?lang=te"><spring:message code="emp.lang.tel" /></a>

	<a href="?lang=kn"><spring:message code="emp.lang.kan" /></a>

	<a href="?lang=hi"><spring:message code="emp.lang.hin" /></a>

	<form:form action="insert" method="post" modelAttribute="employee">

		<h2>
			<spring:message code="emp.title" />
		</h2>
		<pre>
 	<spring:message code="emp.empId" />  : <form:input path="empId" />
 	<form:errors path="empId" />
 	<spring:message code="emp.empName" />     : <form:input
				path="empName" />
 	<form:errors path="empName" /> 
 	<spring:message code="emp.empSal" />   : <form:input path="empSal" />
 	<form:errors path="empSal" />
 	<input type="submit" value="Register" />
 </pre>
	</form:form>
	<h2>${message}</h2>
</body>
</html>