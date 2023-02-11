package staff.managment;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, int NI, double salery, String deptName) {
        super(name, NI, salery);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
