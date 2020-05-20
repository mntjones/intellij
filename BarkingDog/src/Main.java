public class Main {

    public static void main(String[] args) {

        System.out.println(BarkingDog.shouldWakeUp(true, 10)); //false
        System.out.println(BarkingDog.shouldWakeUp(true, 23)); //true
        System.out.println(BarkingDog.shouldWakeUp(false, 21)); //false
        System.out.println(BarkingDog.shouldWakeUp(true, -1)); //false



    }
}
