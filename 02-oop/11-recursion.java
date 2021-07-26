//A method that is being called inside of itself

public class RecursionIsCool {

	public static void main(String[] args) {  //we only cause things inside of the main
		//sayHi();
    sayHi(5);
    countBackwards(14);
	}
  
//   public static void sayHi() {  //no good, recursion occurs, system error
// 		System.out.println("hi");
//     sayHI();  //Recursion, a method called inside of itself, stackoverflow
// 	}
  
  //Need a base case
  public static void sayHi(int n) {
    if(n==0){
		  System.out.println("Done");
    } else {
      System.out.println("hi");
      n--;  //need to decrement
      sayHi(n); //recursion, a method called inside of itself
    }
	}
	
	public static void countBackwards(int n) {
		if(n == 0) {
			System.out.println("Done!");
		} else {
			System.out.println(n);
			n--;  //decrememt each time
			countBackwards(n);
		}
	}
	
	//Need a base case

}
