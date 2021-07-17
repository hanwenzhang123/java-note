//Gearbox.java
public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);    //inner class Gear
        this.gears.add(neutral);  //.add() add a specific element into a Set collection.
      
      for(int i=0; i<maxGears; i++) {
            addGear(i, i* 5.3);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in; //whatever the statics
    }

    public void addGear(int number, double ratio) { //ability to add gear
        if((number >0) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if((newGear>=0 ) && (newGear <this.gears.size()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if(clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    private class Gear {    //private class
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {

            this.gearNumber = gearNumber;   //using this talks about the gearNumber inside the Gear class
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }
}


//Main.java
public class Main {
    public static void main(String[] args) {
	    Gearbox mcLaren = new Gearbox(6);   //outer class
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);     //inner class
        //reference the outer class first then whatever name the inner class
        //then the name of the object you have created with ".new"
        //then the name of the inner class, then the parameters in a constructor
        mcLaren.addGear(1. 5.3);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1)
    }
}
