//Account.java
public class Account {
  private String number;
  private double balance;
  private String customerName;
  private String customerEmailAddress;
  private String customerPhoneNumber;
  
  //constructor - only needs the access modifier and the name of the class （public vs private)
  public Account(String number, double balance, String customerName, String customerEmailAddress,   //main constructor that update all the fields
               String customerPhoneNumber) {  //when we call our method, we pass values into the parameters and assign to variables
    System.out.println("Account constructor with parameters called");
    this.number = number;
    this.balance = balance;
    this.customerName = customerName;
    this.customerEmailAddress = customerEmailAddress;
    this.customerPhoneNumber = customerPhoneNumber;
    //setting the field value in the constructor
  }
  
  //calling constructor within a constructor
  public Account() {  //initialize the object you are creating
    this("56789", 2.50, "Default name", "Default address", "default phone"); //calling constructor within a constructor, need to be the 1st line
    System.out.println("Empty constructor called");
  }
  
  public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {  //call the main constructor
    this("99999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);  //default the first 2 parameters
  }
  
  //deposit method
  public void deposit(double depositAmount){
    this.balance += depositAmount;  //add to the balance amount, updating the field, this keyword refers to the field
    System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);  //be consistent with this when refer to fields in the class
  }
  
  //withdrawal method
  public void withdrawal(double withdrawalAmount){
    if(this.balance - withdrawalAmount < 0){
      System.out.println("Only " + this.balance + " available. Withdrawal not processed");
    } else {
      this.balance <= withdrawalAmount;
      System.out.println("Withdrawal of " + withdrawalAmount + " processed, Remaining balance = " + this.balance);
    }
  }
  
  //setter & getter
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

//Main.java
public class Main {

    public static void main(String[] args) {
      
        Account bobsAccount = new Account(); // "12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
//      Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567"); //set values
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);  //not processed

        bobsAccount.deposit(50.0);  //balance 50
        bobsAccount.withdrawal(100.0);   //not processed

        bobsAccount.deposit(51.0);  //balance 101
        bobsAccount.withdrawal(100.0);  //withdrawal, balance 1
      
        Account timsAccount = new Account("Tim", "tim@email.com","12345");  //create a new account with first two fields default values
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
    
    }
}
