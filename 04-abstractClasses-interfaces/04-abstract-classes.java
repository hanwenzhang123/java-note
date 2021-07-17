abstraction is when you define the required functionality for something without actually implementing the details
we focus on what needs to be done, not on the how it is to be done, no actual implementation, it left for the children

//Animal.java
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat(); //no implement anything
    public abstract void breathe();

    public String getName() {
        return name;
    }
}

//Dog.java
public class Dog extends Animal {

    public Dog(String name) {
        super(name);  //super for the default Animal class
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");

    }
}

//Main.java
public class Main {

    public static void main(String[] args) {
	    Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}

