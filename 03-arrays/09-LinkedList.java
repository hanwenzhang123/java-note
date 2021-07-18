//Like a foreign key points to another location
//each element holds a linked list for the value

Ways to maintain a list in memory
- arrays
- linked list

Types oof linked list
- single linked list: navigation is forward only
	contains 2 parts: 
	- data(contains the actual data) 
	- link(contains the address of the next node of the list)
- doubly linked list: forward and backward navigation is possible
- circular linked list: last element is linked to the first element

//Linky.java
import java.util.ArrayList;

public class Linky {
	public static void main(String[] args) {
	LinkedList<String> linky = new LinkedList<String>();
		
	linky.add("Rob");
	linky.add("Alex");
	linky.add("Jose");
		
	System.out.println(linky.getFirst());
		
	LinkedList<Integer> linky = new LinkedList<Integer>();
		
	linky.add(6);
	linky.add(78);
	linky.add(1);
		
	System.out.println(linky.get(1));
		
	Iterator it = linky.iterator();
	while(it.hasNext()){
		if((int)it.next() == 78) {
			System.out.println("We found 78");
		}
	}	
	}
}

- Java LinkedList class can contain duplicate elements
- Java LinkedList class maintains insertion order
- Java LinkedList class is non synchronized
- In Java LinkedList class, manipulation is fast because no shiftinng needs to occur
- Java LinkedList class can be used as a list, stack or queue


//Customer.java
public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


//Main.java
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer("Tim", 54.96); //new instance
        Customer anotherCustomer; //another instance
        anotherCustomer = customer; //value set as the first
        anotherCustomer.setBalance(12.18);  //change the value of second class
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());  // 12.18

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1); //0:1
        intList.add(3); //1:3
        intList.add(4); //2:4

        for(int i=0; i<intList.size(); i++) {
            System.out.println(i +": " + intList.get(i));
        }

        intList.add(1, 2);  //1 still 1 at index 0, but 2 replaced to index 1 and other elements move down

        for(int i=0; i<intList.size(); i++) {
            System.out.println(i +": " + intList.get(i));
        }   //0:1 1:2 2:3 3:4

    }
}
