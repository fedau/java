import java.util.ArrayList;

public class Flight {

    Plane plane;
    ArrayList<CabinCrewMember> crewMember;
    ArrayList<Passenger>  passenger;
    Pilot pilot;

    String flightNumber;
    String departureAirport;
    String destination;
    String departureTime;


    public Flight(Plane plane, Pilot pilot, String flightNumber, String departureAirport, String destination, String departureTime) {
        this.plane = plane;
        this.crewMember = new ArrayList<>();
        this.passenger = new ArrayList<>();
        this.pilot = pilot;
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public Flight() {

    }

    public int getCapacity(PlaneType planetype) {
        return planetype.getSeats();
    }

    public void addPassenger(Passenger newPassenger) {
        passenger.add(newPassenger);
    }

    public int getTotalPassengers() {
        return passenger.size();
    }
}




//    at least one Pilot
//    a list of CabinCrewMembers (you can decide the number)
//    an empty list of booked Passenger's
//        a Plane
//        flight number (i.e. "FR756")
//        destination (i.e. GLA, EDI)
//        departure airport (i.e. GLA, EDI)
//        departure time (use a String)
//
//        The Flight should be able to:
//
//        return the number of available seats
//        book a passenger (if there are remaining seats)
