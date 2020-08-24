package org.lff.animals;


import static org.lff.constants.Size.UNKNOWN;

import org.lff.constants.Size;

/**
 * Fish class
 * @author Liu Feifei
 * @date 2020/8/24 10:47 © 2020 Telepathy Labs | All Rights Reserved
 **/
public class Fish extends SeaAnimal {

    public Size getSize() {
        return UNKNOWN;
    }

    public String getColor() {
        return "?";
    }

    public void swim() {
        System.out.println("Fish can swim");
    }
}
