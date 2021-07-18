import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {

        groceryList.add(item);
    }


    public ArrayList<String> getGroceryList() { //getter, return the values
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);   //find the index number
        if(position >= 0) {   //check if exist
            modifyGroceryItem(position, newItem); //use this method to update the value passing in the parameters
        }

    }
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);   //update the value
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(String item) {  //find if the item exist
        int position = findItem(item);    //checkc if it exists
        if(position >= 0) {   //if exist
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position) {  //remove
        groceryList.remove(position);
    }

    private int findItem(String searchItem) { //just simply return the index
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >=0) {
            return true;
        }

        return false;
    }
}

//Main.java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
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
                    processArrayList();
                case 7:
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
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Current item name: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + ", not on file.");
        }
    }

    public static void processArrayList() { //copy array list, add all the items to the new array list together
        ArrayList<String> newArray = new ArrayList<String>(); //create a new array
        newArray.addAll(groceryList.getGroceryList());  //using the getter to add all the element to copy to this array

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());  //a simple way to do the job above

        String[] myArray = new String[groceryList.getGroceryList().size()]; //create a new string array with the current size
        myArray = groceryList.getGroceryList().toArray(myArray);  //using toArray() to return

    }
}
