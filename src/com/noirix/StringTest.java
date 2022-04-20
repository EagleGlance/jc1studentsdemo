package com.noirix;

import com.noirix.util.LocalizedMessageProvider;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class StringTest {

    public static void main(String[] args) {

        Locale usLocale = new Locale("en", "US");

        System.out.println(usLocale.getLanguage());
        System.out.println(usLocale.getCountry());

        System.out.println(Locale.FRANCE.getLanguage());
        System.out.println(Locale.FRANCE.getCountry());

        double testNumberFormat = 787878.78;
        Date date = new Date();

        NumberFormat frenchFormat = NumberFormat.getInstance(Locale.FRANCE);
        NumberFormat frenchCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat canadaFormat = NumberFormat.getInstance(Locale.CANADA);
        NumberFormat canadaCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.CANADA);

        System.out.println(frenchFormat.format(testNumberFormat));
        System.out.println(frenchCurrencyFormat.format(testNumberFormat));
        System.out.println(canadaFormat.format(testNumberFormat));
        System.out.println(canadaCurrencyFormat.format(testNumberFormat));

        Locale search = Locale.forLanguageTag("fr");

        System.out.println("Test locale search");
        System.out.println(search.getLanguage());

        DateFormat usDateTime = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.ITALY);

        System.out.println(usDateTime.format(date));

        Locale testLocale = Locale.US;

        System.out.println(LocalizedMessageProvider.getMessage("title", testLocale.getLanguage(), testLocale.getCountry()));
        System.out.println(LocalizedMessageProvider.getMessage("country", testLocale.getLanguage(), testLocale.getCountry()));
        System.out.println(LocalizedMessageProvider.getMessage("city", testLocale.getLanguage(), testLocale.getCountry()));
    }
}

