package com.company;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a string";
        System.out.println("my String is equal to " + myString);
        myString = myString + ", and this is my more";
        System.out.println("MY string is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("my string is equal to " + myString);
        String numberString = "200.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);
    }
}
