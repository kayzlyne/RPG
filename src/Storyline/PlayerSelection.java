package Storyline;

import Core.*;
import java.util.*;

public class PlayerSelection {
    public static PlayerCharacter createPlayer() {
        Scanner scanner = new Scanner(System.in);
        int raceChoice = -1, classChoice = -1;
        String name = "";

        // 🧬 Race selection
        while (true) {
            try {
                System.out.println("Choose your race:");
                Map<Integer, String> races = ClassMenu.getRaceOptions();
                for (Map.Entry<Integer, String> entry : races.entrySet()) {
                    System.out.printf("[%d] %s\n", entry.getKey(), entry.getValue());
                }
                raceChoice = Integer.parseInt(scanner.nextLine());
                if (!races.containsKey(raceChoice)) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("❌ Invalid race choice. Please enter a valid number.\n");
            }
        }

        // 🛡️ Class selection
        while (true) {
            try {
                System.out.println("Choose your class:");
                Map<Integer, String> classes = ClassMenu.getClassOptionsForRace(raceChoice);
                for (Map.Entry<Integer, String> entry : classes.entrySet()) {
                    System.out.printf("[%d] %s\n", entry.getKey(), entry.getValue());
                }
                classChoice = Integer.parseInt(scanner.nextLine());
                if (!classes.containsKey(classChoice)) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("❌ Invalid class choice. Please enter a valid number.\n");
            }
        }

        // 📝 Name input
        while (true) {
            try {
                System.out.print("Enter your character name: ");
                name = scanner.nextLine().trim();
                if (name.isEmpty()) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("❌ Name cannot be empty. Try again.\n");
            }
        }

        PlayerCharacter player = CharacterBuilder.build(name, raceChoice, classChoice);
        player.displayStats();
        return player;
    }
}


