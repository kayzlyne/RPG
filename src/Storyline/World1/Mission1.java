package Storyline.World1;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;
import java.util.Scanner;

public class Mission1 {
    public static void mission1(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nSean: Thank you so much. I owe you my livelihood. I wouldn’t\nhave made it through the end of this month without that merchandise. Especially\nwith the darkening atmosphere of the city– oop! Ishouldn’thavesaidthat.\n");
        scan.nextLine();

        System.out.println(player.name + ": I’m actually investigating that. If you want to repay me, tell me everything you know.\n");
        scan.nextLine();

        System.out.println("Sean: Well, I am indebted to you, so I shall tell you all that I can.\nI heard that there was an increasing number of Enkantos and Diwatas missing.\nThe word on the street is that some sort of giant is behind it. One can only hope\nit isn't for a sacrificial ritual. If you want to know more, you might want to head\nto the Information Guild. My name is Sean. Tell them I sent you, and they might\ngive you more information.\n");
        scan.nextLine();

        System.out.println("You agree and go on your way.\n");
        DialogueUtils.pause();
    }
}