package com.company;

public class Main {

    public static void main(String[] args) {
       int newScore = calculateScore("Tim", 500);
        System.out.println(newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(4, 8));
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
        double newVar = 0;
        double newVary = 0;
        double centy = 0;

        if(feet < 0) {
            return -1;
        } if(inches <= 0 || inches >= 12){
            return -1;
        } else {
            newVar = feet * 12;
            newVary = inches + newVar;
            centy = newVary * 2.54;
        }
        return centy;
    }

}
