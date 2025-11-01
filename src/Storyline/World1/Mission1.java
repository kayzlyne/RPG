package Storyline.World1;

import Core.PlayerCharacter;
import java.util.Scanner;

public class Mission1 {
    public static void mission1 (PlayerCharacter player){
        Scanner scan = new Scanner(System.in);

        System.out.println("\nSean:  Thank you so much. I owe you my livelihood. I wouldn’t\n" +
                "have made it through the end of this month without that merchandise. Especially\n" +
                "with the darkening atmosphere of the city– oop! Ishouldn’thavesaidthat.\n");

        System.out.println(player.name
                + ": I’m actually investigating that. If you want to repay me, tell me everything you know.\n");

        System.out.println("Sean: Well, I am indebted to you, so I shall tell you all that I can.\n" +
                "I heard that there was an increasing number of Enkantos and Diwatas missing.\n" +
                "The word on the street is that some sort of giant is behind it. One can only hope\n" +
                "it isn't for a sacrificial ritual. If you want to know more, you might want to head\n" +
                "to the Information Guild. My name is Sean. Tell them I sent you, and they might\n" +
                "give you more information.");

        System.out.println("You agree and go on your way.\n");
        System.out.print(">> Press ENTER to continue...");
        scan.nextLine();
    }
}
