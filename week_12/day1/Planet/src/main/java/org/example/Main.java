package org.example;

public class Main {
    public static void main(String[] args) {
        Planet myPlanet = new Planet("Mars", 9809);
        System.out.println(myPlanet.getName() +" is " + myPlanet.getSize());
        myPlanet.explode();



    }
}