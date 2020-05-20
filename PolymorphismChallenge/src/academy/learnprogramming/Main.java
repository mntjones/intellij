package academy.learnprogramming;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine() {
        return "Starting engine in Car class...";
    }

    public String accelerate() {
        return "Accelerating in Car class";
    }

    public String brake() {
        return "Braking in Car class";
    }
}

class Prius extends Car {
    public Prius(int cylinders) {
        super("Prius", cylinders);
    }

    public String startEngine() {
        return "Starting engine in Prius class...";
    }

    public String accelerate() {
        return "Accelerating in Prius class";
    }


}

class Mustang extends Car {
    public Mustang(int cylinders) {
        super("Mustang", cylinders);
    }

    public String startEngine() {
        return "Starting engine in Mustang class...";
    }

    public String brake() {
        return "Braking in Mustang class";
    }
}

class Camaro extends Car {
    public Camaro (int cylinders) {
        super("Camaro", cylinders);
    }

    public String accelerate() {
        return "Accelerating in Camaro class";
    }

    public String brake() {
        return "Braking in Camaro class";
    }


}

public class Main {

    public static void main(String[] args) {

        Car car = new Car("My Car", 6);
        System.out.println("Number of cylinder in " + car.getName() + ": " + car.getCylinders());
        System.out.println("Starting engine: " + car.startEngine());
        System.out.println("Accelerating: " + car.accelerate());
        System.out.println("Braking: " + car.brake());

        Mustang mustang = new Mustang( 10);
        System.out.println("Number of cylinder in " + mustang.getName() + ": " + mustang.getCylinders());
        System.out.println("Starting engine: " + mustang.startEngine());
        System.out.println("Accelerating: " + mustang.accelerate());
        System.out.println("Braking: " + mustang.brake());

        Prius prius = new Prius(4);
        System.out.println("Number of cylinder in " + prius.getName() + ": " + prius.getCylinders());
        System.out.println("Starting engine: " + prius.startEngine());
        System.out.println("Accelerating: " + prius.accelerate());
        System.out.println("Braking: " + prius.brake());

        Camaro camaro = new Camaro(12);
        System.out.println("Number of cylinder in " + camaro.getName() + ": " + camaro.getCylinders());
        System.out.println("Starting engine: " + camaro.startEngine());
        System.out.println("Accelerating: " + camaro.accelerate());
        System.out.println("Braking: " + camaro.brake());

    }
}
