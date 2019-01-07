/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.kamilmucha;

/**
 *
 * @author Kamil
 */
public class DaoFactory {

    public static final int XML=1;
    public static final int DATABASE=2;

    
    private IDaoFactory factory;

    public void setSource(int whichFactory){

        switch (whichFactory){
            case XML:
                factory = new FactoryXML();
                break;
            case DATABASE:
                factory = new FactoryDB();
                break;
        }

    }

    public Person getPersonById(int id){
        return factory.getPersonById(id);
    }
}
