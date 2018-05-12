/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.logic.DataReadWriter;
import by.bntu.fitr.povt.jit.coursework.model.Activity;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Dima_T
 */
public class DeleteActivityCommand implements ActionCommand {

    private static final String PARAM_WEEK_DAY_DELETE = "weekDayDelete";
    private static final String PARAM_DELETE_INDEX = "deleteIndex";

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        System.out.println("Start");
        try {
        int index = Integer.parseUnsignedInt(request.getParameter(PARAM_DELETE_INDEX));
        String weekDay = request.getParameter(PARAM_WEEK_DAY_DELETE);
        index--; //X
       
            int indexOfElementToDelete = -1;
            //((User)(request.getSession().getAttribute("user"))).getTimeTable()
            for (Activity activity : ((User) (request.getSession().getAttribute("user"))).getTimeTable()) {
                indexOfElementToDelete++;
                if (activity.getWeekDay().equals(Activity.WeekDay.valueOf(weekDay))) {
                    if (index != 0) {
                        index--;
                    } else {
                        System.out.println("DONE BEFORE BASE");
                        DataReadWriter.deleteActivity(((User) (request.getSession().getAttribute("user"))).getTimeTable().remove(indexOfElementToDelete), (User) (request.getSession().getAttribute("user")));
                    }
                }
            }
        }
        catch(Exception ex){
            System.out.print(ex);
        }
        
         page = ConfigurationManager.getProperty("path.page.main");
// уничтожение сессии
//      request.getSession().invalidate();
        return page;
    }

}
