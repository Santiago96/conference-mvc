<%--
  Created by IntelliJ IDEA.
  User: santi
  Date: 07/04/2020
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <h1>Registration</h1>
    <form:form modelAttribute="registration">
        <h4 color="red">${error}</h4>
        <table>
            <tr>
                <td>Name</td>
                <td><form:input path="name"/></td>
            </tr>
           <tr>
               <td colspan="2">
                   <input type="submit" value="Add Registration">
               </td>
           </tr>
        </table>
    </form:form>
</body>
</html>