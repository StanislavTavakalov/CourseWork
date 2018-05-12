package by.bntu.fitr.povt.jit.coursework.command;

import by.bntu.fitr.povt.jit.coursework.logic.DataReadWriter;
import by.bntu.fitr.povt.jit.coursework.logic.LoginLogic;
import by.bntu.fitr.povt.jit.coursework.model.Activity;
import by.bntu.fitr.povt.jit.coursework.model.Event;
import by.bntu.fitr.povt.jit.coursework.model.Place;
import by.bntu.fitr.povt.jit.coursework.model.Subject;
import by.bntu.fitr.povt.jit.coursework.model.Teacher;
import by.bntu.fitr.povt.jit.coursework.model.TimeTable;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.resource.ConfigurationManager;
import by.bntu.fitr.povt.jit.coursework.resource.MessageManager;
import java.util.GregorianCalendar;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Dima_T
 */
public class AddSubjectCommand implements ActionCommand{
    private static final String PARAM_NAME_DAY  = "weekDay";
    //private static final String PARAM_NAME_PASSWORD  = "password";
    

    public static void testFun(TimeTable timeTable){
        timeTable.add(new Subject());
        timeTable.add(new Subject());
        timeTable.add(new Subject());
    }
    @Override
    public String execute(HttpServletRequest request) {
        String page = null;
        
        request.getSession();
       //System.out.print(request.getParameterNames());
       
        System.out.println(request.getParameter(PARAM_NAME_DAY));
        
        page = ConfigurationManager.getProperty("path.page.main");

       
//            ArrayList<String> list = new ArrayList();
//            
//            list.add("sdg");
//            list.add("654");
//            request.setAttribute("list",list);
// определение пути к main.jsp
//            page = ConfigurationManager.getProperty("path.page.main");
//        } else {
       

  DataReadWriter.addActivity(new Event(), ((User)(request.getSession().getAttribute("user"))).getLogin());
  //DataReadWriter.addActivity(new Subject(), "a");
//  DataReadWriter.addActivity(new Subject(2018, new Teacher("teachers", "teacher_status"),
//          Subject.Type.LECTURE, "sport", new Place("bntu"),
//          new GregorianCalendar(2018, 5, 10, 18, 50), Activity.WeekDay.MONDAY), "a");

//  DataReadWriter.addActivity("a","subject","math","bntu",12,40,"monday",
//                "lecture",2018,"teacher","docent",0,0,0,0,0 );
            page = ConfigurationManager.getProperty("path.page.main");
//            request.setAttribute("errorLoginPassMessage",MessageManager.getProperty("message.loginerror"));
//            page = ConfigurationManager.getProperty("path.page.login");
//        }
        return page;
    }
}
