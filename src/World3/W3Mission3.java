package World3;

import Core.PlayerCharacter;
import java.util.Scanner;

public class W3Mission3 {
    public static void w3mission3(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("     MISSION 3: A BARGAIN AT THE BORDER  ");
        System.out.println("================================================");
        System.out.println();
        System.out.println("The three of you trek through the Valley of Mist, where moonlight clings to the fog like silk. Eventually, you reach a colossal Balete tree, its roots twisting into the ground like an ancient cage.");
        System.out.println("Kheila: This is it. We’re at the gateway.");
        System.out.println("Andrea: Are you sure this is the place?");
        System.out.println("Kheila: There’s no doubt. The scroll’s markings all point here. The entrance to Banwa-an Daan lies beneath the roots of the Balete. But we must earn the tree’s permission first.");
        System.out.println("You press forward until the mist parts, revealing a massive Balete tree — ancient, monstrous, its roots writhing like petrified serpents. The air grows cold. From the shadows, a figure begins to form. A woman in a tattered and bloodied white dress floats forward, her hair cascading down to the ground, face veiled in gloom.");
        System.out.println("Andrea: Stay behind me.");
        System.out.println("Kheila: No, wait. I know who she is. The White Lady of Balete Drive. The Tagapangalaga.");
        System.out.println("The spirit drifts closer, her voice echoing like wind through hollow glass.");
        System.out.println("White Lady: Another has come seeking the Blade of Bulan – the goddess’s sorrow given form.");
        System.out.println(player.name + ": We seek it to stop the Mistress of the Babaylans. Her power grows stronger every day.");
        System.out.println("The White Lady tilts her head, almost pityingly.");
        System.out.println("White Lady: Power always calls to power. But the goddess does not give without taking.");
        System.out.println("She circles you, her presence freezing the air around your body.");
        System.out.println("White Lady: The Diwata cannot wield the blade, for she is already bonded to a weapon, and the Babaylan cannot use it, for she is forbidden from raising that blade against her own kind. It must be you, child of dusk. You are not human, yet your heart still beats with choice. To open the path, you must surrender what binds you to your true nature.");
        System.out.println("Andrea: What does that mean?");
        System.out.println("White Lady: Each soul bears an essence — strength, freedom, cunning, or desire. It is your anchor to what you are. Give it up, and the moonlight will reveal the way.");
        System.out.println("Kheila: That’s what she meant in the scroll… “The sacrifice of truth.” Your essence is who you are. Without it, you’ll never be the same.");
        System.out.println("The White Lady stops before you, her eyes two pale orbs of light.");
        System.out.println("White Lady: Decide, child of dusk. What will you give to walk in the goddess’s light?");
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

        System.out.println(">> Press ENTER to continue...");
        sc.nextLine();
    }
}
