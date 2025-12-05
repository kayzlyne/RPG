package Storyline;

import Core.*;
import java.util.*;

public class PlayerSelection {
    public static PlayerCharacter createPlayer() {
        Scanner scanner = new Scanner(System.in);
        int raceChoice = -1, classChoice = -1, choice;

        String name = "";

        // Race selection
        System.out.println("\n                                                         ▌║█║▌│║▌│║▌║▌█║ 𝐓𝐢𝐤𝐛𝐚𝐥𝐚𝐧𝐠 ▌│║▌║▌│║║▌█║▌║█");
        System.out.println("                   A tikbalang is a mythical, half-human, half-horse creature, known for its horse-like head and hooves, long limbs," +
                "\n                 and gifted with the ability to lead travelers astray in forests and mountains. Though often portrayed as a deceptive" +
                "\n                                        prankster or trickster, it can also be seen as a guardian of nature.\n");

        System.out.println("\n                                                          ▌║█║▌│║▌│║▌║▌█║ 𝐊𝐚𝐩𝐫𝐞 ▌│║▌║▌│║║▌█║▌║█");
        System.out.println("                   A kapre is a towering, tree-dwelling mythical creature. It is a tall, hairy, and muscular giant with dark skin and" +
                "\n               a strong smell, who enjoys smoking large cigars and getting drunk. Often portrayed as playful tricksters, they are known for " +
                "\n                 playing harmless pranks on people and causing them to get lost. Beware, though, for they can become dangerous if angered.\n");
        System.out.println("\n                                                       ▌║█║▌│║▌│║▌║▌█║ 𝐌𝐚𝐧𝐚𝐧𝐚𝐧𝐠𝐠𝐚𝐥 ▌│║▌║▌│║║▌█║▌║█");
        System.out.println("                         A manananggal is a vampire-like mythical creature. During the day, the manananggal disguises itself as a" +
                "\n                beautiful woman, while at night it separates its upper torso from the lower half of its body, sprouts wings, and prowls the" +
                "\n                  darkened skies in search of pregnant women so that it may feed on the unborn fetus growing inside the poor soul’s belly.\n\n");

        while (true) {
            try {
                System.out.println("                                                         ╔════════════════════════════════════╗");
                System.out.println("                                                         ║   -- LEGENDS OF THE SHADOWED --    ║");
                System.out.println("                                                         ║         >> REALM RACES <<          ║");
                System.out.println("                                                         ╠════════════════════════════════════╣");
                System.out.println("                                                         ║ Tikbalang   → HP 95  | Mana 80     ║");
                System.out.println("                                                         ║ Kapre       → HP 100 | Mana 70     ║");
                System.out.println("                                                         ║ Manananggal → HP 90  | Mana 100    ║");
                System.out.println("                                                         ╚════════════════════════════════════╝");
                System.out.println("                                                                  Choose your race:");
                Map<Integer, String> races = ClassMenu.getRaceOptions();
                for (Map.Entry<Integer, String> entry : races.entrySet()) {
                    System.out.printf("                                                                  [%d] %s\n", entry.getKey(), entry.getValue());
                }
                System.out.print("                                                                  You've chosen: ");
                raceChoice = Integer.parseInt(scanner.nextLine());
                System.out.println();
                if (!races.containsKey(raceChoice)) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("                                                 ❌ Invalid race choice. Please enter a valid number.\n");
            }
        }

        if (raceChoice == 1){
            System.out.println("\n                                                                       ++ Archer ++");
            System.out.println("                    Archers are the silent wind on the battlefield—swift, elusive, and deadly from afar. Trained in the art of trajectory " +
                    "\n              and terrain, they rain down judgment with feathered fury. Whether perched in the treetops or shadowing prey through the underbrush," +
                    "\n                                               the Archer is a master of distance, vision, and timing.\n");

            System.out.println("\n                                                                      ++ Spearman ++");
            System.out.println("                    Spearmen are the iron wall and piercing fang of any disciplined force. With unmatched reach and formation control, " +
                    "\n                 they hold lines, break ranks, and strike with relentless precision. Whether defending a fortress or charging into chaos, " +
                    "\n                                       the Spearman is the embodiment of martial order and battlefield dominance.\n");


        } else if (raceChoice == 2){
            System.out.println("\n                                                                       ++ Gunman ++");
            System.out.println("                  Gunmen are lone tacticians of the battlefield, wielding precision and firepower with deadly grace. Born from the fusion " +
                    "\n              of alchemy and engineering, their weapons speak louder than words. Whether dueling at dawn or sniping from shadowed rooftops, the" +
                    "\n                                                 Gunman thrives on accuracy, timing, and nerves of steel.\n");

            System.out.println("\n                                                                        ++ Druid ++");
            System.out.println("                   Druids are the living bridge between the mortal realm and the wild forces that shape it. Guardians of balance, they channel " +
                    "\n             the primal essence of forests, storms, and beasts. Whether healing allies with dew-born magic or unleashing vines to entangle foes, the " +
                    "\n                                                         Druid is the wrath of nature incarnate.\n");
        } else if (raceChoice == 3){
            System.out.println("\n                                                                       ++ Mage ++");
            System.out.println("                 Mages are scholars of the unseen, architects of reality’s threads. Through rigorous study and innate talent, they can bend " +
                    "\n             the laws of nature to their will. Whether hurling fireballs or rewriting fate with runes, the Mage is a master of raw magical power " +
                    "\n                                                              and strategic devastation.\n");

            System.out.println("\n                                                                      ++ Assassin ++");
            System.out.println("                      Assassins are the whisper before the scream, the blade in the dark. Masters of infiltration and precision, " +
                    "\n              they strike where it hurts most—then vanish without a trace. Whether hired by guilds or driven by vengeance, the Assassin is " +
                    "\n                                                    a ghost on the battlefield, feared and unseen.\n");
        }

        // Class selection
        while (true) {
            try {
                System.out.println("                                                        ╔══════════════════════════════════════╗");

                if (raceChoice == 1) {
                    System.out.println("                                                        ║        >> Tikbalang Classes <<       ║");
                    System.out.println("                                                        ╠══════════════════════════════════════╣");
                    System.out.println("                                                        ║ Archer    → +70 HP  | +85 Mana       ║");
                    System.out.println("                                                        ║ Spearman  → +90 HP  | +75 Mana       ║");
                } else if (raceChoice == 2) {
                    System.out.println("                                                        ║           >> Kapre Class <<          ║");
                    System.out.println("                                                        ╠══════════════════════════════════════╣");
                    System.out.println("                                                        ║ Gunman   → +80 HP  | +70 Mana        ║");
                    System.out.println("                                                        ║ Druid    → +100 HP | +85 Mana        ║");
                } else if (raceChoice == 3) {
                    System.out.println("                                                        ║        >> Manananggal Class <<       ║");
                    System.out.println("                                                        ╠══════════════════════════════════════╣");
                    System.out.println("                                                        ║ Mage    → +75 HP   | +100 Mana       ║");
                    System.out.println("                                                        ║ Assassin → +85 HP  | +80  Mana       ║");
                }

                System.out.println("                                                        ╚══════════════════════════════════════╝");
                System.out.println("                                                                  Choose your class:");
                Map<Integer, String> classes = ClassMenu.getClassOptionsForRace(raceChoice);
                for (Map.Entry<Integer, String> entry : classes.entrySet()) {
                    System.out.printf("                                                                  [%d] %s\n", entry.getKey(), entry.getValue());
                }
                System.out.print("                                                                  You've chosen: ");
                classChoice = Integer.parseInt(scanner.nextLine());
                System.out.println();
                if (!classes.containsKey(classChoice)) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("                                                 ❌ Invalid class choice. Please enter a valid number.\n");
            }
        }

        // Name input
        while (true) {
            try {
                System.out.print("                                                           Enter your character name: ");
                name = scanner.nextLine().trim();
                if (name.isEmpty()) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("                                                        ⚠️ Name cannot be empty. Try again.\n");
            }
        }
        //name confirmation (won't close loop until player is happy with the name)
        while (true) {
            System.out.println("                                                  ------------------------------------------------------");
            System.out.println("                                                     Hello, " + name + "! Are you satisfied with that name?");
            System.out.println("                                                  ------------------------------------------------------");
            System.out.println("                                                                  [1] Yes\n                                                                  [0] No, change it.");

            try {
                System.out.print("                                                                  You've chosen: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    break;
                } else if (choice == 0) {
                    System.out.println();
                    while (true) {
                        try {
                            System.out.print("                                                           Enter your character name: ");
                            name = scanner.nextLine().trim();
                            if (name.isEmpty()) throw new Exception();
                            break;
                        } catch (Exception e) {
                            System.out.println("                                                           ⚠️ Name cannot be empty. Try again.\n");
                        }
                    }
                } else {
                    System.out.println("                                                           ⚠️ Please enter only 1 or 0.\n");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("                                                   ⚠️ Invalid input. Please enter a number (1 or 0).\n");
                scanner.nextLine();
            }
        }

        PlayerCharacter player = CharacterBuilder.build(name, raceChoice, classChoice);
        player.displayStats();
        return player;
    }
}


