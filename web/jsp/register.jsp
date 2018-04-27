<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html><head><link rel="stylesheet" type="text/css" href="css/loginStyle2.css"><title>Registration</title></head>
<body><div class="login"><h1>Sign Up</h1><form name="registerForm" method="POST" action="controller">
<input type="hidden" name="command" value="register"/>
Login:<br/><input type="text" name="login" value=""/>
<br/>Password:<br/>
<input type="password" name="password" value=""/>
<br/>Confirm password:<br/>
<input type="password" name="passwordConfirm" value=""/>
<br/>${errorLoginPassMessage}
<br/>${wrongAction}
<br/>${nullPage}<br/>
<input type="submit" class="btn btn-primary btn-block btn-large" value="Submit"/>
</form></div>



</body>
</html>