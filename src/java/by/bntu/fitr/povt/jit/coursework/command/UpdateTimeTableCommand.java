
package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.logic.ActivityInspector;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import javax.servlet.http.HttpServletRequest;

public class UpdateTimeTableCommand implements ActionCommand{
    
    @Override
    public String execute(HttpServletRequest request) {
        try{
        
        ActivityInspector.checkAndRemove((User) (request.getSession().getAttribute("user")));
        }catch(Exception ex){
            System.out.println(ex);
        }
        String page;
        
        if(((User) (request.getSession().getAttribute("user"))).getRole()==User.Role.ADMIN)
             page = ConfigurationManager.getProperty("path.page.mainadmin");
        
        else{
            page = ConfigurationManager.getProperty("path.page.main");
        }
        
        return page;
    }
    
    
}
