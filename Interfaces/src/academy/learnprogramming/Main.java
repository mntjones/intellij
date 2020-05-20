package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    // An interfaces is an "abstract class" that is used to group related methods with empty bodies.
        // To access the interface methods, the interface must be "implemented" by another class using the "implements" keyword
        // 1) Interfaces provide security - hide details, 2) JAva does not support "multiple inheritance", but can implement
        //  multiple interfaces


        ITelephone phone;
        phone = new DeskPhone(1234567);
        phone.powerOn();
        phone.callPhone(1234567);
        phone.answer();

        phone = new MobilePhone(9876543);
        phone.powerOn();
        phone.callPhone(9876543);
        phone.answer();

    }


}
