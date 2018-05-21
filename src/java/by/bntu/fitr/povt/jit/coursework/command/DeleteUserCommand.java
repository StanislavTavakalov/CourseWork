
package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.dao.DataReadWriter;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.model.UserLoginList;
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
                if (DataReadWriter.deleteUserAndHisActivity(userLogin)) {
                    ((UserLoginList) (request.getSession().getAttribute("userLoginList"))).remove(userLogin);
                } else {
                    request.setAttribute("deleteUserError", MessageManager.getProperty("message.deleteusernotfounderror"));
                }
            } else {
                request.setAttribute("deleteUserError", MessageManager.getProperty("message.deleteusererror"));

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

        String page = ConfigurationManager.getProperty("path.page.administration");

        return page;
    }
}
