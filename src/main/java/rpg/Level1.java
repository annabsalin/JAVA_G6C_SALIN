package rpg;

import lombok.Getter;
import lombok.Setter;
import rpg.console.*;
import rpg.console.Main;

import static rpg.Enemy.troll;

@Getter
@Setter

public class Level1 {
    Display displayLifePoints;
    Display display;

    InputParser inputParser;
    private Wizard wizard;
    private Character character;
    private Main main;
    private GameParameters game;



    public void level1(GameParameters game, Wizard wizard){
        this.game = game;
        this.wizard=wizard;
        this.display = new Display();
        this.inputParser = new InputParser(System.in);
        String description = game.getLevelDescription(1);
        display.printText(description);
        playLevel1();
    }

    public void playLevel1() {

        display.printText("""
                Vous êtes dans les toilettes, un troll se tient devant vous. Que voulez-vous faire ?
                1. Attaquer directement le troll
                2. Observer votre environnement
                3. Ne rien faire""");

            int choice1 = inputParser.readInt();

            switch (choice1) {
                case 1, 3:
                    trollAttack();
                    playLevel1();
                    break;
                case 2:
                    handleEnvironment();
                    break;
                default:
                    display.printText("Choix invalide !");
                    playLevel1();
                    break;
            }
        }


    private void handleEnvironment() {
        display.printText(""" 
        Vous observez votre environnement. Que voulez vous faire ?
        1. Se diriger vers la porte
        2. Se diriger vers les toilettes
        3. Se cacher sous une table""");

        int choice2 = inputParser.readInt();

        switch (choice2) {
            case 1, 3:
                trollAttack();
                handleEnvironment();
                break;
            case 2:
                handleToilettes();
                break;
            default:
                display.printText("Choix invalide !");
                handleEnvironment();
                break;
        }
    }

    private void handleToilettes() {

        boolean levelComplete = false;
        display.printText("""
                              Vous vous dirigez vers le troll. Que voulez vous faire ?
                             1. Attaquer directement le troll
                             2. Utiliser Wingardium Leviosa pour faire voler les toilettes
                                     """);
        int subChoice = inputParser.readInt();
        while (!levelComplete) {
            switch (subChoice) {
                case 1:
                    trollAttack();
                    handleToilettes();
                    break;
                case 2:
                    display.printText("Vous utilisez Wingardium Leviosa pour faire voler les toilettes sur le troll !");
                    troll.takeDamage(wizard.getDamage());
                    display.displayLifePoints(this.wizard, troll);
                    break;
                default:
                    display.printText("Choix invalide !");
                    handleToilettes();
                    break;
            }if (troll.getLifePoints() <= 0) {
                display.printText("Vous avez vaincu le troll ! Niveau terminé !");
                wizard.incrementLevel();
                levelComplete = true;
            }
        }
    }

    private void trollAttack() {
        display.printText("Le troll vous attaque !");
        wizard.takeDamage(troll.getDamage());
        display.displayLifePoints(this.wizard, troll);
    }

    private void gameOver() {
        display.printText("Vous êtes mort ! Game over...");
    }

}

