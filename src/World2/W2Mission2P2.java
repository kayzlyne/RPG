package World2;

import Core.PlayerCharacter;
import java.util.Scanner;

public class W2Mission2P2 {
    public static void w2mission2p2(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);

        System.out.println("With one final strike, you drive the creature back. The Aswang lets out a keening howl before collapsing. Its body twists and contorts one last time, then dissolves into the black waters of the marsh.\n");
        scan.nextLine();
        System.out.println("The silence after the Aswang’s defeat lingers like a festering wound. Andrea leans against the boulder, her breath steady but weak, her eyes barely open. You feel relief wash over you, but it’s cut short by the Tambalan’s voice.\n");
        scan.nextLine();
        System.out.println("Tambalan: Saving her life was only the first step. If you intend for your friend to survive Mogul, she cannot face it unarmed.\n");
        scan.nextLine();
        System.out.println("You glance at Andrea. Even in her state, you know she won’t accept being left behind. Her will is iron, but her body is failing.\n");
        scan.nextLine();
        System.out.println(player.name + ": Then tell me. How do we arm her?\n");
        scan.nextLine();
        System.out.println("Tambalan: There is only one weapon fit for her hands, forged not of mortal steel but of Mogul’s own essence. My friend, a Pandai, guards it still. But he does not give freely.\n");
        scan.nextLine();
        System.out.println("The Tambalan’s eyes narrow, the wrinkles on his face tightening like carved stone.\n");
        scan.nextLine();
        System.out.println("Tambalan: Find him, and convince him. Only then will Andrea wield a weapon strong enough to cut through Mogul’s nightmares.\n");
        scan.nextLine();
        System.out.println("Andrea forces herself to sit up, wincing in pain.\n");
        scan.nextLine();
        System.out.println("Andrea: Don’t… don’t go alone. I’ll catch up… once I can stand.\n");
        scan.nextLine();
        System.out.println("You nod, tightening your grip on your weapon before setting out.\n");
        scan.nextLine();
        System.out.println("[\t\t\t\t\t\t\t\t\t]");
        System.out.println("[\tCongratulations! You’re no longer friendless! (\u2060 \u2060ꈍ\u2060ᴗ\u2060ꈍ\u2060)\t\t]");
        System.out.println("[\tAndrea joins you on your adventure!\t\t\t\t]");
        System.out.println("[\t\t\t\t\t\t\t\t\t]\n\n");
        System.out.print(">> Press ENTER to continue...");
        scan.nextLine();
    }
}
