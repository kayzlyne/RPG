package Storyline.World2;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.Scanner;

public class W2Mission3 {
    public static void w2mission3(PlayerCharacter player){
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("================================================");
        System.out.println("          MISSION 3:  THE IRON WILL ");
        System.out.println("================================================");
        System.out.println();

        System.out.println(
                "The tambalan points you toward the east, where the marshland breaks" +
                        "\ninto cracked stone and sunken ruins. The ruins reek of history," +
                        "\nbut not the noble kind. This was once a settlement before it was" +
                        "\nswallowed by Mogul centuries ago, its people long since devoured" +
                        "\nor transformed into grotesque beings.\n");
        sc.nextLine();

        System.out.println(
                "At the center of the ruins, you see it.\nA faint glow inside a crumbling forge, fire still alive where no fire should exist.\n");
        sc.nextLine();

        System.out.println(
                "An old man steps out from the shadows of the forge.\nHis hair is silver, his arms corded with muscle, his leather apron smeared with soot and blood.\nHis gaze is sharp, unwavering.\nBefore you can voice out your intent, the Pandai beats you to it.\n");
        sc.nextLine();

        System.out.println("Pandai: I know why you've come.");
        sc.nextLine();

        System.out.println(player.name + ": How?");
        sc.nextLine();

        System.out.println("Pandai: The flames whisper to me.\nThey told me that the Tambalan sent you.\nHe wants me to part with the weapon.\nBut it will not be yours—or hers—without proof.\n");
        sc.nextLine();

        System.out.println("He produces a hammer and strikes the ground with it, the sound echoing like thunder through the silent ruins.\n");
        System.out.println("From the shadows, three figures crawl forth.");
        System.out.println("Viciously deformed werebeasts frothing at the mouth, their skin covered in sores that leak with pus and corrosive acid.");
        System.out.println("Their eyes gleam with hunger as they stagger closer.");
        sc.nextLine();

        System.out.println("Pandai: Defeat them, and prove you are worthy. Only then will the weapon be forged anew.\n");
        DialogueUtils.pause();
    }
}
