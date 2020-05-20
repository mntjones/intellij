package academy.learnprogramming;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    public int getMyNumber() {
        return myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Phone powering up");
        isOn = true;
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now dialing " + phoneNumber + " on desk phone");

        }
        else {
            System.out.println("Need to power phone on");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Mobile phone is ringing");
        }
        else {
            isRinging = false;
            System.out.println("Mobile phone not on");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
