package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(-123));
    }

    public static int sumDigits (int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;
        int leastSigDigit = number % 10;
        int newNumber = number;

         do {
             newNumber /= 10;
             sum += leastSigDigit;
             leastSigDigit = newNumber % 10;
         } while (newNumber >= 1);

         // teacher's simpler solution
//         while (number > 0) {
//             int digit = number %10;
//             sum += digit;
//             number /= 10;
//         }

        return sum;

    }
}
