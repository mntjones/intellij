public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit (int number) {

        if (number < 0) {
            return -1;
        }

        if (number >=0 && number < 10) {
            return number * 2;
        }

        int firstNum = 0;
        int lastNum = number % 10;

        while (number > 0) {

            firstNum = number % 10;
            number /= 10;

        }

        return firstNum + lastNum;
    }
}
