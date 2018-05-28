/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.command.factory;

import by.bntu.fitr.povt.jit.coursework.logic.HashCoder;
import by.bntu.fitr.povt.jit.coursework.logic.IHashCoder;

/**
 *
 * @author Swyatoslaw
 */
public class LogicFactory implements ILogicFactory {

    private IHashCoder hashCoder = new HashCoder();

    @Override
    public IHashCoder getIHashCoder() {
        return hashCoder;
    }

    public void setHashCoder(IHashCoder hashCoder) {
        this.hashCoder = hashCoder;
    }

}
