<%@page  contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>springboot项目登陆页面</title>
    <%--引入jquery--%>
    <script src="../js/jquery-3.5.1.js" type="text/javascript"></script>
    <%--引入js--%>
    <script src="../js/script.js"></script>
    <!-- Our CSS stylesheet file -->
    <link rel="stylesheet" href="../css/styles.css" />
</head>

<body>

<div id="formContainer">
    <form id="login" method="post" action="/UserInfoAPI/selectUserInfoById">
        <a href="#" id="flipToRecover" class="flipLink">Forgot?</a>
        <input type="text" name="username" id="loginUserName" value="用户名" />
        <input type="password" name="password" id="loginPassWord" value="密码" />
        <input type="submit" name="submit" value="Login" />
    </form>
    <form id="recover" method="post" action="/UserInfoAPI/insertUserInfo">
        <a href="#" id="flipToLogin" class="flipLink">Forgot?</a>
        <input type="text" name="username" id="recoverUserName" value="用户名" />
        <input type="password" name="password" id="recoverPassWord" value="密码" />
        <input type="submit" name="submit" value="Recover" />
    </form>
</div>

</body>
</html>
