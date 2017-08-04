<%--
  Created by IntelliJ IDEA.
  User: Ny Derry
  Date: 7/21/2017
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h1>Please fill the form to register!</h1>

</head>
<body>

<form action="/summary" method="post">

    First name:<br> <input type="text" name="firstname" required><br>
    Last name:<br> <input type="text" name="lastname" required><br>
    Email:<br> <input type="text" name="email" required><br>
    Phone number:<br> <input type="text" name="phonenumber" required><br>
    Password:<br> <input type="text" name="password" required><br>
    <input type="submit" value="Register">

</form>


</body>
</html>
