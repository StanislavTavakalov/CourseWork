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
public class Place {
    private String name;

    public Place(String name) {
        this.name = name;
    }

    public Place() {
        name = "noname";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
