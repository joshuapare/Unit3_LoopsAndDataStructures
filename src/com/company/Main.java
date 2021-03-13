package com.company;

public class Main {

    public static void main(String[] args) {
        // Lets look at some common loops:

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

        // But that's pretty messy. Let's use a "for" loop to make this cleaner and more logical:

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

        //--------While Loops----------//

        // You are already familiar with while loops, it's good to have an easy reference to it. While loops are very
        // useful for having a program execute until a condition is met, or until you forcefully 'break' out of it. Here
        // is an example of the syntax with the same logic as above, where we count up to 10:

        int i = 0;

        while (i < 10){
            System.out.println("Hello");
            i++;
        }

        // The logic here is the same, because we declare an integer BEFORE entering the loop, starting at 0. Every time
        // the loop executes, we print out the word "Hello" and then increment i INSIDE OF THE LOOP. Once i reaches 10,
        // the condition of i < 10 will no longer be true, and the code will move on past the loop


    }
}
