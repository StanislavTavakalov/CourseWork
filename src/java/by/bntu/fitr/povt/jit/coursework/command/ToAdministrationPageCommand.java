/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Dima_T
 */
public class ToAdministrationPageCommand implements
        ActionCommand {

    @Override
    public String execute(HttpServletRequest request) {
        request.setAttribute("admin", "admin");
        String page = ConfigurationManager.getProperty("path.page.administration");
        return page;
    }
}
