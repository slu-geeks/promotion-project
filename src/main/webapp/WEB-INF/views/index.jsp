<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!Doctype HTML>

<html>
<body>
<h2>
    Hello From ${name}

    <c:forEach items="${listName}" var="i">
        <p>${i}</p>
    </c:forEach>
</h2>
</body>
</html>
