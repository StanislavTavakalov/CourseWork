/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.dao;

import by.bntu.fitr.povt.jit.coursework.model.Activity;
import by.bntu.fitr.povt.jit.coursework.model.Event;
import by.bntu.fitr.povt.jit.coursework.model.Place;
import by.bntu.fitr.povt.jit.coursework.model.Subject;
import by.bntu.fitr.povt.jit.coursework.model.Teacher;
import by.bntu.fitr.povt.jit.coursework.model.TimeTable;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.model.UserLoginList;
import by.bntu.fitr.povt.jit.coursework.model.log.Log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Swyatoslaw
 */
public class DataReadWriter {

    private static String ACTIVITY_TYPE_SYBJECT = "subject";
    private static String ACTIVITY_TYPE_EVENT = "event";

    public static boolean addActivity(Activity activity, User user) {

        if (activity.getClass() == Subject.class) {
            //System.out.println("activity.getClass() == Subject.class");
            return addSubject((Subject) activity, user);
        } else if (activity.getClass() == Event.class) {
            return addEvent((Event) activity, user);
        }
        return false;
    }

//    public static boolean addActivity(String login, String activity_type, String name,
//            String place_name, int date_hour, int date_minute, String week_day, 
//            String subject_type, int subject_year, String subject_teacher_name,
//            String subject_teacher_status, int event_year,int event_month,
//            int event_day, int event_hour, int event_minute) {
//
//        String db = "jdbc:mysql://localhost:3306/accounts";
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//            try (Connection cn = DriverManager.getConnection(db, "root", "root"); Statement st = cn.createStatement()) {
//
//                PreparedStatement ps = cn.prepareStatement(
//                        "INSERT INTO activities(login, activity_type, name, place_name, date_hour, date_minute,"
//                        + "week_day, subject_type, subject_year, subject_teacher_name, subject_teacher_status,"
//                        + "event_year, event_month, event_day, event_hour, event_minute)"
//                        + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
//                // , , , , , , , , , , , 
//                ps.setString(1, login);
//                ps.setString(2, activity_type);
//                ps.setString(3, name);
//                ps.setString(4, place_name);
//                ps.setInt(5, date_hour);
//                ps.setInt(6, date_minute);
//                ps.setString(7, week_day);
//                ps.setString(8, subject_type);
//                ps.setInt(9, subject_year);
//                ps.setString(10, subject_teacher_name);
//                ps.setString(11, subject_teacher_status);
//                ps.setInt(12, event_year);
//                ps.setInt(13, event_month);
//                ps.setInt(14, event_day);
//                ps.setInt(15, event_hour);
//                ps.setInt(16, event_minute);
//
//                ps.executeUpdate();
//                return true;
//
////                
////                ResultSet rs = st.executeQuery("select * from accounts where name='" + enterLogin + "' and password='" + enterPass + "'");
////               // st.executeQuery("insert into accounts values('stasp','123'");
////                return rs.next();
//            }
//
//        } catch (SQLException ex) {
//
//            return false;
//        } catch (ClassNotFoundException ex) {
//
//            return false;
//        }
//    }
//    
    public static boolean addSubject(Subject s, User user) {

        String db = "jdbc:mysql://localhost:3306/accounts";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try (Connection cn = DriverManager.getConnection(db, "root", "root"); Statement st = cn.createStatement()) {

                PreparedStatement ps = cn.prepareStatement(
                        "INSERT INTO activities(login, activity_type, name, place_name, date_hour, date_minute,"
                        + "week_day, subject_type, subject_year, subject_teacher_name, subject_teacher_status,"
                        + "event_year, event_month, event_day, event_hour, event_minute)"
                        + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                // , , , , , , , , , , , 
                //ps.setString(1, user.getLogin());
                ps.setString(1, user.getLogin());
                ps.setString(2, ACTIVITY_TYPE_SYBJECT);
                ps.setString(3, s.getName());
                ps.setString(4, s.getPlace().getName());
                ps.setInt(5, s.getDate().get(Calendar.HOUR_OF_DAY));
                ps.setInt(6, s.getDate().get(Calendar.MINUTE));
                ps.setString(7, s.getWeekDay().toString());
                ps.setString(8, s.getType().toString());
                ps.setInt(9, s.getYear());
                ps.setString(10, s.getTeacher().getName());
                ps.setString(11, s.getTeacher().getStatus());
                ps.setInt(12, 0);
                ps.setInt(13, 0);
                ps.setInt(14, 0);
                ps.setInt(15, 0);
                ps.setInt(16, 0);

                ps.executeUpdate();
                return true;

            }

        } catch (SQLException ex) {
            Log.LOG.error(ex);
            return false;
        } catch (ClassNotFoundException ex) {
            Log.LOG.error(ex);
            return false;
        }
    }

