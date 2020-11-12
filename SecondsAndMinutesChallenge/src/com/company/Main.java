package com.company;

public class Main {

    public static final String INVALID_VALUE = "Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(-1, 8));
        System.out.println(getDurationString(63145));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE;
        }
            int hours = minutes / 60;
            minutes = minutes % 60;

            String hoursString = hours + "h ";
            if ( hours < 10) {
                hoursString = "0" + hours + "h ";
            }

            String minutesString = minutes + "m ";
            if (minutes < 10) {
                minutesString = "0" + minutes + "m ";
            }

        String secondsString = seconds + "s ";
        if ( seconds < 10) {
            secondsString = "0" + seconds + "s ";
        }

        return hoursString + minutesString + secondsString;
    }
    public static String getDurationString(int seconds) {
        if (seconds <= 0) {
            System.out.println("invalid Input");
            return "invalid Input";
        }
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString( minutes, seconds);
    }
}
