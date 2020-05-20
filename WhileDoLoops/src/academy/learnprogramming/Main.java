package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 1;

        while (count != 6) {
            System.out.println("Count value is " + count);
            count ++;
        }

        // do-while loop always executes at least once
        count =1;
        do {
            System.out.println("Count value was " + count);
            count ++;
        } while (count != 6);

        // Challenge 5.67

        int startNumber = 4;
        int endNumber = 20;
        int challengeCount = 0;

        while (startNumber <= endNumber) {
            startNumber ++;
            if (!isEvenNumber(startNumber)) {
                continue;
                // continue will not allow any further code to fire (print statement),
                // but allows the loop to continue
            }
            challengeCount ++;
            System.out.println("Even number: " + startNumber);
            if (challengeCount == 5) {
                break;
            }

        }
        System.out.println("# of even numbers found: " + challengeCount);


    }

    public static boolean isEvenNumber (int number) {

        return (number % 2 == 0) ? true:false;
    }
}
