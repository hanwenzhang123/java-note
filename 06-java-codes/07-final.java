keyword final 
  - define constant values, the value can not be changed
  - can only be modified once and any modification must be performed before the class constructor finishes
  - can declare final keywords on variables or constructors
  
//SomeClass.java
  public class SomeClass {

    private static int classCounter = 0;
    public final int instanceNumber;  //final
    private final String name;  //final


    public SomeClass(String name) {
        this.name = name;   //final value not changed
        classCounter++;
        instanceNumber = classCounter;  //final value not changed
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}

//Password.java
  public class Password {
    private static final int key = 748576362; //final
    private final int encryptedPassword;  //final

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int password) {
        return password ^ key;  //XOR
    }

    public final void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if(encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}

//SIBTest - static initialization block test 
//	  - static methods called before the non-static including the constructor
public class SIBTest {
    public static final String owner;

    static {    //once the function called #1
        owner = "tim";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {  //#3
        System.out.println("SIB constructor called");
    }

    static {  //#2
        System.out.println("2nd initialization block called");
    }

    public void someMethod() {  //#4
        System.out.println("someMethod called");
    }
}

//ExtendedPassword.java
public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override   can not override because we marked the method as final
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}

//Main.java
public class Main {

    public static void main(String[] args) {
	    SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

//        one.instanceNumber = 4;
        System.out.println(Math.PI);
//        Math m = new Math();

        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);
        
        
        //Test
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);  //#5
    }   //static methods called before the non-static including the constructor
}
