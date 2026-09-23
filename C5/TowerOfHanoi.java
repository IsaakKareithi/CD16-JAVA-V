package C5;

import java.util.Scanner;

public class TowerOfHanoi {

    // recursive method to solve the tower of hanoi problem
    public static void toh(int n, int t1, int t2, int t3) {
        // base case: if no disks left, return
        if (n == 0) {
            return;
        }

        // move n-1 disks from t1 to t3 using t2 as auxiliary 
        toh (n-1, t1, t3, t2);

        // move the nth disk from t1 to t2
        System.out.println("Move disks " + n + " from Tower "+t1+ " to Tower "+t2);

        //move the n-1 disks from t3 to t2 using t1 as auxiliary
        toh (n-1, t3, t2, t1);
    }
    // main method - entry point of the program
    public static void main(String[] args) { 
        // create a scanner object to read input from the user
        Scanner scn = new Scanner(System.in);

        // ask the user to iput the number of disks
        System.out.print("Enter the number of disks: ");
        int n = scn.nextInt();

        // ask the user to input the numbers for the 3 towers (e.g. 1,2,3)
        System.out.print("Enter the number for the first tower (t1): ");
        int t1 = scn.nextInt();

        System.out.print("Enter the number for the second tower (t2): ");
        int t2 = scn.nextInt();

        System.out.print("Enter the number for the third tower (t3): ");
        int t3 = scn.nextInt();

        // call the toh method to solve the Tower of Hanoi problem 
        toh(n, t1, t2, t3);
    }
    
}
