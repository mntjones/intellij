package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // floating point - fractions with decimals. Single precision - 32 bits, Double - 64 bits
        // F - 1.4E-45 to 3.4E38, D - 4.9E-324 to 1.79E308

        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;

        System.out.println("float min: " + floatMin);
        System.out.println("float max: " + floatMax);

        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;

        System.out.println("double min: " + doubleMin);
        System.out.println("double max: " + doubleMax);

        // good practice to put f or d at the end of whole numbers if they are to be cast as float or double for clarity
        // by default, a float 5.25 is defaulted to a double, if not cast as 5.25f
        int wholeInt = 5;
        float wholeFloat= 5f/3f;
        double wholeDouble = 5d/3.00; // more precision than float

        System.out.println(wholeInt);
        System.out.println(wholeFloat);
        System.out.println(wholeDouble);

        // 3.29 Challenge
        int poundsToConvert = 150;
        double kilogramsConverted = poundsToConvert * 0.45359237;

        System.out.println("Kilograms: " + kilogramsConverted);

        // Summary: Java has a class called BigDecimal that is better to use when precision calculations
        // are needed, due to a limitation on how float point numbers are stored.



    }
}
