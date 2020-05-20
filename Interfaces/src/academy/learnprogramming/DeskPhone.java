package academy.learnprogramming;

public class DeskPhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    public int getMyNumber() {
        return myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Phone is plugged in - always on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now dialing " + phoneNumber + " on desk phone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Desk phone is ringing");
        }
        else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
