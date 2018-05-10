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

/**
 *
 * @author Dima_T
 */
public class TimeTable implements Iterable<Activity>{
    private List<Activity> activities;

    public TimeTable(List<Activity> activities) {
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
    
    
    
}
