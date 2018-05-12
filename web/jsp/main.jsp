
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>

        <link rel="stylesheet" type="text/css" href="css/mainPageStyle.css">
        <link rel="stylesheet" type="text/css" href="css/mainPage.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css">
        <script src="js/bootstrap.js"></script>
        <title>Welcome</title>
    </head>
    <body>
        <form name="addSubjectForm" method="POST" action="controller">
            <table class="profile"> 

                <tbody>
                    <tr>
                        <td class="profile1" rowspan="2"><img src="css/user.png" width="120" height="120"></td>
                        <th class="profile2"> ${user.login}</th>
                    </tr>
                    <tr>
                        <th class="profile2"><a  href="controller?command=logout">Logout</a></th>

                    </tr>
                </tbody>
            </table>

            <div class="button1">

                <input type="hidden" name="command" value="addsubject" />
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

            <div class="inputLayer">
                <p class="layers">Day:</p>
                <p class="layers">Name:</p>
                <p class="layers">Place:</p>
                <p class="layers">Date:</p>
                <p class="layers">Year:</p>
            </div> 
            <div class="inputForm">
                <select class="chooseDay" name="weekDay">
                    <option value="MONDAY"> Monday</option>
                    <option value="TSUESDAY"> Tsuesday</option>
                    <option value="WEDNESDAY"> Wednesday</option>
                    <option value="TSURSDAY"> Tsursday</option>
                    <option value="FRIDAY"> Friday</option>
                    <option value="SATURDAY"> Saturday</option>
                    <option value="SUNDAY"> Sunday</option>
                </select>


                <input type="text" class="" value="" />

                <input type="text" class="" value="" />

                <input type="text" class="" value="" />

                <input type="text" class="" value="" />

                <input type="text" class="" value="" />

                <input type="text" class="" value="" />
            </div>


            <div class="inputForm2">

                <input type="text" class="" value="" />

                <input type="text" class="" value="" />

                <input type="text" class="" value="" />

                <input type="text" class="" value="" />

                <input type="text" class="" value="" />

                <input type="text" class="" value="" />

                <input type="text" class="" value="" />
            </div>
            <%--c:forEach items= "${list}" var="item" >
                ${item}
            </c:forEach--%>       

            <div class="container additonal layer" style="margin-top:300px" >

                <table class="table table-striped " >
                    <c:forEach var="i"  begin="1" end="5" >
                        <thead> 
                        <td style="text-align: center" colspan="4" > Monday </td>
                        </thead>

                        <tbody>
                            <c:forEach items= "${user.timeTable.activities}" var="item" >
                                <tr>
                                    <th> ${item.name} </th>
                                    <th> ${item.place.name} </th>
                                    <th> ${item.info} </th>

                                </tr>

                            </c:forEach>
                            <%--c:forEach var="i"  begin="1" end="10" >
                                <tr>

                                <th> ${user.timetable} </th>
                                <th> 14.00 </th>
                                <th>  </th>
                                <th> 316 </th>
                            </tr>
                        </c:forEach--%>
                        </tbody>
                    </c:forEach>
                </table>
            </div>
        </form>

    </body>


</html>
