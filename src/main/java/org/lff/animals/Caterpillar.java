package org.lff.animals;


import org.lff.ability.IMetamorphosis;

/**
 * A caterpillar
 * @author Liu Feifei
 * @date 2020/8/24 10:43 © 2020 Telepathy Labs | All Rights Reserved
 **/
public class Caterpillar extends LandAnimal implements IMetamorphosis {

    public void walk() {
        System.out.println("A caterpillar walks");
    }

    public Animal next() {
        return new Butterfly(this);
    }
}
