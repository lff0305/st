package org.lff.animals;

import org.lff.ability.ISay;

/**
 * @author Liu Feifei
 * @date 2020/8/24 10:35
 **/
public class Roster extends LandAnimal implements ISay {

    public String say() {
        String msg = "A roster says Cluck, cluck";
        System.out.println(msg);
        return msg;
    }

    public void walk() {
        System.out.println("A roster walks");
    }
}
