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
    private static final String PARAM_NAME_DAY  = "day";
    //private static final String PARAM_NAME_PASSWORD  = "password";
    

    public static void testFun(TimeTable timeTable){
        timeTable.add(new Subject());
        timeTable.add(new Subject());
        timeTable.add(new Subject());
    }
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        
// извлечение из запроса логина и пароля
        String day = request.getParameter(PARAM_NAME_DAY);
     //   String pass = request.getParameter(PARAM_NAME_PASSWORD);
        
// проверка логина и пароля
       // if (LoginLogic.checkLogin(login, pass)) {
//            TimeTable timeTable = new TimeTable();
//            testFun(timeTable);
//            User user = new  User(login,pass,User.Role.USER,timeTable);
//            
//            request.setAttribute("user", user);

        System.out.println(day);
//            ArrayList<String> list = new ArrayList();
//            
//            list.add("sdg");
//            list.add("654");
//            request.setAttribute("list",list);
            
// определение пути к main.jsp
//            page = ConfigurationManager.getProperty("path.page.main");
//        } else {
            page = ConfigurationManager.getProperty("path.page.main");
//            request.setAttribute("errorLoginPassMessage",MessageManager.getProperty("message.loginerror"));
//            page = ConfigurationManager.getProperty("path.page.login");
//        }
        return page;
    }
}
