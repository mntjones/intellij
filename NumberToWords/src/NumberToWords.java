public class NumberToWords {

    public static void numberToWords (int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("Zero");
        }

        int reversed = reverse(number);


        int reversedLength = getDigitCount(reversed);
        int numberLength = getDigitCount(number);

        while (reversed > 0) {

            int currentDigit = reversed % 10;
            reversed /= 10;

            switch (currentDigit) {
                case 0:
                    System.out.println("Zero");
                    continue;
                case 1:
                    System.out.println("One");
                    continue;
                case 2:
                    System.out.println("Two");
                    continue;
                case 3:
                    System.out.println("Three");
                    continue;
                case 4:
                    System.out.println("Four");
                    continue;
                case 5:
                    System.out.println("Five");
                    continue;
                case 6:
                    System.out.println("Six");
                    continue;
                case 7:
                    System.out.println("Seven");
                    continue;
                case 8:
                    System.out.println("Eight");
                    continue;
                case 9:
                    System.out.println("Nine");
                    continue;
                default:
                    break;
            }
        }

        if (reversedLength != numberLength) {
            for (int i= numberLength-reversedLength; i > 0; i--) {
                System.out.println("Zero");
            }
        }

    }

    public static int reverse (int number) {

        int reverse = 0;
        int lastDigit = number % 10;

        reverse += lastDigit;
        int newNumber = number/10;

        while (Math.abs(newNumber) > 0) {

            lastDigit = newNumber % 10;
            reverse *= 10;
            reverse += lastDigit;
            newNumber /= 10;
        }

        return reverse;

    }

    public static int getDigitCount (int number) {

        if (number < 0) {
            return -1;
        }

        // largest int value 2,147,483,647

        if (number >= 1000000000) {
            return 10;
        }
        else if (number >= 100000000) {
            return 9;
        }
        else if (number >= 10000000) {
            return 8;
        }
        else if (number >= 1000000) {
            return 7;
        }
        else if (number >= 100000) {
            return 6;
        }
        else if (number >= 10000) {
            return 5;
        }
        else if (number >= 1000) {
            return 4;
        }
        else if (number >= 100) {
            return 3;
        }
        else if (number >= 10) {
            return 2;
        }
        else {
            return 1;
        }
    }
}
