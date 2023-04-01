package org.example;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println("nowTime : " + now);

        TimeZone tz = Calendar.getInstance().getTimeZone();

        System.out.println("1 ::: " + tz.getDisplayName());
        System.out.println("2 ::: " + tz.getID());
    }
}