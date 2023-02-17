package com.isep.seance1;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        division();
    }

    public static void division() {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int division = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " par rapport à " + deuxiemeEntier +
                " est egale a " + division);
    }
}
