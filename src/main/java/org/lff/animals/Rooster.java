package org.lff.animals;

import org.lff.ability.ISay;

/**
 * Rooster class
 * @author Liu Feifei
 * @date 2020/8/24 10:35
 **/
public class Rooster extends LandAnimal implements ISay {

    public String say() {
        String msg = "Cock-a-doodle-doo";
        System.out.println(msg);
        return msg;
    }

    public void walk() {
        System.out.println("A rooster walks");
    }
}
