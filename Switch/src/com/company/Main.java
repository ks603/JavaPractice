package com.company;

public class Main {

    public static void main(String[] args) {
	    int switchValue = 3;

	    switch(switchValue) {
            case 1:
                System.out.println("value wsa one");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3, 4 or 5");
                System.out.println("actually was a " + switchValue);
                break;

            default:
                System.out.println("Was not one or two");
                break;
        }

//        More code here
    }
}
