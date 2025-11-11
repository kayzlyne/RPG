package Storyline.World3;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.Scanner;

public class W3Mission3 {
    public static void w3mission3(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);

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
        System.out.println("White Lady: The Diwata cannot wield the blade, for she is already bonded to a weapon,\nand the Babaylan cannot use it, for she is forbidden from raising that blade against her own kind.\nIt must be you, child of dusk. You are not human, yet your heart still beats with choice.\nTo open the path, you must surrender what binds you to your true nature.\n");
        sc.nextLine();
        System.out.println("Andrea: What does that mean?\n");
        sc.nextLine();
        System.out.println("White Lady: Each soul bears an essence — strength, freedom, cunning, or desire.\nIt is your anchor to what you are. Give it up, and the moonlight will reveal the way.\n");
        sc.nextLine();
        System.out.println("Kheila: That’s what she meant in the scroll… “The sacrifice of truth.”\nYour essence is who you are. Without it, you’ll never be the same.\n");
        sc.nextLine();
        System.out.println("The White Lady stops before you, her eyes two pale orbs of light.\n");
        sc.nextLine();
        System.out.println("White Lady: Decide, child of dusk. What will you give to walk in the goddess’s light?\n");
        sc.nextLine();

        // !!! NEEDS ADJUSTMENT AND IMPLEMENTATION
        System.out.println("Gameplay Choice: The Sacrifice of Self");

        System.out.println("Depending on your mythical race, the player must choose one essence to give up:");
        //if KAPRE, result; if TIKBALANG, result; if MANANGGAL, result;

        System.out.println("White Lady whispers: No longer shall you soar above the world. Instead, you will move within its silence.");

        System.out.println("After the choice is made:");

        System.out.println("The White Lady extends her hand. A pale light flows from your chest into her palm. You feel your essence torn away, leaving a hole in your heart.");

        System.out.println("The ground trembles as the Balete’s roots part, revealing a spiral staircase of stone leading downward, glowing faintly in silver light.");

        System.out.println("White Lady: The path opens only to those who understand loss. Step carefully, for the moon remembers all who bleed for its light.");

        System.out.println("She disappears into the mist, leaving only the echo of her final words.");

        System.out.println("Andrea: Well, that was terrifying.");

        System.out.println("Kheila: The way is open now. Banwa-an Daan awaits below.");

        DialogueUtils.pause();
    }
}
