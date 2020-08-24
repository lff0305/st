package org.lff.animals;


import org.lff.ability.IEatFish;
import org.lff.constants.Size;

/**
 * @author Liu Feifei
 * @date 2020/8/24 10:53
 **/
public class Shark extends Fish implements IEatFish {

    public Size getSize() {
        return Size.BIG;
    }

    public String getColor() {
        return "Grey";
    }

    public void eat(Fish fish) {
        if (fish == null) {
            throw new NullPointerException("Canot eat void fish");
        }
        System.out.println("Shark eats " + fish);
    }
}
