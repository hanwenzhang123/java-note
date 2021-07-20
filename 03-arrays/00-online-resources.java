//java.util.ArrayList 
Array.push    -> ArrayList.add(Object o); // Append the list
Array.pop     -> ArrayList.remove(int index); // Remove list[index]
Array.shift   -> ArrayList.remove(0); // Remove first element
Array.unshift -> ArrayList.add(int index, Object o); // Prepend the list


//java.util.LinkedList 
push()    -> LinkedList.addLast(); // Or just LinkedList.add();
pop()     -> LinkedList.pollLast();
shift()   -> LinkedList.pollFirst();
unshift() -> LinkedList.addFirst();


//Resize Array
You can't resize an array in Java. You'd need to either:
1. Create a new array of the desired size, and copy the contents from the original array to the new array, using java.lang.System.arraycopy(...);
2. Use the java.util.ArrayList<T> class, which does this for you when you need to make the array bigger. It nicely encapsulates what you describe in your question.
3. Use java.util.Arrays.copyOf(...) methods which returns a bigger array, with the contents of the original array.
- https://stackoverflow.com/questions/13197702/resize-an-array-while-keeping-current-elements-in-java


//ArrayList
import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("book");
        list.add("car");
        System.out.prinln(list.get(0));
      
        list.remove("book");  //remove the item
        list.clear(); //remove everything
        list.contain("fruit");  //boolean
    }
}

