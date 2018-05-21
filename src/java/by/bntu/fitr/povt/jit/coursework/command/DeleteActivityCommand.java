/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.logic.ActivityManager;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import javax.servlet.http.HttpServletRequest;

public class DeleteActivityCommand implements ActionCommand {

    private static final String PARAM_WEEK_DAY_DELETE = "weekDayDelete";
    private static final String PARAM_DELETE_INDEX = "deleteIndex";

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        
        try {
        int index = Integer.parseUnsignedInt(request.getParameter(PARAM_DELETE_INDEX));
        String weekDay = request.getParameter(PARAM_WEEK_DAY_DELETE);
        index--; 
        ActivityManager.deleteActivity(index, weekDay, (User)(request.getSession().getAttribute("user")));

        }
        catch(Exception ex){
            System.out.print(ex);
        }
        
        if(((User) (request.getSession().getAttribute("user"))).getRole()==User.Role.ADMIN)
             page = ConfigurationManager.getProperty("path.page.mainadmin");
        
        else{
            page = ConfigurationManager.getProperty("path.page.main");
        }
        return page;
    }

}
