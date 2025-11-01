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

            System.out.print("🎯 Choose target index: ");
            int targetIndex = scanner.nextInt();
            if (targetIndex < 0 || targetIndex >= enemies.size()) {
                System.out.println("Invalid target. Turn skipped.");
                continue;
            }

            Enemy target = enemies.get(targetIndex);

            System.out.print("⚡ Choose action: [1] Basic Attack [2] Skill [3] Special: ");
            int action = scanner.nextInt();

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


