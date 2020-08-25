package org.lff.locale;

/**
 * @author Liu Feifei
 * @date 2020/8/24 15:27 © 2020 Telepathy Labs | All Rights Reserved
 **/
class LocaleManager {

    private enum Singleton {
        INSTANCE;

        private final LocaleManager instance;

        Singleton() {
            instance = new LocaleManager();
        }

        private LocaleManager getInstance() {
            return instance;
        }
    }

    private LocaleManager() {
    }

    static LocaleManager getInstance() {
        return Singleton.INSTANCE.getInstance();
    }
}