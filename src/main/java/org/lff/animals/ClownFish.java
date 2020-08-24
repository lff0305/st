package org.lff.animals;

import org.lff.constants.Size;

/**
 * @author Liu Feifei
 * @date 2020/8/24 10:55
 **/
public class ClownFish extends Fish {

    public Size getSize() {
        return Size.SMALL;
    }

    public String getColor() {
        return "orange";
    }
}
