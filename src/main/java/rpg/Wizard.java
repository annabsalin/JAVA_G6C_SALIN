package rpg;

import lombok.Getter;
import lombok.Setter;
import rpg.console.Display;
import rpg.console.InputParser;
import rpg.console.Main;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

@Getter
@Setter

public class Wizard extends Character{

    private Display display;
    private InputParser inputParser;

    private House house;





    private static final String RAT = "1";
    private static final String CAT = "2";
    private static final String OWL = "3";
    private static final String TOAD = "4";


    int level = 1;

    // Constructor of Wizard
    public Wizard(String name, String sortingHat, String wand, String pet) {
        super(name, 30, 120, 120);
    }

    public House getHouse() {
        return house;
    }


    public String name() {
        this.display = new Display();
        this.inputParser = new InputParser(System.in);
        this.display.printText("Bienvenue dans le monde des sorciers ! J'espère que tu as fait bon voyage. Comment te prénomme tu ?");
        String name = inputParser.readInput();
        this.display.printText("Je suis ravi de te rencontrer " + name + ". Je suis sûr que tu auras un bel avenir dans la plus grande école de sorcelerie.");
        return name;
    }

    public void takeDamage(int damage) {
        int effectiveDamage = damage;
        // Apply house-specific abilities
        if (this.house == House.GRYFFINDOR) {
            // Gryffindor wizards are more resistant to damage
            effectiveDamage = Math.round(damage * 0.8f);
        }
        super.takeDamage(effectiveDamage);

    }
    //use a spell and know if it works
    public void useSpell(Enemy targetEnemy, Spell spell) {
        if(house == House.RAVENCLAW) {
            spell.precision = 95;
        } else {
            spell.precision = 85;
        }
        Random rand = new Random();
        int randomNumber = rand.nextInt(101);
        System.out.println(randomNumber);
        if (randomNumber<spell.precision){
            out.println("Ton sort a bien marché !");
        } else{
            out.println("Ton sort n'a pas marché...");
        }
        //TODO faire le système qui fait qu'un sort peut ne pas marcher avec finalPrecision
        int damage = spell.attack;
        if(house == House.SLYTHERIN) {
            damage *= 2;
        }
        targetEnemy.takeDamage(damage);

    }
    //Trouver son animal
    public String pet() {
        this.display = new Display();
        this.inputParser = new InputParser(System.in);
        this.display.printText("Il est à présent temps de choisir l'animal qui te suivra pendant tes prochaines années !");
        String pet = petChoice();
        this.display.printText("Ton animal pour tes 7 prochaines années sera un "+pet);
        return pet;
    }
    public String petChoice(){
        this.display = new Display();
        this.inputParser = new InputParser(System.in);
        System.out.println("Quel animal souhaites tu avoir ? \n1. Rat\n2. Chat\n3. Hibou\n4. Crapaud");
        String pet = inputParser.readInput();
        switch (pet) {
            case "1":
                return "rat";
            case "2":
                return "chat";
            case "3":
                return "hibou";
            case "4":
                return "crapaud";
            default:
                out.println("Il faut que tu choisisses entre 1, 2, 3 et 4");
                return petChoice();
        }
    }

    //Trouver sa maison
    public static void chooseHouse(){

    }


    //end of level, to upgrade your wizard
    public void addLifePoints() {
        lifePoints += 30;
    }

    public void addDamage(){
        damage +=10;
    }

    public void incrementLevel(){
        this.level++;
        Main.getInstance().getDisplay().printText("Bravo ! Vous avez réussi à terminer le niveau, vous passez ainsi en année supérieur !");
        Main.getInstance().getDisplay().printText("Vous avez le choix entre augmenter soit :\n1. votre résistance \n2. dégâts");
        if (Main.getInstance().getInputParser().getInt() == 1){
            addLifePoints();
            Main.getInstance().getDisplay().printInt(this.lifePoints);
        } else {
            addDamage();
            Main.getInstance().getDisplay().printInt(this.damage);
        }
    }

}
