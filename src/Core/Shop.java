package Core;

import Storyline.DialogueUtils;

import java.util.*;

public class Shop {
    private static List<Item> items = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        /*items.add(new Item("Pet", 100, "Your life companion who loves you so much and heals you after every round during battles"));
        items.add(new Item("Armor Upgrade", 200, "Increases defense by 2/3/5"));
        items.add(new Item("Mana Potion", 100, "Regenerates mana to full"));
        items.add(new Item("Shield", 75, "Increases defense"));
        items.add(new Item("Pet Food", 50, "Organic entrails fresh from the source :) Increases pet's healing power")); */

        items.add(new Item("Mana Potion", 75, "Regenerates mana to full", ItemType.MANA));
        items.add(new Item("Health Potion", 75, "Regenerates HP to full", ItemType.HEALTH));
        items.add(new Item("Armor Upgrade", 125, "Increases defense by 2/3/5", ItemType.ARMOR_UPGRADE));
        items.add(new Item("Pet", 100, "A loyal companion who heals after battle.", ItemType.PET));
        items.add(new Item("Pet Food", 50, "Increases pet's healing power", ItemType.PET_FOOD));

    }

    public static void enterShop(PlayerCharacter player) {
        System.out.println("                                              ┃  ┃┃┃┏━┛┃  ┏━┛┏━┃┏┏ ┏━┛  ━┏┛┏━┃  ━┏┛┃ ┃┏━┛  ┏━┛┃ ┃┏━┃┏━┃  ┃");
        System.out.println("                                              ┛  ┃┃┃┏━┛┃  ┃  ┃ ┃┃┃┃┏━┛   ┃ ┃ ┃   ┃ ┏━┃┏━┛  ━━┃┏━┃┃ ┃┏━┛  ┛");
        System.out.println("                                              ┛  ━━┛━━┛━━┛━━┛━━┛┛┛┛━━┛   ┛ ━━┛   ┛ ┛ ┛━━┛  ━━┛┛ ┛━━┛┛    ┛");

        while (true) {
            System.out.print("                                                   ┏━───────────────────────────────────────────━┓");
            System.out.print("\n                                                               >> You have " + player.getBarya() + " barya.\n");
            System.out.println("                                                   ┗━───────────────────────────────────────────━┛");

            System.out.println("                                              Available items:");
            for (int i = 0; i < items.size(); i++) {
                System.out.println("                                                  [" + (i + 1) + "] " + items.get(i));
            }
            System.out.println("                                                  [0] Exit Shop");
           // System.out.println("                                                  You have " + player.getBarya() + " barya.\n");
            System.out.print("                                                                  Enter choice: ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("                                                            ❌ Invalid input. Try again.\n");
                continue;
            }

            if (choice == 0) {
                System.out.println("                                                             >> You leave the shop. <<\n");
                break;
            }

            if (choice < 1 || choice > items.size()) {
                System.out.println("                                                            ❌ Invalid choice. Try again.\n");
                continue;
            }

            Item item = items.get(choice - 1);
            if (player.getBarya() < item.getPrice()) {
                System.out.println("                                                            ❌ You don’t have enough barya!\n");

            } else if (item.getName().equals("Pet")) {
                if (!player.hasPet()) {
                    player.setBarya(player.getBarya() - item.getPrice());
                    //addItem(item);
                    player.setPet(new Pet(5)); // starting heal = 5 HP
                    System.out.println("\n                                                     [ ✧\u2060◝\u2060(\u2060⁰\u2060▿\u2060⁰\u2060)\u2060◜\u2060✧ A loyal companion joins you! ]\n");
                } else {
                    System.out.println("                                                                 You already have a pet!\n");
                }
            } else if (item.getName().equals("Pet Food")) {


                if (player.getPetFoodUsed() >= 4) {
                    System.out.println("                                            ❌ Your pet cannot eat more Pet Food! (Max 4 upgrades reached)\n");
                    continue;
                }

                if (player.hasPet()) {
                    player.setBarya(player.getBarya() - item.getPrice());
                    //player.addItem(item);
                    player.getPet().increaseHealingPower(5);
                    player.incrementPetFoodUsed();
                    System.out.println("                                       🍖 Great! Your pet's healing power has increased by 5! (" + player.getPetFoodUsed() + "/4)\n");
                } else {
                    System.out.println("                                                                You don't have a pet yet!\n");
                }
            } else if (item.getName().equals("Armor Upgrade")){
                player.setBarya(player.getBarya() - item.getPrice());
                //player.addItem(item);
                player.buyArmor();
            } else {
                player.setBarya(player.getBarya() - item.getPrice());
                player.addItem(item);
                System.out.println("                                                          ✅ You purchased " + item.getName() + "!\n");
            }
        }
    }
}
