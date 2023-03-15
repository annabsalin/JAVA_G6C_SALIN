package rpg;

import java.util.Scanner;

import static java.lang.System.out;

public class House {

    private static final int SERP = 1;
    private static final int GRYF = 2;
    private static final int SERD = 3;
    private static final int POUF = 4;

    public static void house() {
        out.println("Nous y sommes, c'est à ton tour de passer sous le Choixpeau");
        out.println("Choixpeau : Mmmh c'est très intéressant ce que je vois ! Tu es un élève très particulier.");
        String house = choice();
        out.println("Choixpeau : Félicitation ta maison sera "+house);
    }
    public static String choice(){
        Scanner scanner = new Scanner(System.in);
        out.println("Choixpeau : Tu dois être très heureux de rentrer à Poudlard. Qu'est ce que tu as le plus hâte de faire à Poudlard ? \n1. Apprendre la magie noire \n2. Découvrir les lieux \n3. Commencer les cours \n4. Rencontrer tous les jeunes sorciers ");
        String house;
        switch(scanner.nextInt()) {
            case SERP:
                return house = "Serpentard";
            case GRYF:
                return house = "Gryffondor";
            case SERD:
                return house= "Serdaigle";
            case POUF:
                return house = "Poufsouffle";
            default:
                out.println("Il faut que tu choisisses entre 1, 2, 3, 4");
                choice();
                return null;
        }
    }
}
