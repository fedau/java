public class Lizard {
    private String name;
    private int age;
    private String Colour;
    public Lizard(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        Colour = colour;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }
}
