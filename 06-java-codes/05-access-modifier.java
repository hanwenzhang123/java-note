Access Modifiers
//Top Level
- only classes, interfaces and enums can exist at the top level, everything else must be included within one of these
public: the object is visible to all classes everywhere, whether they are in the same package or have imported the package containing the public class
package-private: the object is only available within it is own package (and is visible to every class within the same package).
  package-private is specific by not specifying, i.e. it is the default if you not speficy public

// Not allowed below
private class PrivateClass {  //no good
  public PrivateClass() { //it is public here
  }
}

//Member Level
public: at the member level, public has the same meaning as at top level. A public class member (or field) and public method can be accessed from any other class anywherer even in different package
package-private: this also has the same meaning as it does at the top level. An object with no access modifier is visible to every class within the same package (but not to classes in external packages)
private: the object is only visible within the class it is declared. it is not visible anywhere else (including subclasses of its class)
protected: the object is visible anywhere in its own package (like package-private) but also in subclasses even if they are in another package


//Account.java
import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw(int amount) {
        int withdrawal = -amount;
        if(withdrawal < 0) {
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    public void calculateBalance() {
        this.balance = 0; //start transaction
        for(int i : this.transactions) {  //enhanced for each loop
            this.balance += i;
        }
        System.out.println("Calculated balance is " + this.balance);
    }



//Main.java
public class Main {

    public static void main(String[] args) {
	Account timsAccount = new Account("Tim");
        timsAccount.deposit(1000);
        timsAccount.withdraw(500);
        timsAccount.withdraw(-200);
        timsAccount.deposit(-20);
        timsAccount.calculateBalance();
     // timsAccount.balance = 5000;   error since it is private, can only access through deposit and withdral method which is more secure

        System.out.println("Balance on account is " + timsAccount.getBalance());
     // timsAccount.transactions.add(4500); //error, can not directly access to it since the variable is private
        timsAccount.calculateBalance();
    }
}

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface?	    //we set the interface private but accessble to all class within the package
// 2. the int variable SOME_CONSTANT?	//public static final
// 3. methodA?	//public
// 4. methodB and methodC?	//public, interface method automatically public unless marked for private
//
// Hint: think back to the lecture on interfaces before answering.

interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}
 
