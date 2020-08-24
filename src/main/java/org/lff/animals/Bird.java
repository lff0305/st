package org.lff.animals;

import org.lff.ability.IFly;
import org.lff.ability.ISing;
import org.lff.ability.IWalk;

/**
 * A bird can sing, fly and walk
 * @author Liu Feifei
 * @date 2020/8/24 10:13
 **/
public class Bird extends LandAnimal implements ISing, IFly {

    public void fly() {
        System.out.println("A Bird flies");
    }

    public void sing() {
        System.out.println("A Bird sings");
    }

    public void walk() {
        System.out.println("A Bird walks");
    }
}
