<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="<%=request.getContextPath()%>/form/join.do">
        아이디 : <input type="text" name="id" size="20"/><br>
        암호 : <input type="password" name="password" size="20"/><br>
        이름 : <input type="text" name="name" size="20"/><br>

        <input  type="submit" value="저장"/>

    </form>

</body>
</html>
