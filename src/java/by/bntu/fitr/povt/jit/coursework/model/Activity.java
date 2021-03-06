
package by.bntu.fitr.povt.jit.coursework.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Activity {
    
    private String name;
    private Place place;
    private GregorianCalendar date;
   
    public enum WeekDay{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }
    
    private WeekDay weekDay;

    public Activity(String name, Place place, GregorianCalendar date, WeekDay weekDay) {
        this.name = name;
        this.place = place;
        this.date = date;
        this.weekDay = weekDay;
    }
    
    public Activity(String name, Place place, int hour, int minute, WeekDay weekDay) {
        this.name = name;
        this.place = place;
        date = new GregorianCalendar(0, 0, 0, hour, minute);
        this.weekDay = weekDay;
    }

    public Activity() {
        name = "name";
        
        place = new Place();
        date = new GregorianCalendar();
        weekDay = WeekDay.MONDAY;
    }
    public abstract boolean check();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }
    public abstract String getInfo();
    
    public String getTime(){
        if(date.get(Calendar.MINUTE)>=0 && date.get(Calendar.MINUTE)<10)
            return date.get(Calendar.HOUR_OF_DAY) + ":0" + date.get(Calendar.MINUTE);
        
        return date.get(Calendar.HOUR_OF_DAY) + ":" + date.get(Calendar.MINUTE);
    }

    @Override
    public String toString() {
        return "Activity{" + "name=" + name + ", place=" + place + ", date=" + date + ", weekDay=" + weekDay + '}';
    }
    
}

    
    

