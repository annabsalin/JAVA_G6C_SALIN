package com.isep.seance1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bonjour");
        Person person = createUser(scanner);
        scanner.close();
    }

    public static Person createUser(Scanner sc) {
        System.out.println("What is the name of the person?");
        String name = sc.nextLine();
        while(!Person.verifyInput(name)){
            System.out.println("Entrée incorrecte !");
            name = sc.nextLine();
        }
        return new Person(name);
    }
}
