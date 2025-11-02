package Core;
import java.util.*;

public class BattleManager {
    Scanner scanner = new Scanner(System.in);

    public void startBattle(PlayerCharacter player, List<Enemy> enemies) {
        System.out.println("⚔️ Battle Begins!");

        while (player.isAlive() && !enemies.isEmpty()) {
            System.out.println("\n🧍 Your HP: " + player.hp + " | Mana: " + player.mana);
            System.out.println("👹 Enemies:");
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
                }
            }
            Enemy target = enemies.get(targetIndex);

            int action = 0;
            boolean validInput = false;

            while (!validInput) {
                System.out.print("⚡ Choose action: [1] Basic Attack [2] Skill [3] Special: ");
                try {
                    action = scanner.nextInt();
                    scanner.nextLine(); // consume leftover newline

                    if (action < 1 || action > 3) {
                        System.out.println("❌ Invalid choice. Please enter a number between 1 and 3.");
                    } else {
                        validInput = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("❌ Invalid input. Please enter a number.");
                    scanner.nextLine(); // clear the invalid input
                }
            }

            if (action == 1) {
                int dmg = player.dealDamage(target);
                System.out.println("You deal " + dmg + " damage to " + target.name + "!");
            } else if (action == 2) {
                player.useSkill(target);
            } else {
                player.useSpecial(target);
            }

            if (!target.isAlive()) {
                System.out.println("💀 " + target.name + " is defeated!");
                enemies.remove(targetIndex);
            }

            for (Enemy enemy : enemies) {
                if (enemy.isAlive()) {
                    enemy.dealDamage(player);
                }
            }

            player.reduceCooldowns();
            player.regenerateMana();

            if (!player.isAlive()) {
                System.out.println("💀 You were defeated...");
            }
        }

        if (player.isAlive()) {
            System.out.println("🎉" + player.name + " defeated all enemies!");
        }
    }
}


