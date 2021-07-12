composition is like setting up parts of an object
like computer, it has its cpu memory i/o motherboard as the parts to set up a computer as a whole object
//Vehicle.java
public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }
}
//Car.java
public class Car extends Vehicle {  //car is a vehicle
    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}

//PC - EXAMPLE
//Main.java
public class Main {

    public static void main(String[] args) {
	Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);  //using the dimensions value above (with a new variable)

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));  //create an instance of a class without using a variable

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//         thePC.getMonitor().drawPixelAt(1500, 1200, "red" );  //revoke the method drawPixelAt built in the monitor class
//         thePC.getMotherboard().loadProgram("Windows 1.0");  //load the program with its programName parameter by the values returned by the getMotherboard
//         thePC.getTheCase().pressPowerButton();	//accessing the function via the PC object
	thePC.powerUp();	//click the button to show the logo
    }
}

//Motherboard.java
public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}

//Monitor.java
public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;  //compositionn - the resolution is a component of a monitor that it has a native resolution.
						//monitor contains resolutions
    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}

//Resolution.java
public class Resolution {
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

//Case.java
public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;	//the case has got the dimension

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}

//Dimensions.java
public class Dimensions {
    private int width;
    private int height;
    private int depth;

    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}

//PC.java
public class PC {	//instead of using extends keyword
    private Case theCase;	//PC has the case which has dimensions
    private Monitor monitor;	//PC has the monitor which has resolution
    private Motherboard motherboard;	//PC has the motherborad

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
  
    public void powerUp() {
        theCase.pressPowerButton();	//once you click the button, you see the logo
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }

//  private only for internally, so we do not really need these getters

//     private Case getTheCase() { 
//         return theCase;
//     }

//     private Monitor getMonitor() {
//         return monitor;
//     }

//     private Motherboard getMotherboard() {
//         return motherboard;
//     }

}
  
