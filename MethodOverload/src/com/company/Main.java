package com.company;

public class Main {

    public static void main(String[] args) {
       int newScore = calculateScore("Tim", 500);
        System.out.println(newScore);
        calculateScore(75);
        calculateScore();
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

}
