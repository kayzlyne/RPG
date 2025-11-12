package Storyline.World1;

import Core.*;
import Storyline.DialogueUtils;
import java.util.List;
import java.util.Scanner;


public class Intro1 {
    public static void intro1(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);

        System.out.println("With the hero's experience as a(n) " + player.classType.getClassName() +
                ", he/she starts to find clues in the heart of Biringan City.\n" +
                player.name + " is taking the first step to the battle that will determine the fate of their kind.");
        System.out.println();
        DialogueUtils.pause();

/*
        System.out.println("+------------------------------------------------+");
        System.out.println("|                                                |");
        System.out.println("|                BIRINGAN CITY                   |");
        System.out.println("|                                                |");
        System.out.println("|     A city of light and lurking darkness.      |");
        System.out.println("|                                                |");
        System.out.println("+------------------------------------------------+");
        System.out.println();
 */

        System.out.println("+------------------------------------------------------------------------------------------------+");
        System.out.println("|   ____  ___ ____    ___ _     _  ______     _      _     _      _____   ___ _______ _     _    |");
        System.out.println("|   |   \\  |  |   \\    |  |\\    | /     \\     /\\     |\\    |     /     \\   |  |  |  |  \\   /     |");
        System.out.println("|   |    | |  |    |   |  | \\   | |          /  \\    | \\   |     |         |     |      \\ /      |");
        System.out.println("|   |---<  |  |---<    |  |  \\  | |  _____  /____\\   |  \\  |     |         |     |       Y       |");
        System.out.println("|   |    | |  |    \\   |  |   \\ | |      | /      \\  |   \\ |     |         |     |       |       |");
        System.out.println("|   |___/ _|_ |     \\ _|_ |    \\|  \\____/ /        \\ |    \\|      \\_____/ _|_    |       |       |");
        System.out.println("|                                                                                                |");
        System.out.println("|                             A city of light and lurking darkness.                              |");
        System.out.println("|                                                                                                |");
        System.out.println("+------------------------------------------------------------------------------------------------+");
        System.out.println();

        System.out.println("A city filled with glittering riches beyond compare that shines like a beacon for all the darkest creatures of the night.\n" +
                        "But lately, you find that traces of a different breed of darkness have been popping up in various areas of your beloved Biringan.\n" +
                //"\n" +
                "With this in mind, you set out to look for clues and follow the trail left behind by the ones threatening to devour the light \n" +
               // "\n" +
                "of the city. You roam about the place and decide to start your search in the most well-populated area of town: the marketplace.\n");

        System.out.println("Your feet carry you through the crowded streets, expertly maneuvering between the merchants bustling about with their wares.\n" +
                "You breathe a sigh of relief after you reach a less populated area.\n" +
                "But just as you stop to relax, you hear a scream.");
        System.out.println();
        DialogueUtils.pause();
    }
}
