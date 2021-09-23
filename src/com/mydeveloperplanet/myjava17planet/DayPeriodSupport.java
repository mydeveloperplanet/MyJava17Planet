package com.mydeveloperplanet.myjava17planet;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DayPeriodSupport {

    public static void main(String[] args) {
        System.out.println("""
                        **********************
                        * English formatting *
                        **********************""");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("B");
        System.out.println(dtf.format(LocalTime.of(8, 0)));
        System.out.println(dtf.format(LocalTime.of(13, 0)));
        System.out.println(dtf.format(LocalTime.of(20, 0)));
        System.out.println(dtf.format(LocalTime.of(23, 0)));
        System.out.println(dtf.format(LocalTime.of(0, 0)));

        System.out.println("""
                        ********************
                        * Dutch formatting *
                        ********************""");
        dtf = DateTimeFormatter.ofPattern("B").withLocale(Locale.forLanguageTag("NL"));
        System.out.println(dtf.format(LocalTime.of(8, 0)));
        System.out.println(dtf.format(LocalTime.of(13, 0)));
        System.out.println(dtf.format(LocalTime.of(20, 0)));
        System.out.println(dtf.format(LocalTime.of(0, 0)));
        System.out.println(dtf.format(LocalTime.of(1, 0)));
    }
}
