package com.noirix.domain;

import java.util.Locale;

public enum TestLocale {

    RU(new Locale("ru", "ru", "ru_RU")),
    EN(new Locale("en", "en", "en_US")),
    UA(new Locale("uk", "ua", "uk_UA")),
    ID(new Locale("in", "id", "id_ID")),
    HI(new Locale("hi", "in", "hi_IN"));

    private final Locale locale;

    TestLocale(Locale locale) {
        this.locale = locale;
    }

    public Locale getLocale() {
        return locale;
    }

    public static TestLocale defaultTestLocale() {
        return TestLocale.RU;
    }


    public String getLocaleLanguage() {
        return locale.getLanguage();
    }

    public String getLocaleCountry() {
        return locale.getCountry();
    }
}
