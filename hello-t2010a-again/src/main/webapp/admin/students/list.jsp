<%@ page import="java.util.List" %>
<%@ page import="com.t2010a.hellot2010aagain.entity.Student" %>
<!doctype html>
<%@ page contentType = "text/html; charset=UTF-8" language = "java"%>
<%
    List<Student> listStudent = (List<Student>) request.getAttribute("listStudent");
%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
   <h1>List Student</h1>
<ul>
    <% for (Student st : listStudent) {
        %>
    <li><%=st.getRollNumber()%> - <%st.getFullName()%></li>
    <%}%>
</ul>
</body>
</html>