package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car ();
        Car yourCar = new Car();

        myCar.setModel("Prius C");
        System.out.println("Model of my car is: " + myCar.getModel());

    }
}
