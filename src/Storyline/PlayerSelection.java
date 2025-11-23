package Storyline;

import Core.*;
import java.util.*;

public class PlayerSelection {
    public static PlayerCharacter createPlayer() {
        Scanner scanner = new Scanner(System.in);
        int raceChoice = -1, classChoice = -1, choice;
        String name = "";

        // Race selection
        while (true) {
            try {
                System.out.println("╔════════════════════════════════════╗");
                System.out.println("║   -- LEGENDS OF THE SHADOWED --    ║");
                System.out.println("║         >> REALM RACES <<          ║");
                System.out.println("╠════════════════════════════════════╣");
                System.out.println("║ Tikbalang   → HP 95  | Mana 80     ║");
                System.out.println("║ Kapre       → HP 100 | Mana 70     ║");
                System.out.println("║ Manananggal → HP 90  | Mana 100    ║");
                System.out.println("╚════════════════════════════════════╝");
                System.out.println("Choose your race:");
                Map<Integer, String> races = ClassMenu.getRaceOptions();
                for (Map.Entry<Integer, String> entry : races.entrySet()) {
                    System.out.printf("[%d] %s\n", entry.getKey(), entry.getValue());
                }
                System.out.print("You've chosen: ");
                raceChoice = Integer.parseInt(scanner.nextLine());
                System.out.println();
                if (!races.containsKey(raceChoice)) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("❌ Invalid race choice. Please enter a valid number.\n");
            }
        }

        // Class selection
        while (true) {
            try {
                System.out.println("╔══════════════════════════════════════╗");

                if (raceChoice == 1) {
                    System.out.println("║        >> Tikbalang Classes <<       ║");
                    System.out.println("╠══════════════════════════════════════╣");
                    System.out.println("║ Spearman  → +90 HP  | +75 Mana       ║");
                    System.out.println("║ Assassin  → +85 HP  | +80 Mana       ║");
                } else if (raceChoice == 2) {
                    System.out.println("║            >> Kapre Class <<         ║");
                    System.out.println("╠══════════════════════════════════════╣");
                    System.out.println("║ Gunman   → +80 HP  | +70 Mana        ║");
                    System.out.println("║ Druid    → +100 HP | +85 Mana        ║");
                } else if (raceChoice == 3) {
                    System.out.println("║        >> Manananggal Class <<       ║");
                    System.out.println("╠══════════════════════════════════════╣");
                    System.out.println("║ Mage    → +75 HP   | +100 Mana       ║");
                    System.out.println("║ Assassin → +85 HP  | +80  Mana       ║");
                }

                System.out.println("╚══════════════════════════════════════╝");
                System.out.println("Choose your class:");
                Map<Integer, String> classes = ClassMenu.getClassOptionsForRace(raceChoice);
                for (Map.Entry<Integer, String> entry : classes.entrySet()) {
                    System.out.printf("[%d] %s\n", entry.getKey(), entry.getValue());
                }
                System.out.print("You've chosen: ");
                classChoice = Integer.parseInt(scanner.nextLine());
                System.out.println();
                if (!classes.containsKey(classChoice)) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("❌ Invalid class choice. Please enter a valid number.\n");
            }
        }

        // Name input
        while (true) {
            try {
                System.out.print("Enter your character name: ");
                name = scanner.nextLine().trim();
                if (name.isEmpty()) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("⚠️ Name cannot be empty. Try again.\n");
            }
        }
        //name confirmation (won't close loop until player is happy with the name)
        while (true) {
            System.out.println("Hello, " + name + "! Are you satisfied with that name?");
            System.out.println("[1] Yes\n[0] No, change it.");

            try {
                System.out.print("You've chosen: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    break;
                } else if (choice == 0) {
                    System.out.println();
                    while (true) {
                        try {
                            System.out.print("Enter your character name: ");
                            name = scanner.nextLine().trim();
                            if (name.isEmpty()) throw new Exception();
                            break;
                        } catch (Exception e) {
                            System.out.println("⚠️ Name cannot be empty. Try again.\n");
                        }
                    }
                } else {
                    System.out.println("⚠️ Please enter only 1 or 0.\n");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("⚠️ Invalid input. Please enter a number (1 or 0).\n");
                scanner.nextLine();
            }
        }

        PlayerCharacter player = CharacterBuilder.build(name, raceChoice, classChoice);
        player.displayStats();
        return player;
    }
}