    public static boolean addEvent(Event s, User user) {

        String db = "jdbc:mysql://localhost:3306/accounts";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try (Connection cn = DriverManager.getConnection(db, "root", "root"); Statement st = cn.createStatement()) {

                PreparedStatement ps = cn.prepareStatement(
                        "INSERT INTO activities(login, activity_type, name, place_name, date_hour, date_minute,"
                        + "week_day, subject_type, subject_year, subject_teacher_name, subject_teacher_status,"
                        + "event_year, event_month, event_day, event_hour, event_minute)"
                        + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                // , , , , , , , , , , , 
                ps.setString(1, user.getLogin());
                ps.setString(2, ACTIVITY_TYPE_EVENT);
                ps.setString(3, s.getName());
                ps.setString(4, s.getPlace().getName());
                ps.setInt(5, s.getDate().get(Calendar.HOUR_OF_DAY));
                ps.setInt(6, s.getDate().get(Calendar.MINUTE));
                ps.setString(7, s.getWeekDay().toString());
                ps.setString(8, "");
                ps.setInt(9, 0);
                ps.setString(10, "");
                ps.setString(11, "");
                ps.setInt(12, s.getEndTime().get(Calendar.YEAR));
                ps.setInt(13, s.getEndTime().get(Calendar.MONTH));
                ps.setInt(14, s.getEndTime().get(Calendar.DAY_OF_MONTH));
                ps.setInt(15, s.getEndTime().get(Calendar.HOUR_OF_DAY));
                ps.setInt(16, s.getEndTime().get(Calendar.MINUTE));

                ps.executeUpdate();
                return true;

            }

        } catch (SQLException ex) {
            Log.LOG.error(ex);
            return false;
        } catch (ClassNotFoundException ex) {
            Log.LOG.error(ex);
            return false;
        }
    }

