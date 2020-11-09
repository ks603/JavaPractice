package com.company;

public class Main {

    public static void main(String[] args) {
	for (int i = 0; i <= 100; i++) {
	    if(i % 3 == 0 && i % 5 == 0){
            System.out.println("fizzbuzz");
        } else if(i % 3 == 0){
            System.out.println("fizz");
        } else if(i % 5 == 0){
            System.out.println("buzz");
        } else {
            System.out.println(i);
        }
    }
	add(10);
    }

    public static void add(int someNumber){
        int count = 0;
        for(int i = 1; i <= someNumber; i++)
            count += i;
        System.out.println(count);
    }
}
