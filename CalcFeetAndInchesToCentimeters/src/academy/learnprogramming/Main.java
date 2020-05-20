package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeters(2, 6));
        System.out.println(calcFeetAndInchesToCentimeters(30));
        System.out.println(calcFeetAndInchesToCentimeters(-1, 4));
        System.out.println(calcFeetAndInchesToCentimeters(-10));

    }

    public static double calcFeetAndInchesToCentimeters (int feet, int inches) {

        if (feet < 0 || (inches < 0 || inches >= 12)) {
            System.out.println("Invalid parameters.");
            return -1;
        }

        double feetToCentimeters = feet * 12 * 2.54;
        double inchesToCentimeters = inches * 2.54;

        return feetToCentimeters + inchesToCentimeters;

    }

    public static double calcFeetAndInchesToCentimeters (int inches) {

        if (inches < 0) {
            System.out.println("Invalid parameters.");
            return -1;
        }

        int numberOfFeetInInches = inches / 12;
        int numberOfRemainingInches = inches % 12;

        return calcFeetAndInchesToCentimeters(numberOfFeetInInches, numberOfRemainingInches);

    }


}
