/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.jit.coursework.command.factory;

/**
 *
 * @author Swyatoslaw
 */
public class FactoryContainer {

    private static final FactoryContainer INSTANCE = new FactoryContainer();

    private FactoryContainer() {
    }

    public static FactoryContainer getInstance() {
        return FactoryContainer.INSTANCE;
    }
    
    private IDaoFactory daoFactory = new DaoFactory();
    private ILogicFactory logicFactory = new LogicFactory();

    public IDaoFactory getDaoFactory() {
        return daoFactory;
    }

    public void setDaoFactory(IDaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    public ILogicFactory getLogicFactory() {
        return logicFactory;
    }

    public void setLogicFactory(ILogicFactory logicFactory) {
        this.logicFactory = logicFactory;
    }

}
