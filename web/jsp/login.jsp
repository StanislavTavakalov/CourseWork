<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html><head><link rel="stylesheet" type="text/css" href="css/loginStyle.css"><title>Login</title></head>
<body><div class="login"><h1>Sign in</h1><form name="loginForm" method="POST" action="controller">
        
<input type="hidden" name="command" value="login" />

Login:<br/><input type="text" name="login" value="" />
<br/>
Password:
<br/>
<input type="password" name="password" value=""/>
<br/>${errorLoginPassMessage}
<br/>${wrongAction}
<br/>${nullPage}<br/>
<button type="submit" class="btn btn-primary btn-block btn-large">Submit</button>
</form>

<form name="registerForm" method="POST" action="controller">
<input type="hidden" name="command" value="toregisterpage" />
<button type="submit" class="btn btn-primary btn-block btn-large">Register</button>
</form>
</div>

</body>
</html>