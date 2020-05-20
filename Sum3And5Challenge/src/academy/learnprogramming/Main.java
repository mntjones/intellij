package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        int count = 0;

        for (int i = 1; i < 1001; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number " + i + " is divisible by both 3 and 5");
                sum += i;
                count ++;
            }
            if (count == 5) {
                break;
            }
        }

        System.out.println("The sum of the first five found numbers is: " + sum);
    }
}
