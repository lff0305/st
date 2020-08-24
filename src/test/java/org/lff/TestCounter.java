package org.lff;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Test;
import org.lff.ability.IFly;
import org.lff.ability.ISing;
import org.lff.ability.ISwim;
import org.lff.ability.IWalk;
import org.lff.animals.base.Animal;
import org.lff.animals.Bird;
import org.lff.animals.Butterfly;
import org.lff.animals.Cat;
import org.lff.animals.Chicken;
import org.lff.animals.ClownFish;
import org.lff.animals.Dog;
import org.lff.animals.Dolphin;
import org.lff.animals.Duck;
import org.lff.animals.Fish;
import org.lff.animals.Frog;
import org.lff.animals.Parrot;
import org.lff.animals.Rooster;
import org.lff.animals.Shark;

/**
 * Test cases for counter
 * @author Liu Feifei
 * @date 2020/8/24 10:58
 **/
public class TestCounter {

    private final Animal[] animals = new Animal[]{
        new Bird(),
        new Duck(),
        new Chicken(),
        new Rooster(),
        new Parrot(),
        new Fish(),
        new Shark(),
        new ClownFish(),
        new Dolphin(),
        new Frog(),
        new Dog(),
        new Butterfly(),
        new Cat()
    };

    @Test
    public void countFly() {
        List<Animal> list = count(IFly.class);
        System.out.println("Count fly = " + list);
        Assert.assertEquals(list.size(), 3);
    }

    @Test
    public void countWalk() {
        List<Animal> list = count(IWalk.class);
        System.out.println("Count walk = " + list);
        Assert.assertEquals(list.size(), 9);
    }
    @Test
    public void countSing() {
        List<Animal> list = count(ISing.class);
        System.out.println("Count sing = " + list);
        Assert.assertEquals(list.size(), 1);
    }
    @Test
    public void countSwim() {
        List<Animal> list = count(ISwim.class);
        System.out.println("Count swim = " + list);
        Assert.assertEquals(list.size(), 6);
    }

    private <T> List<Animal> count(Class<T> c) {
        return Arrays.asList(animals).stream().filter(
            c::isInstance
            ).collect(Collectors.toList());
    }
}
