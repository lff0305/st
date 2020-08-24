package org.lff.animals;

import org.lff.ability.IFly;

/**
 * @author Liu Feifei
 * @date 2020/8/24 10:44
 **/
public class Butterfly extends LandAnimal implements IFly {

    private final Caterpillar from;

    public Butterfly(Caterpillar caterpillar) {
        super();
        this.from = caterpillar;
    }

    public void walk() {
        System.out.println("A butterfly walks");
    }

    public void fly() {
        System.out.println("A butterfly flies");
    }
}
