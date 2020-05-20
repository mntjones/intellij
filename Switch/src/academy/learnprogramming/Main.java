package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int value = 1;

        if (value == 1) {
            System.out.println("Value is 1");
        }
        else if (value == 2) {
            System.out.println("Value is 2");
        }
        else {
            System.out.println("Value is not 1 or 2");
        }


        int switchValue = 4;

        switch (switchValue) {
            case 10:
                System.out.println("Value was 10");
                break;
            case 20:
                System.out.println("Value was 20");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3 or 4 or 5");
                System.out.println("It is actually a " + switchValue);
                break;
            default:
                System.out.println("Was not 10 or 20");
                break;
        }

        char switchChar = 'C';

        switch (switchChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found the letter " + switchChar);
                break;
            default:
                System.out.println("This character was not found");
        }
    }

}
