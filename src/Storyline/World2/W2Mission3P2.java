package Storyline.World2;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.Scanner;

public class W2Mission3P2 {
    public static void w2mission3p2(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Once the battle is won, the Pandai approaches you, impressed.\n");
        sc.nextLine();

        System.out.println("Pandai: Congratulations. You may yet survive this place.\n");
        sc.nextLine();

        System.out.println("He returns to the forge, hammering the air itself, shaping something unseen.\nSlowly, metal begins to form, glowing with unnatural light.\nThe weapon takes shape—a bolo infused with Mogul’s darkness, yet burning with an ember of the eternal flame that has blessed the Pandai.\n");
        sc.nextLine();

        System.out.println("Pandai: Here, give this to your friend. She has a will made of iron. In her hands, this bolo will find its true strength.\n");
        sc.nextLine();

        System.out.println("You take the weapon, its weight heavy, its power undeniable.\nAndrea’s future in Mogul depends on this gift.\n");
        sc.nextLine();

        System.out.println(player.name + ": Thank you.\n");
        sc.nextLine();

        System.out.println("Pandai: You and your friend proved your worth. There is no need for gratitude. Do you know where you must go next?\n");
        sc.nextLine();

        System.out.println(player.name + ": Yes. I must find the Aswang’s lair so that I can talk to their leader. I need to know what they plan to do with the Diwatas and Encantos they’ve had abducted. I must get to the bottom of this wretched scheme.\n");
        sc.nextLine();

        System.out.println("Pandai: Very good. Mogul is a place that cannot be navigated, but the tambalan can point you to the right direction, and the blessed bolo will lead the way. Good luck, young hero.\n");
        DialogueUtils.pause();
    }
}
