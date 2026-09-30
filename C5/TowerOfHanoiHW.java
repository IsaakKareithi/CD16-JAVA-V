package C5;

import java.util.Scanner;

public class TowerOfHanoiHW {

    // method to recursively solve the tower of hanoi
    public static void toh(int n, int t1, int t2, int t3, int t4) {
        // base case: if no disks left, return 
        if (n == 0) {
            return;
        }

        // move n-1 disks from t1 to t3 using t2 as auxiliary
        toh (n-1, t1, t3, t2, t4);

        // move the nth disk from t1 to t2
        System.out.println("Move disks "+n+ " from Tower "+t1+ " to Tower "+t2);

        // move the nth disk from t2 to t3
        System.out.println("Move disks "+n+ " from Tower "+t2+ " to Tower "+t3);

        // move n-1 disks from t4 to t3 using t1 as auxiliary
        toh (n-1, )
    }
    
}
