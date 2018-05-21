package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.dao.DataReadWriter;
import javax.servlet.http.HttpServletRequest;
import by.bntu.fitr.povt.jit.coursework.logic.LoginLogic;
import by.bntu.fitr.povt.jit.coursework.model.Subject;
import by.bntu.fitr.povt.jit.coursework.model.TimeTable;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.model.UserLoginList;
import by.bntu.fitr.povt.jit.coursework.model.log.Log;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import by.bntu.fitr.povt.jit.coursework.resource.MessageManager;

public class LoginCommand implements ActionCommand {

    private static final String PARAM_NAME_LOGIN = "login";
    private static final String PARAM_NAME_PASSWORD = "password";

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;

        String login = request.getParameter(PARAM_NAME_LOGIN);
        String pass = request.getParameter(PARAM_NAME_PASSWORD);

        if (LoginLogic.checkLogin(login, pass)) {

            User user;
            if (login.equals("admin")) {
                user = new User(login, pass, User.Role.ADMIN, new TimeTable());
                UserLoginList userLoginList = UserLoginList.getInstance();
                DataReadWriter.readAllUserLogins(userLoginList);
                request.getSession().setAttribute("userLoginList", userLoginList);
            } else {
                user = new User(login, pass, User.Role.USER, new TimeTable());
            }

            LoginLogic.login(user);

            request.setAttribute("user", user);
            request.getSession().setAttribute("user", user);

            if (user.getRole() == User.Role.ADMIN) {
                page = ConfigurationManager.getProperty("path.page.mainadmin");
            } else {
                page = ConfigurationManager.getProperty("path.page.main");
            }

        } else {
            request.setAttribute("errorLoginPassMessage", MessageManager.getProperty("message.loginerror"));
            page = ConfigurationManager.getProperty("path.page.login");
            Log.LOG.warn("wrong login or password login:" + login);
        }
        return page;
    }
}
