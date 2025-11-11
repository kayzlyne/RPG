package Storyline.World3;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.Scanner;

public class W3Mission5 {
    public static void w3mission5(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);

        int choice;
        System.out.println("================================================");
        System.out.println("       MISSION 5: THE MAZE OF ECLIPSE  ");
        System.out.println("================================================");
        System.out.println();
        System.out.println("The moonlight filters through cracks in the roots above, painting silver streaks across the cave floor.\n" +
                "The air feels alive. It is breathing, whispering, remembering.\n");
        System.out.println("You step through the threshold, and the world falls silent. The air grows cold, thick with the scent of\n" +
                "damp soil and iron. The walls are made of the twisting roots of the Balete Tree, pulsing faintly like veins\n" +
                "running through a living entity.\n");
        System.out.println("You press forward. Every corridor bends in strange, impossible ways. Paths you’ve taken seem to vanish \n" +
                "behind you and bulging ancient eyes open from their slumber as you pass.You realize something as the walls close\n" +
                "in around you: this place means to swallow you whole.\n");
        sc.nextLine();
        System.out.println("Section 1: The Ghastly Path\n"); //changed Whispering Path to Ghastly Path, change if need be
        sc.nextLine();
        System.out.println("As you step deeper, voices echo around you. Some sound like lost loved ones, while others sound like the\n" +
                "vengeful screams of enemies you’ve slain.\n");
        sc.nextLine();
        System.out.println("Press 1: Follow the voices.\nPress 2: Ignore them and keep going.");
        choice = sc.nextInt();
        if (choice == 1){
            System.out.println("You see your past painful memories until Kheila snaps you out of it.\n"); //changed sentence a bit
            sc.nextLine();
            System.out.println("Kheila: Don’t listen! The maze feeds on regret!\n");
            sc.nextLine();
            System.out.println("(You lose time, but gain awareness of illusions.)\n");
        } else if (choice == 2){
            System.out.println("The whispers fade. You find a faint trail of glowing dust that marks the safe path.\n");
            sc.nextLine();
        }
        System.out.println("Section 2: The Split Passage");
        System.out.println("Three tunnels stretch ahead, each marked with symbols carved into the stone: a moon, a sun, and a star.");
        System.out.println("Press 1: Enter the Moon path.");
        System.out.println("Press 2: Enter the Sun path");
        System.out.println("Press 3: Enter the Star path.");
        choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Moon Path: The Blade of Bulan hums and glows faintly. You’re on the right path.\n");
        } else if(choice == 2){
            System.out.println("Sun Path: The walls begin to burn with light. You retreat.\n");
        } else if(choice == 3){
            System.out.println("Star Path: The tunnel collapses behind you. You barely escape.\n");
        }
        System.out.println("Section 3: The Door of Sacrifice\n");
        sc.nextLine();
        System.out.println("At the heart of the maze stands a massive stone door carved with lunar sigils.\n" +
                "A ghostly figure materializes before you. The White Lady of Balete Drive, her form both sorrowful and radiant.\n");
        sc.nextLine();
        System.out.println("White Lady: So you have come for the Blade’s final purpose, but every light demands a shadow.\n");
        sc.nextLine();
        System.out.println(player.name + ": We’ve come this far. Tell us what must be done.\n");
        sc.nextLine();
        System.out.println("White Lady: The door will open only to one who understands balance. You must give up what anchors\n" +
                "you most. Not your power, but your purpose.\n");
        sc.nextLine();
        System.out.println("Andrea: What does that mean?\n");
        sc.nextLine();
        System.out.println("White Lady: If your strength is bound by vengeance, you must forsake it. If it’s guided by pride,\n" +
                "you must humble yourself. The maze tests not your might, but your heart.\n");
        sc.nextLine();
        System.out.println("Kheila: So… the sacrifice isn’t physical?\n");
        sc.nextLine();
        System.out.println("White Lady: No. It’s the reason you fight. To open this door, you must choose what drives you,\n" +
                "and let it die here.\n");
        sc.nextLine();
        //System.out.println("Choices:"); IMPLEMENT !!!
        System.out.println("[Press 1] Sacrifice your vengeance – You lose a powerful attack, but gain the blessing of clarity.");
        System.out.println("[Press 2] Sacrifice your fear – You gain resistance to illusions and mental attacks.");
        System.out.println("[Press 3] Sacrifice your pride – You unlock the ability to protect allies at your own expense.");

        System.out.println("As soon as the choice is made, the Blade of Bulan glows, absorbing the essence of what was sacrificed.\n");
        sc.nextLine();
        System.out.println("White Lady: You have chosen well. The Blade now mirrors your truth. Go, bearer of the moon’s will.\n");
        sc.nextLine();
        System.out.println("The stone door trembles and splits open, revealing a stairway bathed in cold blue light.\n");
        sc.nextLine();
        System.out.println("Andrea: That must be it. The Mistress’s Lair.\n");
        sc.nextLine();
        System.out.println("Kheila: Be ready. What waits beyond that door is not just Erika, the Mistress, but everything she believes in.\n");
        DialogueUtils.pause();
    }
}
