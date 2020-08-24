package org.lff;


import org.junit.Assert;
import org.junit.Test;
import org.lff.ability.IMakeJoke;
import org.lff.ability.ISwim;
import org.lff.animals.ClownFish;

/**
 * @author Liu Feifei
 * @date 2020/8/24 11:41
 **/
public class TestClownFish {
    @Test
    public void clownFishCanSwim() {
        Assert.assertEquals(new ClownFish() instanceof ISwim, true);
    }
    @Test
    public void clownFishCanMakeJokes() {
        Assert.assertEquals(new ClownFish() instanceof IMakeJoke, true);
    }
}
