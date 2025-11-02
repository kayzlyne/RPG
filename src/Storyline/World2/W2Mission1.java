package Storyline.World2;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

public class W2Mission1 {
    public static void w2mission1(PlayerCharacter player){

        System.out.println("Andrea: Finally, you took it down, friend.\n");
        System.out.println(player.name + ": Andrea, you’re heavily injured. " +
                "We need to get you treated immediately. " +
                "\nIt’ll be too late if we go to the city." +
                "Stay conscious, I’ll find something to treat you.\n");
        System.out.println("You lay Andrea against a small boulder and search for herbs that could treat her.\n");
        DialogueUtils.pause();
    }
}
