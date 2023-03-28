package rpg.console;

import rpg.SortingHat;
import rpg.Wizard;
import rpg.console.InputParser;
import rpg.console.Display;

import static java.lang.System.out;


public class Main {

    private static Main game;
    public static Display display;
    public static InputParser inputParser;
    private Wizard wizard;
    private int currentLevel = 1; // niveau actuel


    public static Main getInstance(){
        return game;
    }

    public Display getDisplay() {
        return display;
    }

    public InputParser getInputParser() {
        return inputParser;
    }

    public Main(){
        this.display = new Display();
        this.inputParser = new InputParser(System.in);
        createWizard();
    }

    private void createWizard(){
        this.wizard = new Wizard("", "", "");
        String name = this.wizard.name();
        String wand = wand();
        String sortingHat = SortingHat.chooseHouse();
        this.wizard = new Wizard(name, sortingHat, wand);
        startLevel(1);
    }

   /*private void createWizard(){
       String name = wizard.name();
       String house = SortingHat.chooseHouse();
       String wand = wand();
       this.wizard = new Wizard(name, house, wand);
       startLevel(1);
    }*/

    //choose the wand of the wizard
    public String wand() {
        this.display.printText("Viens, je vais t'emmener à la boutique d'Ollivander pour t'assigner ta baguette ! C'est elle qui est sensé te choisir selon ta personnalité. Il va falloir que tu me donnes quelques informations...");
        String core = core();
        int size= size();
        String wand = core + size;
        this.display.printText("Votre baguette a un coeur constitué de "+core+" et mesure "+size+"cm.");
        this.display.printText("Maintenant que tu as trouvé ta baguette, allons vite à Poudlard ! Nous allons arriver juste à temps pour la cérémonie de répartition !");
    return wand;
   }

    public String core() {
        this.display.printText("Qu'est ce que tu attends de ta baguette ? \n1. Fidèle, sans trop de fluctuations \n2. Puissante et simple d'utilisation, mais elle peut causer des accidents \n3. Pour exécuter tous types de magie");
        String core = inputParser.readInput();
        switch (core) {
            case "1":
                out.println("Ta baguette aura un coeur composé de crin de licorne.");
                return "crin de licorne";
            case "2":
                out.println("Ta baguette aura un coeur de dragon.");
                return "coeur de dragon";
            case "3":
                out.println("Ta baguette aura un coeur composé de la plume de Phénix.");
                return "plume de Phénix";
            default:
                out.println("Il faut que tu choisisses entre 1, 2, 3");
                return core();

        }
    }

    public int size() {
        System.out.println("De quelle taille es-tu ?\n1. Grand \n2. Petit \n3. Normal");
        int size = InputParser.getInt();
        switch(size) {
            case 1:
                return 35;
            case 2:
                return 22;
            case 3:
                return 29;
            default:
                return size();
        }
    }

    // Fonction pour démarrer un niveau
    public void startLevel(int level) {
        // Afficher l'énoncé du niveau
        System.out.println(getLevelDescription(level));

        // Jouer le niveau jusqu'à la victoire ou la défaite
        boolean victory = playLevel(level);

        // Si le joueur a gagné le niveau
        if (victory) {
            // Passer au niveau suivant si possible
            if (level < getMaxLevel()) {
                currentLevel++;
                wizard.setLifePoints(wizard.getMaxLifePoints()); // réinitialiser les points de vie
                startLevel(currentLevel);
            } else {
                // Si on a terminé tous les niveaux, afficher un message de victoire et proposer de rejouer ou de quitter
                System.out.println("Bravo, vous avez terminé tous les niveaux !");
            }
        }else {
            System.out.println("Vous avez perdu tous vos points de vie...");
        }
    }

    // Fonction pour jouer un niveau
    public boolean playLevel(int level) {
        // TODO: logique pour jouer le niveau
        // Retourne true si le joueur a gagné, false sinon
        return true;
    }

    // Fonction pour récupérer la description d'un niveau
    public String getLevelDescription(int level) {
        // TODO: retourner la description du niveau demandé
        return "Description du niveau " + level;
    }

    // Fonction pour récupérer le nombre maximum de niveaux
    public int getMaxLevel() {
        int maxLevel;
        maxLevel=7;
        return maxLevel;
    }


    public static void main(String[] args) {
        game = new Main();
        //Wand.wand();
        //Wizard.pet();
        //Wizard character = new Wizard(name, 120,20);
        //EndLevel endLevel= new EndLevel();
        //endLevel.success(character);
    }
}
