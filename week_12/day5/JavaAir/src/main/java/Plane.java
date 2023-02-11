public class Plane {

    int seats;
    double planeWeight;

    public Plane(PlaneType planeType) {
        this.seats = planeType.getSeats();
        this.planeWeight = planeType.getWeight();
    }
}
