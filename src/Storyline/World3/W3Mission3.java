package Storyline.World3;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class W3Mission3 {
    public static void w3mission3(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        System.out.println("================================================");
        System.out.println("     MISSION 3: A BARGAIN AT THE BORDER  ");
        System.out.println("================================================");
        System.out.println();
        System.out.println("The three of you trek through the Valley of Mist, where moonlight clings to the fog like silk. Eventually, you reach a colossal Balete tree, its roots twisting into the ground like an ancient cage.\n");

        System.out.println("Kheila: This is it. We’re at the gateway.\n");
        sc.nextLine();
        System.out.println("Andrea: Are you sure this is the place?\n");
        sc.nextLine();
        System.out.println("Kheila: There’s no doubt. The scroll’s markings all point here.\nThe entrance to Banwa-an Daan lies beneath the roots of the Balete. But we must earn the tree’s permission first.\n");
        sc.nextLine();
        System.out.println("You press forward until the mist parts, revealing a massive Balete tree \n— ancient, monstrous, its roots writhing like petrified serpents.\nThe air grows cold. From the shadows, a figure begins to form.\nA woman in a tattered and bloodied white dress floats forward,\nher hair cascading down to the ground, face veiled in gloom.\n");
        sc.nextLine();
        System.out.println("Andrea: Stay behind me.\n");
        sc.nextLine();
        System.out.println("Kheila: No, wait. I know who she is. The White Lady of Balete Drive. The Tagapangalaga.\n");
        sc.nextLine();
        System.out.println("The spirit drifts closer, her voice echoing like wind through hollow glass.\n");
        sc.nextLine();
        System.out.println("White Lady: Another has come seeking the Blade of Bulan – the goddess’s sorrow given form.\n");
        sc.nextLine();
        System.out.println(player.name + ": We seek it to stop the Mistress of the Babaylans. Her power grows stronger every day.\n");
        sc.nextLine();
        System.out.println("The White Lady tilts her head, almost pityingly.\n");
        sc.nextLine();
        System.out.println("White Lady: Power always calls to power. But the goddess does not give without taking.\n");
        sc.nextLine();
        System.out.println("She circles you, her presence freezing the air around your body.\n");
        sc.nextLine();
        System.out.println("White Lady: The Diwata cannot wield the blade, for she is already bonded to a weapon,\nand the Babaylan cannot use it, for she is forbidden from raising that blade against her own kind.\nIt must be you, child of dusk. You are not human, yet your heart still beats with choice.\nTo open the path, you must surrender what binds you to the material world.\n");
        sc.nextLine();
        System.out.println("Andrea: What does that mean?\n");
        sc.nextLine();
        System.out.println("White Lady: Mortals cling to possessions — wealth, armor, safety. To walk the moon’s road, you must surrender what protects you in this world.\n");
        sc.nextLine();
        System.out.println("The White Lady stops before you, her eyes two pale orbs of light.\n");
        sc.nextLine();
        System.out.println("White Lady: Decide, child of dusk. What will you give to walk in the goddess’s light?\n");
        sc.nextLine();

        // !!! NEEDS ADJUSTMENT AND IMPLEMENTATION
        System.out.println("[Press 1] You lose all the barya you’ve earned so far.\n" +
                "[Press 2] You lose all armor upgrades.\n");

        while (true){
            try {
                System.out.print("You've chosen: ");
                choice = sc.nextInt();
                System.out.println();

                if (choice == 1){
                    System.out.println("White Lady: Prosperity binds the spirit to comfort. You have released it, and so I shall let you pass.\n");
                    player.setBarya(0);
                    System.out.println("🏦 Total barya: " + player.getBarya());
                    break;
                } else if (choice == 2){
                    System.out.println("White Lady: Your material armor was a promise of protection to your body, but now the moon shall shield your soul instead.\n");
                    int armor = player.getArmorLevel();
                    if (armor == 0){
                        player.setDefense(5);
                    } else if (armor == 1){
                        player.setDefense(player.getDefense() - 2);
                    } else if (armor == 2){
                        player.setDefense(player.getDefense() - 5);
                    } else if (armor == 3){
                        player.setDefense(player.getDefense() - 10);
                    } else {
                        player.setDefense(7);
                    }
                    break;
                } else {
                    System.out.println("⚠️ Invalid choice! Please try again.\n");
                }
            } catch (InputMismatchException e){
                System.out.println("❌ Invalid input! Please try again.\n");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("⚠️ An unexpected error occurred: " + e.getMessage());
                sc.nextLine();
            }
        }

        System.out.println("The ground trembles as the Balete’s roots part, revealing a spiral staircase of stone leading downward, glowing faintly in silver light.\n");
        sc.nextLine();
        System.out.println("White Lady: The path opens only to those who understand loss. Step carefully, for the moon remembers all who bleed for its light.");
        sc.nextLine();
        System.out.println("She disappears into the mist, leaving only the echo of her final words.");
        sc.nextLine();
        System.out.println("Andrea: Well, that was terrifying.");
        sc.nextLine();
        System.out.println("Kheila: The way is open now. Banwa-an Daan awaits below.");
        sc.nextLine();
        DialogueUtils.pause();
    }
}
