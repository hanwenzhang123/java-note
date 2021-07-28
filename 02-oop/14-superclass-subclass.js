//Shoe.java
public class Shoe {
  public final String brand;
  public final double size;
  
  Shoe(String brand, double size){
    this.brand = brand;
    this.size = size;
  }
}

//Walking.java
public class Walking extends Shoe {
  boolean goreTex;
  
  Walking(boolean goreTex, String brand, double size){
    super(brand, size);   //must be first, need shoe to do walking
    this.goreTex = goreTex;
  }
}

//Running.java
public class Running extends Shoe {
 public final double weight;
  
 Running(double weight, String brand, double size) {
   super(brand, size);
   this.weight = weight;
 }
}

//Main.java
public class Main {
  public static void main(String[] args){
    Walking w = new Walking(true, "Nike", 10);
    System.out.printlb(w.goreTex);
    Running r = new Runnig(4.5, "Nike", 10);
    System.out.printlb(r.weight);
  }
}
