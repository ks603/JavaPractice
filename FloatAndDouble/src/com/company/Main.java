package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float max value " + myMaxFloatValue);
        System.out.println("Float min value " + myMinFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double max value " + myMaxDoubleValue);
        System.out.println("Double min value " + myMinDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        double lbs = 200;
        double lbsToKg = lbs * 0.45359237;
        System.out.println("The answer lbs to kg is " + lbsToKg);

    }
}
