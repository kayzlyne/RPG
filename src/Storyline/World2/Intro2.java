package Storyline.World2;

import Core.*;
import Storyline.DialogueUtils;

import java.util.List;
import java.util.Scanner;

public class Intro2 {
    public static boolean intro(PlayerCharacter player){
        Scanner scan = new Scanner(System.in);
        System.out.println("The Bungisngis, no longer smiling, throws soil at both of you, effectively" +
                "blocking your vision. It takes this chance to grab Andrea and run towards Mogul.");
        scan.nextLine();

        System.out.println("Andrea: Help!\n");
        scan.nextLine();

        System.out.println(player.name + ": Andrea!\n");
        scan.nextLine();

        System.out.println("Without a second thought, you rush towards Mogul.\n");
        scan.nextLine();

        System.out.println("[You have entered Mogul, the land of the Aswangs]\n");
        DialogueUtils.pause();

        System.out.println("||___________________________________________________||");
        System.out.println("||         |\\    /| |----| |----  |    | |          ||");
        System.out.println("||         | \\  / | |    | |  ___ |    | |          ||");
        System.out.println("||         |  \\/  | |____| |____| |____| |____      ||");
        System.out.println("||___________________________________________________||");
        System.out.println();

        System.out.println("The moment you cross the threshold to Mogul, a suffocating weight settles into your chest. The air itself is different here.");
        System.out.println("While the Dark Forest’s atmosphere was just as oppressive, the air at least still smelled like cedar and fresh pine.");
        System.out.println("Here, the air is thick, acrid, and laced with the copper sting of blood. Each breath tastes of rust and rot.");
        System.out.println("You glance down, expecting soil beneath your feet, but the ground is nothing but ashen dust, crumbling like brittle bone with every step.");

        System.out.println("\nThe sky is an eternal shroud, alive with twisting shapes that churn behind clouds as black as coal.");
        System.out.println("Now and then, the heavens tear open with a dull red glow, exposing the outlines of crow-shaped Abwak in the distance and even some ");
        System.out.println("Manananggal prowling about with their entrails hanging below them like a perverted bridal train. No warmth reaches you here. ");
        System.out.println("Only the feeling of being watched. \nYour eyes search your immediate surroundings for a trace of the Bungisngis and Andrea.");
        System.out.println("You sense a gust of wind and move to follow the direction from which it came.");
        DialogueUtils.pause();

        System.out.println();
        System.out.println("================================================");
        System.out.println("          MISSION 1:  THE LAST LAUGH ");
        System.out.println("================================================");
        System.out.println();

        System.out.println(
                "You see Andrea heavily injured on the ground, the Bungisngis limping towards her. You rush in to protect her.\n");
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.BUNGISNGIS2, 1);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 2);

        if (!survived) {
            return false;
        }

        System.out.println("\uD83D\uDCB0 You earned 10 barya for winning the battle!");
        scan.nextLine();
        player.addBarya(10);

        player.rest();
        return true;
    }
}
