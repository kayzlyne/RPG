package World3;

import Core.PlayerCharacter;
import java.util.Scanner;

public class Intro3 {
    public static void intro3 (PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "||================================================================================================================================||");
        System.out.println(
                "||  ||\\        //||  ========   ||  //      //\\      ||\\    ||      //\\      ========  ||     ||      //\\      ||\\    ||    ||");
        System.out.println(
                "||  || \\      // ||     ||      || //      //  \\     || \\   ||     //  \\        ||     ||     ||     //  \\     || \\   ||    ||");
        System.out.println(
                "||  ||  \\    //  ||     ||      ||//      //====\\    ||  \\  ||    //====\\       ||     ||     ||    //====\\    ||  \\  ||    ||");
        System.out.println(
                "||  ||   \\  //   ||     ||      || \\    //      \\   ||   \\ ||   //      \\      ||     \\     //   //      \\   ||   \\ ||    ||");
        System.out.println(
                "||  ||    \\//    ||     ||      ||  \\  //        \\  ||    \\||  //        \\     ||      \\===//   //        \\  ||    \\||    ||");
        System.out.println(
                "||================================================================================================================================||");
        System.out.println();

        System.out.println(
                "The moment you cross the threshold to Mogul, a suffocating weight settles into your chest. The air itself is different here.");
        System.out.println();

        System.out.println(">> Press ENTER to continue...");
        scan.nextLine();
    }
}
