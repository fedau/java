public class CEO extends Staff{

    private double allowance;

    public CEO(String name, double salary, double allowance) {
        super(name, salary);
        this.allowance = allowance;
    }

    public String firePeople(){
        return "You are fired";
    }
}
