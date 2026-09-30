package C6;

import java.util.Scanner;

public class displayArray {

    public static void main(String[] args){
    // create a scanner object to read input from the user
    Scanner scn = new Scanner(System.in);

    // ask the user for the number of elements in the array
    System.out.print("Enter the number of elements in the array: ");
    int n = scn.nextInt();

    // create an integer array of size n
    int[] arr = new int[n];

    // ask the user to input the elements in the array
    System.out.println("Enter the "+n+ " elements of the array: ");

    for (int i = 0; i<n; i++) {
        arr[i] = scn.nextInt(); // store each elemnts in the array 

        // call the method to diisplay he array elements starting from  index 0
        displayArr(arr, 0);

    }
    // method to display the array elements recursively
    public static void displayArr(int[] arr, int idx) {
        // base case: if index reaches the lengths of the array, return
        if (idx == arr.length) {
            return;
        }

        // print the current element of the array
        System.out.println(arr[idx]);

        // recursively call to display the next element
        displayArr(arr, idx + 1);
    
    } 
}
