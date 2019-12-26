package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Planet {
    private String name;

    private String star;
    private int distance;
    private int speed;
    private double time;
    Scanner prompt = new Scanner(System.in);

    public  Planet(String star) throws IOException {
        this.star = star;
        System.out.println("Enter the name of your planet: ");
        name = prompt.nextLine();
        System.out.println("Enter the distance to your star: ");
        distance = prompt.nextInt();
        System.out.println("Enter the speed of your planet: ");
        speed = prompt.nextInt();
        FileWriter writer = new FileWriter("galaxy.txt", true);
        String distanceToString = String.valueOf(distance);
        String speedToString = String.valueOf(speed);
        writer.append(name + " " +  speed + " " + distance);
        writer.flush();
    }

    public String getName() {
        return name;
    }

    public String getStar() {
        return star;
    }

    public int getDistance() {
        return distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void timeSet() {
        time = (Math.PI * (distance * distance)) / speed;
    }

    public double getTime() {
        return time;
    }
}