    public static boolean readAllUsersActivities(User user) {
//        user.getTimeTable().add(e)
        String db = "jdbc:mysql://localhost:3306/accounts";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try (Connection cn = DriverManager.getConnection(db, "root", "root"); Statement st = cn.createStatement()) {

                ResultSet rs = st.executeQuery("SELECT "
                        + "activity_type, name, place_name, date_hour, date_minute,"
                        + "week_day, subject_type, subject_year, subject_teacher_name, subject_teacher_status,"
                        + "event_year, event_month, event_day, event_hour, event_minute"
                        + " FROM activities WHERE login='" + user.getLogin() + "'");
                while (rs.next()) {
                    if (rs.getString("activity_type").equals(ACTIVITY_TYPE_SYBJECT)) {
                        Subject subject = new Subject(
                                rs.getInt("subject_year"),
                                new Teacher(rs.getString("subject_teacher_name"), rs.getString("subject_teacher_status")),
                                Subject.Type.valueOf(rs.getString("subject_type")),
                                rs.getString("name"), new Place(rs.getString("place_name")),
                                new GregorianCalendar(0, 0, 0, rs.getInt("date_hour"), rs.getInt("date_minute")),
                                Activity.WeekDay.valueOf(rs.getString("week_day")));
                        user.getTimeTable().add(subject);
                    } else if (rs.getString("activity_type").equals(ACTIVITY_TYPE_EVENT)) {
                        Event event = new Event(
                                new GregorianCalendar(rs.getInt("event_year"), rs.getInt("event_month"), rs.getInt("event_day"), rs.getInt("event_hour"), rs.getInt("event_minute")),
                                rs.getString("name"), new Place(rs.getString("place_name")),
                                new GregorianCalendar(0, 0, 0, rs.getInt("date_hour"), rs.getInt("date_minute")),
                                Activity.WeekDay.valueOf(rs.getString("week_day")));
                        user.getTimeTable().add(event);
                    }

                }
                //
                //System.out.println(user.getTimeTable());

                //
                rs.close();
                return true;

            }
        } catch (SQLException ex) {
            Log.LOG.error(ex);
            return false;
        } catch (ClassNotFoundException ex) {
            Log.LOG.error(ex);
            return false;
        }

    }

    public static boolean deleteActivity(Activity activity, User user) {

        if (activity.getClass() == Subject.class) {
            return deleteSubject((Subject) activity, user);
        } else if (activity.getClass() == Event.class) {
            return deleteEvent((Event) activity, user);
        }
        return false;
    }

    public static boolean deleteEvent(Event s, User user) {

        String db = "jdbc:mysql://localhost:3306/accounts";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try (Connection cn = DriverManager.getConnection(db, "root", "root"); Statement st = cn.createStatement()) {

                PreparedStatement ps = cn.prepareStatement(
                        "DELETE FROM activities where login='" + user.getLogin() + "'"
                        + " and name='" + s.getName() + "'"
                        + " and place_name='" + s.getPlace().getName() + "'"
                        + " and date_hour='" + s.getDate().get(Calendar.HOUR_OF_DAY) + "'"
                        + " and date_minute='" + s.getDate().get(Calendar.MINUTE) + "'"
                        + " and week_day='" + s.getWeekDay().toString() + "'"
                        + " and event_year='" + s.getEndTime().get(Calendar.YEAR) + "'"
                        + " and event_month='" + s.getEndTime().get(Calendar.MONTH) + "'"
                        + " and event_day='" + s.getEndTime().get(Calendar.DAY_OF_MONTH) + "'"
                        + " and event_hour='" + s.getEndTime().get(Calendar.HOUR_OF_DAY) + "'"
                        + " and event_minute='" + s.getEndTime().get(Calendar.MINUTE) + "'");

                ps.executeUpdate();
                return true;

            }

        } catch (SQLException ex) {
            Log.LOG.error(ex);
            return false;

        } catch (ClassNotFoundException ex) {
            Log.LOG.error(ex);
            return false;
        }
    }

    public static boolean deleteSubject(Subject s, User user) {
        String db = "jdbc:mysql://localhost:3306/accounts";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try (Connection cn = DriverManager.getConnection(db, "root", "root"); Statement st = cn.createStatement()) {
                PreparedStatement ps = cn.prepareStatement("DELETE FROM activities where login='" + user.getLogin() + "'" + " and name='" + s.getName() + "'"
                        + " and place_name='" + s.getPlace().getName() + "'" + " and date_hour='" + s.getDate().get(Calendar.HOUR_OF_DAY) + "'"
                        + " and date_minute='" + s.getDate().get(Calendar.MINUTE) + "'" + " and week_day='" + s.getWeekDay().toString() + "'"
                        + " and subject_type='" + s.getType().toString() + "'"
                        + " and subject_year='" + s.getYear() + "'"
                        + " and subject_teacher_name='" + s.getTeacher().getName() + "'"
                        + " and subject_teacher_status='" + s.getTeacher().getStatus() + "'");

                ps.executeUpdate();
                return true;

            }

        } catch (SQLException ex) {
            Log.LOG.error(ex);
            return false;
        } catch (ClassNotFoundException ex) {
            Log.LOG.error(ex);
            return false;
        }
    }

    public static boolean readAllUserLogins(UserLoginList userLoginList) {
        String db = "jdbc:mysql://localhost:3306/accounts";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try (Connection cn = DriverManager.getConnection(db, "root", "root"); Statement st = cn.createStatement()) {

                ResultSet rs = st.executeQuery(
                        "SELECT name FROM accounts");
                while (rs.next()) {
                    userLoginList.add(rs.getString("name"));
                }
                rs.close();
                //System.out.println(userLoginList);
                return true;

            }
        } catch (SQLException ex) {
            Log.LOG.error(ex);
            return false;
        } catch (ClassNotFoundException ex) {
            Log.LOG.error(ex);
            return false;
        }
    }

    public static boolean deleteUserAndHisActivity(String userLogin) {
        String db = "jdbc:mysql://localhost:3306/accounts";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            try (Connection cn = DriverManager.getConnection(db, "root", "root"); Statement st = cn.createStatement()) {

                ResultSet rs = st.executeQuery("select name from accounts where name='" + userLogin + "'");
                if (!rs.next()) {
                    return false;
                }

                PreparedStatement ps = cn.prepareStatement(
                        "DELETE FROM accounts WHERE name='" + userLogin + "'");

                ps.executeUpdate();
                ps = cn.prepareStatement(
                        "DELETE FROM activities WHERE login='" + userLogin + "'");
                ps.executeUpdate();
                return true;
            }
        } catch (SQLException ex) {
            Log.LOG.error(ex);
            return false;
        } catch (ClassNotFoundException ex) {
            Log.LOG.error(ex);
            return false;
        }
    }

}
