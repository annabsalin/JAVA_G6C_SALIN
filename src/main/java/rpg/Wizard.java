package rpg;

import java.util.Scanner;

import static java.lang.System.out;

public class Wizard extends Character{

    private static final String RAT = "1";
    private static final String CAT = "2";
    private static final String OWL = "3";
    private static final String TOAD = "4";
    public static void pet() {
        out.println("Il est à présent temps de choisir l'animal qui te suivra pendant tes prochaines années !");
        String pet = petChoice();
        out.println("Ton animal pour tes 7 prochaines années sera un "+pet);
    }
    public static String petChoice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel animal souhaites tu avoir ? \n1. Rat\n2. Chat\n3. Hibou\n4. Crapaud");
        String pet;
        switch (scanner.next()) {
            case RAT:
                return pet = "rat";
            case CAT:
                return pet = "chat";
            case OWL:
                return pet = "hibou";
            case TOAD:
                return pet = "crapaud";
            default:
                out.println("Il faut que tu choisisses entre 1, 2, 3 et 4");
                pet();
                return null;
        }
    }

    public String house;
    public String wand;
}
