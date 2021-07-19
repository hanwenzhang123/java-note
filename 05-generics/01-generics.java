//Generics Introduction
Generics allow us to create classes interfaces and methods that takes types as parameters called type parameters
the early we fix the bug the less it cost

//Example
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      //ArrayList items = new ArrayList();    //it is a array list can be anything, no specific type indicated
        ArrayList<Integer> items = new ArrayList<>(); //type - <Integer>, set the progject structure as lambda so no needs to specify the second one 
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("tim");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {  //indicate the type of the data
        for(int i : n) {  // (Object i : n)   //for each i in n
            System.out.println( i * 2); // ((Integer) i * 2)
        }
    }
}
