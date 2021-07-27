When an element is removed from an ArrayList, 
all the items that appear after the removed element will have their index value shift by negative one 
— it’s like all elements shifted to the left! 
  
  int i = 0; // initialize counter
 
while (i < lst.size()) {
  // if value is odd, remove value
  if (lst.get(i) % 2 != 0){
    lst.remove(i);
  } else {
    // if value is even, increment counter
    i++;
  }
}

for (int i = 0; i < lst.size(); i++) {
  if (lst.get(i) == "value to remove"){
    // remove value from ArrayList
    lst.remove(lst.get(i));
    // Decrease loop control variable by 1
    i--;    
  }
}
    
The final solution should look similar to the code below if using a for loop:

for (int i = 0; i < listName.size(); i++) {
  if (listName.get(i) == "ant"){
    listName.remove(listName.get(i));
    i--;    
   }
}
return listName;


If using a while loop, the solution may look similar to the following snippet:

int i = 0; 
while (i < listName.size()) {
  if (listName.get(i) == "ant"){
    listName.remove(listName.get(i));
  } else {
    i++;
  }
}
