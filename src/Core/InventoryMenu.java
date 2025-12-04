package Core;

import java.util.*;

public class InventoryMenu {
    private static Scanner scanner = new Scanner(System.in);

    public static void open(PlayerCharacter player) {
        List<Item> inv = player.getInventory();

        if (inv.isEmpty()) {
            System.out.print("                                                   ┏━───────────────────────────────────────────━┓");
            System.out.print("\n                                                            ++ You inventory is empty. ++\n");
            System.out.println("                                                   ┗━───────────────────────────────────────────━┛");
            return;
        }

        while (true) {
            System.out.println("\n=== 🎒 Inventory ===");
            for (int i = 0; i < inv.size(); i++) {
                System.out.println("[" + (i + 1) + "] " + inv.get(i).getName());
            }
            System.out.println("[0] Exit");
            System.out.print("Choose an item to use: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input.");
                continue;
            }

            if (choice == 0) break;
            if (choice < 1 || choice > inv.size()) {
                System.out.println("Invalid choice.");
                continue;
            }

            Item selected = inv.get(choice - 1);
            player.useItem(selected);
            break;
        }
    }
}
