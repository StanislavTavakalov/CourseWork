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
import by.bntu.fitr.povt.jit.coursework.model.sort.ActivitySortType;
import by.bntu.fitr.povt.jit.coursework.model.sort.ActivitySorter;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import by.bntu.fitr.povt.jit.coursework.resource.MessageManager;
import java.util.GregorianCalendar;
import javax.servlet.http.HttpServletRequest;

public class AddEventCommand implements ActionCommand {

    private static final String PARAM_EVENT_DAY = "weekDayEvent";
    private static final String PARAM_EVENT_NAME = "eventName";
    private static final String PARAM_EVENT_TIME = "eventTime";
    private static final String PARAM_EVENT_PLACE = "eventPlace";
    private static final String PARAM_EVENT_END_DATE_TIME = "eventEndTime";

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;

        try {
            String weekDay = request.getParameter(PARAM_EVENT_DAY);
            String name = request.getParameter(PARAM_EVENT_NAME);
            String time = request.getParameter(PARAM_EVENT_TIME);
            String placeName = request.getParameter(PARAM_EVENT_PLACE);
            String endDateTime = request.getParameter(PARAM_EVENT_END_DATE_TIME);

            int year = Integer.parseUnsignedInt(endDateTime.substring(0, 4));
            int month = Integer.parseUnsignedInt(endDateTime.substring(5, 7));
            int day = Integer.parseUnsignedInt(endDateTime.substring(8, 10));
            int hour = Integer.parseUnsignedInt(endDateTime.substring(11, 13));
            int minute = Integer.parseUnsignedInt(endDateTime.substring(14));

            int timeHour = Integer.parseUnsignedInt(time.substring(0, 2));
            int timeMinute = Integer.parseUnsignedInt(time.substring(3));

            DataReadWriter.addActivity(
                    new Event(year, month - 1, day, hour, minute, name,
                            new Place(placeName), timeHour, timeMinute,
                            Activity.WeekDay.valueOf(weekDay)),
                    ((User) (request.getSession().getAttribute("user"))));

            ((User) (request.getSession().getAttribute("user"))).getTimeTable().add(new Event(year, month - 1, day, hour, minute, name,
                    new Place(placeName), timeHour, timeMinute,
                    Activity.WeekDay.valueOf(weekDay)));
            ActivitySorter.sort(((User) (request.getSession().getAttribute("user"))).getTimeTable(), ActivitySortType.TIME_ASC);

        } catch (Exception ex) {
            System.out.println(ex);
        }
        if(((User) (request.getSession().getAttribute("user"))).getRole()==User.Role.ADMIN)
             page = ConfigurationManager.getProperty("path.page.mainadmin");
        
        else{
            page = ConfigurationManager.getProperty("path.page.main");
        }
             
        return page;
    }
}
