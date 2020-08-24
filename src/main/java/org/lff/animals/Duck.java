package org.lff.animals;


import org.lff.ability.ISay;
import org.lff.ability.ISwim;
import org.lff.animals.base.LandAnimal;

/**
 * @author Liu Feifei
 * @date 2020/8/24 10:27
 **/
public class Duck extends LandAnimal implements ISay, ISwim {

    public void swim() {
        System.out.println("A duck swims");
    }

    public void walk() {
        System.out.println("A duck walks");
    }

    public String say() {
        String msg = "A duck says Quack, quack";
        System.out.println(msg);
        return msg;
    }
}
