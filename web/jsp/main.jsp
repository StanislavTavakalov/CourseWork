<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/loginStyle2.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <title>Welcome</title>
    </head>
    <body>
        <style>
   table {
    width: 12%; /* Ширина таблицы */
    color: #ffff00; /* Цвет текста */
    
   }
   td, th {
    padding: 5px; /* Поля вокруг текста */
   }
  </style>
        <table> 

            <tbody>
                <tr>
                    <td rowspan="2"><img src="css/user.png" width="120" height="120"></td>
                    <th> ${user}</th>
                </tr>
                <tr>
                    <th><a  href="controller?command=logout">Logout</a></th>
                </tr>
            </tbody>
        </table>


    </body>
</html>
