package by.bntu.fitr.povt.jit.coursework.logic;

import by.bntu.fitr.povt.jit.coursework.command.factory.FactoryContainer;
//import by.bntu.fitr.povt.jit.coursework.dao.DataReadWriter;
//import by.bntu.fitr.povt.jit.coursework.dao.Searcher;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.model.UserLoginList;
import by.bntu.fitr.povt.jit.coursework.model.log.Log;
import by.bntu.fitr.povt.jit.coursework.model.sort.ActivitySortType;
import by.bntu.fitr.povt.jit.coursework.model.sort.ActivitySorter;

public class LoginLogic {
    
    public static void login(User user) {
        FactoryContainer.getInstance().getDaoFactory().getDataReadWriter().readAllUsersActivities(user);
//        DataReadWriter.readAllUsersActivities(user);
        ActivityInspector.checkAndRemove(user);
        ActivitySorter.sort(user.getTimeTable(), ActivitySortType.TIME_ASC);
        Log.LOG.info("Login user=" + user.getLogin());
    }
    
    public static boolean checkLogin(String enterLogin, String enterPass) {
//        return Searcher.searchLogin(enterLogin, enterPass);
        String hashedPass = FactoryContainer.getInstance().getLogicFactory().getIHashCoder().get_SHA_512_SecurePasswordSimple(enterPass);
        return FactoryContainer.getInstance().getDaoFactory().getSearcher().searchLogin(enterLogin, hashedPass);
    }
    
    public static boolean deleteUser(String userLogin, UserLoginList userLoginList) {
//        if (DataReadWriter.deleteUserAndHisActivity(userLogin)) {
        if (FactoryContainer.getInstance().getDaoFactory().getDataReadWriter().deleteUserAndHisActivity(userLogin)) {
            userLoginList.remove(userLogin);
            Log.LOG.info("Delete user:" + userLogin);
            return true;
        } else {
            return false;
        }
    }
    
    public static UserLoginList getUserLoginList(){
        UserLoginList userLoginList = UserLoginList.getInstance();
        userLoginList.clear();
        FactoryContainer.getInstance().getDaoFactory().getDataReadWriter().readAllUserLogins(userLoginList);
//        DataReadWriter.readAllUserLogins(userLoginList);
        return userLoginList;
    }
}
