package com.isep.seance1;

import java.util.Scanner;

public class Volume {

    public static void main(String[] args) {
        volume();
    }
    public static void volume() {
        //Besoin de 3 valeurs int en les demandant à l'utilisateur : hauteur, largeur, longueur : l*L*h ; puis afficher
        Scanner scanner = new Scanner( System.in );
        System.out.println("Veuillez saisir la largeur de la base");
        int largeur = scanner.nextInt();
        System.out.println("Veuillez saisir la longueur de la base");
        int longueur = scanner.nextInt();
        System.out.println("Veuillez saisir la hauteur du pavé droit");
        int hauteur = scanner.nextInt();
        int volume = largeur * longueur * hauteur;
        System.out.println("Le volume du pavé droit " + volume);
    }
}
