//list and ArrayList part1
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
}
 
