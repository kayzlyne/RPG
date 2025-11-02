package Storyline.World3;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.Scanner;

public class W3Mission4 {
    public static void w3mission4(PlayerCharacter player) {
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

        //FIGHT 2 BABAYLAN SENTINELS
    }
}
