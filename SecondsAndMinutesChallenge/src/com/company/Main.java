package com.company;

public class Main {

    public static void main(String[] args) {

        getDurationString(125, 34);
        getDurationString(3661);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("invalid Input");
            return "invalid Input";
        } else {
            double hours = Math.floor(minutes / 60);
            minutes = minutes % 60;
            String time = hours + "h" + minutes + "m" + seconds + "s";
            System.out.println(hours + "h" + minutes + "m" + seconds + "s");
            return time;
        }
    }
    public static String getDurationString(int seconds) {
        if (seconds <= 0) {
            System.out.println("invalid Input");
            return "invalid Input";
        } else {
            double minutes = Math.floor(seconds / 60);
            seconds = seconds % 60;
            return getDurationString((int) minutes, seconds);
        }
    }
}
