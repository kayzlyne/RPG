package Storyline.World1;

import Core.*;
import Storyline.DialogueUtils;
import java.util.List;
import java.util.Scanner;


public class Intro1 {
    public static void intro1(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);

        System.out.println("With the hero's experience as a " + player.classType.getClassName() +
                ", he/she starts to\nfind clues in the heart of Biringan City. " +
                player.name + " is taking the\nfirst step to the battle that will determine the fate of their kind.");
        System.out.println();
        DialogueUtils.pause();


        System.out.println("+------------------------------------------------+");
        System.out.println("|                                                |");
        System.out.println("|                BIRINGAN CITY                   |");
        System.out.println("|                                                |");
        System.out.println("|     A city of light and lurking darkness.      |");
        System.out.println("|                                                |");
        System.out.println("+------------------------------------------------+");
        System.out.println();

        System.out.println("A city filled with glittering riches beyond compare that shines like a\n" +
                "beacon for all the darkest creatures of the night. But lately, you find that\n" +
                "traces of a different breed of darkness have been popping up in various areas\n" +
                "of your beloved Biringan. With this in mind, you set out to look for clues and\n" +
                "follow the trail left behind by the ones threatening to devour the light of the\n" +
                "city. You roam about the place and decide to start your search in the most well-\n" +
                "populated area of town: the marketplace.\n");

        System.out.println("Your feet carry you through the crowded streets, expertly maneuvering\n" +
                "between the merchants bustling about with their wares. You breathe a sigh of relief\n" +
                "after you reach a less populated area. But just as you stop to relax, you hear a scream.");
        System.out.println();
        DialogueUtils.pause();

        System.out.println();
        System.out.println("================================================");
        System.out.println("         MISSION 1: THE HEART OF A HERO         ");
        System.out.println("================================================");
        System.out.println();

        System.out.println("???: Someone help! Please! A thief has stolen my merchandise!");
        scan.nextLine();
        System.out.println();

        System.out.println("Without even taking a second to think about it, you bolt after five duwendes\n" +
                "clearly trying to make a run for it.");
        scan.nextLine();
        System.out.println();

        System.out.println("[You encountered 5 thief duwendes.]");
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.DUWENDE, 5);
        BattleManager battle = new BattleManager();
        battle.startBattle(player, enemies, 1);

    }
}
