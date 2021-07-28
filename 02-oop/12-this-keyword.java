// No static when using the keyword this
  
public class ThisIsFun {
//example 1
  int c;
  int d;
  
  public void setData(int a, int b) {  //this keyword does not work with static, static not accessible to object and only shared one value
    this.c = a;     //this is the reference to the variable above
    this.d = b;     //after this. needs to the same name as the variable above, after = needs to be the same as the parameter
  }
  
	public static void main(String[] args) {
//     setData(4, 3);
    
    ThisIsFun t = new ThisIsFun();
    t.setDate(4, 3);    //call through here since it is not static
    
    System.out.println(t.a);
    System.out.println(t.b);
  }
  
//example 2
  String food;  //you can do foodType
  char size;    //you can do length
  
  public void setData(String food, char size) {
    this.food = food;   //this.foodType = food;
    this.size = size;   //this.length = size;
  }
  
	public static void main(String[] args) {

    ThisIsFun t = new ThisIsFun();
    t.setDate("soup", "L");    //call through here since it is not static
    
    System.out.println(t.food);
    System.out.println(t.size);
    
  }
}
    
