package Core;

import Classes.*;
import Races.*;

public class CharacterBuilder {
    public static PlayerCharacter build(String name, int raceChoice, int classChoice) {
        Race race = null;
        ClassArchetype cls = null;

        if (raceChoice == 1) race = new Tikbalang();
        else if (raceChoice == 2) race = new Kapre();
        else if (raceChoice == 3) race = new Manananggal();

        if (raceChoice == 1) {
            if (classChoice == 1) cls = new Archer();
            else if (classChoice == 2) cls = new Spearman();
        } else if (raceChoice == 2) {
            if (classChoice == 1) cls = new Gunman();
            else if (classChoice == 2) cls = new Druid();
        } else if (raceChoice == 3) {
            if (classChoice == 1) cls = new Mage();
            else if (classChoice == 2) cls = new Assassin();
        }

        return new PlayerCharacter(name, race, cls);
    }
}



