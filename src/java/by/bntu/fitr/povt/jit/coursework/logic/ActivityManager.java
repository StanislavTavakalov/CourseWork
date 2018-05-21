package by.bntu.fitr.povt.jit.coursework.logic;

import by.bntu.fitr.povt.jit.coursework.dao.DataReadWriter;
import by.bntu.fitr.povt.jit.coursework.model.Activity;
import by.bntu.fitr.povt.jit.coursework.model.Event;
import by.bntu.fitr.povt.jit.coursework.model.Place;
import by.bntu.fitr.povt.jit.coursework.model.Subject;
import by.bntu.fitr.povt.jit.coursework.model.Teacher;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.model.sort.ActivitySortType;
import by.bntu.fitr.povt.jit.coursework.model.sort.ActivitySorter;

public class ActivityManager {

    public static void AddEvent(String weekDay, String name, String time,
            String placeName, String endDateTime, User user) {
        int year = Integer.parseUnsignedInt(endDateTime.substring(0, 4));
        int month = Integer.parseUnsignedInt(endDateTime.substring(5, 7));
        int day = Integer.parseUnsignedInt(endDateTime.substring(8, 10));
        int hour = Integer.parseUnsignedInt(endDateTime.substring(11, 13));
        int minute = Integer.parseUnsignedInt(endDateTime.substring(14));

        int timeHour = Integer.parseUnsignedInt(time.substring(0, 2));
        int timeMinute = Integer.parseUnsignedInt(time.substring(3));

        DataReadWriter.addActivity(
                new Event(year, month - 1, day, hour, minute, name,
                        new Place(placeName), timeHour, timeMinute,
                        Activity.WeekDay.valueOf(weekDay)),
                user);

        user.getTimeTable().add(new Event(year, month - 1, day, hour, minute, name,
                new Place(placeName), timeHour, timeMinute,
                Activity.WeekDay.valueOf(weekDay)));
        ActivitySorter.sort(user.getTimeTable(), ActivitySortType.TIME_ASC);

    }

    public static void addSubject(String weekDay, String name, String time,
            String type, String year, String placeName, String teacherName, String teacherStatus, User user) {
        int hour = Integer.parseUnsignedInt(time.substring(0, 2));
        int minute = Integer.parseUnsignedInt(time.substring(3));

        DataReadWriter.addActivity(
                new Subject(Integer.parseInt(year),
                        new Teacher(teacherName, teacherStatus),
                        Subject.Type.valueOf(type), name, new Place(placeName),
                        hour, minute,
                        Activity.WeekDay.valueOf(weekDay)),
                user);

        user.getTimeTable().add(new Subject(Integer.parseInt(year),
                new Teacher(teacherName, teacherStatus),
                Subject.Type.valueOf(type), name, new Place(placeName),
                hour, minute,
                Activity.WeekDay.valueOf(weekDay)));
        ActivitySorter.sort(user.getTimeTable(), ActivitySortType.TIME_ASC);

    }

    public static void deleteActivity(int index, String weekDay, User user) {

        int indexOfElementToDelete = -1;

        for (Activity activity : user.getTimeTable()) {
            indexOfElementToDelete++;
            if (activity.getWeekDay().equals(Activity.WeekDay.valueOf(weekDay))) {
                if (index != 0) {
                    index--;
                } else {
                    DataReadWriter.deleteActivity(user.getTimeTable().remove(indexOfElementToDelete), user);
                }
            }
        }
    }
}
