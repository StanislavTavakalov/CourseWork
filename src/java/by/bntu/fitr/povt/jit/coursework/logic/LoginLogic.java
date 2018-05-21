package by.bntu.fitr.povt.jit.coursework.logic;

import by.bntu.fitr.povt.jit.coursework.dao.DataReadWriter;
import by.bntu.fitr.povt.jit.coursework.dao.Searcher;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.model.sort.ActivitySortType;
import by.bntu.fitr.povt.jit.coursework.model.sort.ActivitySorter;

public class LoginLogic {

    public static void login(User user) {
        DataReadWriter.readAllUsersActivities(user);
        ActivityInspector.checkAndRemove(user);
        ActivitySorter.sort(user.getTimeTable(), ActivitySortType.TIME_ASC);
    }

    public static boolean checkLogin(String enterLogin, String enterPass) {
        return Searcher.searchLogin(enterLogin, enterPass);
    }
}
