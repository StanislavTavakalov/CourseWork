package by.bntu.fitr.povt.jit.coursework.logic;

import by.bntu.fitr.povt.jit.coursework.dao.DataReadWriter;
import by.bntu.fitr.povt.jit.coursework.model.TimeTable;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.model.log.Log;

public class ActivityInspector {

    public static void checkAndRemove(User user) {
        TimeTable timeTable = user.getTimeTable();
        try {
            for (int i = 0; i < timeTable.size(); i++) {
                if (!timeTable.get(i).check()) {
                    DataReadWriter.deleteActivity(timeTable.remove(i), user);
                }
            }
        } catch (NullPointerException ex) {
            Log.LOG.error(ex);
        }
    }
}
