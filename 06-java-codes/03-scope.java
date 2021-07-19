Scope
Granting and restricting access to our objects
Apply to both classes and variables

//ScopeCheck.java
public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);  //0, 1
    }

    public int getPrivateVar() {
        return privateVar;  //1
    }

    public void timesTwo() {
        int privateVar = 2; //local variable to this method, without this line, the method goes up to get the 1 in global scope
        for (int i=0; i<10; i++) {   //i is only within the for loop
            System.out.println(i + " times two is " + i * privateVar);
        }
    }

    public class InnerClass {
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + privateVar);  //3
        }

        public void timesTwo() {
            ScopeCheck.this.timesTwo(); //specific call that method timesTwo() in the ScopeCheck class
            for (int i=0; i<10; i++) {  
                System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar);
            }         //this.privateVar - 3 the local variable within the class
        }             //ScopeCheck.this.privateVar - 1 the variable in the feild of ScopeCheck
    }
}


//Main.java
public class Main {

    public static void main(String[] args) {
	    String privateVar = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar()); //1
        System.out.println(privateVar); //this is private to main()

        scopeInstance.timesTwo();
        System.out.println("***********************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
