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
    public enum Type{
        LECTURE,PRACTICE
    }
    private int year;
    private Teacher teacher;
    private Type type;

    public Subject(int year, Teacher teacher, Type type, String name, Place place, GregorianCalendar date, WeekDay weekDay) {
        super(name, place, date, weekDay);
        this.year = year;
        this.teacher = teacher;
        this.type = type;
    }
   

    public Subject() {
        
        super();
        year = 2018;
        teacher = new Teacher();
        type = Type.LECTURE;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean check() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getInfo() {
        return teacher.getStatus() + " " + teacher.getName() + " / " + (year-1) + "-" + year;
    }
    
    @Override
    public String toString() {
         return "Subject{" + "name=" + getName() + ", place=" + getPlace() +
                ", date=" + getDate() + ", weekDay=" + getWeekDay() +
                 ", year=" + year + ", teacher=" + teacher + ", type=" + type + '}';
    }
        
   
   
}
