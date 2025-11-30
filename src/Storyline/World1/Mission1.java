package Storyline.World1;

import Core.*;
import Storyline.DialogueUtils;

import java.util.List;
import java.util.Scanner;

public class Mission1 {
    public static void mission1(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);

        System.out.println("================================================");
        System.out.println("         MISSION 1: THE HEART OF A HERO         ");
        System.out.println("================================================");
        System.out.println();
        scan.nextLine();

        System.out.println("???: Someone help! Please! A thief has stolen my merchandise!");
        scan.nextLine();

        System.out.println("Without even taking a second to think about it, you bolt after the two duwendes clearly trying to make a run for it.");
        scan.nextLine();

        System.out.println("[You encountered 2 duwende.]");
        System.out.println();
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.DUWENDE, 2);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 1, false);

        System.out.println("\uD83D\uDCB0 You earned 25 barya for winning the battle!");
        player.addBarya(25);
        System.out.println("🏦 Total barya: " + player.getBarya());
        scan.nextLine();

        player.levelUp();

        System.out.println("\n\nSean: Thank you so much. I owe you my livelihood. I wouldn’t have made it through the end of this month without that merchandise.");
        scan.nextLine();
        System.out.println("Sean: Especially with the darkening atmosphere of the city– oop! Ishouldn’thavesaidthat.");
        scan.nextLine();

        System.out.println(player.name + ": I’m actually investigating that. If you want to repay me, tell me everything you know.");
        scan.nextLine();

        System.out.println("Sean: Well, I am indebted to you, so I shall tell you all that I can. I heard that there was an increasing number of Enkantos and Diwatas missing.");
        scan.nextLine();
        System.out.println("Sean: The word on the street is that some sort of giant is behind it. One can only hope it isn't for a sacrificial ritual.");
        scan.nextLine();
        System.out.println("Sean: If you want to know more, you might want to head to the Information Guild.");
        scan.nextLine();
        System.out.println("Sean: My name is Sean. Tell them I sent you, and they might give you more information.");
        scan.nextLine();

        System.out.println("You agree and go on your way.");
        System.out.println("After a while, you see a cozy bench and decide to take a rest.");
        System.out.println();
        player.rest();
        DialogueUtils.pause();
    }
}