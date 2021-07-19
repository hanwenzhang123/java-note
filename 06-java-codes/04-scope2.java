//ScopeCheck.java
public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for (int i=0; i<10; i++) {
            System.out.println(i + " times two is " + i * varTwo);
        }
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);  //3 either public or private
    }

    public class InnerClass {
        private int varThree = 3; 

        public InnerClass() {
            System.out.println("InnerClass created, varOne is " + varOne + " and varThree is " + varThree);
        }

        public void timesTwo() {
            System.out.println("varOne is still available here " + varOne);
            for (int i=0; i<10; i++) {
                System.out.println(i + " times two is " + i * varThree);
            }
        }
    }
}

//Main.java
public class Main {

    public static void main(String[] args) {
	    String varFour = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("varThree is not accessible here " + innerClass.varThree);
     // ERROR! because it is private visibility, we can not access to varThree unless in it's own main class ScopeCheck

      
//        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
//        System.out.println(varFour);
//
//        scopeInstance.timesTwo();
//        System.out.println("***********************************");
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();
    }
}
