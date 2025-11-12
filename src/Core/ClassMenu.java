package Core;

import java.util.*;

public class ClassMenu {
    public static Map<Integer, String> getRaceOptions() {

        Map<Integer, String> races = new LinkedHashMap<>();
        races.put(1, "Tikbalang");
        races.put(2, "Kapre");
        races.put(3, "Manananggal");
        return races;
    }

    public static Map<Integer, String> getClassOptionsForRace(int raceChoice) {
        Map<Integer, String> classes = new LinkedHashMap<>();
        if (raceChoice == 1) {
            classes.put(1, "Archer");
            classes.put(2, "Spearman");
        } else if (raceChoice == 2) {
            classes.put(1, "Gunman");
            classes.put(2, "Druid");
        } else if (raceChoice == 3) {
            classes.put(1, "Mage");
            classes.put(2, "Assassin");
        }
        return classes;
    }
}

