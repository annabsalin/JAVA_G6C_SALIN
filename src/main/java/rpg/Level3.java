package rpg;

import rpg.console.Display;
import rpg.console.GameParameters;
import rpg.console.InputParser;
import rpg.console.Main;

import static rpg.Enemy.detraqueurs;

public class Level3 {
    Display displayLifePoints;
    Display display;

    InputParser inputParser;
    private Wizard wizard;
    private Character character;
    private Main main;
    private GameParameters game;

    public void level3(GameParameters game, Wizard wizard){
        this.game = game;
        this.wizard=wizard;
        this.display = new Display();
        this.inputParser = new InputParser(System.in);
        String description = game.getLevelDescription(3);
        display.printText(description);
        playLevel3();
    }

    public void playLevel3() {

        display.printText("""
                Vous avez vu dans les journaux que de nombreux détraqueurs étaient en liberté !
                Votre courage vous pousse à sortir de Poudelard et à vous diriger dans la forêt.
                Vous vous faites soudainement attaquer par une bande de détraqueurs. Que voulez-vous faire ?
                1. Vous recroquevillez sur vous même
                2. Les battre à main nu
                3. Réfléchir à un sort
                """);

        int choice1 = inputParser.readInt();

        switch (choice1) {
            case 1, 2:
                detraqueurAttack();
                playLevel3();
                break;
            case 3:
                chooseSpell();
                break;
            default:
                display.printText("Choix invalide !");
                playLevel3();
                break;
        }
    }

    public void chooseSpell(){
        display.printText("""
                Quel sort choisissez vous ?
                1. Expectro Patronum
                2. Accio
                3. Wingardium Leviosa
                """);

        int choice2 = inputParser.readInt();

        switch (choice2) {
            case 1:
                detraqueurs.takeDamage(wizard.getDamage());
                display.displayLifePoints(this.wizard, detraqueurs);
                chooseSpell();
                break;
            case 2, 3:
                detraqueurAttack();
                chooseSpell();
                break;
            default:
                display.printText("Choix invalide !");
                chooseSpell();
                break;
        }
    }
    private void detraqueurAttack() {
        display.printText("Les détraqueurs vous attaquent !");
        wizard.takeDamage(detraqueurs.getDamage());
        display.displayLifePoints(this.wizard, detraqueurs);
    }

}
