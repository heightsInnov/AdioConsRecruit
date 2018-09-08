<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><spring:message code="lbl.title"/></title>
<style>
	.error{
		color: red;
	}
</style>
</head>
<body>
	<h2>Please in the form below</h2>
	<form:form action="saveApplicant" modelAttribute="applicant" method="post">
		<table>
			<tr>
				<td><spring:message code="lbl.accountNo"/></td>
				<td><form:input path="accountNo" size="30" /></td>
				<form:errors cssClass="error" path="accountNo"></form:errors>
			</tr>
			<tr>
				<td><spring:message code="lbl.accountHolderName"/></td>
				<td><form:input path="accountHolderName" size="30" /></td>
				<form:errors cssClass="error" path="accountHolderName"></form:errors>
			</tr>
			<tr>
				<td><spring:message code="lbl.balance"/></td>
				<td><form:input path="balance" size="30" /></td>
				<form:errors cssClass="error" path="balance"></form:errors>
			</tr>
			<tr>
				<td><spring:message code="lbl.accountType"/></td>
				<td><form:select path="accountType">
					<form:option value="Select Account Type"></form:option>
					<form:option value="SAVINGS">Savings</form:option>
					<form:option value="CURRENT">Current</form:option>
				</form:select>
				</td>
				<form:errors cssClass="error" path="accountType"></form:errors>
			</tr>
			<tr>
				<td><spring:message code="lbl.doB"/></td>
				<td><form:input path="dateofBirth" size="30" /></td>
				<form:errors cssClass="error" path="dateofBirth"></form:errors>
			</tr>
			<tr>
				<td><spring:message code="lbl.psCode"/></td>
				<td><form:input path="psCode" size="30" /></td>
				<form:errors cssClass="error" path="psCode"></form:errors>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					name="btnSubmit" value="Save Account" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>