
package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.logic.LoginLogic;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import javax.servlet.http.HttpServletRequest;

public class ToAdministrationPageCommand implements
        ActionCommand {

    @Override
    public String execute(HttpServletRequest request) {
        request.setAttribute("admin", ((User) (request.getSession().getAttribute("user"))).getLogin());
        request.setAttribute("userLoginList", LoginLogic.getUserLoginList());
        String page = ConfigurationManager.getProperty("path.page.administration");
        return page;
    }
}
