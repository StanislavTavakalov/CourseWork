/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.logic;

import by.bntu.fitr.povt.jit.coursework.model.TimeTable;
import by.bntu.fitr.povt.jit.coursework.model.User;

/**
 *
 * @author Swyatoslaw
 */
public class ActivityInspector {
    public static void checkAndRemove(User user){
        TimeTable timeTable = user.getTimeTable();
        try{
        for(int i=0;i<timeTable.size();i++){
            if(!timeTable.get(i).check()){
                DataReadWriter.deleteActivity(timeTable.remove(i), user);
            }
        }
        }catch(NullPointerException ex){
            System.out.println(ex);
        }
    }
}
