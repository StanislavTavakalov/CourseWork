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
class Teacher {
    
    private String name;
    private String status;

    public Teacher(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public Teacher() {
        name = "name";
        status = "docent";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}
