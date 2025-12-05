package Storyline;

import Core.PlayerCharacter;
import Storyline.World1.Mission2;

import java.util.Random;
import java.util.Scanner;

public class BeggarEvent {

    private static boolean triggeredInWorld3 = false;
    private static boolean introducedBefore = false;


    public static int trigger(PlayerCharacter player, int currentWorld) {
        Scanner sc = new Scanner(System.in);
        if (!Mission2.helpedBeggar) {
            return 0;
        }
        if (currentWorld == 3 && triggeredInWorld3) {
            return 0;
        }

        int dialogType;
        if (!introducedBefore) {

            System.out.println("\n\nA faint voice echoes in the darkness...\n");
            sc.nextLine();

            System.out.println("??? : Hey... wake up, kid. C’mon, open your eyes.\n");
            sc.nextLine();

            System.out.println("As your vision clears, you recognize the man leaning over you.\n");
            sc.nextLine();

            System.out.println("Sir Khai: Heh. Remember me? I'm Sir Khai—");
            System.out.println("Sir Khai: the beggar you helped back at the alley in Biringan City.\n");
            sc.nextLine();

            System.out.println("Sir Khai: Didn’t think we'd meet again like this... but good thing I passed by the old bridge.");
            System.out.println("Sir Khai: You were knocked out cold. Lucky I found you before someone else did.\n");
            sc.nextLine();

            introducedBefore = true;
            dialogType = 1; // mark introduction as done

        } else {
            System.out.println("\n\nYou hear a familiar voice as consciousness returns...\n");
            sc.nextLine();

            System.out.println("Sir Khai: Tsk. You again?");
            System.out.println("Sir Khai: Kid, you really gotta stop dying everywhere.\n");
            sc.nextLine();

            System.out.println("Sir Khai: Anyway... I dragged you somewhere safe. Again.\n");
            sc.nextLine();

            dialogType = 2;
        }

        int lostBarya = Math.min(player.getBarya(), new Random().nextInt(26)); // loses up to 25 pesos
        player.setBarya(player.getBarya() - lostBarya);
        player.hp += player.maxHp / 2; //restore hp
        if (player.hp > player.maxHp) {
            player.hp = player.maxHp; // prevent overheal
        }

        System.out.println("\nSir Khai: You dropped some coins, so I kept " + lostBarya + " pesos for ‘finding you’. ");
        System.out.println("Sir Khai: Try not to get yourself killed next time, alright?");
        sc.nextLine();

        System.out.println("\nYou wake up in a small hut, feeling sore but alive.");
        System.out.println("Your HP has been partially restored, but " + lostBarya + " pesos are missing...");
        DialogueUtils.pause();



        if(currentWorld == 3) triggeredInWorld3 = true;

        return dialogType;
    }
}
