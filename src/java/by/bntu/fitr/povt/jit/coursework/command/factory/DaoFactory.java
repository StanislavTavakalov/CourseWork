/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.command.factory;

import by.bntu.fitr.povt.jit.coursework.dao.DataReadWriter;
import by.bntu.fitr.povt.jit.coursework.dao.IDataReadWriter;
import by.bntu.fitr.povt.jit.coursework.dao.IRegistrar;
import by.bntu.fitr.povt.jit.coursework.dao.ISearcher;
import by.bntu.fitr.povt.jit.coursework.dao.Registrar;
import by.bntu.fitr.povt.jit.coursework.dao.Searcher;

/**
 *
 * @author Swyatoslaw
 */
public class DaoFactory implements IDaoFactory {

    private IDataReadWriter dataReadWriter = new DataReadWriter();
    private IRegistrar registrar = new Registrar();
    private ISearcher searcher = new Searcher();

    @Override
    public IDataReadWriter getDataReadWriter() {
        return dataReadWriter;
    }

    public void setDataReadWriter(IDataReadWriter dataReadWriter) {
        this.dataReadWriter = dataReadWriter;
    }

    @Override
    public IRegistrar getRegistrar() {
        return registrar;
    }

    public void setRegistrar(IRegistrar registrar) {
        this.registrar = registrar;
    }
    
    @Override
    public ISearcher getSearcher() {
        return searcher;
    }

    public void setSearcher(ISearcher searcher) {
        this.searcher = searcher;
    }

}
