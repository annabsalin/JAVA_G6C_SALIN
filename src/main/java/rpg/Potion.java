package rpg;

import lombok.Getter;
import lombok.Setter;
import rpg.console.Display;
import rpg.console.Main;

import java.util.ArrayList;

@Getter
@Setter

public class Potion {

    public int power, quantity;
    public Potion(int power, int quantity){
        this.power=power;
        this.quantity=quantity;
    }


    public static void potion() {
        ArrayList<Potion> potions = new ArrayList<>();
        potions.add(new Potion(60, 2));
    }


    public String drinkPotion(Wizard wizard) {
        if (quantity > 0) {
            int addPV = power;
            if (wizard.getHouse() == House.HUFFLEPUFF) {
                addPV *= 1.5;
            }
            wizard.setLifePoints(wizard.getLifePoints() + addPV);
            quantity--;
            return "Le sorcier a maintenant " + wizard.getLifePoints() + " points de vie.";
        } else {
            return "Le sorcier n'a plus de potion.";
        }
    }


}
