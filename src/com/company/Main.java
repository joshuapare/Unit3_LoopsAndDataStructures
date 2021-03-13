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

        //---------For Each Loops---------//

        // These loops are used a bit more commonly in JavaScript, but they can still be useful in Java. The syntax is
        // a bit weird, though. Nevertheless the concept is as follows:

        // I have a basket of things. For each item in that basket, I want to do something. Lets make a basket of things
        // below to show an example. To do this, I will create an array of integers.

        int[] basketOfNumbers = {1,2,3,4,5,6,7,8,9};

        // An array is a collection of variables that are treated as an ORDERED COLLECTION (we will talk about other data
        // structures later on that are unordered - you'll see why this can be useful. Each element is placed in a specific
        // slot in the collection, known as an 'index'. Think if you have a road with 10 houses on it, each houses
        // address is the houses index, and the road is the array. The houses are all on the same road (in the same array)
        // but they all have different addresses.

        // Lets print out the number stored at each index (address) in the array using a for-each loop:

        for ( int number : basketOfNumbers ){
            System.out.println(number);
        }

        // What's happening here is that we are able to access the value stored in each index of the array by using the
        // 'int number' portion. When we reference 'number', we are referencing the variable that the loops is currently
        // being accessed in the loop. When the loop first executes, number refers to '0', the first number in the
        // 'basketOfNumbers' array. The second time it loops, it sees if there is another element after that in the
        // array. In our case, there is! After 0, there is a 1 stored in the second index of the array. This process
        // continues until there are no values left in the array, which at this point the loop will see it has reached
        // the end of the array and will exit the loop.
    }
}
