package Core;
import java.util.*;
import Storyline.BeggarEvent;

public class BattleManager {
    Scanner scanner = new Scanner(System.in);

    public boolean startBattle(PlayerCharacter player, List<Enemy> enemies, int currentWorld) {

        //Insert new lines and arrange outputs
        //Add item inventory, too (potion in inventory

        System.out.println("⚔️ Battle Begins!");

        while (player.isAlive() && !enemies.isEmpty()) {
            System.out.println("\n🧍 Your HP: " + player.hp + " | Mana: " + player.mana);
            System.out.println("\n👹 Enemies:");
            for (int i = 0; i < enemies.size(); i++) {
                Enemy e = enemies.get(i);
                System.out.printf("[%d] %s - HP: %d\n", i, e.name, e.hp);
            }

            int targetIndex;
            while (true) {
                try {
                    System.out.print("🎯 Choose target index: ");
                    targetIndex = scanner.nextInt();
                    if (targetIndex < 0 || targetIndex >= enemies.size()) {
                        System.out.println("Invalid target. Try again.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Invalid target index or target is already defeated.");
                } catch (InputMismatchException e) {
                    System.out.println("Please input a valid index.");
                    scanner.nextLine();
                }
            }
            Enemy target = enemies.get(targetIndex);

            int action = 0;
            boolean validInput = false;

            while (!validInput) {
                System.out.print("\n⚡ Choose action:\n[1] Basic Attack\n[2] Skill\n[3] Special Skill: ");
                try {
                    System.out.print("\nYou've chosen to use: ");
                    action = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();

                    if (action < 1 || action > 3) {
                        System.out.println("❌ Invalid choice. Please enter a number between 1 and 3.");
                    } else {
                        validInput = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("❌ Invalid input. Please enter a number.");
                    scanner.nextLine();
                }
            }

            if (action == 1) {
                player.dealDamage(target);
            } else if (action == 2) {
                player.useSkill(target);
            } else {
                player.useSpecial(target);
            }

            if (!target.isAlive()) {
                System.out.println("💀 " + target.name + " is defeated!\n");
                enemies.remove(targetIndex);
            }

            // Pet heals the player after each enemy is defeated
            player.petHeal();


            for (Enemy enemy : enemies) {
                if (enemy.isAlive()) {
                    enemy.dealDamage(player);
                }
            }

            player.reduceCooldowns();
            player.regenerateMana();

            if (!player.isAlive()) {
                System.out.println("💀 You were defeated...");

                // Attempt to trigger Sir Khai rescue
                boolean rescued = BeggarEvent.trigger(player, currentWorld);

                if (rescued) {
                    System.out.println("\n✨ Sir Khai has saved you! You live to fight another day!");

                    //Insert small Sir khai interaction
                    continue;
                } else {

                    System.out.println("\n☠️ Your journey ends here...");
                    System.out.println("🔚 Game Over");
                    return false;
                }
            }
        }

        if (player.isAlive()) {
            System.out.println("🎉" + player.name + " defeated all enemies!");
        }


        return true;
    }
}


