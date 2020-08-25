package org.lff.locale;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import org.lff.animals.Rooster;

/**
 * Manage the locales
 * @author Liu Feifei
 * @date 2020/8/24 15:27
 **/
public class LocaleManager {


    public String getString(Class clz, String defString) {
        String s = getString(clz);
        return (s == null) ? defString : s;
    }

    public String getString(Class clz) {
        Properties p = data.get(clz.getName());
        if (p == null) {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream is = classloader.getResourceAsStream("locales/" + clz.getName() + ".properties");
            p = new Properties();
            try {
                p.load(is);
                data.putIfAbsent(clz.getName(), p);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (p != null && this.language != null) {
            String v = p.getProperty(this.language);
            return v;
        }
        return null;
    }

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
        load();
    }

    ConcurrentHashMap<String, Properties> data = new ConcurrentHashMap<>();

    private void load() {

    }

    public static LocaleManager getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private String language = null;

    public void set(String language) {
        this.language = language;
    }
}