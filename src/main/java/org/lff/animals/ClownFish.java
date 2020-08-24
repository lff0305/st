package org.lff.animals;

import org.lff.ability.IMakeJoke;
import org.lff.constants.Size;

/**
 * @author Liu Feifei
 * @date 2020/8/24 10:55
 **/
public class ClownFish extends Fish implements IMakeJoke {

    public Size getSize() {
        return Size.SMALL;
    }

    public String getColor() {
        return "orange";
    }

    @Override
    public void joke() {
        System.out.println("telling a joke");
    }
}
