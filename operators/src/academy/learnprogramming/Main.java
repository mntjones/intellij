package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int counter = 0;

	    counter += 1;
	    counter += 1;

        System.out.println(counter);

        boolean isGreaterThanZero = true;

        if (isGreaterThanZero) {
            System.out.println("Counter is greater than zero.");
            System.out.println("And that is awesome!");
        }

        int score = 100;

        if (score > 70 && score < 100) {
            System.out.println("You have passed the test");
        }

        if (score < 70 || score ==100) {
            System.out.println("See teacher!");
        }

        boolean isCar = true;
        String wasCar = isCar ? "wasCar is true because isCar is true" : "wasCar is false because isCar is false" ;
        System.out.println(wasCar);

        // 3.39 - Operator Challenge

        double myValue = 20.00d;
        double myNextValue = 80.00d;

        double answerMutiply = (myNextValue + myValue) * 100.00d;
        double answerMod = answerMutiply % 40.00d;

        boolean yesOrNo = (answerMod == 0) ? true:false;


        System.out.println("(20.00 + 80.00) * 100.00 divided by 40.00 = 0? true or false? --> " + yesOrNo);

        if (!yesOrNo) {
            System.out.println("Got some remainder");
        }


    }
}
