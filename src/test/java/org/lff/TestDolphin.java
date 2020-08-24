package org.lff;

import org.junit.Assert;
import org.junit.Test;
import org.lff.ability.ISwim;
import org.lff.animals.Dolphin;
import org.lff.animals.Fish;

/**
 * @author Liu Feifei
 * @date 2020/8/24 11:41
 **/
public class TestDolphin {
    @Test
    public void testNotFish() {
        Object dolphin = new Dolphin();
        Assert.assertEquals(dolphin instanceof Fish, false);
    }
    @Test
    public void testCanSwim() {
        Assert.assertEquals(new Dolphin() instanceof ISwim, true);
    }
}
