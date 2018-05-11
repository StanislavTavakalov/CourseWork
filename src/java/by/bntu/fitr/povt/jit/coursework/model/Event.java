/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.model;

import java.util.GregorianCalendar;

/**
 *
 * @author Dima_T
 */
public class Event extends Activity{

    @Override
    public boolean check() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Event(GregorianCalendar endTime, String name, Place place, GregorianCalendar date, WeekDay weekDay) {
        super(name, place, date, weekDay);
        this.endTime = endTime;
    }

    public Event() {
        super();
        endTime = new GregorianCalendar();
        
    }
    
    private GregorianCalendar endTime;
    
    @Override
    public String getInfo() {
        return endTime.toString();
    }
}
