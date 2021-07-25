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


//Arrays
public class ZombieKiller {

	public static void main(String[] args) {
		System.out.println("Welcome to our zombie killer program!!!!");

		String backpack[] = { "Shotgun", "Assault Rifle", "Sniper" };
		String zombies[] = { "Close-range zombie", "Mid-range zombie", "Long-range zombie" };
		int numbersZombiesHate[] = {4, 5, 90, 70, 123, 13, 561}

		System.out.println("Backpack items!");
		System.out.println(backpack[0]);
		System.out.println(backpack[1]);
		System.out.println(backpack[2]);

		System.out.println("These are the zombies!");
		System.out.println(zombies[0]);
		System.out.println(zombies[1]);
		System.out.println(zombies[2]);
		
		System.out.println(numbersZombiesHate[6]);	//561
	}
}


//2D Arrays - everything with rows and columns using 2D Arrays - screen (2D array pixes)
public class TwoDimArrays {

	public static void main(String[] args) {

		int[][] lotteryCard = { { 20, 15, 7 }, { 8, 7, 19 }, { 7, 13, 47 } };	//each row in {}

		int[][] lotteryCard2 = new int[3][3];
		lotteryCard2[0][0] = 20;
		lotteryCard2[0][1] = 15;
		lotteryCard2[0][2] = 7;
		lotteryCard2[1][0] = 8;
		lotteryCard2[1][1] = 7;
		lotteryCard2[1][2] = 19;
		lotteryCard2[2][0] = 7;
		lotteryCard2[2][1] = 13;
		lotteryCard2[2][1] = 47;

		// [row][column]	- Array starts with a row
		System.out.println(lotteryCard[0][0]);	//20

		System.out.println("---------");
		for (int i = 0; i < 3; i++) {
			System.out.println(lotteryCard[i][i]);	//20 7 47; [0][0], [1][1], [2][2]
		}

		System.out.println("---------");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(lotteryCard[i][j]);	//print out everything in card
			}
		}
	}
}


//ArrayList
import java.util.ArrayList;

public class ArrayListProj {

	public static void main(String[] args) {

		String[] fruits = new String[4];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Strawberry";
		fruits[3] = "Watermelon";
		System.out.println(fruits);

		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Watermelon");

		fruitList.remove("Strawberry");
//		fruitList.clear();
		System.out.println(fruitList.contains("Raspberry"));    //false

		System.out.println(fruitList);  //[Mango, Apple, Watermelon]
	}

}

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


//LinkedList
import java.util.LinkedList;
import java.util.Iterator;

public class Linky {
	public static void main(String[] args) {
	LinkedList<String> linky = new LinkedList<String>();
		
	linky.add("Rob");
	linky.add("Alex");
	linky.add("Jose");
        
    System.out.println(linky);  //[Rob, Alex, Jose] - keep the order
		
	linky.remove();	//remove from the front which rob is gone
	linky.clear();	//clear out everything
		
	System.out.println(linky.getFirst());   //only print the first one
		
	//another example - Integer, can not put primitive type in <>
	LinkedList<Integer> linky = new LinkedList<Integer>();
		
	linky.add(6);
	linky.add(78);
	linky.add(1);
		
	System.out.println(linky.get(1));	//78
		
	Iterator<Integer> it = linky.iterator();		//if you do not know where is that 78, use Iterator
	while(it.hasNext()){	//while the iteration has something next
		if((int)it.next() == 78) {
			System.out.println("We found 78");
		}
	}	
    }
}


//HashSet - no indexed position
import java.util.HashSet;
import java.util.Iterator;

public class HashBrowns {
	public static void main(String[] args) {
        HashSet<integer> hashbrowns = new HashSet<Integer>();
        
        hashbrowns.add(13);
	    hashbrowns.add(24);
	    hashbrowns.add(5);
        
        System.out.println(hashbrowns);  //[5, 24,  13] 
        
        hashbrowns.remove();	
	    hashbrowns.clear();
        
        System.out.println(hashbrowns.toArray());   //where the array is in memory 
		
        Object[] h = hashbrowns.toArray();
        System.out.println(h[]); //5    - you can not reply on the position of the order, it is hashed all over the place
        
        System.out.println(hashbrowns.hasCode());   //random number
        
        Iterator<Integer> it = hashbrowns.iterator();
	    while(it.hasNext()){
			System.out.println(it.next());  //just print out the next value in the iterator
		}
	}	
    }
}


//HashMap - no specific order, only reply on key and values
import java.util.HashMap;
import java.util.Iterator;

public class HashMapAwesomeness {
	public static void main(String[] args) {
        
        int a = 10;
        int b = 3;
        int c = 88;
        
        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        happy.put("a", 10) //(key, value)
        happy.put("b", 3) //(key, value)
        happy.put("c", 88) //(key, value)
            
        System.out.println(happy);  //{a=10; b=3; c=88}

        HashMap<String, String> fun = new HashMap<String, String>();
		fun.put("bobbyJoe1996", "FluffyP0nies!");
		fun.put("helloKittyFan21", "AloeVera?");
		fun.put("coolguyswag", "password123");
        
        System.out.println(fun.containsValue("password123"));   //true
        System.out.println(fun.containsValue("coolguyswag"));   //false,  it is a key, not value
        System.out.println(fun.containsKey("coolguyswag"));     //true
		
        System.out.println(fun.replace("bobbyJoe1996", "b3tt3rP@ssword"));  //replace the password
		System.out.println(fun.values());   //get all the values
        System.out.println(fun.keySet());   //get all the keys
    }
}


//Queue
import java.util.LinkedList;
import java.util.Queue;

public class BBQ {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<String>();
		
		q.add("A");
		q.add("B");
		q.add("C");
		
		System.out.println(q.poll());
		
	}
}


//Stack
import java.util.Stack;

public class StacksRFun {

	public static void main(String[] args) {
		
		// Y
		// B
		// R
		
		Stack<Character> tower = new Stack<Character>();
		
		tower.add('R');
		tower.add('B');
		tower.add('Y');
		
		System.out.println(tower.size());
		
	}
}
   
