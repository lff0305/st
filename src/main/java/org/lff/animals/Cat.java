package org.lff.animals;


import org.lff.ability.ISay;
import org.lff.animals.base.LandAnimal;

/**
 * @author Liu Feifei
 * @date 2020/8/24 11:04 © 2020 Telepathy Labs | All Rights Reserved
 **/
public class Cat extends LandAnimal implements ISay {

    public void walk() {
        System.out.println("A cat can walk");
    }

    public String say() {
        System.out.println("A cat can say moew moew");
        return "moew moew";
    }
}
