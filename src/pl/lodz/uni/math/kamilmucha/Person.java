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
class Person {
    private int id;
    private String imie;
    private String nazwisko;

    public Person(int id, String imie, String nazwisko) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String show(){
        return id + " " + imie + " " + nazwisko;
    }
}
