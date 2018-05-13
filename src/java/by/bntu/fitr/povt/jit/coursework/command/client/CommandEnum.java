package by.bntu.fitr.povt.jit.coursework.command.client;

import by.bntu.fitr.povt.jit.coursework.command.ActionCommand;
import by.bntu.fitr.povt.jit.coursework.command.AddEventCommand;
import by.bntu.fitr.povt.jit.coursework.command.AddSubjectCommand;
import by.bntu.fitr.povt.jit.coursework.command.DeleteActivityCommand;
import by.bntu.fitr.povt.jit.coursework.command.LoginCommand;
import by.bntu.fitr.povt.jit.coursework.command.LogoutCommand;
import by.bntu.fitr.povt.jit.coursework.command.RegisterCommand;
import by.bntu.fitr.povt.jit.coursework.command.ToAdministrationPageCommand;
import by.bntu.fitr.povt.jit.coursework.command.ToMainAdminPageCommand;
import by.bntu.fitr.povt.jit.coursework.command.ToRegisterPageCommand;
import by.bntu.fitr.povt.jit.coursework.command.UpdateTimeTableCommand;

public enum CommandEnum {
    LOGIN {
        {
            this.command = new LoginCommand();
        }
    },
    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    },
    
    REGISTER {
        {
            this.command = new RegisterCommand();
        }
    },
    
    TOREGISTERPAGE {
        {
            this.command = new ToRegisterPageCommand();
        }
    },
    
     ADDSUBJECT {
        {
            this.command = new AddSubjectCommand();
        }
     },
     ADDEVENT {
        {
            this.command = new AddEventCommand();
        }
    },
     
      DELETEACTIVITY {
        {
            this.command = new DeleteActivityCommand();
        }
    },
      
       UPDATETIMETABLE {
        {
            this.command = new UpdateTimeTableCommand();
        }
    },
       
     TOADMINISTRATIONPAGE {
        {
            this.command = new ToAdministrationPageCommand();
        }
    },
     
      TOMAINADMINPAGE {
        {
            this.command = new ToMainAdminPageCommand();
        }
    };
       
    
    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}
