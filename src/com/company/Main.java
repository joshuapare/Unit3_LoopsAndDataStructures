package com.company;

public class Main {

    public static void main(String[] args) {
        // Lets look at some common data structures:

        //-----For Loops------//

        // Lets say that I want to execute something multiple times, like print hello 5 times. I could do this:

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        // But that's pretty messy. Let's use a loop to make this cleaner and more logical:

        for (int i = 0; i < 10; i++){
            System.out.println("Hello");
        }

        // The syntax of the for loop is this:
        // for (
        // #-declare an integer and starting value to count from-# -> 'int i = 0';
        // #-condition that tells the loop when to keep executing-# -> 'i < 10';
        // #-how to change the counting integer every time the loop executes-# -> 'i++'
        // ) {
        //     do something
        // }

    }
}
