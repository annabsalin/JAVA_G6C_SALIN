package rpg;

import lombok.Getter;
import lombok.Setter;
import rpg.console.Display;
import rpg.console.InputParser;

import java.util.List;
import java.util.Random;

import static java.lang.System.out;

@Getter
@Setter

public class Wizard extends Character{

    public Spell chooseSpell(){
        //TODO faire une fonction qui permet de sélectionner quels sorts on va utiliser
        return null;
    }
    private Display display;
    private InputParser inputParser;

    private House house;

    private Wand wand;
    private List<Potion> potion;
    private List<Spell> spell;

    private String name;

    private Pet pet;


    int level = 1;

    // Constructor of Wizard
    public Wizard(String name) {
        super(name, 30, 120, 120);
        this.potion =potion;
        this.spell = spell;
        createWizard();
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public House getHouse() {
        return house;
    }



    public String askName() {
        this.display = new Display();
        this.inputParser = new InputParser(System.in);
        this.display.printText("Bienvenue dans le monde des sorciers ! J'espère que tu as fait bon voyage. Comment te prénomme tu ?");
        String name = inputParser.readInput();
        this.display.printText("Je suis ravi de te rencontrer " + name + ". Je suis sûr que tu auras un bel avenir dans la plus grande école de sorcelerie.");
        return name;
    }

    //choose the wand of the wizard
    public Wand askWand() {
        this.display = new Display();
        this.inputParser = new InputParser(System.in);
        this.display.printText("Viens, je vais t'emmener à la boutique d'Ollivander pour t'assigner ta baguette ! C'est elle qui est sensé te choisir selon ta personnalité. Il va falloir que tu me donnes quelques informations...");
        Core core = askCore();
        int size= askSize();
        Wand wand = new Wand(core, size);
        this.display.printText("Votre baguette a un coeur constitué de "+core.getDescription()+" et mesure "+size+"cm.");
        this.display.printText("Maintenant que tu as trouvé ta baguette, allons vite à Poudlard ! Nous allons arriver juste à temps pour la cérémonie de répartition !");
        return wand;
    }

    public Core askCore() {
        this.display.printText("Qu'est ce que tu attends de ta baguette ? \n1. Fidèle, sans trop de fluctuations \n2. Puissante et simple d'utilisation, mais elle peut causer des accidents \n3. Pour exécuter tous types de magie");
        String core = inputParser.readInput();
        switch (core) {
            case "1":
                out.println("Ta baguette aura un coeur composé de crin de licorne.");
                return Core.UNICORN;
            case "2":
                out.println("Ta baguette aura un coeur de dragon.");
                return Core.DRAGON;
            case "3":
                out.println("Ta baguette aura un coeur composé de la plume de Phénix.");
                return Core.PHOENIX;
            default:
                out.println("Il faut que tu choisisses entre 1, 2, 3");
                return askCore();
        }
    }

    public int askSize() {
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
                return askSize();
        }
    }
    public void createWizard(){
        String wizardName = askName();
        this.setName(wizardName);
        Wand wand = askWand();
        House house = SortingHat.chooseHouse();
        this.setHouse(house);
        Pet pet = pet();
        this.setPet(pet);
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
    public int useSpell(Enemy targetEnemy, Spell spell) {
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
        int damage = spell.attack;
        if(house == House.SLYTHERIN) {
            damage *= 2;
        }
        targetEnemy.takeDamage(damage);

        return randomNumber;
    }
    //Trouver son animal
    public Pet pet() {
        this.display = new Display();
        this.inputParser = new InputParser(System.in);
        this.display.printText("Il est à présent temps de choisir l'animal qui te suivra pendant tes prochaines années !");
        Pet pet = petChoice();
        this.display.printText("Ton animal pour tes 7 prochaines années sera un "+pet);
        return pet;
    }
    public Pet petChoice(){
        this.display = new Display();
        this.inputParser = new InputParser(System.in);
        System.out.println("Quel animal souhaites tu avoir ? \n1. Rat\n2. Chat\n3. Hibou\n4. Crapaud");
        String pet = inputParser.readInput();
        switch (pet) {
            case "1":
                return Pet.RAT;
            case "2":
                return Pet.CAT;
            case "3":
                return Pet.OWL;
            case "4":
                return Pet.TOAD;
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
        this.display = new Display();
        this.inputParser = new InputParser(System.in);
        display.printText("Bravo ! Vous avez réussi à terminer le niveau, vous passez ainsi en année supérieur !");
        display.printText("Vous avez le choix entre augmenter soit :\n1. votre résistance \n2. dégâts");
        if (inputParser.readInt() == 1){
            addLifePoints();
            display.printText("Tes points de vie sont à présent à :");
            display.printInt(this.lifePoints);
        } else {
            addDamage();
            display.printText("Tes points de dégâts sont à présent à :");
            display.printInt(this.damage);
        }
    }

}
