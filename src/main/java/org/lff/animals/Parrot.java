package org.lff.animals;

import org.lff.ability.IFly;
import org.lff.ability.ILearn;
import org.lff.ability.ISay;
import org.lff.animals.base.LandAnimal;

/**
 * A parrot, who can learn to say something from others
 * @author Liu Feifei
 * @date 2020/8/24 10:20
 **/
public class Parrot extends LandAnimal implements ISay, ILearn, IFly {

    private ISay learnFrom;

    public Parrot(ISay neighbour) {
        this.learnFrom = neighbour;
    }

    public Parrot() {
        this(null);
    }

    public void learn(ISay learnFrom) {
        this.learnFrom = learnFrom;
    }

    public String say() {
        if (this.learnFrom == null) {
            return "A parrot says";
        } else {
            return learnFrom.say();
        }
    }

    public void walk() {
        System.out.println("A parrot walks");
    }

    public void fly() {
        System.out.println("A parrot flys");
    }
}
