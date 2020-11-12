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



        char newVar = 'd';

	    switch(newVar) {

            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.println("char was a, b, c, d, e");
                break;

            default:
                System.out.println("Was not a, b, c, d, e");
                break;
        }

        String month = "January";

	    switch(month.toLowerCase()) {
            case "february":
                System.out.println("month is febrauary");
                break;
            case "january":
                System.out.println("month was january");
                break;
            default:
                System.out.println("not sure what month it is");
                break;
        }
    }
}
