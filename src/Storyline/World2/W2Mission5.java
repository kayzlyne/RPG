package Storyline.World2;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.Scanner;

public class W2Mission5 {
    public static void w2mission5(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("================================================");
        System.out.println("      MISSION 5:  THE MONSTER'S GAPING MAW ");
        System.out.println("================================================");
        System.out.println();

        System.out.println(
                "The chamber opens wide before you like a cavernous maw, a cathedral of decay.\nJagged pillars rise from the ground, formed from fused bone and dried sinew.\nThe walls are slick with black resin, glistening like tar.\nDim candles burn at uneven intervals, their weak flames dancing atop puddles of wax and congealed blood.\n");
        sc.nextLine();

        System.out.println(
                "Hanging from the ceiling are cocoons – live pulsating sacks of flesh that drip thick ichor onto the floor.\nThe air hums faintly, a constant low buzzing that seems to come from everywhere and nowhere.\n");
        sc.nextLine();

        System.out.println(
                "And then… a voice.\nSmooth at first, but sickly sweet.\nThe kind of tone that curls around your spine like a whisper from a nightmare.\n");
        sc.nextLine();

        System.out.println("???: Have you come to be my supper? Quite idiotic of you… But well, I don’t mind.\n");
        sc.nextLine();

        System.out.println("The voice is followed by a wet, insectoid chitter and a soft, mocking laugh.\n");
        sc.nextLine();

        System.out.println("Andrea raises her glowing blade in the direction of the voice, and you feel your pulse skyrocket at the sight of the creature before you.\n");
        sc.nextLine();

        System.out.println("Perched atop a massive nest-like structure is a gigantic wasp-like creature, her slick black carapace glistening in the candlelight.\nHer head is that of a woman, as pale and beautiful as the moon, but her arms are bladed and jointed like those of a mantis.\nHer lower body writhes with veined wings and a stinger that glows faintly red.\nHer smile widens unnaturally as she leans forward, her mandibles clicking.\n");
        sc.nextLine();

        System.out.println(player.name + ": Who are you? Are you the leader of the Aswangs?\n");
        sc.nextLine();

        System.out.println("???: You don’t know who I am? Truly an idiot.\n");
        sc.nextLine();

        System.out.println(player.name + ": Am I supposed to?\n");
        sc.nextLine();

        System.out.println("???: I am Tria, the Master of Mogul! I am feared in these lands! And you, my dear, you should be terrified. Henchmen! Tear them apart!\n");
        sc.nextLine();

        System.out.println("From the shadows of the chamber, shapes crawl and emerge. Seven of Tria’s minions, made up of different Aswang species, respond to their leader’s command.\n");
        sc.nextLine();

        System.out.println("[You encountered 7 henchmen of Tria. 3 Tiktiks, 2 Abwak, 2 Aswang. Choose a target and an attack]\n{Boss cannot be chosen until henchmen are wiped out}\n");
        DialogueUtils.pause();
    }
}
