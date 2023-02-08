public class Staff {

    String name;
    double salary;

    public Staff (String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Staff(double salary) {
        this.salary = salary;
    }
    public double raiseSalary(double payRaiseParam){
        if(payRaiseParam >= 0) {
            return this.salary += payRaiseParam;
        }
        return payRaiseParam;
    }
}
