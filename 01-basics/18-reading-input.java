//interactive application

import java.util.Scanner;   //import the scanner, java built in class

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //first thing, scanner the input and talk with the program

        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();        //scan it ( for int ) and save the input to the yearOfBirth
      
        scanner.nextLine(); // handle next line character (enter key), without it, we are not able to enter our name, it would just print out what after

        System.out.println("Enter your name:");
        String name = scanner.nextLine();   //scan it and save the input to the name

        int age = 2021 - yearOfBirth;   //current year - year of birth to see how old is the person

        System.out.println("Your name is " + name + ", and you are " + age + " years old."); //retrieve the information from the console

        scanner.close();    //close the scanner at the end
    }
}
    
