public class NumberPalindrome {

    public static boolean isPalindrome (int number) {

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

        System.out.println("Reverse is " + reverse);

        if (reverse == number) {
            return true;
        }

        return false;
    }
}
