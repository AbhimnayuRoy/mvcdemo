<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
	<head>
	
	</head>

	<body>
	
	<c:forEach var="tempStudent" items="${student_details}" >
		${tempStudent} <br>
	
	</c:forEach>
	
	</body>

</html>