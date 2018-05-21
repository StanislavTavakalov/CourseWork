package by.bntu.fitr.povt.jit.coursework.logic;

import by.bntu.fitr.povt.jit.coursework.dao.Registrar;
import by.bntu.fitr.povt.jit.coursework.model.log.Log;

public class RegisterLogic {

    public static boolean checkPasswords(String enterPass, String enterPassConfirm) {
        if (!enterPass.equals(enterPassConfirm)) {
            return false;
        }
        if (enterPass.length() == 0 || enterPassConfirm.length() == 0) {
            return false;
        }
        return true;
    }

    public static boolean registerLogin(String enterLogin, String enterPass, String enterPassConfirm) {

        if (!checkPasswords(enterPass, enterPassConfirm)) {
            return false;
        }
        if (Registrar.registerLogin(enterLogin, enterPass)) {
            Log.LOG.info("New user:" + enterLogin);
            return true;
        } else {
            return false;
        }
    }
}
