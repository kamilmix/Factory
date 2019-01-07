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
public class FactoryDB implements IDaoFactory{

    @Override
    public Person getPersonById(int id) {
        Person nowy;
        nowy = new Person(2,"Adam","DB");
        return nowy;
    }
    
}
