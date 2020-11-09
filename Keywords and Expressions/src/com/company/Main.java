package com.company;

public class Main {

    public static void main(String[] args) {
//	a mile is equal to 1.609344 Kilometres
        double kilometres = (100 * 1.609344);
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        System.out.println("This is" +
                " another" +
                " Still more.");
        int anotherVariable = 5;
        anotherVariable--;
        System.out.println(anotherVariable);


        boolean gameOver = true;
        int levelCompleted = 5;
        int bonus = 100;
        int score = 800;

//        if(score <5000 && score >1000) {
//            System.out.println("Score was less than or equal to");
//        }  else if (score < 1000) {
//            System.out.println("Your score wass less than 1000");
//        } else {
//            System.out.println("Got here");
//        }
       if( gameOver) {
           int finalScore = score + (levelCompleted * bonus);
           System.out.println(" Your final score was " + finalScore);
       }

        boolean newGameOver = true;
        int levelCompleted2 = 8;
        int newBonus = 200;
        int newScore = 10000;
        if (newGameOver) {
            int newFinalScore = newScore + (levelCompleted2 * newBonus);
            System.out.println("Your new score was " + newFinalScore);

        }

    }
}
