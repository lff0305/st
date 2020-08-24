package org.lff.animals.base;

import org.lff.ability.IWalk;
import org.lff.animals.base.Animal;

/**
 * Animals living on land
 * @author Liu Feifei
 * @date 2020/8/24 10:09
 **/
public abstract class LandAnimal extends Animal implements IWalk {

    public abstract void walk();
}
