package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.logic.DataReadWriter;
import by.bntu.fitr.povt.jit.coursework.logic.LoginLogic;
import by.bntu.fitr.povt.jit.coursework.model.Activity;
import by.bntu.fitr.povt.jit.coursework.model.Event;
import by.bntu.fitr.povt.jit.coursework.model.Place;
import by.bntu.fitr.povt.jit.coursework.model.Subject;
import by.bntu.fitr.povt.jit.coursework.model.Teacher;
import by.bntu.fitr.povt.jit.coursework.model.TimeTable;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import by.bntu.fitr.povt.jit.coursework.resource.MessageManager;
import java.util.GregorianCalendar;
import javax.servlet.http.HttpServletRequest;

public class AddEventCommand implements ActionCommand {

    private static final String PARAM_EVENT_DAY = "weekDayEvent";
    private static final String PARAM_EVENT_NAME = "eventName";
    private static final String PARAM_EVENT_TIME = "eventTime";
    private static final String PARAM_EVENT_PLACE = "eventPlace";
    private static final String PARAM_EVENT_END_TIME = "eventEndTime";
 
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;

//        try {
//            String weekDay = request.getParameter(PARAM_SUBJECT_DAY);
//            String name = request.getParameter(PARAM_SUBJECT_NAME);
//            String time = request.getParameter(PARAM_SUBJECT_TIME);
//            String type = request.getParameter(PARAM_SUBJECT_TYPE);
//            String year = request.getParameter(PARAM_SUBJECT_YEAR);
//            String placeName = request.getParameter(PARAM_SUBJECT_PLACE_NAME);
//            String teacherName = request.getParameter(PARAM_SUBJECT_TEACHER_NAME);
//            String teacherStatus = request.getParameter(PARAM_SUBJECT_TEACHER_STATUS);
//
//            int hour = Integer.parseUnsignedInt(time.substring(0, 2));
//            //System.out.println(hour);
//            int minute = Integer.parseUnsignedInt(time.substring(3));
//            //System.out.println(minute);
//
//       
//            DataReadWriter.addActivity(
//                    new Event(Integer.parseInt(year),
//                            new Teacher(teacherName, teacherStatus),
//                            Subject.Type.valueOf(type), name, new Place(placeName),
//                            hour, minute,
//                            Activity.WeekDay.valueOf(weekDay)),
//                    ((User) (request.getSession().getAttribute("user"))));
//
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
        page = ConfigurationManager.getProperty("path.page.main");
        return page;
    }
}
