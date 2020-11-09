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


//        boolean gameOver = true;
//        int levelCompleted = 5;
//        int bonus = 100;
//        int score = 800;

//        if(score <5000 && score >1000) {
//            System.out.println("Score was less than or equal to");
//        }  else if (score < 1000) {
//            System.out.println("Your score wass less than 1000");
//        } else {
//            System.out.println("Got here");
//        }
       calculateScore(true, 800, 5, 100);
       calculateScore(true, 10000, 8, 200);


    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {


        if( gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println(" Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

}
