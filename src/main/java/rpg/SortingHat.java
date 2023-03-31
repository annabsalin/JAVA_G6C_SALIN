package rpg;

import lombok.Getter;
import lombok.Setter;
import rpg.House;

import java.util.Scanner;
@Getter
@Setter

public class SortingHat {

//TODO refaire avec le MVC
    public static House chooseHouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nous y sommes, c'est à ton tour de passer sous le Choixpeau.");
        System.out.println("Choixpeau : Mmmh c'est très intéressant ce que je vois ! Tu es un élève très particulier.");
        House house = house(scanner);
        System.out.println("Choixpeau : Félicitation ta maison sera " + house);
        return house;
    }

    private static House house(Scanner scanner) {
        System.out.println("Choixpeau : Tu dois être très heureux de rentrer à Poudlard. Qu'est ce que tu as le plus hâte de faire à Poudlard ? ");
        System.out.println("1. Apprendre la magie noire");
        System.out.println("2. Découvrir les lieux");
        System.out.println("3. Commencer les cours");
        System.out.println("4. Rencontrer tous les jeunes sorciers ");
        int choice = scanner.nextInt();
        switch(choice) {
            case 1:
                return House.SLYTHERIN;
            case 2:
                return House.GRYFFINDOR;
            case 3:
                return House.RAVENCLAW;
            case 4:
                return House.HUFFLEPUFF;
            default:
                System.out.println("Il faut que tu choisisses entre 1, 2, 3, 4");
                return house(scanner);
        }
    }
}
