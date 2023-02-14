package people;

import attractions.Attraction;

import java.util.ArrayList;

public class Visitor {

    private ArrayList<Attraction> visited;
    private int age;
    private double height;
    private double money;


    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visited = new ArrayList<Attraction>();

    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public void addAsVisited(Attraction attraction) {
        visited.add(attraction);
    }

    public int howManyVisited(){
        return visited.size();
    }
}
