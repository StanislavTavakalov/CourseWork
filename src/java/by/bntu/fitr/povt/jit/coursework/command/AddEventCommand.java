package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.logic.ActivityManager;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.model.log.Log;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;

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

            ActivityManager.AddEvent(weekDay, name, time, placeName, endDateTime, ((User) (request.getSession().getAttribute("user"))));
        } catch (Exception ex) {
            Log.LOG.error(ex);
        }
        if (((User) (request.getSession().getAttribute("user"))).getRole() == User.Role.ADMIN) {
            page = ConfigurationManager.getProperty("path.page.mainadmin");
        } else {
            page = ConfigurationManager.getProperty("path.page.main");
        }

        return page;
    }
}
