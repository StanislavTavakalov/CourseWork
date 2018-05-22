package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.logic.ActivityManager;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.model.log.Log;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import javax.servlet.http.HttpServletRequest;

public class AddSubjectCommand implements ActionCommand {

    private static final String PARAM_SUBJECT_DAY = "weekDaySubject";
    private static final String PARAM_SUBJECT_NAME = "subjectName";
    private static final String PARAM_SUBJECT_TIME = "subjectTime";
    private static final String PARAM_SUBJECT_TYPE = "subjectType";
    private static final String PARAM_SUBJECT_YEAR = "subjectYear";
    private static final String PARAM_SUBJECT_PLACE_NAME = "subjectPlace";
    private static final String PARAM_SUBJECT_TEACHER_NAME = "teacherName";
    private static final String PARAM_SUBJECT_TEACHER_STATUS = "teacherStatus";

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
        } catch (Exception ex) {
            Log.LOG.error(ex);
        }

        page = ConfigurationManager.getProperty("path.page.main");

        return page;
    }
}
