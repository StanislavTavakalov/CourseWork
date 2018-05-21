package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.model.log.Log;
import javax.servlet.http.HttpServletRequest;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;

public class LogoutCommand
        implements
        ActionCommand {

    @Override
    public String execute(HttpServletRequest request) {
        String page = ConfigurationManager.getProperty("path.page.index");
//        String page = ConfigurationManager.getProperty("path.page.login");
        try {
            User user = (User) (request.getSession().getAttribute("user"));
            if (user != null) {
                Log.LOG.info("Logout user:" + user.getLogin());
            }
        } catch (Exception ex) {
            Log.LOG.error(ex);
        }
        request.getSession().invalidate();
        return page;
    }
}
