package rpg;

import lombok.Getter;
import lombok.Setter;
import rpg.console.Display;
import rpg.console.InputParser;
import rpg.console.Main;
import rpg.console.GameParameters;

import static rpg.Enemy.basilic;
import static rpg.Enemy.troll;
import static rpg.House.getHouse;

@Getter
@Setter

public class Level2 {
    Display displayLifePoints;
    Display display;

    InputParser inputParser;
    private Wizard wizard;
    private Character character;
    private Main main;
    private GameParameters game;



    public void level2(GameParameters game, Wizard wizard){
        this.game = game;
        this.wizard=wizard;
        this.display = new Display();
        this.inputParser = new InputParser(System.in);
        String description = game.getLevelDescription(2);
        display.printText(description);
        level2();
    }


    private void level2() {
        while(wizard.stillAlive()&&basilic.stillAlive()){
            introduction2();
        } if (wizard.dead()){
            gameOver();
        } if (basilic.dead()){
            display.printText("Vous avez vaincu le Basilic");
            wizard.incrementLevel();
        }
    }

    public void introduction2(){
        display.printText("""
                Alors que vous vous rendiez à votre cours de forces contre le Mal, votre instinct vous dit de suivre le couloir sur votre gauche.
                 1. Suivre votre instinct et prendre ce couloir
                 2. Aller en cours de forces contre le Mal
                 """);
        int choice1 = inputParser.readInt();

        switch (choice1) {
            case 1:
                if (this.wizard.getHouse().equals(House.GRYFFINDOR)) {
                    objectGr();
                }else{
                    fightLost();
                }
                break;
            case 2:
                darkArtsStudy();
                break;
            default:
                display.printText("Choix invalide !");
                level2();
                break;
        }if (wizard.dead()){
            gameOver();
        }if (basilic.dead()){
            display.printText("Vous avez vaincu le basilic ! Niveau terminé !");
            wizard.incrementLevel();
        }
    }
    //Solution : si Gryffondor il faut choisir de suivre son instinct pour récupérer l'épée
    //Si autre maison, il faut aller en cours pour récupérer le carnet
    //L'autre option emmène directement au combat qui n'est pas résolvable sans l'un des deux objets

    public void objectGr() {
        display.printText("""
                Vous avez suivi votre instinct !
                Vous tombez sur une porte fermée et vous décidez de l'ouvrir.
                Oh ! Mais cet objet vous dit quelque chose. Vous vous en rapprochez doucement.
                Mais oui c'est bien ce que vous pensiez ! Vous venez de tomber sur l'épée légendaire de Godric Gryffindor !
                Est-ce-que vous la prenez ?
                1. Oui, ça peut me servir plus tard
                2. Non, ça va m'encombrer""");

        int choice2 = inputParser.readInt();

        switch (choice2) {
            case 1:
                fight();
                break;
            case 2:
                fightLost();
                break;
            default:
                display.printText("Choix invalide !");
                objectGr();
                break;
        }if (wizard.dead()){
            gameOver();
        }if (basilic.dead()){
            display.printText("Vous avez vaincu le basilic ! Niveau terminé !");
            wizard.incrementLevel();
        }
    }

    public void darkArtsStudy() {
        display.printText("""
                Vous êtes malgré tout très suspicieux et décidez de parler à votre professeur de vos intuitions.
                Pour vous remercier et vous protégez, il vous confit un objet de la plus haute importance :
                Le Journal de Tom Jedusor.
                1. J'accepte avec grand plaisir
                2. Non, ça va m'encombrer""");
        int choice3 = inputParser.readInt();

        switch (choice3) {
            case 1:
               jedusor();
               SpellChoice();
               break;
            case 2:
                basilicAttack();
                fightLost();
                break;
            default:
                display.printText("Choix invalide !");
                darkArtsStudy();
                break;
        }if (wizard.dead()){
            gameOver();
        }if (basilic.dead()){
            display.printText("Vous avez vaincu le basilic ! Niveau terminé !");
            wizard.incrementLevel();
        }
    }

    public void fightLost() {
        display.printText("""
                Vous arrivez devant une porte verte, doucement vous l'ouvrez et descendez les escaliers. 
                Tout d'un coup, apparait devant vous le grand basilic ! Vite il faut agir avant qu'il vous attaque !
                1. Vous vous préparez à lancer un sort
                2. Vous observer la pièce
                3. Vous utilisez un objet
                """);
        int choice4 = inputParser.readInt();

        switch (choice4) {
            case 1:
                basilicAttack();
                display.printText("Tu ne peux lancer aucun sorts.");
                break;
            case 2:
                basilicAttack();
                break;
            case 3:
                display.printText("Vous n'avez aucun objet à votre disposition");
                basilicAttack();
                break;

            default:
                display.printText("Choix invalide !");
                fightLost();
                break;
        }if (wizard.dead()){
            gameOver();
        }if (basilic.dead()){
            display.printText("Vous avez vaincu le basilic ! Niveau terminé !");
            wizard.incrementLevel();
        }
    }

