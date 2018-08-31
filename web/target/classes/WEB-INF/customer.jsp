<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	test
	
	${viewCust}
	
	<table>
		<tr>
			<th>Customer ID</th>
			<th>Customer Name</th>
			<th>Contact Number</th>
			<th>DOB</th>
			<th>Address</th>
			<th>Nationality</th>
			<th>Gender</th>
		</tr>
		<jstl:forEach var="map" items="${viewCust}">
			<tr>
				<td>${map.get("id") }</td>
				<td>${map.get("customerName") }</td>
				<td>${map.get("contactNumber") }</td>
				<td>${map.get("dateOfBirth") }</td>
				<td>${map.get("address") }</td>
				<td>${map.get("nationality") }</td>
				<td>${map.get("gender") }</td>
			</tr>
		</jstl:forEach>
	</table>
</body>
</html>