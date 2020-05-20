package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);

        printArray(myIntegers);

        System.out.println("");

        printArray(sortDescending(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values =  new int[number];

        for (int i=0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " is " + array[i]);
        }

    }

    public static int[] sortDescending(int[] array) {
//        int[] sorted = new int[array.length];
//
//        // copies array passed
//        for (int i = 0; i < array.length; i++) {
//            sorted[i] = array[i];
//        }

        int[] sorted = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i=0; i<sorted.length-1; i++) {
                if (sorted[i] < sorted[i+1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sorted;
    }
}
