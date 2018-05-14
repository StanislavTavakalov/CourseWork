package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.logic.ActivityInspector;
import by.bntu.fitr.povt.jit.coursework.dao.DataReadWriter;
import javax.servlet.http.HttpServletRequest;
import by.bntu.fitr.povt.jit.coursework.logic.LoginLogic;
import by.bntu.fitr.povt.jit.coursework.model.Subject;
import by.bntu.fitr.povt.jit.coursework.model.TimeTable;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.model.UserLoginList;
import by.bntu.fitr.povt.jit.coursework.model.sort.ActivitySortType;
import by.bntu.fitr.povt.jit.coursework.model.sort.ActivitySorter;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import by.bntu.fitr.povt.jit.coursework.resource.MessageManager;
import java.util.ArrayList;

public class LoginCommand implements ActionCommand {

    private static final String PARAM_NAME_LOGIN = "login";
    private static final String PARAM_NAME_PASSWORD = "password";

    public static void testFun(TimeTable timeTable) {
        timeTable.add(new Subject());
        timeTable.add(new Subject());
        timeTable.add(new Subject());
    }

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;

// извлечение из запроса логина и пароля
        String login = request.getParameter(PARAM_NAME_LOGIN);
        String pass = request.getParameter(PARAM_NAME_PASSWORD);

// проверка логина и пароля
        if (LoginLogic.checkLogin(login, pass)) {
            //TimeTable timeTable = ;
            //testFun(timeTable);
            User user;
            if (login.equals("admin")) {
                user = new User(login, pass, User.Role.ADMIN, new TimeTable());
                UserLoginList userLoginList = UserLoginList.getInstance();
                DataReadWriter.readAllUserLogins(userLoginList);
                request.getSession().setAttribute("userLoginList", userLoginList);
            } else {
                user = new User(login, pass, User.Role.USER, new TimeTable());
            }

            //User user = new  User(login,pass,User.Role.USER,new TimeTable());
            LoginLogic.login(user);

            request.setAttribute("user", user);
            request.getSession().setAttribute("user", user);
//            ArrayList<String> list = new ArrayList();
//            
//            list.add("sdg");
//            list.add("654");
//            request.setAttribute("list",list);

// определение пути к main.jsp
            if (user.getRole() == User.Role.ADMIN) {
                page = ConfigurationManager.getProperty("path.page.mainadmin");
            } else {
                page = ConfigurationManager.getProperty("path.page.main");
            }

        } else {
            request.setAttribute("errorLoginPassMessage", MessageManager.getProperty("message.loginerror"));
            page = ConfigurationManager.getProperty("path.page.login");
        }
        return page;
    }
}
