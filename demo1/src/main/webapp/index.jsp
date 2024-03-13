<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>

    <form action="additionServlet" method="post">
        <label for="number1">Number 1:</label>
        <input type="number" id="number1" name="number1" required><br>
        <label for="number2">Number 2:</label>
        <input type="number" id="number2" name="number2" required><br>
        <input type="submit" value="Add">
    </form>

</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>