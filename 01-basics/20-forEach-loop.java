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
     
