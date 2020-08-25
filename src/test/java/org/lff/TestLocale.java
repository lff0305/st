package org.lff;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.lff.animals.Rooster;
import org.lff.locale.LocaleManager;

/**
 * Test Locale Strings
 * @author Liu Feifei
 **/
public class TestLocale {

    @Before
    public void reset() {
        LocaleManager.getInstance().set("English");
    }
    @Test
    public void testDefault() {
        String s = new Rooster().say();
        Assert.assertEquals(s, "A rooster says in English");
    }
    @Test
    public void testGerman() {
        LocaleManager.getInstance().set("German");
        String s = new Rooster().say();
        Assert.assertEquals("kikeriki", s);
    }
}
