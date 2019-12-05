package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String lang;
        String param;

        Scanner prompt = new Scanner(System.in);

        lang = prompt.nextLine();

        while(true) {
            param = prompt.nextLine();
            if (!Generator.checkParams(param)) {
                System.out.println("Your parameters are incorrect! Try again!");
            } else {
                break;
            }

        }

        Generator generator = new Generator(lang, param);

        System.out.println(generator.generateParagraph());
    }
}

//geo
//p-5-s-2-7-w-3-9