package org.lff.animals;


import org.lff.ability.ISay;

/**
 * @author Liu Feifei
 * @date 2020/8/24 11:03
 **/
public class Dog extends LandAnimal implements ISay {

    public String say() {
        System.out.println("A dog can say");
        return "Bark";
    }

    public void walk() {
        System.out.println("A dog can walk");
    }
}