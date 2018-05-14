
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>

        <link rel="stylesheet" type="text/css" href="css/mainPageStyle.css">
        <link rel="stylesheet" type="text/css" href="css/administrationPage.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
        <script src="js/bootstrap.js"></script>
        <title>Administration</title>
    </head>
    <body>

        <form name="deleteUserForm" method="POST" action="controller">
            <input type="hidden" name="command" value="deleteuser" />    
            <div class="buttonDelete">
                <button type="submit" class="btn btn-primary btn-block btn-large ">Delete user</button>
            </div>

            <div class="inputLayerDelete">
                <p class="layers">Login:</p>
            </div> 

            <div class="inputFormDelete">
                <input type="text" style="width: 100%" name="deleteUser" class="" value="" />
            </div>

            <div class="inputLayerTable">
                <p class="layers">User list:</p>
            </div> 

        </form>


        <form name="backToMainAdminForm" method="POST" action="controller">
            <input type="hidden" name="command" value="tomainadminpage" />    
            <div class="buttonBack">
                <button type="submit" class="btn btn-primary btn-block btn-large ">Back</button>
                <p class="layers">${deleteUserError}</p>
            </div>
        </form>



            <div class="loginlist additonal layer" style="width: 38%">

            <table class="table table-striped ">
                <thead> 
                <td style="text-align: center" colspan="4" > Login </td>
                </thead>
                <tbody>
                    
                    <c:forEach items= "${userLoginList.iterator()}" var="login" >
                        <c:if test="${login!=admin}"> 
                            <tr>
                                <th> ${login} </th>
                            </tr>
                        </c:if>
                    </c:forEach>

                </tbody>
            </table>
        </div>


    </body>


</html>

