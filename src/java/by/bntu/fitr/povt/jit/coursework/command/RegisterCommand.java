/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.logic.RegisterLogic;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import by.bntu.fitr.povt.jit.coursework.resource.MessageManager;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Dima_T
 */
public class RegisterCommand implements ActionCommand {

    private static final String PARAM_NAME_LOGIN = "login";
    private static final String PARAM_NAME_PASSWORD = "password";
    private static final String PARAM_NAME_PASSWORD_CONFIRM = "passwordConfirm";

    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
// извлечение из запроса логина и пароля
        String login = request.getParameter(
                PARAM_NAME_LOGIN
        );
        String pass = request.getParameter(
                PARAM_NAME_PASSWORD
        );
        String passConf = request.getParameter(
                PARAM_NAME_PASSWORD_CONFIRM
        );
// проверка логина и пароля
        if (RegisterLogic.checkPasswords(pass, passConf)) {

            if (RegisterLogic.registerLogin(login, pass, passConf)) {
                request.setAttribute("user", login);
// определение пути к main.jsp
                page = ConfigurationManager.getProperty("path.page.login");
            } else {
                request.setAttribute("errorLoginPassMessage", MessageManager.getProperty("message.loginexisterror"));
                page = ConfigurationManager.getProperty("path.page.register");
            }
        }
        else{
            request.setAttribute("errorLoginPassMessage", MessageManager.getProperty("message.passwordserror"));
            page = ConfigurationManager.getProperty("path.page.register");
        }
        return page;
    }
}
