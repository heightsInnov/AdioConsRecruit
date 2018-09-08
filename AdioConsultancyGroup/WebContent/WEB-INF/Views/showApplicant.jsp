<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><spring:message code="lbl.title"/></title>
</head>
<body>
<h2>Adio Consultancy: Applicant Details</h2>

<p><spring:message code="lbl.firstname"/>: ${applicant.firstname}</p>
<p><spring:message code="lbl.surname"/>: ${account.surname}</p>
<p><spring:message code="lbl.phoneNo"/>: ${account.phoneNo}</p>
<p><spring:message code="lbl.email"/>: ${account.email}</p>
</body>
</html>