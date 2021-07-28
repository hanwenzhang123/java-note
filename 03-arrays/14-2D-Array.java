//2D Array Review
When modifying an element in a 2D array, you access the element using the variable name first, 
the row index in brackets second, and the column index in brackets third. You then set it equal to a value.

Row-major order starts at the top left of the 2D array (when viewing it as a matrix) and traverses across each row until it ends at the bottom right corner.

The inner-most nested loop must complete all of its iterations before the outer loop continues.

// Declaring without initializing
int[][] intTwoD;
 
// Initializing an empty 2D array which has already been declared
intTwoD = new int[5][5];
 
// Declaring and initializing an empty 2D array at once
String[][] stringData = new String[3][6];
 
// Declaring and initializing a 2D array using initializer lists
double[][] doubleValues = {{1.5, 2.6, 3.7}, {7.5, 6.4, 5.3}, {9.8,  8.7, 7.6}, {3.6, 5.7, 7.8}};
 
// Initializing a 2D array using initializer lists after it has already been declared, or already contains data;
char[][] letters = new char[100][250];
letters = new char[][]{{'a', 'b', 'c'}, {'d', 'e', 'f'}};

//Traversal
We traverse 2D arrays using nested loops.
We can use loops of any type, but we typically use nested for loops to keep track of the indices
Row-major order traverses through each row moving horizontally to the right through each row
Column-major order traverses through each column moving vertically down through each column
Row-major order and column-major order start and end on the same elements, but the paths are different.
In order to convert row-major to column-major, we need to make the outer loop terminating condition depend on the number of columns, 
  make the inner loop terminating condition depend on the number of rows, 
  and flip the variables in our accessor within the inner loop to ensure that 
  we don’t try to access outside of the 2D array since we flipped the direction of traversal.
// Row-major order
for(int o = 0; o < letters.length; o++) {
    for(int i = 0; i < letters[o].length; i++) {
        char c = letters[o][i];
    }
}
 
// Column-major order
for(int o = 0; o < letters[0].length; o++) {
    for(int i = 0; i < letters.length; i++) {
        char c = letters[i][o];
    }
}


//Example
Here is an example of traversal with conditional logic.

Given this 2D array of Strings:

String[][] words = {{"championship", "QUANTITY", "month"},{"EMPLOYEE", "queen", "understanding"},{"method", "writer", "MOVIE"}};
We are going to flip the capitalization of the words:

System.out.println("Before...");
System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");
 
for(int i=0; i<words.length; i++) {
    for(int j = 0; j<words[i].length; j++) {
        if(words[i][j]!=null) {
 
            // Check the capitalization
            boolean allCaps = true;
            for(char c : words[i][j].toCharArray()) 
                if(!Character.isUpperCase(c)) 
                    allCaps = false;
 
            // Flip the capitalization
            if(allCaps)
                words[i][j] = words[i][j].toLowerCase();
            else
                words[i][j] = words[i][j].toUpperCase();
        }
    }
}
 
System.out.println("After...");
System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");
Here is the output of the above code:

Before...
[[championship, QUANTITY, month],
 [EMPLOYEE, queen, understanding],
 [method, writer, MOVIE]]
 
After...
[[CHAMPIONSHIP, quantity, MONTH],
 [employee, QUEEN, UNDERSTANDING],
 [METHOD, WRITER, movie]]
