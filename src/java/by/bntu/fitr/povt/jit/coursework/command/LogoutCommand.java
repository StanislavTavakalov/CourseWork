package by.bntu.fitr.povt.jit.coursework.command;

import javax.servlet.http.HttpServletRequest;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;

public class LogoutCommand
        implements
        ActionCommand {

    @Override
    public String execute(HttpServletRequest request) {
        String page = ConfigurationManager.getProperty("path.page.index");
        request.getSession().invalidate();
        return page;
    }
}
