package Storyline;

import Core.PlayerCharacter;
import Storyline.World1.Mission2;

import java.util.Scanner;

public class BeggarEvent {

    private static boolean triggeredInWorld3 = false;


    public static boolean trigger(PlayerCharacter player, int currentWorld) {
        Scanner sc = new Scanner(System.in);
        if (!Mission2.helpedBeggar) {
            return false;
        }
        if (currentWorld == 3 && triggeredInWorld3) {
            return false;
        }

        System.out.println("\n\nA faint voice echoes in the darkness...\n");
        sc.nextLine();
        System.out.println("Sir Khai: Hey! Wake up, kid! You were out cold near the old bridge.\n");
        sc.nextLine();
        System.out.println("Sir Khai: Lucky I found you before someone else did.\n");
        sc.nextLine();

        int lostBarya = Math.min(20, player.getBarya()); // loses up to 20 pesos
        player.setBarya(player.getBarya() - lostBarya);
        player.hp += 50; // restores some HP

        System.out.println("\nSir Khai: You dropped some coins, so I kept " + lostBarya + " pesos for ‘finding you’. ");
        System.out.println("Sir Khai: Try not to get yourself killed next time, alright?");
        sc.nextLine();

        System.out.println("\nYou wake up in a small hut, feeling sore but alive.");
        System.out.println("Your HP has been partially restored, but " + lostBarya + " pesos are missing...");
        DialogueUtils.pause();

        if(currentWorld == 3) triggeredInWorld3 = true;

        return true;
    }
}
