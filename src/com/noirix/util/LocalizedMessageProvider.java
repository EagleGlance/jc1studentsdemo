package com.noirix.util;

import com.noirix.domain.TestLocale;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedMessageProvider {

    public static final String BUNDLE_NAME = "translation";

    public static String getMessage(String messageKey, String language, String country) {
        Locale locale;
        if (!language.isBlank() && !country.isBlank()) {
            locale = new Locale(language, country);
        } else {
            locale = TestLocale.defaultTestLocale().getLocale();
        }

        return ResourceBundle
                .getBundle(BUNDLE_NAME, locale)
                .getString(messageKey);
    }
}
