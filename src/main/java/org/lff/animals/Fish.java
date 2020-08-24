package org.lff.animals;


import org.lff.constants.Size;

/**
 * Fish class
 * @author Liu Feifei
 * @date 2020/8/24 10:47 © 2020 Telepathy Labs | All Rights Reserved
 **/
public abstract class Fish extends SeaAnimal {

    public abstract Size getSize();

    public abstract String getColor();

    public void swim() {
        System.out.println("Fish can swim");
    }
}
