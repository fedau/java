public enum PlaneType {
    BOEING747(10, 60),
    PRIVATEJET(4, 30),
    CARGO(2,40),
    ;

    private final int seats;
    private final double weight;

    PlaneType(int seats, double weight) {
        this.seats = seats;
        this.weight = weight;
    }

    public int getSeats() {
        return seats;
    }

    public double getWeight() {
        return weight;
    }
}
