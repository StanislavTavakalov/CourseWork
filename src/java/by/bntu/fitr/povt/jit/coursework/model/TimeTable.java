/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Dima_T
 */
public class TimeTable implements Iterable<Activity>{
    private List<Activity> activities;

    public TimeTable(List<Activity> activities) {
        this.activities = activities;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public TimeTable() {
        this.activities = new ArrayList<>();
    }

    
    public int size() {
        return activities.size();
    }

    public boolean isEmpty() {
        return activities.isEmpty();
    }

    @Override
    public Iterator<Activity> iterator() {
        return activities.iterator();
    }

    public boolean add(Activity e) {
        return activities.add(e);
    }

    public void sort(Comparator<? super Activity> c) {
        activities.sort(c); 
    }
    
    public Activity remove(int index) {
        return activities.remove(index);
    }

    @Override
    public void forEach(Consumer<? super Activity> action) {
        activities.forEach(action);
        //Iterable.super.forEach(action); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
