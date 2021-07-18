//list and ArrayList
private int[] myNumbers = new int[50];  //array
private ArrayList<String> = new ArrayList<String>(); 
//put what kind of the datatype will be in that ArrayList in that <>, here will be String

//GroceryList.java
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);    //adding the item in the parameter to that groceryList
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");   //count how many element using method .size()
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));  //get the element and print out each one with prefix #
        }
    }

    public void modifyGroceryItem(int position, String newItem) { //update the item
        groceryList.set(position, newItem); //replace the item
        System.out.println("Grocery item " + (position+1) + " has been modified."); //add 1 since it is 0 based
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position); //get that element at that position
        groceryList.remove(position);   //delete
    }
    
    publicc String findItem(String searchItem){
//      boolean exists = groceryList.contains(searchItem);  //search the item using method .contains(), return boolean
        int position = groceryList.indexOf(searchItem);     //this function will return the index number of the item, -1 if not found
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;
    }
}
 

//Main.java
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

     public static void main(String[] args) {
         boolean quit = false;
         int choice = 0;
         printInstructions();
         while(!quit) {
             System.out.println("Enter your choice: " );
             choice = scanner.nextInt();
             scanner.nextLine();

             switch(choice) {
                 case 0:
                     printInstructions();
                     break;
                 case 1:
                     groceryList.printGroceryList();
                     break;
                 case 2:
                     addItem();
                     break;
                 case 3:
                     modifyItem();
                     break;
                 case 4:
                     removeItem();
                     break;
                 case 5:
                     searchForItem();
                     break;
                 case 6:
                     quit = true;
                     break;
             }
         }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine()); //type anything until enter pressed
    }

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1, newItem);   //-1 to reflect to the index number
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo-1);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in  our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}
 
 
  
