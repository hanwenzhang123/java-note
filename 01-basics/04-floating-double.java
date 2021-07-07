Floating Number - single precision number 32 bits
Double Number - double precision number 64 bits
- double is more precise, and being used more

public class Main{
    public static void main (String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue); //1.4E-45
        System.out.println("Float Maximum Value = " + myMaxFloatValue); //3.4028235E38

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);   //4.9E-324
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);   //1.7976931348623157E308

        int myInValue = 5 / 2;
        float myFloatValue = (float) 5 / 3f;  //we can also do 5.25f
        double myDoubleValue = 5d / 3d; //we can also do 5.00/3.00;
        System.out.println("MyInValue = " + myInValue); //MyInValue = 2
        System.out.println("MyFloatValue = " + myFloatValue); //MyFloatValue = 1.6666666
        System.out.println("MyDoubleValue = " + myDoubleValue); //MyDoubleValue = 1.6666666666666667
        
        //lbs to kg
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);
        
        double pi = 3.1415927d;
        double anotherNumer = 3_000_000.4_567_890d;
        System.out.println(pi); //3.1415927
        System.out.println(anotherNumer); //3000000.456789  - 0 is ignored
    }
}
  
