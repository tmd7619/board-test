<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>회원정보</h1>
    id : ${memberVO.id}<br>
    password :${memberVO.password}<br>
    name : ${memberVO.name}<br>
</body>
<script>
    if("${msg}" != null){
        alert("${msg}");
    };

</script>
</html>
