package rpg;

import lombok.Getter;
import lombok.Setter;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.out;


public enum House {

    SLYTHERIN("Serpentard"),
    GRYFFINDOR("Gryffondor"),
    RAVENCLAW("Serdaigle"),
    HUFFLEPUFF("Poufsouffle");

    public String house;

    House(String house) { this.house=house;}

    public static House getHouse(int house){
        return House.values()[house - 1];
    }

    /*public static String house() {
           StringBuilder sb = new StringBuilder();
           sb.append("Nous y sommes, c'est à ton tour de passer sous le Choixpeau").append("\n");
           sb.append("Choixpeau : Mmmh c'est très intéressant ce que je vois ! Tu es un élève très particulier.").append("\n");
           String house = choice();
           sb.append("Choixpeau : Félicitation ta maison sera ").append(house).append("\n");
           out.println(sb.toString());
           return house;
}

    }
    public static String choice(){
        Scanner scanner = new Scanner(System.in);
        out.println("Choixpeau : Tu dois être très heureux de rentrer à Poudlard. Qu'est ce que tu as le plus hâte de faire à Poudlard ? \n1. Apprendre la magie noire \n2. Découvrir les lieux \n3. Commencer les cours \n4. Rencontrer tous les jeunes sorciers ");
        String house;
        switch(scanner.nextInt()) {
            case 1:
                return house = "Serpentard";
            case 2:
                return house = "Gryffondor";
            case 3:
                return house= "Serdaigle";
            case 4:
                return house = "Poufsouffle";
            default:
                out.println("Il faut que tu choisisses entre 1, 2, 3, 4");
                choice();
                return null;
        }
    }*/
}
