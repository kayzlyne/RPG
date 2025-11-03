package Storyline.World2;

import Core.*;
import Storyline.DialogueUtils;

import java.util.List;
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
        //sc.nextLine();

        System.out.println(
                "Hanging from the ceiling are cocoons – live pulsating sacks of flesh that drip thick ichor onto the floor.\nThe air hums faintly, a constant low buzzing that seems to come from everywhere and nowhere.\n");
        //sc.nextLine();

        System.out.println(
                "And then… a voice.\nSmooth at first, but sickly sweet.\nThe kind of tone that curls around your spine like a whisper from a nightmare.\n");
        sc.nextLine();

        System.out.println("???: Have you come to be my supper? Quite idiotic of you… But well, I don’t mind.\n");
        //sc.nextLine();

        System.out.println("The voice is followed by a wet, insectoid chitter and a soft, mocking laugh.\n");
        //sc.nextLine();

        System.out.println("Andrea raises her glowing blade in the direction of the voice, and you feel your pulse skyrocket at the sight of the creature before you.\n");
        sc.nextLine();

        System.out.println("Perched atop a massive nest-like structure is a gigantic wasp-like creature, her slick black carapace glistening in the candlelight.\nHer head is that of a woman, as pale and beautiful as the moon, but her arms are bladed and jointed like those of a mantis.\nHer lower body writhes with veined wings and a stinger that glows faintly red.\nHer smile widens unnaturally as she leans forward, her mandibles clicking.\n");
        sc.nextLine();

        System.out.println(player.name + ": Who are you? Are you the leader of the Aswangs?\n");
        sc.nextLine();

        System.out.println("???: You don’t know who I am? Truly an idiot.\n");
        //sc.nextLine();

        System.out.println(player.name + ": Am I supposed to?\n");
        //sc.nextLine();

        System.out.println("???: I am Tria, the Master of Mogul! I am feared in these lands! And you, my dear, you should be terrified. Henchmen! Tear them apart!\n");
        //sc.nextLine();

        System.out.println("From the shadows of the chamber, shapes crawl and emerge. Seven of Tria’s minions, made up of different Aswang species, respond to their leader’s command.\n");
        //sc.nextLine();

        System.out.println("[You encountered 7 henchmen of Tria. 3 Tiktiks, 2 Abwak, 2 Aswang. Choose a target and an attack]\n{Boss cannot be chosen until henchmen are wiped out}\n");
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.TIKTIK, 3);
        List<Enemy> enemies2 = EnemyFactory.spawnEnemies(EnemyType.ABWAK, 2);
        List<Enemy> enemies3 = EnemyFactory.spawnEnemies(EnemyType.ASWANG, 2);
        BattleManager battle = new BattleManager();
        battle.startBattle(player, enemies);
        battle.startBattle(player, enemies2);
        battle.startBattle(player, enemies3);

        //Boss Battle


        System.out.println("Tria: I… lost? I… I can’t believe you defeated me… But you… You won’t get far. The Babaylan’s plan is already halfway.\n");
        //sc.nextLine();

        System.out.println(player.name + ": The Babaylan? What are you talking about?\n");
        //sc.nextLine();

        System.out.println("Leaving you with more questions, Tria draws her last breath.\n");
        sc.nextLine();

        System.out.println("You ponder upon the clue Tria left, the possible mastermind behind the plan to dominate Biringan City.\n");
        //sc.nextLine();

        System.out.println("Andrea: Should we investigate the Babaylans? Their base is in Mt. Kanatuan.\n");
        //sc.nextLine();

        System.out.println(player.name + ": I think we should. Even if Tria lied, this is our only clue.\n");
        sc.nextLine();

        System.out.println("You hear a thud and a yelp from the corner of the chamber.\nYou and Andrea immediately look in the direction the noise came from.\nYou saw an Aswang hurriedly escaping through a side passage. Both of you immediately chase after the Aswang.\n");
        //sc.nextLine();

        System.out.println("You chase it through the narrow, winding tunnel, your footsteps pounding against stone.\nWhen you finally catch up, Andrea’s blade flashes in the dark, and the Aswang falls lifeless at your feet.\n");
        //sc.nextLine();

        System.out.println(player.name + ": Where are we?\n");
        //sc.nextLine();

        System.out.println("The path ahead stretches into darkness once more. But somewhere beyond it lies Mt. Kanatuan. And with it, the truth behind the Babaylan’s sinister plan.\n");
        DialogueUtils.pause();
    }
}
