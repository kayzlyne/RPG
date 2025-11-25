package Storyline.World3;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

public class Intro3 {
    public static void intro3 (PlayerCharacter player) {

        System.out.println("╔═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗ ");
        System.out.println("║      ▲        ▲  .        ▪        .     ▲▲▲     .        ▪    .       .           ▪             .     ▪          ▪         ▲▲▲                ▲      ║ ");
        System.out.println("║     ▲▲▲      ▲▲▲        ▪       ▲       █████   • ▌ ▄ ·. ▄▄▄▄▄   ,   ▄ •▄  ▄▄▄·  ▐ ▄  ▄▄▄· ▄▄▄▄▄▄• ▄▌ ▄▄▄·  ▐ ▄      ▲     █████     ▪        ▲▲▲     ║");
        System.out.println("║    ▲▲▲▲▲    █████    ▲    .    ▲▲▲              ·██ ▐███▪•██     ▪   █▌▄▌▪▐█ ▀█ •█▌▐█▐█ ▀█ •██  █▪██▌▐█ ▀█ •█▌▐█ .  ▲▲▲            ▲         ▲▲▲▲▲    ║");
        System.out.println("║  ▲▲▲▲▲▲▲▲▲     ▪    ▲▲▲       █████     ▪   .   ▐█ ▌▐▌▐█· ▐█.▪       ▐▀▀▄·▄█▀▀█ ▐█▐▐▌▄█▀▀█  ▐█.▪█▌▐█▌▄█▀▀█ ▐█▐▐▌   █████  ▪       ▲▲▲   ▪  ▲▲▲▲▲▲▲▲   ║");
        System.out.println("║      █      .  '   █████  '  . .         ▲      ██ ██▌▐█▌ ▐█▌·       ▐█.█▌▐█ ▪▐▌██▐█▌▐█ ▪▐▌ ▐█▌·▐█▄█▌▐█ ▪▐▌██▐█▌'   .   '  .  '  █████         █      ║");
        System.out.println("║    █████     ▪               ▲         ▲▲▲     ▀▀  █▪▀▀▀ ▀▀▀  ▀ ▲    ·▀  ▀ ▀  ▀ ▀▀ █▪ ▀  ▀  ▀▀▀  ▀▀▀  ▀  ▀ ▀▀ █▪         ▲            ▪      █████    ║");
        System.out.println("║  █████████      ▲     . ▪   ▲▲▲       █████    .  ▲      .   ▪ ▲▲▲         ▪      .      ▲        ▪            ▲    ▪   ▲▲▲  .    ▲     ▪  █████████  ║ ");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝ ");

        DialogueUtils.pause();
        System.out.println(
                "The moment you cross the threshold to Mogul, a suffocating weight settles into your chest. The air itself is different here.");
        System.out.println();

        DialogueUtils.pause();
    }
}
