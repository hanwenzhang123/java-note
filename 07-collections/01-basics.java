Array can be viewed as collections

//Theatre.java
import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();	//private list of the seat object; can also be new LinkedList<>(); 
//  private Collection<Seat> seats = new HashSet<>();	//can also be new LinkedHashSet<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {	//constructor
        this.theatreName = theatreName;	//set the name

        int lastRow = 'A' + (numRows -1);	//last row for the ASCII in integer, -1 because we have to count A as our beginning
        for (char row = 'A'; row <= lastRow; row++) {	//going through all the rows from A-Z
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {	//for each row 
                Seat seat = new Seat(row + String.format("%02d", seatNum));	//create seat object
                seats.add(seat);	//add to the array list
            }
        }
    }

    public String getTheatreName() {		//get the theatre name from the construction
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {	//pass through a boolean method then reserve it
        Seat requestedSeat = null;
        for(Seat seat : seats) {    //for each seat in seats of Seat object
            if(seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;	//update the requestedSeat
                break;	//break loop
            }
        }

        if(requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.reserve();	//reserve it if return true
    }

    // for testing
    public void getSeats() {	//print out all the seats
        for(Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

  //inner private class Seat with function reserve and cancel
    private class Seat {
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {	//constructor, set the seatNumber
            this.seatNumber = seatNumber;
        }

        public boolean reserve() {
            if(!this.reserved) {
                this.reserved = true;	//set it to true
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if(this.reserved) {	//if this specific seat has already being reserved
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;	//we are not able to cancel
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }


//Main.java
public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
//        theatre.getSeats();	//print every seat
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");   //seat researved
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
    
