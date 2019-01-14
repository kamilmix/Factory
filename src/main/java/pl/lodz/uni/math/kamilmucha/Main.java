/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.kamilmucha;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 *
 * @author Kamil
 */
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        DaoFactory daof = new DaoFactory();
        daof.setSource(FactorySource.XML);

        Person personFromSource = daof.getPersonById(1);
        logger.debug(personFromSource.show());

        daof.setSource(FactorySource.DATABASE);  //change source to database
        personFromSource = daof.getPersonById(2);
        logger.debug(personFromSource.show());
    }
}
