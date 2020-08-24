package org.lff;


import org.junit.Assert;
import org.junit.Test;
import org.lff.ability.IEatFish;
import org.lff.ability.IMakeJoke;
import org.lff.ability.ISwim;
import org.lff.animals.ClownFish;
import org.lff.animals.Shark;
import sun.security.provider.SHA;

/**
 * @author Liu Feifei
 * @date 2020/8/24 11:37
 **/
public class TestShark {
    @Test
    public void sharkCanSwim() {
        Assert.assertEquals(new Shark() instanceof ISwim, true);
    }
    @Test
    public void sharkIsGray() {
        Assert.assertEquals(new Shark().getColor(), "Grey");
    }
    @Test
    public void sharkEatsFish() {
        Assert.assertEquals(new Shark() instanceof IEatFish, true);
    }
}
