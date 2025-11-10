package Storyline.World3;

import Core.*;
import Storyline.DialogueUtils;
import java.util.List;
import java.util.Scanner;

public class W3Mission4 {
    public static boolean w3mission4(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("       MISSION 4: THE RUINS OF BANWA-AN DAAN  ");
        System.out.println("================================================");
        System.out.println();
        System.out.println("The three of you descend the spiraling staircase beneath the Balete Tree. The temperature drops with every step, your breath fogging in the pale light.");
        System.out.println("Andrea: This place… it feels alive.");
        System.out.println("Kheila: It is. The first Babaylans performed their rituals here. Every inch of this place remembers their power.");
        System.out.println("As you move through the ruins, strange runes flicker to life on the walls, seemingly reacting to your presence. You feel the absence of what you sacrificed earlier. The cavern of your chest rings hollow, a dull emptiness where your essence once burned.");
        System.out.println("You reach a massive stone door, carved with the phases of the moon. The final symbol, the inverted crescent from the scroll, pulses faintly.");
        System.out.println("Kheila: That’s it. The entrance to the inner sanctum.");
        System.out.println("Opening the ornate door, you walk into a grand hall where massive moonstone pillars encircle a raised altar. Upon it rests a blade glowing faintly silver: the Blade of Bulan.");
        System.out.println(player.name + ": There it is. The goddess’s weapon.");
        System.out.println("But before you can move closer, shadows stir at the edges of the chamber and Babaylan Sentinels emerge. Twisted humanoid figures cloaked in bone charms, their eyes glowing red with witchfire.");
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.BABAYLANS2, 2);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 3);
        if (!survived) {
            return false;
        }

        System.out.println("The battle is fierce, but the power of Mogul still flows through your veins. When the last guardian falls, silence returns, broken only by the faint hum of the Blade.");
        System.out.println("Andrea: They were protecting this.");
        System.out.println("Kheila: And for good reason. This is the only weapon that can stand a chance against the Mistress.");
        System.out.println("You step forward. The Blade of Bulan seems to breathe, silver light rippling across its edge. As your hand touches the hilt, a surge of divine power courses through your arm, searing your veins with radiant energy.");
        System.out.println("[New Ability Unlocked – Moonstrike: Channels lunar energy to purify corrupted magic.]");
        System.out.println("The chamber trembles. The moonlight shifts, revealing a hidden compartment beneath the altar. Inside lies a charred, folded map.");
        System.out.println("You unfurl the ancient parchment. Strange runes and shifting lines mark a region deep within Mt. Kanatuan — the heart of the Babaylan fortress.");
        System.out.println("Kheila: This isn’t a map of Banwa-an Daan. This leads to their most guarded chamber: the Sanctum of Eclipse. Only the highest-ranked Babaylan is allowed access to it.");
        System.out.println("Andrea: Then that’s where the Mistress must be.");
        System.out.println("Kheila: And where all their power converges. Be warned, for this isn’t just another temple. It’s where the boundaries between Mogul, the mortal world, and Biringan City begin to blur.");
        DialogueUtils.pause();

        return true;
    }
}
