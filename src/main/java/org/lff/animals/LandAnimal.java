package org.lff.animals;

import org.lff.ability.IWalk;

/**
 * @author Liu Feifei
 * @date 2020/8/24 10:09
 **/
public abstract class LandAnimal extends Animal implements IWalk {

    public abstract void walk();
}
