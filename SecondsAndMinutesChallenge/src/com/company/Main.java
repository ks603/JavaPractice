package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(63145));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("invalid Input");
            return "invalid Input";
        } else {
            int hours = minutes / 60;
            minutes = minutes % 60;
            return hours + "h " + minutes + "m " + seconds + "s";
        }
    }
    public static String getDurationString(int seconds) {
        if (seconds <= 0) {
            System.out.println("invalid Input");
            return "invalid Input";
        } else {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString( minutes, seconds);
        }
    }
}
