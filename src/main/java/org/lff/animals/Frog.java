package org.lff.animals;

import org.lff.ability.ISwim;
import org.lff.animals.base.LandAnimal;

/**
 * @author Liu Feifei
 * @date 2020/8/24 11:02
 **/
public class Frog extends LandAnimal implements ISwim {

    public void walk() {
        System.out.println("A frog can walk");
    }

    public void swim() {
        System.out.println("A frog can swim");
    }
}
