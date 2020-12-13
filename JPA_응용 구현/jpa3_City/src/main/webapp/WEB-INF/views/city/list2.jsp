<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="R" value="/" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${R}common.css" />
</head>
<body>
	<div class="container">
		<table class="list">
			<thead>
				<tr>
					<th>id</th>
					<th>도</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach var="district" items="${ districts }">
					<tr>
						<td>${ district.id }</td>
						<td>${ district.districtName }</td>
						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>