package Storyline;

import java.util.Scanner;

public class DialogueUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static void pause() {
        try {
            System.out.println(">> Press ENTER to continue...");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("⚠️ Input error. Skipping pause.");
        }
    }
}

