package com.company;

public class Main {

    public static void main(String[] args) {
        int highSCore = calculateScore(true, 800, 5, 100);
        System.out.println("your final score " + highSCore);

       highSCore = calculateScore(true, 10000, 8, 200);

        System.out.println("your final score " + highSCore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Pablo", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Rick", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Steve", position);



    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >1000){
            return 1;
        } else if(playerScore >500 && playerScore < 1000){
            return 2;
        } else if (playerScore > 100 && playerScore < 500){
            return 3;
        } else {
            return 4;
        }
    }
}

