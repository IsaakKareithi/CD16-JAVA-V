package C3;

import java.util.Scanner;

public class PowerLogarithmic {

    //main meethod - entry point of the program
    public  static void main(String[] args) throws Exception {

        // create a scanner object to read input from the user 
        Scanner scn = new Scanner(System.in);

        // ask a user to enter the base (x)
        System.out.print("Enter the base (x): ");
        int x = scn.nextInt();

        // ask the user enter the exponent (n)
        System.out.print("Enter the exponent (n): ");
        int n= scn.nextInt();

        // call the power method to calculate x*n
        int xpn = power(x, n);

        // print the result 
        System.out.println("Result: " + xpn);   
    }

    // method to compute the power using logarithmic time complexity (O(log n))
    public static int power(int x, int n) {
        // base case: x^0 = 1
        if (n == 0) {
            return 1;
        }

        // recursive case: compute power for n/2
        int xpnb2 = power(x, n / 2);

        // calculate x^n using the result for x^(n/2)
        int xn = xpnb2 * xpnb2;

        // if n is odd, multiply the result by x
        if (n % 2 == 1) {
            xn = xn * x;
        }

        return xn;
    }
}