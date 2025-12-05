package Storyline.World2;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.Scanner;

public class W2Mission4 {
    public static void w2mission4(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("======================================================================================================================================================================");
        System.out.println("░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░█░█░░░░░░░█▀█░░░█▀▀░█░█░█▀▄░▀█▀░█▀█░█▀▀░░░█▀█░█▀▀░░░█▀▀░█▀█░▀█▀░█▀▄░█▀█░▀█▀░█░░░█▀▀░░░█▀█░█▀█░█▀▄░░░█▀▄░█▀█░█▀█░█▀▀░░░░▄▀░░▄▀");
        System.out.println("░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░░▀█░░▀░░░░█▀█░░░▀▀█░█▀█░█▀▄░░█░░█░█░█▀▀░░░█░█░█▀▀░░░█▀▀░█░█░░█░░█▀▄░█▀█░░█░░█░░░▀▀█░░░█▀█░█░█░█░█░░░█▀▄░█░█░█░█░█▀▀░░░▀▄░░▀▄░");
        System.out.println("░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░░░▀░░▀░░░░▀░▀░░░▀▀▀░▀░▀░▀░▀░▀▀▀░▀░▀░▀▀▀░░░▀▀▀░▀░░░░░▀▀▀░▀░▀░░▀░░▀░▀░▀░▀░▀▀▀░▀▀▀░▀▀▀░░░▀░▀░▀░▀░▀▀░░░░▀▀░░▀▀▀░▀░▀░▀▀▀░░░░░▀░░░▀");
        System.out.println("======================================================================================================================================================================");
        System.out.println();

        System.out.println("You make your way back to Andrea and the Tambalan.\nThough pale, Andrea’s eyes open the moment she hears your footsteps.");
        sc.nextLine();

        System.out.println("Andrea: You’re back. Did you find it?");
        sc.nextLine();

        System.out.println("You kneel and present the Pandai’s creation.\nThe blade gleams faintly in the gloom, its edge shimmering like captured moonlight.\nAndrea’s hand trembles as she reaches for it, but the moment her fingers curl around the hilt, the glow steadies.");
        sc.nextLine();

        System.out.println("Tambalan: Good. The sword knows its master. She must carry it herself.");
        System.out.println();
        DialogueUtils.pause();

        System.out.println("You glance at him with concern.");
        sc.nextLine();

        System.out.println(player.name + ": She’s not fully healed. Shouldn’t she rest?");
        sc.nextLine();

        System.out.println("The Tambalan shakes his head.");
        sc.nextLine();

        System.out.println("Tambalan: The Aswang’s thirst for blood waits for no one. And the blade’s blessing will shield her more than my herbs ever could.");
        sc.nextLine();

        System.out.println("Tambalan: Go together, but listen well. Their lair is hidden. You will not find it by sight alone. Follow the signs of their gluttony.");
        sc.nextLine();

        System.out.println("Tambalan: They linger where the air itself rots. Beware their trickery, for the farther away they sound, the closer they actually are.");
        sc.nextLine();

        System.out.println("With those parting words from the Tambalan, you and Andrea make your way out to the hostile wilds of Mogul.");
        System.out.println("Along the way, you encounter deformed vultures with beady blood-red eyes preying on discarded carcasses.");
        System.out.println("You pay them no mind, for the tambalan's warning rings clear in your head.");
        System.out.println("If these carcasses still had enough meat for vultures to feast on, then the lair of the Aswang is still far ahead.");
        sc.nextLine();

        System.out.println("Soon enough, you feel the shift in the air.\nThe scent of death and decay hangs heavy in the atmosphere.\nDistant laughter crackles like sharp strikes of lightning splitting the quiet.\nBeside you, Andrea stops and points to a pile of bones.");
        sc.nextLine();

        System.out.println(player.name + ": This must mean we're getting closer.");
        sc.nextLine();

        System.out.println("Andrea: The blade senses it too.");
        sc.nextLine();

        System.out.println("She raises the bolo in the air. Its light shimmers in the blistering darkness. You remember what the Pandai told you.");
        sc.nextLine();

        System.out.println(player.name + ": “The blessed bolo will lead the way.” Come on, let's get going.");
        sc.nextLine();

        System.out.println("A pit forms in your stomach when you realize that all the skittering laughter in the distance has skidded to an unnatural stillness.\nYou look up to see a towering structure made of bones, sinew, and dried blood coagulated like thick globs of syrup.\nAll around you, there are hundreds of these same structures,\n festooned with glistening entrails like a perverted shrine created to worship everything unholy that ever walked this land. \n");
        sc.nextLine();

        System.out.println("A sick feeling washes over you as you and Andrea come to the same conclusion- you've made it to the Aswang’s lair.\n");
        DialogueUtils.pause();
    }
}
