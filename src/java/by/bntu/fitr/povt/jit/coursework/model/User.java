/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.model;

/**
 *
 * @author Dima_T
 */
public class User {
   private String login;
   private String password;
   
   public enum Role{
       USER,ADMIN
   }
   
  private Role role;
  private TimeTable timeTable;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User(String login, String password, Role role, TimeTable timeTable) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.timeTable = timeTable;
    }

    public User() {
    }

    public TimeTable getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(TimeTable timeTable) {
        this.timeTable = timeTable;
    }

    @Override
    public String toString() {
        return "User{" + "login=" + login + ", password=" + password + ", role=" + role + ", timeTable=" + timeTable + '}';
    }
  
  
}
