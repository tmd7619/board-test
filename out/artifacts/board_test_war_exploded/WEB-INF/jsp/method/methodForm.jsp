<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="<%=request.getContextPath()%>/method/method.do" method="post">
        <input type="submit" value="호출"/>
    </form>
</body>
</html>
