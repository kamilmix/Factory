/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.kamilmucha;

import java.util.EnumMap;

/**
 *
 * @author Kamil
 */
public class DaoFactory {

    private IDaoFactory factory;
    private static final EnumMap<FactorySource, IDaoFactory> factoryEnumMap = new EnumMap<>(FactorySource.class);

    public void setSource(FactorySource source){
       factory = factoryEnumMap.get(source);
    }

    static
    {
        factoryEnumMap.put(FactorySource.DATABASE, new FactoryDB());
        factoryEnumMap.put(FactorySource.XML, new FactoryXML());
    }

    public Person getPersonById(int id){
        return factory.getPersonById(id);
    }
}
