package rpg.console;

import rpg.*;
import rpg.Character;
import rpg.Wizard;
import rpg.console.InputParser;
import rpg.console.Display;
import rpg.console.GameParameters;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;
import static rpg.Enemy.troll;


public class Main {
    public GameParameters game;
    public Display display;
    public InputParser inputParser;
    Wizard wizard;

    public Main(){
        this.display = new Display();
        this.inputParser = new InputParser(System.in);
        this.game = new GameParameters();
        this.wizard = new Wizard("");
        //Level1 level1 = new Level1();
        //level1.level1(game, wizard);
        Level2 level2 = new Level2();
        level2.level2(game, wizard);
        Level3 level3 = new Level3();
        level3.level3(game,wizard);
    }

   /*private void createWizard(){
       String name = wizard.name();
       String house = SortingHat.chooseHouse();
       String wand = wand();
       this.wizard = new Wizard(name, house, wand);
       startLevel(1);
    }*/

    // Fonction pour démarrer un niveau
    /*public void startLevel(int level) {
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
    }*/

    /*public Enemy getLevelEnemy(int level) {
        switch (level) {
            case 1:
                return new Enemy("Troll", 15, 80, 80);
            case 2:
                return new Enemy("Basilic", 20, 100, 120);
            case 3:
                return new Enemy("Détraqueurs", 25, 120, 150);
            case 4:
                //TODO voir comment avoir 2 ennemis dans un même niveau
                return new Enemy("Voldemort", 75, 300, 300);
                //return new Enemy("Peter Pettigrow", 15, 80, 80);
            case 5:
                return new Enemy("Dolores Ombrage", 20, 100, 120);
            case 6:
                return new Enemy("Mangemorts", 25, 120, 150);
            case 7:
                //TODO est ce que j'ai besoin de recréer un nouvel ennemi ou j'ai juste la flemme de me casser la tête ?
                return new Enemy("Voldemort", 75, 300, 300);
                //return new Enemy("Bellatrix Lestrange", 50, 250, 250);
            default:
                return null;
        }
    }*/

    /*public Enemy getLevelEnemies(int level) {
        switch (level) {
            case 1:
                return new Enemy(Arrays.asList(new Enemy("Troll", 15, 80, 80)));
            case 2:
                return new Enemy(Arrays.asList(new Enemy("Basilic", 20, 100, 120)));
            case 3:
                return new Enemy(Arrays.asList(new Enemy("Détraqueurs", 25, 120, 150)));
            case 4:
                return new Enemy(Arrays.asList(new Enemy("Voldemort", 75, 300, 300), new Enemy("Peter Pettigrow", 15, 80, 80)));
            case 5:
                return new Enemy(Arrays.asList(new Enemy("Dolores Ombrage", 20, 100, 120)));
            case 6:
                return new Enemy(Arrays.asList(new Enemy("Mangemorts", 25, 120, 150)));
            case 7:
                return new Enemy(Arrays.asList(new Enemy("Voldemort", 75, 300, 300), new Enemy("Bellatrix Lestrange", 50, 250, 250)));
            default:
                return null;
        }
    }*/

    // Fonction pour jouer un niveau
    /*public boolean playLevel(int level) {
        // TODO: logique pour jouer le niveau
        Enemy levelEnemies = getLevelEnemies(level);
        List<Enemy> enemies = levelEnemies.getEnemies();
        //TODO réussir à utiliser les spell dans la liste spell

        Spell spell = wizard.chooseSpell();
        display.displayLifePoints(wizard, (Enemy) enemies);

        boolean allEnemiesDefeated = true;

        for (Enemy enemy : enemies) {
            while (wizard.getLifePoints() > 0 && enemy.getLifePoints() > 0) {
                enemy.takeDamage(wizard.useSpell(enemy, spell));
                wizard.takeDamage(enemy.getDamage());
                display.displayLifePoints(wizard, enemy);
            }
            if (enemy.getLifePoints() > 0) {
                allEnemiesDefeated = false;
                break;
            }
        }if (allEnemiesDefeated) {
            wizard.incrementLevel();
            return true;
        } else {
            return false;
        }
    }*/


    public static void main(String[] args) {
        Main main = new Main();
        //Wand.wand();
        //Wizard.pet();
        //Wizard character = new Wizard(name, 120,20);
        //EndLevel endLevel= new EndLevel();
        //endLevel.success(character);
    }
}
