package Storyline.World3;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.Scanner;

public class W3Mission1P2 {
    public static void w3mission1p2(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);
        if (player.isAlive()) {
            System.out.println("After the tedious fight with the tiyanak, you and Andrea sit by the side of a stream to recuperate and recover your energy.\nBut after only a few minutes, your peaceful respite is interrupted by the sound of footsteps from a distance.\n");
            System.out.println("???: Over there!!! Spread out and search the area. That traitor couldn't have gone far.\n");
            System.out.println("Before they can come any closer, you and Andrea move to take cover in a secluded area behind some thick bushes.\nSimultaneously, you and Andrea still your breaths when you hear footsteps stop right in front of your hiding place.\n");
            System.out.println("???: What will we do with Kheila when we find her, Commander?\n");
            System.out.println("Commander: Don't even say that name in front of me.\n");
            System.out.println("Commander: Trashy lowlife sympathiser! She will be brought to her knees in front of the mistress and executed for her crimes.\n");
            System.out.println("???: Commander, we've found some tracks heading south.\n");
            System.out.println("Commander: Alright, move out. We must catch that traitor!\n");
            System.out.println("You wait for a few more minutes after they leave before getting out of your hiding place.\n");
            System.out.println("Andrea: Those were Babaylans. They said they were looking for a traitor.\nDo you think we should look for whoever that Kheila is and ask for her help?\nShe might have some information against the Babaylans.\n");
            System.out.println(player.name + ": Let’s go. It’s definitely worth a try.\n");
            System.out.println("You follow the tracks of deep footprints, broken branches,\nand streaks of blood winding down a narrow path into the lower forest.\nThe air grows dense with mist, and the once-cheerful songs of birds fade into silence.\n");
            System.out.println("After several minutes, you spot flickering lights ahead—a camp.\n");
            System.out.println("You crouch behind a fallen log. In the clearing, several Babaylans circle a campfire.\nBound and gagged near the flames sits a woman with matted hair and bruised wrists.\n");
            System.out.println("Andrea: That must be her… Kheila.\n");
            System.out.println("Commander: Tighten her bonds! The Mistress will be pleased once we drag this traitor back to the altar.\n");

            System.out.println("MISSION CHOICE");
            System.out.println("[Press 1] Create a distraction while Andrea frees Kheila");
            System.out.println("[Press 2] Stealth attack the Babaylans before they notice you");
            //System.out.println("#1 Create a distraction while Andrea frees Kheila or #2 Stealth attack the Babaylans before they notice you");
            int choice = sc.nextInt();

            if (choice == 1){
                System.out.println("You throw a stone to the far side of the camp. A few Babaylans turn to investigate the noise. Andrea slips through the shadows toward Kheila, cutting the ropes binding her wrists.");
            } else if (choice == 2){
                System.out.println("You and Andrea move in silently, striking fast. The nearest Babaylan falls before he can even shout. Kheila’s eyes widen in shock as Andrea slices through her bindings.");
            }

            System.out.println("Commander: Intruders! Stop them!\n");
            //Player fights 4 Babaylans
            if (player.isAlive()) {
                System.out.println("You and Andrea finish off the last of the enemies. The remaining Babaylans scatter into the forest.\n");
                System.out.println("You kneel beside the rescued woman. She’s breathing heavily, clutching at her raw wrists.\n");
                System.out.println(player.name + ": You’re safe now. You’re Kheila, right?\n");
                System.out.println("Kheila: I.. I thought I was done for. Thank you. I don’t know who you are, but the Babaylans will hunt you for this.\n");
                System.out.println("Andrea: Let them. We’re looking for them anyway. Why were they after you?\n");
                System.out.println("Kheila: I was one of them. I helped with their rituals until I learned what they were truly planning.\n" +
                        "They want to merge the powers of Mogul and the mortal world so they can make\nthe Babaylan Mistress the ruler of Biringan City and control all the powers and riches it has to offer.\nI tried to warn the others, but they called me a traitor.\n");
                System.out.println(player.name + ": Tria mentioned something. A “Babaylan’s plan.” So it’s true, then?\n");
                System.out.println("Kheila: Yes, but all is not lost. I stole this from their leader before I ran away.\n");
                System.out.println("Kheila reaches into her tattered cloak and pulls out a worn, ancient scroll, its edges blackened as if burned.\n");
                System.out.println("Kheila: This contains a clue to find the Babaylan’s best-kept secret:\na weapon that has the power to destroy even the strongest of them all.\n");

            } else {
                System.out.println("Skill issue. Please try again.");
            }
        } else {
            System.out.println("Skill issue. Please try again.");
        }
        DialogueUtils.pause();
    }
}
