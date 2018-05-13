/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Dima_T
 */
public class Event extends Activity {

    private GregorianCalendar endTime;

    @Override
    public boolean check() {
        GregorianCalendar now = new GregorianCalendar();
        if (endTime.get(Calendar.YEAR) < now.get(Calendar.YEAR)) {
            return false;
        } else if (endTime.get(Calendar.YEAR) == now.get(Calendar.YEAR)
                && endTime.get(Calendar.MONTH) < now.get(Calendar.MONTH)) {
            return false;
        } else if (endTime.get(Calendar.YEAR) == now.get(Calendar.YEAR)
                && endTime.get(Calendar.MONTH) == now.get(Calendar.MONTH)
                && endTime.get(Calendar.DAY_OF_MONTH) < now.get(Calendar.DAY_OF_MONTH)) {
            return false;
        } else if (endTime.get(Calendar.YEAR) == now.get(Calendar.YEAR)
                && endTime.get(Calendar.MONTH) == now.get(Calendar.MONTH)
                && endTime.get(Calendar.DAY_OF_MONTH) == now.get(Calendar.DAY_OF_MONTH)
                && endTime.get(Calendar.HOUR_OF_DAY) * 60 + endTime.get(Calendar.MINUTE) < now.get(Calendar.HOUR_OF_DAY) * 60 + now.get(Calendar.MINUTE)) {
            return false;
        }
        return true;
//        if(endTime.getTimeInMillis() - new GregorianCalendar().getTimeInMillis() < 0){
//            return false;
//        }
//        return true;
    }

    public Event(GregorianCalendar endTime, String name, Place place, GregorianCalendar date, WeekDay weekDay) {
        super(name, place, date, weekDay);
        this.endTime = endTime;
    }

    public Event(int year, int month, int day, int hour, int minute, String name, Place place, int timeHour, int timeMinute, WeekDay weekDay) {
        super(name, place, timeHour, timeMinute, weekDay);
        endTime = new GregorianCalendar(year, month, day, hour, minute);
    }

    public Event(int count, String name, Place place, GregorianCalendar date, WeekDay weekDay) {
        super(name, place, date, weekDay);

        this.endTime = new GregorianCalendar();
        //GregorianCalendar now = new GregorianCalendar();
        //this.endTime = new GregorianCalendar(now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH)+count*7);
    }

    public Event() {
        super();
        endTime = new GregorianCalendar();

    }

    public GregorianCalendar getEndTime() {
        return endTime;
    }

    public void setEndTime(GregorianCalendar endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Event{" + "name=" + getName() + ", place=" + getPlace()
                + ", date=" + getDate() + ", weekDay=" + getWeekDay() + ", endTime=" + endTime + '}';
    }

    @Override
    public String getInfo() {
        return endTime.get(Calendar.DAY_OF_MONTH) + "." + (endTime.get(Calendar.MONTH) + 1) + "." + endTime.get(Calendar.YEAR);

    }
}
