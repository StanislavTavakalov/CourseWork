/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.dao;

import by.bntu.fitr.povt.jit.coursework.model.Activity;
import by.bntu.fitr.povt.jit.coursework.model.Event;
import by.bntu.fitr.povt.jit.coursework.model.Subject;
import by.bntu.fitr.povt.jit.coursework.model.User;
import by.bntu.fitr.povt.jit.coursework.model.UserLoginList;

/**
 *
 * @author Swyatoslaw
 */
public interface IDataReadWriter {

    public boolean addActivity(Activity activity, User user);

    public boolean readAllUsersActivities(User user);

    public boolean deleteActivity(Activity activity, User user);

    public boolean readAllUserLogins(UserLoginList userLoginList);

    public boolean deleteUserAndHisActivity(String userLogin);
}
