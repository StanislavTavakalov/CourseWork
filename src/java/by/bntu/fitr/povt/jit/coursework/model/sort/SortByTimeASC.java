/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.model.sort;

import by.bntu.fitr.povt.jit.coursework.model.Activity;
import java.util.Calendar;
import java.util.Comparator;

/**
 *
 * @author Swyatoslaw
 */
public class SortByTimeASC implements Comparator<Activity> {

    public SortByTimeASC() {
    }

    @Override
    public int compare(Activity o1, Activity o2) {
        return o1.getDate().get(Calendar.HOUR_OF_DAY) * 60 + o1.getDate().get(Calendar.MINUTE)
                -( o2.getDate().get(Calendar.HOUR_OF_DAY) * 60 + o2.getDate().get(Calendar.MINUTE));
           
//        if (o1.getDate().get(Calendar.HOUR_OF_DAY) * 60 + o1.getDate().get(Calendar.MINUTE) > o2.getDate().get(Calendar.HOUR_OF_DAY) * 60 + o2.getDate().get(Calendar.MINUTE)) {
//            return 1;
//        } else if (o1.getDate().get(Calendar.HOUR_OF_DAY) * 60 + o1.getDate().get(Calendar.MINUTE) == o2.getDate().get(Calendar.HOUR_OF_DAY) * 60 + o2.getDate().get(Calendar.MINUTE)) {
//            return 0;
//        }
//        return -1;
    }

}
