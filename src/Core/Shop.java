package Core;

import java.util.*;

public class Shop {
    private static List<Item> items = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        items.add(new Item("Pet", 100, "Healer"));
        items.add(new Item("Armor Upgrade", 200, "Increases defense"));
        items.add(new Item("Mana Potion", 100, "idk what this does"));
        items.add(new Item("Shield", 75, "Increases defense"));
        items.add(new Item("Pet Food", 50, "Organic entrails fresh from the source :)")); //idk what this does either. pls edit nalang
    }

    public static void enterShop(PlayerCharacter player) {
        System.out.println("\n=== 🏪 Welcome to the Shop! ===\n");
        //System.out.println("You have " + player.getBarya() + " barya.\n");

        while (true) {
            System.out.println("Available items:");
            for (int i = 0; i < items.size(); i++) {
                System.out.println("[" + (i + 1) + "] " + items.get(i));
            }
            System.out.println("[0] Exit Shop");
            System.out.println("You have " + player.getBarya() + " barya.\n");
            System.out.print("Enter choice: ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("❌ Invalid input. Try again.\n");
                continue;
            }

            if (choice == 0) {
                System.out.println("You leave the shop.\n");
                break;
            }

            if (choice < 1 || choice > items.size()) {
                System.out.println("❌ Invalid choice. Try again.\n");
                continue;
            }

            Item item = items.get(choice - 1);
            if (player.getBarya() < item.getPrice()) {
                System.out.println("❌ You don’t have enough barya!\n");
            } else {
                player.setBarya(player.getBarya() - item.getPrice());
                player.addItem(item);
                System.out.println("✅ You purchased " + item.getName() + "!\n");
            }
        }
    }
}
