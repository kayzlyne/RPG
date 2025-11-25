package Storyline.World3;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class W3Mission5 {
    public static void w3mission5(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);

        int choice;
        System.out.println("================================================");
        System.out.println("       MISSION 5: THE MAZE OF ECLIPSE  ");
        System.out.println("================================================");
        System.out.println();
        System.out.println("The moonlight filters through cracks in the roots above, painting silver streaks across the cave floor.\n" +
                "The air feels alive. It is breathing, whispering, remembering.\n");
        System.out.println("You step through the threshold, and the world falls silent. The air grows cold, thick with the scent of\n" +
                "damp soil and iron. The walls are made of the twisting roots of the Balete Tree, pulsing faintly like veins\n" +
                "running through a living entity.\n");
        System.out.println("You press forward. Every corridor bends in strange, impossible ways. Paths you’ve taken seem to vanish \n" +
                "behind you and bulging ancient eyes open from their slumber as you pass.You realize something as the walls close\n" +
                "in around you: this place means to swallow you whole.\n");
        sc.nextLine();
        System.out.println("Section 1: The Ghastly Path\n"); //changed Whispering Path to Ghastly Path, change if need be
        sc.nextLine();
        System.out.println("As you step deeper, voices echo around you. Some sound like lost loved ones, while others sound like the\n" +
                "vengeful screams of enemies you’ve slain.\n");

        sc.nextLine();
        System.out.println("[Press 1] Follow the voices.\n[Press 2] Ignore them and keep going.\n");

        while (true) {
            try {
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("You see your past painful memories until Kheila snaps you out of it.\n");
                    sc.nextLine();
                    System.out.println("Kheila: Don’t listen! The maze feeds on regret!\n");
                    sc.nextLine();
                    System.out.println("(You lose time, but gain awareness of illusions.)\n");
                    break;
                } else if (choice == 2) {
                    System.out.println("The whispers fade. You find a faint trail of glowing dust that marks the safe path.\n");
                    sc.nextLine();
                    break;
                } else {
                    System.out.println("⚠️ Invalid choice. Try again.\n");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
            } catch (InputMismatchException e) {
                System.out.println("Please input a valid number (1 or 2).");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("⚠️ An unexpected error occurred: " + e.getMessage());
                sc.nextLine();
            }
        }

        System.out.println("Section 2: The Split Passage\n");
        System.out.println("Three tunnels stretch ahead, each marked with symbols carved into the stone: a moon, a sun, and a star.\n");
        System.out.println("[Press 1] Enter the Moon path.");
        System.out.println("[Press 2] Enter the Sun path.");
        System.out.println("[Press 3] Enter the Star path.");

        while (true) {
            try {
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Moon Path: The Blade of Bulan hums and glows faintly. You’re on the right path.\n");
                    break;
                } else if (choice == 2) {
                    System.out.println("Sun Path: The walls begin to burn with light. You retreat.\n");
                    break;
                } else if (choice == 3) {
                    System.out.println("Star Path: The tunnel collapses behind you. You barely escape.\n");
                    break;
                } else {
                    System.out.println("⚠️ Invalid choice. Please enter 1, 2, or 3.\n");
                }

            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please enter a number (1, 2, or 3).\n");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("⚠️ An unexpected error occurred: " + e.getMessage());
                sc.nextLine();
            }
        }

        System.out.println("Section 3: The Door of Sacrifice\n");
        sc.nextLine();
        System.out.println("At the heart of the maze stands a massive stone door carved with lunar sigils.\n" +
                "A ghostly figure materializes before you. The White Lady of Balete Drive, her form both sorrowful and radiant.\n");
        sc.nextLine();
        System.out.println("White Lady: So you have come for the Blade’s final purpose, but every light demands a shadow.\n");
        sc.nextLine();
        System.out.println(player.name + ": We’ve come this far. Tell us what must be done.\n");
        sc.nextLine();
        System.out.println("White Lady: The door opens only to one who understands sacrifice. Not of spirit, not of pride – but of the body that carries your will.\n");
        sc.nextLine();
        System.out.println("Andrea steps forward, alarmed.\n");
        sc.nextLine();
        System.out.println("Andrea: What do you mean? What kind of sacrifice?\n");
        sc.nextLine();
        System.out.println("White Lady: To cross this threshold, you must surrender half of what sustains you. Either your life-force or the moon-forged mana that fuels your power.\n");
        sc.nextLine();
        System.out.println("Kheila’s voice trembles.\n");
        sc.nextLine();
        System.out.println("Kheila: Half? That’s– that’s irreversible.\n");
        sc.nextLine();
        System.out.println("White Lady: Strength and magic shape every path you have walked. Choose which burden you will lighten, and which wound you will carry forward.\n");
        sc.nextLine();

        System.out.println("[Press 1] Sacrifice half of your current hp. Your vitality withers.");
        System.out.println("[Press 2] Sacrifice half of your current mana. Your magical core dims.");

        while (true){
            try {
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                if (choice == 1) {
                    player.setHp(player.getHp() / 2);
                    System.out.println("White Lady: Your life-force narrows to a fragile thread… yet the moon often favors the desperate.");
                    break;
                } else if (choice == 2) {
                    player.setMana(player.getMana() / 2);
                    System.out.println(" White Lady: Power wanes, but resolve sharpens. The moon tests those who rely not on spells, but on will.");
                    break;
                } else {
                    System.out.println("⚠️ Invalid choice. Please enter 1 or 2 only.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please enter a number (1 or 2).\n");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("⚠️ An unexpected error occurred: " + e.getMessage());
                sc.nextLine();
            }
        }

        System.out.println("The Blade of Bulan glows, absorbing the essence of what was sacrificed and locking it into its lunar steel.\n");
        sc.nextLine();
        System.out.println("White Lady: You have chosen well. The Blade now mirrors your truth. Go, bearer of the moon’s will.\n");
        sc.nextLine();
        System.out.println("The stone door trembles and splits open, revealing a stairway bathed in cold blue light.\n");
        sc.nextLine();
        System.out.println("Andrea: That must be it. The Mistress’s Lair.\n");
        sc.nextLine();
        System.out.println("Kheila: Be ready. What waits beyond that door is not just Erika, the Mistress, but everything she believes in.\n");
        DialogueUtils.pause();
    }
}
