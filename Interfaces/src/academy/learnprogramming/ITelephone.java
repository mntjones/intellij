package academy.learnprogramming;

public interface ITelephone {
    //list of methods that must be implemented by implementing class

    // Convention to put 'I' before class name to indicate Interface
     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone(int phoneNumber);
     boolean isRinging();
}
