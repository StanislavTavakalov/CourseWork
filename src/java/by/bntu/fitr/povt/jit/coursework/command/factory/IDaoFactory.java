/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.command.factory;

import by.bntu.fitr.povt.jit.coursework.dao.IDataReadWriter;
import by.bntu.fitr.povt.jit.coursework.dao.IRegistrar;
import by.bntu.fitr.povt.jit.coursework.dao.ISearcher;

/**
 *
 * @author Swyatoslaw
 */
public interface IDaoFactory {
    public abstract IDataReadWriter getDataReadWriter();
    public abstract IRegistrar getRegistrar();
    public abstract ISearcher getSearcher();
}
