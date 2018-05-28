/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.command.factory;

import by.bntu.fitr.povt.jit.coursework.logic.IHashCoder;

/**
 *
 * @author Swyatoslaw
 */
public interface ILogicFactory {
    public IHashCoder getIHashCoder();
}
