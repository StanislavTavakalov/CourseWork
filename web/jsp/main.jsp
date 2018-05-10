
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/loginStyle2.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
        <script src="js/bootstrap.js"> </script>
        <title>Welcome</title>
    </head>
    <body>
        <style>
            table.profile {
                width: 12%; /* Ширина таблицы */
                color: #ffff00; /* Цвет текста */

            }
            td.profile1{
                padding: 5px; /* Поля вокруг текста */
            }
            th.profile2{
                padding: 5px; /* Поля вокруг текста */
            }
            div.additonal{
                padding:0px; 
                background-color: white;
            }
        </style>
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

         <c:forEach items= "${list}" var="item" >
                         ${item}
                    </c:forEach>       
        
        <div class="container additonal" style="margin-top:300px" >
            
            <table class="table table-striped table-hover" >
                <thead> 
                <td style="text-align: center" colspan="4" > Monday </td>
                </thead>
                    
                <tbody>
                    
                    <c:forEach var="i"  begin="1" end="5" >
                        <tr>
                            <th> Math </th>
                            <th> 14.00 </th>
                            <th>  </th>
                            <th> 316 </th>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>


</html>
