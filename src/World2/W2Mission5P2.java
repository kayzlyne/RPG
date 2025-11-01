package World2;

import Core.PlayerCharacter;
import java.util.Scanner;

public class W2Mission5P2 {
    public static void w2mission5p2(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tria: I… lost? I… I can’t believe you defeated me… But you… You won’t get far. The Babaylan’s plan is already halfway.\n");
        sc.nextLine();

        System.out.println(player.name + ": The Babaylan? What are you talking about?\n");
        sc.nextLine();

        System.out.println("Leaving you with more questions, Tria draws her last breath.\n");
        sc.nextLine();

        System.out.println("You ponder upon the clue Tria left, the possible mastermind behind the plan to dominate Biringan City.\n");
        sc.nextLine();

        System.out.println("Andrea: Should we investigate the Babaylans? Their base is in Mt. Kanatuan.\n");
        sc.nextLine();

        System.out.println(player.name + ": I think we should. Even if Tria lied, this is our only clue.\n");
        sc.nextLine();

        System.out.println("You hear a thud and a yelp from the corner of the chamber.\nYou and Andrea immediately look in the direction the noise came from.\nYou saw an Aswang hurriedly escaping through a side passage. Both of you immediately chase after the Aswang.\n");
        sc.nextLine();

        System.out.println("You chase it through the narrow, winding tunnel, your footsteps pounding against stone.\nWhen you finally catch up, Andrea’s blade flashes in the dark, and the Aswang falls lifeless at your feet.\n");
        sc.nextLine();

        System.out.println(player.name + ": Where are we?\n");
        sc.nextLine();

        System.out.println("The path ahead stretches into darkness once more. But somewhere beyond it lies Mt. Kanatuan. And with it, the truth behind the Babaylan’s sinister plan.\n");
        System.out.println(">> Press ENTER to continue...");
        sc.nextLine();
    }
}
