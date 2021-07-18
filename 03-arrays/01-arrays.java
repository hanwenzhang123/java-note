Array - store multiple values of the same type
  a data structure that allows you to store a sequencce of data in same type
  zero-index, an array with n elements is indexed from 0 to n-1, like 10 is ranged from 0 to 9
  to access the array, we use []
  
Creating a new array - int[] array = new int[5];  //array[0] to array[4]
  {data type}[]
  int[] - array of integer
  keyword "new" create new array, initialize the array elements with their default values
  
int[] myVariable;
myVariable = new int[10];

int[] myIntArray = new int[10];  //we define an array called myIntArray, type integer and we assign 10 elements to it
myIntArray[5] = 50; //assign the element #6 value as 50, 0 based position, if [10] then it will be 0-9; 
myIntArray[0] = 10; //first one
myIntArray[9] = 20; //last one

int[] myIntArray = {1,2,3,4,5,6,7,8,9,10};  //we can assign(initiate) the value to each array element at the beginning 
                                            //and indirectly tell Java how many elements in that array 
                                            //seperated by comma

for (int i=0; i<10, i++) {  //loop i will be 0-9
  myIntArray[i] = i*10;
}

for (int i=0; i<myIntArray.length, i++) {  //we can use .length if we know the length of the array
  myIntArray[i] = i*10;
}

//using a method
printArray(myIntArray);

public static void printArray(int[] array) {
  for (int i=0; i<array.length; i++){
    System.out.println("Element " + i + ", value is " + array[i]);
   }
}                   


//Example - average of an integer array
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i +", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i< array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double)array.length;

    }
}
