
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
            <input type="hidden" name="command" value="toadministrationpage" />    
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
            <input type="hidden" name="command" value="toadministrationpage" />    
            <div class="buttonBack">
                <button type="submit" class="btn btn-primary btn-block btn-large ">Back</button>
            </div>
        </form>
        
        

        <div class="loginlist additonal layer">

            <table class="table table-striped ">

                <tbody>
                    <tr>
                        <td width="23%"> Time </td>
                        <td width="23%"> Name </td>
                        <td width="23%"> Place</td>
                        <td width="31%"> Additional information</td>
                    </tr>

                </tbody>
            </table>
        </div>


    </body>


</html>

