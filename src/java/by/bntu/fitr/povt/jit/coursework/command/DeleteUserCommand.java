/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.logic.DataReadWriter;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.model.UserLoginList;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Dima_T
 */
public class DeleteUserCommand implements ActionCommand {
    private static final String PARAM_DELETE_USER = "deleteUser";
    //private static final String PARAM_EVENT_NAME = "eventName";
    
    @Override
    public String execute(HttpServletRequest request) {
        request.setAttribute("admin", ((User) (request.getSession().getAttribute("user"))).getLogin());
        try{
            String userLogin = request.getParameter(PARAM_DELETE_USER);
            if(!userLogin.equals(((User) (request.getSession().getAttribute("user"))).getLogin())){
            DataReadWriter.deleteUserAndHisActivity(userLogin);
            ((UserLoginList) (request.getSession().getAttribute("userLoginList"))).remove(userLogin);
            }
        }
        
        catch(Exception ex){
            System.out.println(ex);
        }
        
        
        String page = ConfigurationManager.getProperty("path.page.administration");
        
        
        //  request.getSession().invalidate();
        return page;
    }
}
