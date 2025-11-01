package Storyline.World1;

import Core.*;
import java.util.*;

public class PlayerSelection {
    public static PlayerCharacter createPlayer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your race:");
        Map<Integer, String> races = ClassMenu.getRaceOptions();
        for (Map.Entry<Integer, String> entry : races.entrySet()) {
            System.out.printf("[%d] %s\n", entry.getKey(), entry.getValue());
        }
        int raceChoice = scanner.nextInt();

        System.out.println("Choose your class:");
        Map<Integer, String> classes = ClassMenu.getClassOptionsForRace(raceChoice);
        for (Map.Entry<Integer, String> entry : classes.entrySet()) {
            System.out.printf("[%d] %s\n", entry.getKey(), entry.getValue());
        }
        int classChoice = scanner.nextInt();

        System.out.print("Enter your character name: ");
        scanner.nextLine(); // consume newline
        String name = scanner.nextLine();

        PlayerCharacter player = CharacterBuilder.build(name, raceChoice, classChoice);
        player.displayStats();
        return player;
    }
}

