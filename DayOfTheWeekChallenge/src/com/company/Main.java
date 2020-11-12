package com.company;

public class Main {

    public static void main(String[] args) {
        printDayOFTheWeek(-1);
	    printDayOFTheWeek(0);
        printDayOFTheWeek(1);
        printDayOFTheWeek(2);
        printDayOFTheWeek(3);
        printDayOFTheWeek(4);
        printDayOFTheWeek(5);
        printDayOFTheWeek(6);
        printDayOFTheWeek(7);
	    newDayOfTheWeek(-1);
        newDayOfTheWeek(0);
        newDayOfTheWeek(2);
        newDayOfTheWeek(3);
        newDayOfTheWeek(4);
        newDayOfTheWeek(5);
        newDayOfTheWeek(6);
        newDayOfTheWeek(1);
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
