package org.lff;

import org.junit.Assert;
import org.junit.Test;
import org.lff.ability.ISing;
import org.lff.ability.ISwim;
import org.lff.ability.IWalk;
import org.lff.animals.Fish;

/**
 * @author Liu Feifei
 * @date 2020/8/24 11:34
 **/
public class TestFish {
    @Test
    public void testFishCanSwim() {
        Assert.assertEquals(new Fish() instanceof ISwim, true);
    }
    @Test
    public void testFishCanNotWalk() {
        Assert.assertEquals(new Fish() instanceof IWalk, false);
    }
    @Test
    public void testFishCanNotSing() {
        Assert.assertEquals(new Fish() instanceof ISing, false);
    }
}
