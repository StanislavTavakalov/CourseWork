
package by.bntu.fitr.povt.jit.coursework.logic;

import by.bntu.fitr.povt.jit.coursework.dao.Registrar;

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
        return Registrar.registerLogin(enterLogin, enterPass);
    }
}
