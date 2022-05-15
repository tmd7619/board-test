<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="<%=request.getContextPath()%>/hello/hello.do">
    hello
  </a>
  <br>
  <a href="<%=request.getContextPath()%>/method/method.do">
    method
  </a>
  <br>
  <a href="<%=request.getContextPath()%>/form/joinForm.do">
    vo
  </a>
  </br/>

  <a href="<%=request.getContextPath()%>/ajax/resBody.do">
    문자열 응답
  </a></br>

  <a href="<%=request.getContextPath()%>/ajax/resBody.json">
    JSON 응답
  </a>
  </body>
</html>
