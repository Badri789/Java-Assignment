package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Star> Stars = new ArrayList<>();

        Scanner prompt = new Scanner(System.in);
        while (true) {
            System.out.println("What do you want? 1-Create a new Stars, 2-See the list of your stars");
            int ans;
            String starName;
            ans = Integer.parseInt(prompt.nextLine());
            if (ans == 1) {
                Star newStar = new Star();
                Stars.add(newStar);
                System.out.println("Do you wish to create planets for your star? 1-Yes/2-No");
                int ans2 = Integer.parseInt(prompt.nextLine());
                prompt.nextLine();
                if (ans2 == 1) {
                    newStar.createPlanet();
                } else {
                    continue;
                }
            } else {
                System.out.println("List of your stars: ");
                for (Star st: Stars) {
                    System.out.println("*" + st.getName());
                }
                System.out.println("Enter the name of star if you wish to to see its planets: ");
                starName = prompt.nextLine();
                for (int i = 0; i < Stars.size(); i++) {
                    if (starName == Stars.get(i).getName()) {
                        for (int j = 0; j < Stars.get(i).getPlanets().size(); j++) {
                             System.out.println(Stars.get(i).getPlanets().get(j).getName());
                             System.out.println(Stars.get(i).getPlanets().get(j).getDistance());
                             System.out.println(Stars.get(i).getPlanets().get(j).getSpeed());
                            System.out.println(Stars.get(i).getPlanets().get(j).getTime());
                            }
                        }
                    }
                }
            }
        }
    }

