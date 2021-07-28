create many classes within one java source file (many forms)
aassigning different functionality depending on the type of object that we have created
polymorphism also inheritate from the parent class without the extends keyword

It’s possible to use objects of different classes that share a parent class together in an array or ArrayList.


//Example1
class Bird{
	public void sing(){
		System.out.println("tweet tweet tweet");
	}
}
class Robin extends Bird {
	public void sing(){
		System.out.println("twiddledeedee");
	}
}
class Pelican extends Bird {
	public void sing(){
		System.out.println("kwaah kwaah kwaah");
	}
}
public class Polymorphism {
	public static void main(String[] args){
		Robin b = new Robin();	//priortize the method in Robin instead of its parent methods
		b.sing();	//twiddledeedee
	}	//if Robin has a parameter in its method, when we execute, it has to match the parameter, it has to be exact 
}		//if name or parameter not matched, when we do. b.sing, we get its parent value "tweet tweet tweet"


//Example 2
class Movie { //based class
    private String name;  //field

    public Movie(String name) { //constructor
        this.name = name;
    }

    public String plot() {  //method
        return "No plot here";
    }

    public String getName() { //getter
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {  //without the override, we still return this local statement
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No plot method, use polymorphism so we return from where it extended, Movie.plot() will be returned
}


public class Main {

    public static void main(String[] args) {  //static method
	    for(int i=1; i<11; i++) {   //return one of the random movie in a 10-loop
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                            " : " + movie.getName() + "\n" +
                            "Plot: " + movie.plot() + "\n");  //polymorphism
        }
    }

    public static Movie randomMovie() { //object movie
        int randomNumber = (int) (Math.random() * 5) +1;  //a random number, cast to int
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) { //switch statement, no need break because we return the value anyway
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;  //handle anything outside the range
    }
}
