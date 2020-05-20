package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // chars can only store a single character - 2 bytes/16 bits - due to unicode
        char myChar = 'C';
        char unicodeChar = '\u0044';
        char copyrightChar = '\u00A9';

        System.out.println("Character: " + myChar);
        System.out.println("Unicode: " + unicodeChar);
        System.out.println("Copyright: " + copyrightChar);


        boolean trueBoolean = true;
        boolean falseBoolean = false;

        boolean overTwentyOne = true;


    }
}
