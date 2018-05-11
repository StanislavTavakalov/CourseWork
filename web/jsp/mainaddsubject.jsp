
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/loginStyle2.css">
        <link rel="stylesheet" type="text/css" href="css/mainPage.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
        <script src="js/bootstrap.js"></script>
        <title>Welcome</title>
    </head>
    <body>
        
        <table class="profile"> 

            <tbody>
                <tr>
                    <td class="profile1" rowspan="2"><img src="css/user.png" width="120" height="120"></td>
                    <th class="profile2"> ${user}</th>
                </tr>
                <tr>
                    <th class="profile2"><a  href="controller?command=logout">Logout</a></th>

                </tr>
            </tbody>
        </table>
        <div class="button1">
            <button type="submit" class="btn btn-primary btn-block btn-large ">Add subject</button>
        </div>
                
        <div class="button2">
            <button type="submit" class="btn btn-primary btn-block btn-large ">Add event</button>
        </div>
                
        <div class="button3">
            <button type="submit" class="btn btn-primary btn-block btn-large ">Delete subject</button>
        </div>
                
        <div class="button4">
            <button type="submit" class="btn btn-primary btn-block btn-large ">Delete event</button>
        </div>

        <%--c:forEach items= "${list}" var="item" >
            ${item}
        </c:forEach--%>       

        <div class="container additonal layer" style="margin-top:300px" >

            <table class="table table-striped " >
                <c:forEach var="i"  begin="1" end="60" >
                    <thead> 
                    <td style="text-align: center" colspan="4" > Monday </td>
                    </thead>

                    <tbody>

                        <c:forEach var="i"  begin="1" end="10" >
                            <tr>
                                <th> Math </th>
                                <th> 14.00 </th>
                                <th>  </th>
                                <th> 316 </th>
                            </tr>
                        </c:forEach>
                    </tbody>
                </c:forEach>
            </table>
        </div>
    </body>


</html>
