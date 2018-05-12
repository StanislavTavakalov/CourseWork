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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Event(GregorianCalendar endTime, String name, Place place, GregorianCalendar date, WeekDay weekDay) {
        super(name, place, date, weekDay);
        this.endTime = endTime;
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
        return "Event{" + "name=" + getName() + ", place=" + getPlace() +
                ", date=" + getDate() + ", weekDay=" + getWeekDay() + ", endTime=" + endTime + '}';
    }

    @Override
    public String getInfo() {
        return endTime.toString();
    }
}
