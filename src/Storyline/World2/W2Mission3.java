package Storyline.World2;

import Core.*;
import Storyline.DialogueUtils;
import java.util.List;
import java.util.Scanner;

public class W2Mission3 {
    public static boolean w2mission3(PlayerCharacter player){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("                       ============================================================================================================");
        System.out.println("                       ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀▀█░░░░░░░▀█▀░█░█░█▀▀░░░▀█▀░█▀▄░█▀█░█▀█░░░█░█░▀█▀░█░░░█░░░░░░▄▀░░▄▀");
        System.out.println("                       ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░▀▄░░▀░░░░░█░░█▀█░█▀▀░░░░█░░█▀▄░█░█░█░█░░░█▄█░░█░░█░░░█░░░░░▀▄░░▀▄░");
        System.out.println("                       ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀░░░▀░░░░░▀░░▀░▀░▀▀▀░░░▀▀▀░▀░▀░▀▀▀░▀░▀░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░░░░░▀░░░▀");
        System.out.println("                       ============================================================================================================");
        //System.out.println();
        sc.nextLine();

        System.out.println("The tambalan points you toward the east, where the marshland breaks into cracked stone and sunken ruins.");
        System.out.println("The ruins reek of history, but not the noble kind.");
        System.out.println("This was once a settlement before it was swallowed by Mogul centuries ago, its people long since devoured or transformed into grotesque beings.");
        sc.nextLine();
        System.out.println("At the center of the ruins, you see it.\nA faint glow inside a crumbling forge, fire still alive where no fire should exist.");
        sc.nextLine();
        System.out.println("An old man steps out from the shadows of the forge. His hair is silver, his arms corded with muscle, his leather apron smeared with soot and blood.");
        System.out.println("His gaze is sharp, unwavering.Before you can voice out your intent, the Pandai beats you to it.");
        sc.nextLine();
        System.out.println("Pandai: I know why you've come.");
        sc.nextLine();
        System.out.println(player.name + ": How?");
        sc.nextLine();
        System.out.println("Pandai: The flames whisper to me. They told me that the Tambalan sent you.");
        sc.nextLine();
        System.out.println("Pandai: He wants me to part with the weapon. But it will not be yours—or hers—without proof.");

        System.out.println("He produces a hammer and strikes the ground with it, the sound echoing like thunder through the silent ruins.");
        System.out.println("From the shadows, three figures crawl forth.");
        System.out.println("Viciously deformed werebeasts frothing at the mouth, their skin covered in sores that leak with pus and corrosive acid.");
        System.out.println("Their eyes gleam with hunger as they stagger closer.");
        sc.nextLine();

        System.out.println("Pandai: Defeat them, and prove you are worthy. Only then will the weapon be forged anew.");
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.SIGBIN, 3);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 2, false);

        if (!survived) {
            return false;
        }

//        System.out.println("\uD83D\uDCB0 You earned 25 barya for winning the battle!");
//        player.addBarya(25);
//        System.out.println("🏦 Total barya: " + player.getBarya());
        sc.nextLine();

        System.out.println("Once the battle is won, the Pandai approaches you, impressed.");
        sc.nextLine();
        System.out.println("Pandai: Congratulations. You may yet survive this place.");
        sc.nextLine();
        System.out.println("He returns to the forge, hammering the air itself, shaping something unseen.");
        System.out.println("Slowly, metal begins to form, glowing with unnatural light.");
        System.out.println("The weapon takes shape—a bolo infused with Mogul’s darkness, yet burning with an ember of the eternal flame that has blessed the Pandai.");
        sc.nextLine();
        System.out.println("Pandai: Here, give this to your friend. She has a will made of iron. In her hands, this bolo will find its true strength.");
        sc.nextLine();
        System.out.println("You take the weapon, its weight heavy, its power undeniable.\nAndrea’s future in Mogul depends on this gift.");
        sc.nextLine();
        System.out.println(player.name + ": Thank you.");
        sc.nextLine();
        System.out.println("Pandai: You and your friend proved your worth. There is no need for gratitude. Do you know where you must go next?");
        sc.nextLine();
        System.out.println(player.name + ": Yes. I must find the Aswang’s lair so that I can talk to their leader.");
        sc.nextLine();
        System.out.println("I need to know what they plan to do with the Diwatas and Encantos they’ve had abducted.");
        sc.nextLine();
        System.out.println("I must get to the bottom of this wretched scheme.");
        sc.nextLine();
        System.out.println("Pandai: Very good. Mogul is a place that cannot be navigated, but the tambalan can point you to the right direction,");
        sc.nextLine();
        System.out.println("Pandai: and the blessed bolo will lead the way. Good luck, young hero.");

        DialogueUtils.pause();
        return true;
    }
}
