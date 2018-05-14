package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.logic.ActivityManager;
import by.bntu.fitr.povt.jit.coursework.dao.DataReadWriter;
import by.bntu.fitr.povt.jit.coursework.logic.LoginLogic;
import by.bntu.fitr.povt.jit.coursework.model.Activity;
import by.bntu.fitr.povt.jit.coursework.model.Event;
import by.bntu.fitr.povt.jit.coursework.model.Place;
import by.bntu.fitr.povt.jit.coursework.model.Subject;
import by.bntu.fitr.povt.jit.coursework.model.Teacher;
import by.bntu.fitr.povt.jit.coursework.model.TimeTable;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.model.sort.ActivitySortType;
import by.bntu.fitr.povt.jit.coursework.model.sort.ActivitySorter;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import by.bntu.fitr.povt.jit.coursework.resource.MessageManager;
import java.util.GregorianCalendar;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Dima_T
 */
public class AddSubjectCommand implements ActionCommand {

    private static final String PARAM_SUBJECT_DAY = "weekDaySubject";
    private static final String PARAM_SUBJECT_NAME = "subjectName";
    private static final String PARAM_SUBJECT_TIME = "subjectTime";
    private static final String PARAM_SUBJECT_TYPE = "subjectType";
    private static final String PARAM_SUBJECT_YEAR = "subjectYear";
    private static final String PARAM_SUBJECT_PLACE_NAME = "subjectPlace";
    private static final String PARAM_SUBJECT_TEACHER_NAME = "teacherName";
    private static final String PARAM_SUBJECT_TEACHER_STATUS = "teacherStatus";
//    private static final String PARAM_EVENT_DAY = "weekDayEvent";
//    private static final String PARAM_EVENT_NAME = "eventName";
//    private static final String PARAM_EVENT_TIME = "eventTime";
//    private static final String PARAM_EVENT_PLACE = "eventPlace";
//    private static final String PARAM_EVENT_END_TIME = "eventEndTime";
    //private static final String PARAM_NAME_PASSWORD  = "password";

    public static void testFun(TimeTable timeTable) {
        timeTable.add(new Subject());
        timeTable.add(new Subject());
        timeTable.add(new Subject());
    }

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;

        try {
            String weekDay = request.getParameter(PARAM_SUBJECT_DAY);
            String name = request.getParameter(PARAM_SUBJECT_NAME);
            String time = request.getParameter(PARAM_SUBJECT_TIME);
            String type = request.getParameter(PARAM_SUBJECT_TYPE);
            String year = request.getParameter(PARAM_SUBJECT_YEAR);
            String placeName = request.getParameter(PARAM_SUBJECT_PLACE_NAME);
            String teacherName = request.getParameter(PARAM_SUBJECT_TEACHER_NAME);
            String teacherStatus = request.getParameter(PARAM_SUBJECT_TEACHER_STATUS);
            ActivityManager.addSubject(weekDay, name, time, type, year, placeName,
                    teacherName, teacherStatus, (User) (request.getSession().getAttribute("user")));
//            int hour = Integer.parseUnsignedInt(time.substring(0, 2));
//            //System.out.println(hour);
//            int minute = Integer.parseUnsignedInt(time.substring(3));
//            //System.out.println(minute);
//
//            DataReadWriter.addActivity(
//                    new Subject(Integer.parseInt(year),
//                            new Teacher(teacherName, teacherStatus),
//                            Subject.Type.valueOf(type), name, new Place(placeName),
//                            hour, minute,
//                            Activity.WeekDay.valueOf(weekDay)),
//                    ((User) (request.getSession().getAttribute("user"))));
//
//            ((User) (request.getSession().getAttribute("user"))).getTimeTable().add(new Subject(Integer.parseInt(year),
//                    new Teacher(teacherName, teacherStatus),
//                    Subject.Type.valueOf(type), name, new Place(placeName),
//                    hour, minute,
//                    Activity.WeekDay.valueOf(weekDay)));
//            ActivitySorter.sort(((User) (request.getSession().getAttribute("user"))).getTimeTable(), ActivitySortType.TIME_ASC);

        } catch (Exception ex) {
            System.out.println(ex);
        }

        //request.getSession();
        //System.out.print(request.getParameterNames());
        //System.out.println(request.getParameter(PARAM_NAME_DAY));
        //System.out.println(request.getParameter("testtime"));
        //page = ConfigurationManager.getProperty("path.page.main");

//            ArrayList<String> list = new ArrayList();
//            
//            list.add("sdg");
//            list.add("654");
//            request.setAttribute("list",list);
// определение пути к main.jsp
//            page = ConfigurationManager.getProperty("path.page.main");
//        } else {
        //DataReadWriter.addActivity(new Event(), ((User)(request.getSession().getAttribute("user"))));
        //DataReadWriter.addActivity(new Subject(), "a");
//  DataReadWriter.addActivity(new Subject(2018, new Teacher("teachers", "teacher_status"),
//          Subject.Type.LECTURE, "sport", new Place("bntu"),
//          new GregorianCalendar(2018, 5, 10, 18, 50), Activity.WeekDay.MONDAY), "a");
//  DataReadWriter.addActivity("a","subject","math","bntu",12,40,"monday",
//                "lecture",2018,"teacher","docent",0,0,0,0,0 );
      if(((User) (request.getSession().getAttribute("user"))).getRole()==User.Role.ADMIN)
             page = ConfigurationManager.getProperty("path.page.mainadmin");
        
        else{
            page = ConfigurationManager.getProperty("path.page.main");
        }
      
        return page;
    }
}
