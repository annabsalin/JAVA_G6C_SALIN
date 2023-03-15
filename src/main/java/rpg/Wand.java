package rpg;

import java.util.Scanner;

import static java.lang.System.out;

public class Wand {

    private static final String UNICORN = "1";
    private static final String DRAGON = "2";
    private static final String PHENIX = "3";
    private static final String TALL = "1";
    private static final String SMALL = "2";
    private static final String MEDIUM = "3";
    public static void wand() {
        out.println("Viens, je vais t'emmener à la boutique d'Ollivander pour t'assigner ta baguette ! C'est elle qui est sensé te choisir selon ta personnalité. Il va falloir que tu me donnes quelques informations...");
        String core = core();
        int size= size();
        out.println("Votre baguette a un coeur constitué de "+core+" et mesure "+size+"cm.");
        out.println("Maintenant que tu as trouvé ta baguette, allons vite à Poudlard ! Nous allons arriver juste à temps pour la cérémonie de répartition !");
    }

    public static String core() {
        Scanner scanner = new Scanner(System.in);
        out.println("Qu'est ce que tu attends de ta baguette ? \n1. Fidèle, sans trop de fluctuations \n2. Puissante et simple d'utilisation, mais elle peut causer des accidents \n3. Pour exécuter tous types de magie");
        String core;
        switch (scanner.next()) {
            case UNICORN:
                out.println("Ta baguette aura un coeur composé de crin de licorne.");
                return core = "crin de licorne";
            case DRAGON:
                out.println("Ta baguette aura un coeur de dragon.");
                return core = "coeur de dragon";
            case PHENIX:
                out.println("Ta baguette aura un coeur composé de la plume de Phénix.");
                return core = "plume de Phénix";
            default:
                out.println("Il faut que tu choisisses entre 1, 2, 3");
                core();
                return null;
        }
    }

    public static int size() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("De quelle taille es-tu ?\n1. Grand \n2. Petit \n3. Normal");
        int size;
        switch(scanner.next())
        {
            case TALL:
                out.println("Ta baguette mesurera 35cm.");
                return size = 35;
            case SMALL:
                out.println("Ta baguette mesurera 22cm.");
                return size = 22;
            case MEDIUM:
                out.println("Ta baguette mesurera 29cm.");
                return size = 29;
            default:
                out.println("Il faut que tu choisisses entre 1, 2, 3");
                size();
                return 0;
        }
    }
}
