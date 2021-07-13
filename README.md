# java-note
```java
public class Main{
    public static void main (String[] args) {
        System.out.println("Hello World");
    }
}
```
```java
import java.util.Scanner; 

public class Pizza{    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt(); 

        scanner.nextLine();

        System.out.println("Enter your name:");
        String name = scanner.nextLine(); 

        age(name, yearOfBirth);
        
        scanner.close();

    }

    public static void age(String name, int yearOfBirth){
        int age = 2021 - yearOfBirth;
        System.out.println("Your name is " + name + ", and you are " + age + " years old."); 
    }

}
```
