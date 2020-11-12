package com.company;

public class Main {

    public static void main(String[] args) {
	    printDayOFTheWeek(8);
	    newDayOfTheWeek(8);
    }

    public static void printDayOFTheWeek(int day){
        switch (day){
            case 1:
                System.out.println("day is Sunday");
                break;
            case 2:
                System.out.println("day is Monday");
                break;
            case 3:
                System.out.println("day is Tuesday");
                break;
            case 4:
                System.out.println("day is Wednesday");
                break;
            case 5:
                System.out.println("day is Thursday");
                break;
            case 6:
                System.out.println("day is Friday");
                break;
            case 0:
                System.out.println("day is Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void newDayOfTheWeek(int day) {
        if (day == 1) {
            System.out.println("day is Saturday");
        } else if (day == 2) {
            System.out.println("day is Monday");
        } else if (day == 3) {
            System.out.println("day is Tuesday");
        } else if (day == 4) {
            System.out.println("day is Wednesday");
        } else if (day == 5) {
            System.out.println("day is Thursday");
        } else if (day == 6) {
            System.out.println("day is Friday");
        } else if (day == 0) {
            System.out.println("day is Sunday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