    public void fight(){
        display.printText("""
                Vous arrivez devant une porte verte, doucement vous l'ouvrez et descendez les escaliers. 
                Tout d'un coup, apparait devant vous le grand basilic ! Vite il faut agir avant qu'il vous attaque !
                1. Vous vous préparez à lancer un sort
                2. Vous observer la pièce
                3. Vous utilisez un objet""");
        int choice5 = inputParser.readInt();

        switch (choice5) {
            case 1:
                basilicAttack();
                SpellChoice();
                break;
            case 2:
                basilicAttack();
                break;
            case 3:
                sword();
                basilicAttack();
                break;

            default:
                display.printText("Choix invalide !");
                fight();
                break;
        }if (wizard.dead()){
            gameOver();
        }if (basilic.dead()){
            display.printText("Vous avez vaincu le basilic ! Niveau terminé !");
            wizard.incrementLevel();
        }
    }

    public void jedusor(){
        display.printText("""
                Vous arrivez devant une porte verte, doucement vous l'ouvrez et descendez les escaliers. 
                Tout d'un coup, apparait devant vous le grand Basilic ! Vite il faut agir avant qu'il vous attaque !
                1. Vous vous préparez à lancer un sort
                2. Vous observer la pièce
                3. Vous utilisez un objet""");
        int choice7 =inputParser.readInt();

        switch (choice7) {
            case 1:
                basilicAttack();
                SpellChoice();
                break;
            case 2:
                basilicAttack();
                break;
            case 3:
                basilicAttack();
                jedusorOutput();
                break;

            default:
                display.printText("Choix invalide !");
                jedusor();
                break;
        }if (wizard.dead()){
            gameOver();
        }if (basilic.dead()){
            display.printText("Vous avez vaincu le basilic ! Niveau terminé !");
            wizard.incrementLevel();
        }
    }

    public void jedusorOutput() {
        display.printText("""
                Vous avez sorti le journal de Tom Jedusor, vous êtes à présent face au Basilic. 
                Que décidez-vous de faire ?
                1. Vous vous préparez à lancer un sort
                2. Vous observer la pièce""");
        int choice7 = inputParser.readInt();
            switch (choice7) {
                case 1:
                    basilicAttack();
                    SpellChoice();
                    break;
                case 2:
                    basilicAttack();
                    break;

                default:
                    display.printText("Choix invalide !");
                    jedusorOutput();
                    break;
            }if (wizard.dead()){
            gameOver();
        }if (basilic.dead()){
            display.printText("Vous avez vaincu le basilic ! Niveau terminé !");
            wizard.incrementLevel();
        }
        }


    public void SpellChoice(){
        boolean levelComplete = false;
        display.printText("""
                Vous avez le choix entre différents sorts
                1. Wingardium Leviosa
                2. Accio """);
        int choice6 = inputParser.readInt();
        while (!levelComplete){
        switch (choice6) {
            case 1:
                basilicAttack();
                break;
            case 2:
                basilic.takeDamage(wizard.getDamage());
                display.displayLifePoints(wizard, basilic);
                break;
            default:
                display.printText("Choix invalide !");
                SpellChoice();
                break;
        }   if (basilic.getLifePoints() <= 0) {
                display.printText("Vous avez vaincu le Basilic ! Niveau terminé !");
                wizard.incrementLevel();
                levelComplete = true;
            }
        }
    }



    public void sword() {
         boolean levelComplete = false;
        display.printText("""
                 Est ce que vous souhaitez sortir l'épée légendaire de Godric Gryffindor.
                 1. La sortir et l'utiliser contre le Basilic
                 2. Essayer un sort
                """);
        while (!levelComplete){
        int choice7 = inputParser.readInt();
            switch (choice7) {
                case 1:
                    basilic.takeDamage(wizard.getDamage());
                    display.displayLifePoints(wizard, basilic);
                    sword();
                    break;
                case 2:
                    SpellChoice();
                    break;
                default:
                    display.printText("Choix invalide !");
                    sword();
                    break;
            }if (basilic.getLifePoints() <= 0) {
                display.printText("Vous avez vaincu le basilic ! Niveau terminé !");
                wizard.incrementLevel();
                levelComplete = true;
        }
        }
    }




    private void basilicAttack() {
        display.printText("Le Basilic vous attaque ! Vous avez perdu :"+ basilic.getDamage());
        wizard.takeDamage(basilic.getDamage());
        display.displayLifePoints(this.wizard, basilic);
    }

    private void gameOver() {
        display.printText("Vous êtes mort ! Game over...");
    }

}

