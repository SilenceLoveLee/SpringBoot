<%@ page language="java"  contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>登录管理</title>
    <meta name="description" content="登录界面">
    <meta name="keywords" content="登录界面">
    <!-- 引入jquery -->
    <script src="/js/jquery-3.5.1.js" type="text/javascript"></script>
    <link href="" rel="stylesheet">
    <style>
        body,p,div,ul,li,h1,h2,h3,h4,h5,h6{
            margin:0;
            padding: 0;
        }
        body{
            background: #E9E9E9;
        }
        #login{
            width: 400px;
            height: 250px;
            background: #FFF;
            margin:200px auto;
            position: relative;
        }
        #login h1{
            text-align:center;
            position:absolute;
            left:155px;
            top:-40px;
            font-size:21px;
        }
        #login form p{
            text-align: center;
        }
        #user{
            background:url(images/user.png) rgba(0,0,0,.1) no-repeat;
            width: 200px;
            height: 30px;
            border:solid #ccc 1px;
            border-radius: 3px;
            padding-left: 32px;
            margin-top: 50px;
            margin-bottom: 30px;
        }
        #pwd{
            background: url(images/pwd.png) rgba(0,0,0,.1) no-repeat;
            width: 200px;
            height: 30px;
            border:solid #ccc 1px;
            border-radius: 3px;
            padding-left: 32px;
            margin-bottom: 30px;
        }
        #submit{
            width: 232px;
            height: 30px;
            background: rgba(0,0,0,.1);
            border:solid #ccc 1px;
            border-radius: 3px;
        }
        #submit:hover{
            cursor: pointer;
            background:#D8D8D8;
        }
    </style>
</head>
<body>
<div id="login">
    <h1>登录管理</h1>
    <form method="post" action="/UserInfoAPI/selectUserInfoById">
        <p><input type="text" name="userName" id="user" placeholder="用户名"></p>
        <p><input type="password" name="passWord" id="pwd" placeholder="密码"></p>
        <p><input type="submit" id="submit" value="登录"></p>
    </form>
</div>
</body>
</html>


