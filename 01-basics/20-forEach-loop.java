Sometimes we need access to the elements’ indices or we only want to iterate through a portion of a list.
For example, we can use a for loop to print out each element in an array called inventoryItems:

for (int inventoryItem = 0; inventoryItem < inventoryItems.length; inventoryItem++) {
  // Print element at current index
  System.out.println(inventoryItems[inventoryItem]);
}

But sometimes we couldn’t care less about the indices; we only care about the element itself.
At times like this, for-each loops come in handy.
    
//for each loop
allow us to directly loop through each item in a list of items (like an array or ArrayList) and perform some action with each item.
    
for (String inventoryItem : inventoryItems) {
  // Print element value
  System.out.println(inventoryItem);
}
//an enhanced for loop variable (inventoryItem) and a list to traverse through (inventoryItems).
//We can read the : as “in” like this: for each inventoryItem (which should be a String) in inventoryItems, print inventoryItem.
    
We can name the enhanced for loop variable whatever we want; using the singular of a plural is just a convention. 
    We may also encounter conventions like String word : sentence.   
        

//1
public class happyFunTime{
    public static void main (String[] args) {
        String[] cars = {"BMW M2", "Veloster N", "GTI"};    //String[] - how you create an array
      
      //regular for loop
        for (int i=0; i<cars.length; i++){
          System.out.println(cars[i]);
        }
          
     //for each string car in sides of cars
        for (String car : cars){        //we declare a String car
          System.out.println(car);  //each time we loop over cars array, we create a new car
      }                         //we just create the element each time we see a new one
    }
}
    
//2
import java.util.ArrayList;
    
public class happyFunTime{
    public static void main (String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        
        for(int a : numbers){
            System.out.println(a); 
        }       //3 7 2 
        for (int i=0; i<numbers.length; i++){
          System.out.println(numbers.get[i]);
        }       //3 7 2
    }
}
     
