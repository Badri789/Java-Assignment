package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Star {
    private String name;
    private int diameter;
    private int temperature;

    private List<Planet> planets = new ArrayList<>();
    Scanner prompt = new Scanner(System.in);
    private Planet planet;

    public Star() throws IOException {
        System.out.println("Enter the name of your star: ");
        name = prompt.nextLine();
        System.out.println("Enter the diameter of your star: ");
        diameter = prompt.nextInt();
        System.out.println("Enter the temperature of your star: ");
        temperature = prompt.nextInt();
        FileWriter writer = new FileWriter("galaxy.txt", true);
        String diameterToString = String.valueOf(diameter);
        String temperatureToString = String.valueOf(temperature);
        writer.append(name + " " +  diameterToString + " " + temperatureToString);
        writer.flush();
    }

    public void createPlanet() throws IOException {
        planet = new Planet(name);
        planets.add(planet);
    }

    public String getName() {
        return name;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getTemperature() {
        return temperature;
    }

    public List<Planet> getPlanets() {
        return planets;
    }


}
