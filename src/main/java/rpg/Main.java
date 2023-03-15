package rpg;

import javax.imageio.plugins.jpeg.JPEGQTable;
import javax.xml.namespace.QName;
import java.util.Scanner;

import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {
        //name();
        //Wand.wand();
        //House.house();
        //Wizard.pet();
    }

    public static void name() {
        Scanner scanner = new Scanner(System.in);
        out.println("Bienvenue dans le monde des sorciers ! J'espère que tu as fait bon voyage. Comment te prénomme tu ?");
        String name = scanner.nextLine();
        out.println("Je suis ravi de te rencontrer " + name + ". Je suis sûr que tu auras un bel avenir dans la plus grande école de sorcelerie.");
    }



}
