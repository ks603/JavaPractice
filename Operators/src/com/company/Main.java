package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);


        result *= 10;
        System.out.println("3 * 30 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;

        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 82;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 81;
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }

        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }
        isCar = true;

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("was car was true");
        }
        System.out.println(wasCar);

//        Challenge
        double variable2 = 20.00;
        double variable3 = 80.00;
        double variable4 = (variable2 + variable3) * 100.00;
        System.out.println("the total here = " + variable4);
        double theRemainder = variable4 % 40.00d;
        System.out.println(theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isnoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("There is a remainder");
        }

    }
}
