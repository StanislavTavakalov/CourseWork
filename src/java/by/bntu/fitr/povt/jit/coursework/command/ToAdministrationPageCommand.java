
package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import javax.servlet.http.HttpServletRequest;

public class ToAdministrationPageCommand implements
        ActionCommand {

    @Override
    public String execute(HttpServletRequest request) {
        request.setAttribute("admin", ((User) (request.getSession().getAttribute("user"))).getLogin());
        String page = ConfigurationManager.getProperty("path.page.administration");
        return page;
    }
}
