methods that a particular class that implements the interface must implement
  the interface itself that you are creating is abstract, no actual code
  provide a common behaviour that used by several classes by having them all implement the same interface
  a way to standardize the way a particular set of classes is used
  a commitment, a contract, you stick to what is in that interface
  
  //ITelephone.java
  public interface ITelephone {       //these are the methods that will be implemented, contract
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
//when you implement this interface, you have to implement everything here


//DeskPhone.java
public class DeskPhone implements ITelephone {  //using the keyword implements, all methods in ITelephone must be implemented
    private int myNumebr;
    private boolean isRinging;

    public DeskPhone(int myNumebr) {
        this.myNumebr = myNumebr;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone.");
    }

    @Override
    public void answer() {
        System.out.println("Answering the desk phone");
        isRinging = false;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumebr) {
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

//MobilePhone.java - often used the interface ITelephone
public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");

    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone.");
        } else {
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number different");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

//Main.java
public class Main {

    public static void main(String[] args) {
        ITelephone hanwenPhone; //we cannot instantiate interfaces, instead we use the actual class that has overridden that functionality
        hanwenPhone = new DeskPhone(123456);
        hanwenPhone.powerOn();
        hanwenPhone.callPhone(123456);
        hanwenPhone.answer();
      
        hanwenPhone = new MobilePhone(24565); //MobilePhone class also implement from the ITelephone
        hanwenPhone.powerOn();
        hanwenPhone.callPhone(24565);
        hanwenPhone.answer();
    }
}
