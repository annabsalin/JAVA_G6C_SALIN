package com.isep.seance2;


import java.util.Scanner;
import java.lang.Thread;

import static com.isep.seance1.Somme.somme;

public class Main {
    public static void main(String[] args) {
        division();
    }
    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        System.out.println("La discriminant de ce polynome vaut " + delta);
        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");
        }
        if (delta == 0) {
            int racine = -b / (2*a);
            System.out.println("la racine double de ce polynome vaut " + racine);
        }
        if (delta>0){
            int racarre = (int) Math.sqrt(delta);
            int racine1 =  (-b + racarre)/(2*a);
            int racine2 = (-b - racarre)/(2*a);
            System.out.println("la première racine vaut " + racine1 + " et la deuxième racine vaut " + racine2);
        }
    }

    public static void parite(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez un entier ?");
        int entier = scanner.nextInt();
        int resultat = (entier%2);
        if (resultat == 0) {
            System.out.println("Le chiffre " + entier + " est pair");
        }
        else {
            System.out.println("Le chiffre " + entier + " est impair");
        }
    }
    public static void max(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez le premier entier :");
        int entier1 = scanner.nextInt();
        System.out.println("Saisissez le second entier :");
        int entier2 = scanner.nextInt();
        if (entier1<entier2){
            System.out.println("le maximum est " + entier2);
        }
        else {
            System.out.println("le maximum est " + entier1);
        }
    }

    static public void min(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez le premier entier :");
        int entier1 = scanner.nextInt();
        System.out.println("Saisissez le second entier :");
        int entier2 = scanner.nextInt();
        if (entier1<entier2){
            System.out.println("le minimum est " + entier1);
        }
        else {
            System.out.println("le minimum est " + entier2);
        }
    }

    public static void egaliteStr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisissez une première phrase :");
        String str1 = scanner.nextLine();
        System.out.println("Saisissez une seconde phrase :");
        String str2 = scanner.nextLine();
        boolean test= str1.equals(str2);
        if (test==true){
            System.out.println("Les deux phrases sont les mêmes");
        } else {
            System.out.println("Les deux phrases ne sont pas les mêmes");
        }
    }

    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }

    public static void countdown(){
        for (int i=10; i>=0; i--){
            if (i!=0) {
                System.out.println(i);
            } else {
                System.out.println("BOUM !");
            }
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Erreur"+e);
            }
        }

    }

    public static void carres(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rentrez un entier que vou souhaitez mettre au carré : ");
        int x = scanner.nextInt();
        int carre = x*x;
        System.out.println(x + "    " + carre);
    }

    public static void tableMultiplication(){
        for (int j=1; j<=10; j++){
            for (int i=1; i<=10; i++) {
                int a=i*j;
                if (a < 10) {
                    System.out.print(a + "    ");
                } else{
                    System.out.print(a + "   ");
                }
            }
            System.out.println("    ");
        }
    }

    public static void division(){
        Scanner scanner = new Scanner( System.in );
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        int deuxiemeEntier;
        do {
            System.out.println("Veuillez saisir le deuxieme entier");
            deuxiemeEntier = scanner.nextInt();
        } while (deuxiemeEntier==0);
        int division = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " par rapport à " + deuxiemeEntier +
                " est egale a " + division);
    }

}


