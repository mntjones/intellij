package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    // Autoboxing is the automatic conversion that the JAva compiler makes between primitive types and their corresponding Object wrapper classes.
    //  i.e. an int --> Integer, double --> Double
    // If the conversion goes the other way, that is called Unboxing


    public static void main(String[] args) {
	// write your code here

        String[] strArray = new String[10];
        int[] intArray = new int[10];

    // can't do this becuase int is primitive
       // ArrayList<int> intList = new ArrayList<int>();

    // You can do this
        ArrayList<Integer> intList = new ArrayList<Integer>();

        //  compiler reads as Integer myIntValue = Integer.valueOf(56);
        // will accept this
        Integer myIntValue = 56;
        int myInt = myIntValue; // compiler reads as   ->  myIntValue.intValue()



    }
}
