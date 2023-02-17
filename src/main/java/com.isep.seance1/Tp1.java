package com.isep.seance1;

import java.util.Scanner;

// 4. Interaction avec l'utilisateur
// a. Si l'utilisateur entre un entier, le programme sortira la phrase "J'ai récupéré un entier" suivit de l'entier entré
// Si l'utilisateur entre un nb réel, le programme sortira la phrase "J'ai récupéré un réel" suivit du réel entré
// b. Scanner.nextInt() permet de donner la valeur de la saisie à une variable si l'entrée est un entier. Même principe
// pour un réel.
// c. Il y a une erreur qui indique que nextInt et nextFloat ne peuvent être utilisé que dans une méthode static + il
// n'y a pas l'import du scanner (java.util.Scanner)

public class Tp1 {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);
    }
}
