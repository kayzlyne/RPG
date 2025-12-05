package Storyline.World3;

import Core.*;
import Storyline.DialogueUtils;
import java.util.List;
import java.util.Scanner;

public class W3Mission4 {
    public static boolean w3mission4(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);

        System.out.println("  ============================================================================================================================================================");
        System.out.println("  ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░█░█░░░░░░░▀█▀░█░█░█▀▀░░░█▀▄░█░█░▀█▀░█▀█░█▀▀░░░█▀█░█▀▀░░░█▀▄░█▀█░█▀█░█░█░█▀█░░░░░█▀█░█▀█░░░█▀▄░█▀█░█▀█░█▀█░░░░▄▀░░▄▀ ");
        System.out.println("  ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░▀█░░▀░░░░░█░░█▀█░█▀▀░░░█▀▄░█░█░░█░░█░█░▀▀█░░░█░█░█▀▀░░░█▀▄░█▀█░█░█░█▄█░█▀█░▄▄▄░█▀█░█░█░░░█░█░█▀█░█▀█░█░█░░░▀▄░░▀▄░ ");
        System.out.println("  ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░░░▀░░▀░░░░░▀░░▀░▀░▀▀▀░░░▀░▀░▀▀▀░▀▀▀░▀░▀░▀▀▀░░░▀▀▀░▀░░░░░▀▀░░▀░▀░▀░▀░▀░▀░▀░▀░░░░░▀░▀░▀░▀░░░▀▀░░▀░▀░▀░▀░▀░▀░░░░░▀░░░▀ ");
        System.out.println("  ============================================================================================================================================================");
        System.out.println();
        sc.nextLine();
        System.out.println("The three of you descend the spiraling staircase beneath the Balete Tree.\nThe temperature drops with every step, your breath fogging in the pale light.");
        sc.nextLine();
        System.out.println("Andrea: This place… it feels alive.");
        sc.nextLine();
        System.out.println("Kheila: It is. The first Babaylans performed their rituals here. Every inch of this place remembers their power.");
        sc.nextLine();
        System.out.println("As you move through the ruins, strange runes flicker to life on the walls,\nseemingly reacting to your presence. You feel the absence of what you sacrificed earlier.\nThe cavern of your chest rings hollow, a dull emptiness where your essence once burned.");
        sc.nextLine();
        System.out.println("You reach a massive stone door, carved with the phases of the moon.\nThe final symbol, the inverted crescent from the scroll, pulses faintly.");
        sc.nextLine();
        System.out.println("Kheila: That’s it. The entrance to the inner sanctum.");
        sc.nextLine();
        System.out.println("Opening the ornate door, you walk into a grand hall where massive moonstone pillars\nencircle a raised altar. Upon it rests a blade glowing faintly silver: the Blade of Bulan.");
        sc.nextLine();
        System.out.println(player.name + ": There it is. The goddess’s weapon.");
        sc.nextLine();
        System.out.println("But before you can move closer, shadows stir at the edges of the chamber and Babaylan Sentinels emerge.\nTwisted humanoid figures cloaked in bone charms, their eyes glowing red with witchfire.");
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.BABAYLANS2, 3);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 3, false);
        if (!survived) {
            return false;
        }

        player.resetCooldowns();
        sc.nextLine();

        System.out.println("The battle is fierce, but the power of Mogul still flows through your veins.\n" +
                           "When the last guardian falls, silence returns, broken only by the faint hum of the Blade.");
        sc.nextLine();
        System.out.println("Andrea: They were protecting this.");
        sc.nextLine();
        System.out.println("Kheila: And for good reason. This is the only weapon that can stand a chance against the Mistress.");
        sc.nextLine();
        System.out.println("You step forward. The Blade of Bulan seems to breathe, silver light rippling across its edge." +
                           "As your hand touches the hilt, a surge of divine power courses through your arm, searing your veins with radiant energy.");
        sc.nextLine();
        System.out.println("[New Ability Unlocked – Moonstrike: Channels lunar energy to purify corrupted magic.]");
        sc.nextLine();
        System.out.println("The chamber trembles. The moonlight shifts, revealing a hidden compartment beneath the altar. Inside lies a charred, folded map.");
        sc.nextLine();
        System.out.println("You unfurl the ancient parchment. Strange runes and shifting lines mark a region deep within Mt. Kanatuan — the heart of the Babaylan fortress.");
        sc.nextLine();
        System.out.println("Kheila: This isn’t a map of Banwa-an Daan. This leads to their most guarded chamber- the Sanctum of Eclipse.\n" +
                           "Only the highest-ranked Babaylan is allowed access to it.");
        sc.nextLine();
        System.out.println("Andrea: Then that’s where the Mistress must be.");
        sc.nextLine();
        System.out.println("Kheila: And where all their power converges.");
        sc.nextLine();
        System.out.println(player.name + ": It's where we must go to end this once and for all.");
        sc.nextLine();
        System.out.println("Exhausted but determined, the three of you pause to take a breather and come up with a plan.");

        DialogueUtils.pause();
        player.rest();
        DialogueUtils.pause();

        System.out.println("You move to set out for the Sanctum of the Eclipse, and Kheila's voice rings in the quiet.");
        sc.nextLine();

        System.out.println("Kheila: Be warned, for this isn’t just another temple.\n" +
                           "It’s where the boundaries between Mogul, the mortal world, and Biringan City begin to blur.");

        return true;
    }
}
