/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.command.factory;

import javax.servlet.http.HttpServletRequest;
import by.bntu.fitr.povt.jit.coursework.command.ActionCommand;
import by.bntu.fitr.povt.jit.coursework.command.client.CommandEnum;
import by.bntu.fitr.povt.jit.coursework.resource.MessageManager;

public class ActionFactory {

    public ActionCommand defineCommand(HttpServletRequest request) {
        ActionCommand current = CommandEnum.EMPTY.getCurrentCommand();
        String action = request.getParameter("command");
        if (action == null || action.isEmpty()) {
            return current;
        }
        try {
            CommandEnum currentEnum = CommandEnum.valueOf(action.toUpperCase());
            current = currentEnum.getCurrentCommand();
        } catch (IllegalArgumentException e) {
            request.setAttribute("wrongAction", action + MessageManager.getProperty("message.wrongaction"));
        }
        return current;
    }
}
