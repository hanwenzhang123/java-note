//Reference Types vs Value Types
//Array Reference vs Array Copy
- to copy an array, you can not simply assign one array to another
  this will just point your reference variable to the same array object in memory
- you can, however, use the array clone() method to copy an array
- you can also iterate through one array and copy each element into the other way

int[] x = {0, 1, 2, 3};
int[] y = x;    //reference, both are pointed to the same element, change x also change y

int[] x = {0, 1, 2, 3};
int[] y = x.clone();    //now we copy the element, so when we change x, y will have no affect

int[] x = {0, 1, 2, 3};
int[] y = new int[4];

for (int i =0; i<x.length; i++){
    y[i] = x[i];        //this way also just make a copy of the elements stored in array x
}

//Example
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

  
