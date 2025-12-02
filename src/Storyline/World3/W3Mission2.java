package Storyline.World3;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.Scanner;

public class W3Mission2 {
    public static void w3mission2(PlayerCharacter player){
        Scanner sc = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("         MISSION 2: THE BABAYLANS BANE  ");
        System.out.println("================================================");
        System.out.println();
        System.out.println(player.name + ": Can I see it?");
        sc.nextLine();
        System.out.println("Kheila hands the scroll to you. You gently open the scroll, mindful of causing tears. Unfortunately, however careful you were, the scroll’s state was for the worse. The ink has faded, the surface marred by age and moisture. Most of the writing is smeared and lost in oblivion.\n" +
                           "But near the bottom, a single line remains legible, written in bold, deliberate strokes:\n" +
                           "“Seek the Origin of the Babaylans.”\n");
        sc.nextLine();
        System.out.println("Kheila: I’m sorry. The ink must have run when I crossed the river while running from my kin. It’s the only part I could save.\n");
        sc.nextLine();
        System.out.println("Andrea: You did what you had to. Surviving came first.\n");
        sc.nextLine();
        System.out.println(player.name + ": “Origin of the Babaylans…” What could it mean? Are we supposed to find where their power began?\n");
        sc.nextLine();
        System.out.println("Kheila: Impossible. Babaylans are not made, they are born. And the Mistress was born more powerful than any before her. Worse still, her strength continues to grow.\n");
        sc.nextLine();
        System.out.println("Andrea: What? Then how are we supposed to defeat her?\n");
        sc.nextLine();
        System.out.println(player.name + ": The weapon. We must find it at all costs.\n");
        sc.nextLine();
        System.out.println("Andrea: Right, we must figure out what this “Origin of Babaylans” means.\n");
        sc.nextLine();
        System.out.println("Kheila: There might be something at my hideout. I gathered evidence before I was captured: old tomes, relics, things the Babaylans tried to erase from history. If we can find something there, maybe we can decipher what the scroll means. I was supposed to gather more evidence today, but I got caught, and that’s how you found me.\n");
        sc.nextLine();
        System.out.println(player.name + ": Alright. Lead the way, Kheila.\n");
        sc.nextLine();
        System.out.println("[\tCongratulations! You’ve gained another friend! (\u2060 \u2060ꈍ\u2060ᴗ\u2060ꈍ\u2060)\t]"); //EMOTICON UNSURE IF IT WORKS
        System.out.println("[\t\tKheila joins you on your adventure!\t\t\t\t\t]");
        //removed 1 /t
        sc.nextLine();
        System.out.println("The three of you make your way through the forest as dusk deepens into night. The moon hangs pale and hollow over the canopy, its light bending through the mist like silk. After a long trek, you reach a secluded waterfall, its sound masking the outside world. Behind the veil of water lies a cave.");
        sc.nextLine();
        System.out.println("Inside, the hideout feels more like a hermit’s study than a fugitive’s den. Stacks of parchment cover every surface, their ink-stained edges curling with age. An oil lamp flickers faintly in the corner, painting the cavern walls in shades of amber and shadow.");
        sc.nextLine();
        System.out.println("Kheila immediately heads to the bed and falls as if collapsing. You can see that she was fatigued and wounded.");
        sc.nextLine();
        System.out.println("Kheila: Make yourself at home. I’ll just… just rest for a little bit…");
        sc.nextLine();
        System.out.println("Kheila dozes off as if fainting. You press your hand to her forehead. Her skin burns with fever. You quickly find a damp cloth and place it over her brow.");
        sc.nextLine();
        System.out.println("Andrea: She’s been through too much. We should rest for tonight and search for clues when daylight comes.");
        sc.nextLine();
        System.out.println(player.name + ": Agreed. We’ll take turns watching her. She risked her life to bring us this far. The least we can do is protect her while she recovers.");
        DialogueUtils.pause();
        player.rest();
        DialogueUtils.pause();
        System.out.println("Soft morning light filters through the waterfall curtain of the hideout. The sound of rushing water blends with the rustle of parchment as you and Andrea sift through Kheila’s notes.");
        sc.nextLine();
        System.out.println("Kheila, pale but awake, notices you looking for clues about the “Origin of Babaylans”. After a while of searching, you find a parchment that resembles the ancient scroll you had. Something inside you clicked into place. This is it, the clue you’ve been searching for.");
        sc.nextLine();
        System.out.println("Kheila: The scroll is not just a clue, it’s also a key. With the right seal, it can reveal the resting place of the Blade of Bulan. The weapon forged by the moon goddess to cut through corruption itself.");
        sc.nextLine();
        System.out.println("Andrea: A divine weapon. That’s what we’ve been looking for.");
        sc.nextLine();
        System.out.println("Kheila: But it’s hidden deep in Banwa-an Daan, the “First Settlement,” where the first Babaylan was born. No mortal leaves that place unchanged.");
        sc.nextLine();
        System.out.println(player.name + ": Then we’ll take the risk.");
        sc.nextLine();
        System.out.println("You and Andrea piece together fragments of ancient symbols scattered across the table. Among them, you find a pattern of moon phases, with one inverted.");
        sc.nextLine();
        System.out.println("Andrea: A lunar map, and this one’s upside down.");
        sc.nextLine();
        System.out.println(player.name + ": The inverted moon marks the entrance.");
        sc.nextLine();
        System.out.println("Kheila: Beneath the roots of an ancient Balete near the Valley of Mist. But beware, for the Blade’s guardian, the Tagapangalaga, demands a sacrifice.");
        sc.nextLine();
        System.out.println("Kheila: You must remember why you fight. Power without purpose will consume you, just like it consumed her.");
        DialogueUtils.pause();
    }
}
