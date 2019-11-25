package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Assignment 1

        Random rand = new Random();

        ArrayList<Integer> randNums = new ArrayList<Integer>();

        for (int i = 0; i < 12; i++) {
            randNums.add(rand.nextInt(1000));
        }

        ArrayList<Integer> copyNums = new ArrayList<Integer>(randNums);

        for (int i = 0; i < randNums.size(); i++) {
            randNums.remove(i);
        }

        Collections.sort(randNums);
        Collections.sort(copyNums);

        System.out.println("Initial: " + copyNums);
        System.out.println("Modified: " + randNums);

        //Assignment 2=============================================================================

        Random rand2 = new Random();
        ArrayList<Integer> randomRange = new ArrayList<Integer>();

        for (int i = 0; i < 12; i++) {
            randomRange.add(rand2.nextInt((10 - 5) + 1) + 5);
        }

        ArrayList<Integer> copyRange = new ArrayList<Integer>(randomRange);

        for (int i = 4; i < randomRange.size(); i+=4) {
            randomRange.add(i, rand2.nextInt((25- 20) + 1) + 20);
        }

        System.out.println("Initial: " + copyRange);
        System.out.println("Modified: " + randomRange);

    }
}
