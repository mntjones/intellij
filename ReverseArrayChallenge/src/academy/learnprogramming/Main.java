package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArray = {1,2,3,4,5};

        System.out.println("Array = " + Arrays.toString(myArray));

        reverse(myArray);

        System.out.println("Reversed Array= " + Arrays.toString(myArray));
    }

    public static void reverse(int[] array) {

        int temp;
        int last = array.length-1;

        for (int i=0; i <= array.length/2; i++) {
            temp = array[i];

            array[i] = array[last];
            array[last] = temp;

            last -= 1;
        }
    }
}
