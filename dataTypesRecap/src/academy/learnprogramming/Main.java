package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //byte - rarely used
        //short - rarely used
        //int
        //long
        //float - rarely used
        //double
        //char
        //boolean

        // String is a class - sequence of characters, limited by the MAX int value space

        String myString = "This is my string.";

        System.out.println("My string is: " + myString);
        myString = myString + " Isn't is grand?";

        System.out.println(myString);

        String numberString = "10";
        numberString = numberString + "20";
        // string does not do calculations, are immutable - new String created when something is appended
        // thus appending in this way is inefficient
        System.out.println(numberString);



    }
}
