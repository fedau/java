package staff.managment;

public class Director extends Manager{

    private double budget;

    public Director(String name, int NI, double salery, String deptName, double budget) {
        super(name, NI, salery, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(){
        return this.salery *= 0.02;
    }
}
