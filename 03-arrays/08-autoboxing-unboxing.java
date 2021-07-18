
import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {

    public static void main(String[] args) {
	      String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>(); //ERROR! type argument can not be primitive in ArrayList, can only pass class
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();  //how we have a list in integer, we create aother class
        intClassArrayList.add(new IntClass(54));
      
        Integer integer = new Integer(54);  //Integer is a class
        Double doubleValue = new Double(12.25); //Double is a class

        ArrayList<Integer> intArrayList = new ArrayList<Integer>(); //this is valid
      
      //adding entry using for loop
      
//        for(int i=0; i<=10; i++) {
//            intArrayList.add(Integer.valueOf(i)); //autoboxing: converting int to Interger, taking primitive type to class
//        }
//
//        for(int i=0; i<=10; i++) {    //the element we want to retrieve
//            System.out.println(i + " --> " + intArrayList.get(i).intValue()); //unboxing: taking from object wrapper convert back to primitive type
//        }
      
      //easier way to do autoboxing and unboxing

        Integer myIntValue = 56; // Integer.valueOf(56);  //java convert it for you
        int myInt = myIntValue.intValue(); // myIntValue.intValue();  //unboxing

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        
        for(double dbl=0.0; dbl<=10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);    //myDoubleValues.add(Double.valueOf(dbl));
        }

        for(int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);   //double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + "  --> " + value);
        }
        
    }
}
