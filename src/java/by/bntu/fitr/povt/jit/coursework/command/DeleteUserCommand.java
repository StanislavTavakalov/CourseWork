package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.logic.LoginLogic;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.model.log.Log;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import by.bntu.fitr.povt.jit.coursework.resource.MessageManager;
import javax.servlet.http.HttpServletRequest;

public class DeleteUserCommand implements ActionCommand {

    private static final String PARAM_DELETE_USER = "deleteUser";

    @Override
    public String execute(HttpServletRequest request) {
        request.setAttribute("admin", ((User) (request.getSession().getAttribute("user"))).getLogin());
        try {
            String userLogin = request.getParameter(PARAM_DELETE_USER);
            if (!userLogin.equals(((User) (request.getSession().getAttribute("user"))).getLogin())) {
                //if (LoginLogic.deleteUser(userLogin, (UserLoginList) (request.getSession().getAttribute("userLoginList")))) {
                if (LoginLogic.deleteUser(userLogin, LoginLogic.getUserLoginList())) {
                    request.setAttribute("userLoginList", LoginLogic.getUserLoginList());
                } else {
                    request.setAttribute("deleteUserError", MessageManager.getProperty("message.deleteusernotfounderror"));
                }   request.setAttribute("userLoginList", LoginLogic.getUserLoginList());
            } else {
                request.setAttribute("deleteUserError", MessageManager.getProperty("message.deleteusererror"));
                request.setAttribute("userLoginList", LoginLogic.getUserLoginList());
            }
        } catch (Exception ex) {
            Log.LOG.error(ex);
        }

        String page = ConfigurationManager.getProperty("path.page.administration");

        return page;
    }
}
