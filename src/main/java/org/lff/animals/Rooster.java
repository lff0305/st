package org.lff.animals;

import org.lff.ability.ISay;
import org.lff.animals.base.BaseBird;
import org.lff.locale.LocaleManager;

/**
 * Rooster class
 * @author Liu Feifei
 * @date 2020/8/24 10:35
 **/
public class Rooster extends BaseBird implements ISay {

    public String say() {
        String msg = LocaleManager.getInstance().getString(this.getClass(), "A rooster says in English");
        System.out.println(msg);
        return msg;
    }

    public void walk() {
        System.out.println("A rooster walks");
    }
}
