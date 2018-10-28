/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Kamil
 */
public class FactoryXML implements IDaoFactory{

    @Override
    public Person getPersonById(int id) {
        Person nowy;
        nowy = new Person(1,"Adam","XML");
        return nowy;
    }
    
}
