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
public class Subject extends Activity{
    enum Type{
        LECTURE,PRACTISE
    }
    int year;
    Teacher teacher;

    public Subject(int year, Teacher teacher, String name, Place place, GregorianCalendar date, WeekDay weekDay) {
        super(name, place, date, weekDay);
        this.year = year;
        this.teacher = teacher;
    }

    

    public Subject() {
        
        super();
        year = 2018;
        teacher = new Teacher();
    }

    @Override
    public boolean check() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getInfo() {
        return year + " "  + teacher.getName() + " " + teacher.getStatus();
    }
}
