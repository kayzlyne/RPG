package Storyline.World1;

import Core.*;
import Storyline.DialogueUtils;

import java.util.List;
import java.util.Scanner;

public class Mission1 {
    public static void mission1(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);

        //System.out.println();
        System.out.println("================================================");
        System.out.println("         MISSION 1: THE HEART OF A HERO         ");
        System.out.println("================================================");
        System.out.println();

        System.out.println("???: Someone help! Please! A thief has stolen my merchandise!");
        scan.nextLine();

        //System.out.println();
        System.out.println("Without even taking a second to think about it, you bolt after five duwendes clearly trying to make a run for it.");
        scan.nextLine();

        System.out.println("[You encountered 5 thief duwendes.]");
        System.out.println();
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.DUWENDE, 5);
        BattleManager battle = new BattleManager();
        battle.startBattle(player, enemies, 1);

        System.out.println("\n\nSean: Thank you so much. I owe you my livelihood. I wouldn’t have made it through\n the end of this month without that merchandise. Especially with\n the darkening atmosphere of the city– oop! Ishouldn’thavesaidthat.\n");
        scan.nextLine();

        System.out.println(player.name + ": I’m actually investigating that. If you want to repay me, tell me everything you know.\n");
        scan.nextLine();

        System.out.println("Sean: Well, I am indebted to you, so I shall tell you all that I can.\nI heard that there was an increasing number of Enkantos and Diwatas missing.\nThe word on the street is that some sort of giant is behind it. One can only hope\nit isn't for a sacrificial ritual. If you want to know more, you might want to head\nto the Information Guild. My name is Sean. Tell them I sent you, and they might\ngive you more information.\n");
        scan.nextLine();

        System.out.println("You agree and go on your way.\n");
        DialogueUtils.pause();
    }
}