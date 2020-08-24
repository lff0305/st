package org.lff;

import org.junit.Assert;
import org.junit.Test;
import org.lff.ability.ISay;
import org.lff.ability.ISing;
import org.lff.ability.ISwim;
import org.lff.animals.Bird;
import org.lff.animals.Cat;
import org.lff.animals.Chicken;
import org.lff.animals.Duck;
import org.lff.animals.Parrot;
import org.lff.animals.Rooster;

/**
 * Test case for bird, duck, chicken, etc
 * @author Liu Feifei
 * @date 2020/8/24 11:21
 **/
public class TestBird {
    @Test
    public void birdCanSing() {
        Assert.assertEquals(new Bird() instanceof ISing, true);
    }
    @Test
    public void DuckCanSay() {
        Assert.assertEquals(new Duck() instanceof ISay, true);
    }
    @Test
    public void DuckCanSwim() {
        Assert.assertEquals(new Duck() instanceof ISwim, true);
    }
    @Test
    public void chickenCanSay() {
        Assert.assertEquals(new Chicken() instanceof ISay, true);
    }
    @Test
    public void chickenCanNotSwim() {
        Assert.assertEquals(new Chicken() instanceof ISwim, false);
    }

    @Test
    public void RoosterCanSay() {
        Assert.assertEquals(new Rooster() instanceof ISay, true);
    }

    @Test
    public void RoosterSaysDifferentWithChicken() {
        String s = new Rooster().say();
        String c = new Chicken().say();
        Assert.assertNotSame(s, c);
    }
    @Test
    public void testParrot() {
        Cat cat = new Cat();
        Parrot p = new Parrot(cat);
        String s = p.say();
        Assert.assertEquals(s, cat.say());
    }
}
