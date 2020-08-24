package org.lff.animals;


import org.lff.ability.ISay;
import org.lff.animals.base.BaseBird;
import org.lff.animals.base.LandAnimal;

/**
 * @author Liu Feifei
 * @date 2020/8/24 10:33 © 2020 Telepathy Labs | All Rights Reserved
 **/
public class Chicken extends BaseBird implements ISay {

    public String say() {
        String msg = "A chicken says Cluck, cluck";
        System.out.println(msg);
        return msg;
    }

    public void walk() {
        System.out.println("A chicken walks");
    }
}
