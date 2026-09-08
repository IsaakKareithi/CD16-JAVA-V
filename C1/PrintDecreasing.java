import java.io.*;
import java.util.*;

public class PrintDecreasing {

    public static void main(String[] args) throws Exception{
        //create scanner object to read input from the user

        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();

        // call the method method to print numbers decreasing drom n to 1
        printDecreasing(n);
    }

    // method to print decressing numbers from n to 1
    public static void printDecreasing(int n) {
        // base case: if n is 0, return (stop recursion)
        if (n == 0) return;

        // print the current value of n 
        System.out.println(n);

        // recursive call to print the next smaller number 
        printDecreasing (n-1);
    }
}