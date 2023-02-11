public class Passenger {

    private String name;
    private int luggage;

    public Passenger(String name, int luggage) {
        this.name = name;
        this.luggage = luggage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLuggage() {
        return luggage;
    }

    public void setLuggage(int luggage) {
        this.luggage = luggage;
    }

//    public void addNew(Passenger newPassenger){
//        passenger.add(newPassenger);
//    }
}
