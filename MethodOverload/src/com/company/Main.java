package com.company;

public class Main {

    public static void main(String[] args) {
       int newScore = calculateScore("Tim", 500);
        System.out.println(newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(10, 1);
        calcFeetAndInchesToCentimeters(100);

    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("PLayer " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("no player name no player scored");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if(feet < 0) {
            System.out.println("Invalid");
            return -1;
        } if(inches < 0 || inches >= 12){
            System.out.println("invalid");
            return -1;
        } else {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(centimeters);
            return centimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else {
            double feet = Math.floor(inches / 12);
            inches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        }
    }

}
