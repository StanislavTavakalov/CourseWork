/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Dima_T
 */
public abstract class Activity {
    
    private String name;
    //...TIME
    private Place place;
    
    private GregorianCalendar date;
   
    public enum WeekDay{
        MONDAY,TUESDAY,WEDNESDAY,TSURSDAY,FRIDAY,SATURDAY,SUNDAY
    }
    
    private WeekDay weekDay;

    public Activity(String name, Place place, GregorianCalendar date, WeekDay weekDay) {
        this.name = name;
        this.place = place;
        this.date = date;
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
}

    
    

