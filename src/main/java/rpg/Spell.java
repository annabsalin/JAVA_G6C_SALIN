package rpg;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter

public class Spell {

    public int precision, attack;
    public String name;

    public Spell(String name, int precision, int attack){
        this.name =name;
        this.precision=precision;
        this.attack=attack;
    }

    public void spellAvailable(){
        ArrayList<Spell> spells = new ArrayList<Spell>();

        spells.add(new Spell("Wingardium Leviosa", precision, 20)); //sort de lévitation
        spells.add(new Spell("Lumos", precision, 0)); //sort de lumière
        spells.add(new Spell("Expelliarmus", precision, 0)); //sort de désarmement
        spells.add(new Spell("Expecto Patronum", precision, 0)); //sort pour appeler le patronus
    }



}
