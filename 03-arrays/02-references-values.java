reference types v.s. value types

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;  //add one

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue); //11

        int[] myIntArray = new int[5];  //create a new object (array)
        int[] anotherArray = myIntArray;  // reference: address itself rather than data, it does not create another copy
      
        //Arrays.toString() - convert every element to as a string, print the array as a string
        System.out.println("myIntArray= " + Arrays.toString(myIntArray)); //[0, 0, 0, 0, 0]
        System.out.println("anotherArray= " + Arrays.toString(anotherArray)); //[0, 0, 0, 0, 0]

        anotherArray[0] = 1;  //updated both array 

        System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));  //[1, 0, 0, 0, 0]
        System.out.println("after change anotherArray= " + Arrays.toString(anotherArray)); //[1, 0, 0, 0, 0]

        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray= " + Arrays.toString(myIntArray));  //[2, 0, 0, 0, 0]
        System.out.println("after modify anotherArray= " + Arrays.toString(anotherArray)); //[4, 5, 6, 7, 8]
    }

    private static void modifyArray(int[] array) {

        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
