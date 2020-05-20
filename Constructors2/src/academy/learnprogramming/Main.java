package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        VipCustomer person1 = new VipCustomer();
        VipCustomer person2 = new VipCustomer("Monica", 10000.0);
        VipCustomer person3 = new VipCustomer("Cassie", 20000, "cj@gmail.com");

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());

        System.out.println(person1.getCreditLimit());
        System.out.println(person2.getCreditLimit());
        System.out.println(person3.getCreditLimit());

        System.out.println(person1.getEmail());
        System.out.println(person2.getEmail());
        System.out.println(person3.getEmail());

    }
}
