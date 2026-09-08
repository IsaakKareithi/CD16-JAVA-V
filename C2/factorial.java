package C2;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // reading the integer input(n) to calculate factorial
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scn.nextInt();

        // calling the factorial method and printing the result
        System.out.println("Factorial of "+n+ " is: " + Factorial1(n));

    }
        // method to calculate the factorial of a number 
        public static int Factorial1(int n) {
            // base case: if n is 0 or 1, return 1
            if (n == 0 || n == 1) {
                return 1;
            }

            // REcursive case: n*factorial(n-1)
            return n * Factorial1(n-1);
        }
    }

