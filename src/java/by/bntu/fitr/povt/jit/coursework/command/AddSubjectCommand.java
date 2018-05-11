/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.logic.LoginLogic;
import by.bntu.fitr.povt.jit.coursework.model.Subject;
import by.bntu.fitr.povt.jit.coursework.model.TimeTable;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import by.bntu.fitr.povt.jit.coursework.resource.MessageManager;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Dima_T
 */
public class AddSubjectCommand implements ActionCommand{
    private static final String PARAM_NAME_DAY  = "test";
    //private static final String PARAM_NAME_PASSWORD  = "password";
    

    public static void testFun(TimeTable timeTable){
        timeTable.add(new Subject());
        timeTable.add(new Subject());
        timeTable.add(new Subject());
    }
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        
        request.getSession();
       //System.out.print(request.getParameterNames());
       // System.out.println(request.getParameter(PARAM_NAME_DAY));
        
        page = ConfigurationManager.getProperty("path.page.main");

        return page;
    }
}
