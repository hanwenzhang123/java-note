public class happyFunTime{
    public static void main (String[] args) {
        String[] cars = {"BMW M2", "Veloster N", "GTI"};
      
      //regular for loop
        for (int i=0; i<cars.length; i++){
          System.out.println(cars[i]);
          
     //for each string car in sides of cars
        for (String car : cars){
          System.out.println(car);  //we just reate
      }
    }
}
