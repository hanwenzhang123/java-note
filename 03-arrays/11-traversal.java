//For loop for array
for (int i = 0; i < secretCode.length; i++) {
  // Increase value of element value by 1
  secretCode[i] += 1;
}

//Traversing an ArrayList using for loop
for (int i = 0; i < secretCode.size(); i++) {
  // Increase value of element value by 1
  int num = secretCode.get(i);
  secretCode.set(i, num + 1);
}


// while loop - traverse through an array:
we need to create our own counter variable to access individual elements. 
We’ll also set our condition to continue looping until our counter variable equals the list length.

int i = 0; // initialize counter 
while (i < secretCode.length) {
  secretCode[i] += 1;
  i++; // increment the while loop
}

//Traversing through an ArrayList with a while loop would look like this:
int i = 0; // initialize counter
while (i < secretCode.size()) {
  int num = secretCode.get(i);
  secretCode.set(i, num + i);
  i++; // increment the while loop
}

// Iterate over expenses
//Inside the for loop, add the item’s value to total.
for (int i = 0; i < expenses.size(); i++) {    
      total += expenses.get(i);
    }
  
