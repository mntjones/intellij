package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int[] myArray = new int[5];

        readIntegers(myArray);

        System.out.println("The minimum element in the array is: " + findMin(myArray));

    }

    public static int[] readIntegers (int[] array) {
        System.out.println("Enter " + array.length + " elements: ");
        for (int i=0; i< array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {

        int min = array[0];

        for (int i =1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
