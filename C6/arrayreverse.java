package C6;

import java.util.Scanner;

public class arrayreverse {

    public static void main(String[] args){
        // create a scanner object to read input from the user
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of elements in the aray: ");
        int n = scn.nextInt();

        // create an array of size n
        int [] arr = new int[n];

        System.out.println("Enter the "+n+ " elements of the array: ");

        for (int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        displayArrReverse(arr, 0);
    }

    // method to display array elements in reverse order
    public static void displayArrReverse(int[] arr, int idx) {
        if (idx == arr.length){
            return;
        }

        // recursively call to display the next elements
        displayArrReverse(arr, idx+ 1);

        // print the current element in reverse order after the recursive call
        System.out.println(arr[idx]);
    }
    
}
