package C4;

import java.util.Scanner;

public class FibonacciSeries { 

    // static varialbes to store fibonacci series values
    static int n1 = 0, n2 = 1, n3 = 0;

    // method to print fibonacci series up to given count 
    static void printFibonacci(int count) {
        if (count > 0) {
            // calculate the next Fibonacci number
            n3 = n1 + n2;

            // update n1 and n2 for the next iteration
            n1 = n2;
            n2 = n3 ;

            // print the current Fibonacci number
            System.out.print(" " + n3);

            // recursive call to print the next Fibonacci number
            printFibonacci(count -1);
        }
    }

    // main method  Entry point of the program
    public static void main(String args[]) {
        // create a Scanner object to read input from the user 
        Scanner scn = new Scanner (System.in);

        // ask the uer how many Fibonacci numbers they want to print
        System.out.print("Enter the number of Fibonacci numbers you want to print: ") ;

        int count = scn.nextInt(); // read input

        // print the first 2 Fibonacci numbers
        System.out.print(n1 + " " + n2);

        // call the printFibonacci method to print the next Fibonacci numbers
        printFibonacci(count - 2); // subtract 2 because 0 and 1 are already printed
    }
}