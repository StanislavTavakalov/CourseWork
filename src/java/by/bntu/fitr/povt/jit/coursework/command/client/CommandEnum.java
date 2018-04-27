package by.bntu.fitr.povt.jit.coursework.command.client;

import by.bntu.fitr.povt.jit.coursework.command.ActionCommand;
import by.bntu.fitr.povt.jit.coursework.command.LoginCommand;
import by.bntu.fitr.povt.jit.coursework.command.LogoutCommand;
import by.bntu.fitr.povt.jit.coursework.command.RegisterCommand;
import by.bntu.fitr.povt.jit.coursework.command.ToRegisterPageCommand;

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
    };
    
    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }
}
