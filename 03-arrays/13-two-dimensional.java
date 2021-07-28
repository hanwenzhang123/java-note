//datatype variableName = existing2DArray[row][column];

In Java, arrays are considered Objects; therefore, we can also have an array of arrays:

[[1, 2, 3], [4, 5, 6], [7, 8, 9]]

Additionally, we can have 2D arrays which are not rectangular in shape. These are called jagged arrays:

[['a', 'b', 'c', 'd'], ['e', 'f'], ['g', 'h', 'i', 'j'], ['k']]

//Declaration, Initialization, and Assignment
int[][] intTwoDArray;

You can think of this as creating an array ([]) of int arrays (int[]). So we end up with int[][].
  
int[][] intArray1;
intArray1 = new int[row][column];

int[][] intArray2;
intArray2 = new int[3][5];

double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};

String[][] stringValues;
stringValues = new String[][] {{"working", "with"}, {"2D", "arrays"}, {"is", "fun"}};

public class Exercise2 {
	public static void main(String[] args) {
    
		// Declare a 2d array of float values called floatTwoD
    float[][] floatTwoD;

		// Initialize the 2d array from the last step to an empty 2d array consisting of 4 arrays with 10 elements each
		floatTwoD = new float[4][10];

		// Declare and initialize an empty 2d array of integers consisting of 15 rows and 8 columns called dataChart
    int[][] dataChart = new int[15][8];
		
		// Create a 2D char array called ticTacToe representing the provided tic-tac-toe board using initializer lists. Use the characters 'X', 'O', and ' '.
    char[][] ticTacToe = {{'X', 'O', 'O'}, {'O', 'X', ' '}, {'X', ' ', 'X'}};
		
		// When no one is looking, you want to modify the game to where you, 'O', wins the game. Replace the game board so that all X’s are O’s and all O’s are X’s. Do this in one line with initializer lists.
    ticTacToe = new char[][] {{'O', 'X', 'X'}, {'X', 'O', ' '}, {'O', ' ', 'O'}};
    
    }
}

//Accessing Elements in a 2D Array
public class Exercise3 {
	public static void main(String[] args) {
		// Using the provided 2D array
	  int[][] intMatrix = {
				{1, 1, 1, 1, 1},
				{2, 4, 6, 8, 0},
				{9, 8, 7, 6, 5}
		};
    
		// Access the integer at the first row and fourth column of intMatrix and store it in a variable called retrievedInt
    int retrievedInt = intMatrix [0][3];
    

		// Print 3 times the center value of intMatrix to the console. Make sure to access the correct element!
    System.out.println(intMatrix[1][2] * 3);

    }
}

//Modifying Elements
int[][] intTwoD = new int[4][3];
 
intTwoD[3][2] = 16;
intTwoD[0][0] = 4;
intTwoD[2][1] = 12;
intTwoD[1][1] = 8;


//Traversing 2D Arrays
public class Introduction {
	public static void main(String[] args) {
		//Given the provided 2d array
		int[][] intMatrix = {
				{ 4,  6,  8, 10, 12, 14, 16},
				{18, 20, 22, 24, 26, 28, 30},
				{32, 34, 36, 38, 40, 42, 44},
				{46, 48, 50, 52, 54, 56, 58},
				{60, 62, 64, 66, 68, 70, 79}
		};
		// Store the number of subarrays of intMatrix into a variable called 'numSubArrays'
		int numSubArrays = intMatrix.length;
		// Store the length of the subarrays using the first subarray in intMatrix. Store it in a variable called subArrayLength.
		int subArrayLength = intMatrix[0].length;
    
		// Store the number of columns in intMatrix into a variable called 'columns'
		int columns = subArrayLength;

		// Store the number of rows in intMatrix into a variable called 'rows'
		int rows = numSubArrays;
    
		// Replace the outer and inner for loop headers to iterate through the entire 2D array. Use the iterators `i` for the outer loop and `j` for the inner loop.
		int sum = 0;
		for(int i=0; i<intMatrix.length; i++) {
			for(int j = 0; j < intMatrix[i].length; j++) {
				// Insert a line of code to increase the variable `sum` by each accessed element
				sum+=intMatrix[i][j];
			}
		}
		System.out.println(sum);
	}
}
   
