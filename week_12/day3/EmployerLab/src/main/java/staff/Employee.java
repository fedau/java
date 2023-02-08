package staff;
public abstract class Employee {
    String name;

    long NI;

    protected double salery;

    public Employee(String name, long NI, double salery){
        this.name = name;
        this.NI = NI;
        this.salery = salery;
    }

    public String getName() {
        return name;
    }

    public long getNI() {
        return NI;
    }

    public double getSalery() {
        return salery;
    }

    public double raiseSalery(double payRaiseParam){
        if(payRaiseParam >= 0) {
            return this.salery += payRaiseParam;
        }
        return payRaiseParam;
    }

    public double payBonus(){
        return this.salery * 0.01;
    }
}
