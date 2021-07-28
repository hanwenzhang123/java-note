In Java, there are many different ways of classifying errors, but they can be boiled down to three categories:

Syntax errors: Errors found by the compiler.
Run-time errors: Errors that occur when the program is running.
Logic errors: Errors found by the programmer looking for the causes of erroneous results.
  

//Syntax errors 
Errors represent grammar errors in the use of the programming language. 
Some common syntax errors are:
Misspelled variable and method names
Omitting semicolons ;
Omitting closing parenthesis ), square bracket ], or curly brace }


// Run-time Errors
Errors which happen during program execution (run-time) after successful compilation are called run-time errors.
Some common run-time errors:
Division by zero also known as division error
Trying to open a file that doesn’t exist


//Exceptions
Java uses exceptions to handle errors and other exceptional events. 
  Exceptions are the conditions that occur at runtime and may cause the termination of the program.
  When an exception occurs, Java displays a message that includes the name of the exception, the line of the program where the exception occurred, and a stack trace. 
  The stack trace includes:
The method that was running
The method that invoked it
The method that invoked that one
and so on…

Some common exceptions that you will see in the wild:
- ArithmeticException: Something went wrong during an arithmetic operation; for example, division by zero.
- NullPointerException: You tried to access an instance variable or invoke a method on an object that is currently null.
- ArrayIndexOutOfBoundsException: The index you are using is either negative or greater than the last index of the array (i.e., array.length-1).
- FileNotFoundException: Java didn’t find the file it was looking for.
  
//Exception Handling
  One way to handle exceptions is using the try/catch:
The try statement allows you to define a block of code to be tested for errors while it is being executed.
The catch statement allows you to define a block of code to be executed if an error occurs in the try block.
  
  
// Logic errors
These types of errors which provide incorrect output, but appears to be error-free, are called logic errors.
  Logic errors occur when there is a design flaw in your program.  
  Some common logic errors:
Program logic is flawed
Some “silly” mistake in an if statement or a for/while loop

//Debugging Techniques
1. Divide and conquer: Comment out or temporarily delete half the code to isolate an issue.
If the program compiles now, you know the error is in the code you deleted. Bring back about half of what you removed and repeat.
If the program still doesn’t compile, the error must be in the code that remains. Delete about half of the remaining code and repeat.
2. Print statements for the rescue: Use System.out.println() to check variable/return values at various points throughout the program.
    
