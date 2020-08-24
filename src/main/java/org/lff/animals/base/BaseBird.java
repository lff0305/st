package org.lff.animals.base;

import org.lff.ability.IFly;
import org.lff.ability.IWalk;

/**
 * Common parent class for all birds
 * @author Liu Feifei
 * @date 2020/8/24 12:00 © 2020 Telepathy Labs | All Rights Reserved
 **/
public class BaseBird extends LandAnimal implements IWalk {

    @Override
    public void walk() {
        System.out.println("I am walking");
    }
}
