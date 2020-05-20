package academy.learnprogramming;

import java.util.Scanner;

class Hamburger {

    // Basics for all burgers
    private String bread;
    private String meat;
    private String type;
    private double price;

    // Additions
    private String tomato = "tomato";
    private String lettuce = "lettuce";
    private String cheese = "cheese";
    private String onion = "onion";
    private String avocado = "avocado";
    private String pickle = "pickle";

    private double tomatoPrice = 0.50;
    private double lettucePrice = 0.50;
    private double cheesePrice = 1.00;
    private double onionPrice = 0.50;
    private double avocadoPrice = 1.50;
    private double picklePrice = 1.00;

    private int tomatoCount = 0;
    private int lettuceCount = 0;
    private int cheeseCount = 0;
    private int onionCount = 0;
    private int avocadoCount = 0;
    private int pickleCount = 0;

    // Totals variables
    private int totalAdditionCount;
    private double totalPrice;

    public Hamburger(String bread, String meat, String type) {
        this.bread = bread;
        this.meat = meat;
        this.type = type;
        if (this.type == "basic") {
            this.price = 5.00;
        }
        else if (this.type == "healthy") {
            this.price = 6.00;
        }
        else {
            this.price = 7.00;
        }


        this.totalPrice = this.price;
        this.totalAdditionCount = 0;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getType() {
        return type;
    }

    public String getPrice() {
        return String.format("%,.2f", price);
    }

    // counts up additions to burger
    public int addAddition(String name) {
        if ((totalAdditionCount < 4 && this.type == "basic") || (totalAdditionCount < 6 && this.type == "healthy")  ) {
            switch (name) {
                case "tomato":
                    tomatoCount += 1;
                    totalPrice += tomatoPrice;
                    totalAdditionCount += 1;
                    break;
                case "lettuce":
                    lettuceCount += 1;
                    totalPrice += lettucePrice;
                    totalAdditionCount += 1;
                    break;
                case "onion":
                    onionCount += 1;
                    totalPrice += onionPrice;
                    totalAdditionCount += 1;
                    break;
                case "cheese":
                    cheeseCount += 1;
                    totalPrice += cheesePrice;
                    totalAdditionCount += 1;
                    break;
                case "avocado":
                    avocadoCount += 1;
                    totalPrice += avocadoPrice;
                    totalAdditionCount += 1;
                    break;
                case "pickle":
                    pickleCount += 1;
                    totalPrice += picklePrice;
                    totalAdditionCount += 1;
                    break;
                default:
                    break;
            }
            System.out.println(name + " added");
        }
        else {
            System.out.println("You can't add anything else to this burger.");
        }
        return totalAdditionCount;
    }

    public void receipt() {
        System.out.println("The base price of your burger is $" + String.format("%,.2f", price));
        System.out.println("Additions: ");
        if (totalAdditionCount > 0) {
            for (int i = 0; i < tomatoCount; i++) {
                System.out.println("   Tomato -  $" + String.format("%,.2f", tomatoPrice));
            }
            for (int i = 0; i < lettuceCount; i++) {
                System.out.println("   Lettuce -  $" + String.format("%,.2f", lettucePrice));
            }
            for (int i = 0; i < onionCount; i++) {
                System.out.println("   Onion -  $" + String.format("%,.2f", onionPrice));
            }
            for (int i = 0; i < cheeseCount; i++) {
                System.out.println("   Cheese -  $" + String.format("%,.2f", cheesePrice));
            }
            for (int i = 0; i < avocadoCount; i++) {
                System.out.println("   Avocado -  $" + String.format("%,.2f", avocadoPrice));
            }
            for (int i = 0; i < pickleCount; i++) {
                System.out.println("   Pickle -  $" + String.format("%,.2f", picklePrice));
            }

        }
        else if (this.type == "deluxe") {
            System.out.println("   Chips and Drink included");
        }
        else {
            System.out.println("   None");
        }
        System.out.println("Total Price is $" + String.format("%,.2f", totalPrice));
    }
}

class Healthy extends Hamburger {

    public Healthy(String bread, String meat, String type) {
        super("brown rye roll", meat, "healthy");
    }
}

class Deluxe extends Hamburger {

    public Deluxe(String bread, String meat, String type) {
        super(bread, meat, "deluxe");
    }

}

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Bill's Burgers!");
        System.out.println("Burger choices are " + "\n" + "1. basic ($5) with up to 4 additions  2. healthy ($6) with a brown rye roll and up to 6 additions  " +
                "3. deluxe ($7) with fries and a drink and no additions");
        System.out.println("The available additions are: lettuce - $0.50, tomato - $0.50, pickle - $1, avocado - $1.50, onion - $0.50, cheese - $1");
        System.out.println("");

        // Testing Hamburger
        Hamburger hamburger = new Hamburger("bun", "beef", "basic");
        hamburger.addAddition("tomato");
        hamburger.addAddition("tomato");
        hamburger.addAddition("lettuce");
        hamburger.addAddition("pickle");
        hamburger.addAddition("tomato");
        System.out.println("");
        hamburger.receipt();
        System.out.println("");
        // Testing Healthy
        Healthy healthy = new Healthy("bun","chicken", "healthy");
        System.out.println("Healthy bread is: " + healthy.getBread());
        System.out.println("Healthy price is: " + healthy.getPrice());
        healthy.addAddition("tomato");
        healthy.addAddition("lettuce");
        healthy.addAddition("cheese");
        healthy.addAddition("avocado");
        healthy.addAddition("onion");
        healthy.addAddition("pickle");
        healthy.addAddition("pickle");
        healthy.addAddition("tomato");
        System.out.println("");
        healthy.receipt();
        System.out.println("");

        // Testing Deluxe
        Deluxe deluxe = new Deluxe("bun", "angus", "deluxe");
        System.out.println("Deluxe meat is " + deluxe.getMeat());
        deluxe.addAddition("tomato");
        System.out.println("");
        deluxe.receipt();
    }
}
