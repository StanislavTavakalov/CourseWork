
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>

        <link rel="stylesheet" type="text/css" href="css/pageStyle.css">
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
                    <th class="profile2"> ${user.login}</th>
                </tr>
                <tr>
                    <th class="profile2"><a  href="controller?command=logout">Logout</a></th>

                </tr>
            </tbody>
        </table>

        <form name="addSubjectForm" method="POST" action="controller">
            <div class="button1">
                <input type="hidden" name="command" value="addsubject" />
                <button type="submit" class="btn btn-primary btn-block btn-large ">Add subject</button>

            </div>


            <div class="inputLayer1">
                <p class="layers">Day:</p>
                <p class="layers">Name:</p>
                <p class="layers">Time:</p>
                <p class="layers">Type:</p>
                <p class="layers">Place:</p>
            </div> 

            <%--MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY --%>
            <div class="inputForm1">
                <select class="choose" style="width: 80%" name="weekDaySubject">
                    <option value="MONDAY"> Monday</option>
                    <option value="TUESDAY"> Tuesday</option>
                    <option value="WEDNESDAY"> Wednesday</option>
                    <option value="THURSDAY"> Thursday</option>
                    <option value="FRIDAY"> Friday</option>
                    <option value="SATURDAY"> Saturday</option>
                    <option value="SUNDAY"> Sunday</option>
                </select>

                <input type="text" style="width: 80%" name="subjectName" class="" value="" />

                <input type="time" style="width: 80%" name="subjectTime" class="" value="" />

                <select class="choose" style="width: 80%" name="subjectType">
                    <option value="LECTURE"> Lecture</option>
                    <option value="PRACTISE"> Practise</option>
                </select>

                <input type="text" style="width: 80%" name="subjectPlace" class="" value="" />

            </div>


            <div class="inputLayer4">
                <p class="layers">Year:</p>
                <p class="layers">Teacher info:</p>
            </div> 

            <div class="inputForm4">
                <input type="number" style="width: 80%" name="subjectYear" class="" value="2018" />
            </div>


            <div class="inputLayer2">
                <p class="layers">Name:</p>
                <p class="layers">Status:</p>
            </div> 

            <div class="inputForm2">
                <input type="text" style="width: 80%" name="teacherName" class="" value="" />
                <input type="text" style="width: 80%" name="teacherStatus" class="" value="" />
            </div>


        </form>
        <form name="addEventForm" method="POST" action="controller">
            <input type="hidden" name="command" value="addevent" />
            <div class="button2">

                <button type="submit" class="btn btn-primary btn-block btn-large ">Add event</button>
            </div>

            <div class="inputLayer3">
                <p class="layers">Day:</p>
                <p class="layers">Name:</p>
                <p class="layers">Time:</p>
                <p class="layers">End Time:</p>
                <p class="layers">Place:</p>

            </div> 

            <%--MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY --%>
            <div class="inputForm3">
                <select style="width: 80%" class="choose" name="weekDayEvent">
                    <option value="MONDAY"> Monday</option>
                    <option value="TUESDAY"> Tuesday</option>
                    <option value="WEDNESDAY"> Wednesday</option>
                    <option value="THURSDAY"> Thursday</option>
                    <option value="FRIDAY"> Friday</option>
                    <option value="SATURDAY"> Saturday</option>
                    <option value="SUNDAY"> Sunday</option>
                </select>


                <input type="text" style="width: 80%" name="eventName" class="" value="" />

                <input type="time" style="width: 80%" name="eventTime" class="" value="" />

                <input type="datetime-local" style="width: 80%" name="eventEndTime" class="" value="" />

                <input type="text" style="width: 80%" name="eventPlace" class="" value="" />



            </div>

        </form>
        <form name="deleteActivityForm" method="POST" action="controller">
            <input type="hidden" name="command" value="deleteactivity" />
            <div class="button3">
                <button type="submit" class="btn btn-primary btn-block btn-large ">Delete activity</button>
            </div>

            <div class="inputLayerDelete">
                <p class="layers">Day:</p>
                <p class="layers">Index:</p>
            </div> 

            <div class="inputFormDelete">
                <select style="width: 100%" class="choose" name="weekDayDelete">
                    <option value="MONDAY"> Monday</option>
                    <option value="TUESDAY"> Tuesday</option>
                    <option value="WEDNESDAY"> Wednesday</option>
                    <option value="THURSDAY"> Thursday</option>
                    <option value="FRIDAY"> Friday</option>
                    <option value="SATURDAY"> Saturday</option>
                    <option value="SUNDAY"> Sunday</option>
                </select>
                <input type="number" style="width: 100%" name="deleteIndex" class="" value="1" />
            </div>


        </form>
            
            
        <form name="updateTimeTable" method="POST" action="controller">
        <input type="hidden" name="command" value="updatetimetable" />    
        <div class="button4">
            <button type="submit" class="btn btn-primary btn-block btn-large ">Update timetable</button>
        </div>
        </form>
            
        <form name="administrationForm" method="POST" action="controller">
        <input type="hidden" name="command" value="toadministrationpage" />    
        <div class="button5">
            <button type="submit" class="btn btn-primary btn-block btn-large ">Administration</button>
        </div>
        </form>






        <div class="container additonal layer" style="width: 84%" >

            <table class="table table-striped ">
                <%--c:forEach var="i"  begin="1" end="5" --%>
                <c:forTokens items = "MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY" delims = "," var = "weekday">


                    <thead> 
                    <td style="text-align: center" colspan="4" > ${weekday} </td>
                    
                    </thead>

                    <tbody>
                        <tr>
                            <td width="24%"> Time </td>
                            <td width="24%"> Name </td>
                            <td width="24%"> Place</td>
                            <td width="28%"> Additional information</td>
                        </tr>
                        <c:forEach items= "${user.timeTable.activities}" var="item" >
                            <c:if test="${item.weekDay.toString()==weekday}"> 
                                <tr>
                                    <th> ${item.time} </th>
                                    <th> ${item.name} </th>
                                    <th> ${item.place.name} </th>
                                    <th> ${item.info} </th>

                                </tr>
                            </c:if>
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
                    <%--/c:forEach--%>
                </c:forTokens>
            </table>
        </div>


    </body>


</html>

