package Storyline;

public class Opening {
    public static void opening() {

        /*
        System.out.println("+------------------------------------------------+");
        System.out.println("|             Welcome, Traveler, to              |");
        System.out.println("|              *  SALAMING LIHIM  *              |");
        System.out.println("|                                                |");
        System.out.println("|   Where myths breathe, and shadows move        |");
        System.out.println("|        in Biringan's hidden realm...           |");
        System.out.println("+------------------------------------------------+");
        System.out.println();
         */

        System.out.println("\n\n          █     █░▓█████  ██▓     ▄████▄   ▒█████   ███▄ ▄███▓▓█████    ▄▄▄█████▓ ██▀███   ▄▄▄    ██▒   █▓▓█████  ██▓    ▓█████  ██▀███         ");
        System.out.println("          ▓█░ █ ░█░▓█   ▀ ▓██▒    ▒██▀ ▀█  ▒██▒  ██▒▓██▒▀█▀ ██▒▓█   ▀    ▓  ██▒ ▓▒▓██ ▒ ██▒▒████▄ ▓██░   █▒▓█   ▀ ▓██▒    ▓█   ▀ ▓██ ▒ ██▒      ");
        System.out.println("          ▒█░ █ ░█ ▒███   ▒██░    ▒▓█    ▄ ▒██░  ██▒▓██    ▓██░▒███      ▒ ▓██░ ▒░▓██ ░▄█ ▒▒██  ▀█▄▓██  █▒░▒███   ▒██░    ▒███   ▓██ ░▄█ ▒      ");
        System.out.println("          ░█░ █ ░█ ▒▓█  ▄ ▒██░    ▒▓▓▄ ▄██▒▒██   ██░▒██    ▒██ ▒▓█  ▄    ░ ▓██▓ ░ ▒██▀▀█▄  ░██▄▄▄▄██▒██ █░░▒▓█  ▄ ▒██░    ▒▓█  ▄ ▒██▀▀█▄        ");
        System.out.println("          ░░██▒██▓ ░▒████▒░██████▒▒ ▓███▀ ░░ ████▓▒░▒██▒   ░██▒░▒████▒     ▒██▒ ░ ░██▓ ▒██▒ ▓█   ▓██▒▒▀█░  ░▒████▒░██████▒░▒████▒░██▓ ▒██▒      ");
        System.out.println("          ░ ▓░▒ ▒  ░░ ▒░ ░░ ▒░▓  ░░ ░▒ ▒  ░░ ▒░▒░▒░ ░ ▒░   ░  ░░░ ▒░ ░     ▒ ░░   ░ ▒▓ ░▒▓░ ▒▒   ▓▒█░░ ▐░  ░░ ▒░ ░░ ▒░▓  ░░░ ▒░ ░░ ▒▓ ░▒▓░      ");
        System.out.println("            ▒ ░ ░   ░ ░  ░░ ░ ▒  ░  ░  ▒     ░ ▒ ▒░ ░  ░      ░ ░ ░  ░       ░      ░▒ ░ ▒░  ▒   ▒▒ ░░ ░░   ░ ░  ░░ ░ ▒  ░ ░ ░  ░  ░▒ ░ ▒░      ");
        System.out.println("            ░   ░     ░     ░ ░   ░        ░ ░ ░ ▒  ░      ░      ░        ░        ░░   ░   ░   ▒     ░░     ░     ░ ░      ░     ░░   ░       ");
        System.out.println("           ░       ░  ░    ░  ░░ ░          ░ ░           ░      ░  ░               ░           ░  ░   ░     ░  ░    ░  ░   ░  ░   ░           ");
        System.out.println("                          ░                                                                    ░                                           ");
        System.out.println("        ▄▄▄█████▓ ▒█████           ██████  ▄▄▄       ██▓    ▄▄▄       ███▄ ▄███▓ ██▓ ███▄    █   ▄████     ██▓     ██▓ ██░ ██  ██▓ ███▄ ▄███▓   ");
        System.out.println("        ▓  ██▒ ▓▒▒██▒  ██▒       ▒██    ▒ ▒████▄    ▓██▒   ▒████▄    ▓██▒▀█▀ ██▒▓██▒ ██ ▀█   █  ██▒ ▀█▒   ▓██▒    ▓██▒▓██░ ██▒▓██▒▓██▒▀█▀ ██▒   ");
        System.out.println("        ▒ ▓██░ ▒░▒██░  ██▒       ░ ▓██▄   ▒██  ▀█▄  ▒██░   ▒██  ▀█▄  ▓██    ▓██░▒██▒▓██  ▀█ ██▒▒██░▄▄▄░   ▒██░    ▒██▒▒██▀▀██░▒██▒▓██     ▓██░  ");
        System.out.println("        ░ ▓██▓ ░ ▒██   ██░         ▒   ██▒░██▄▄▄▄██ ▒██░   ░██▄▄▄▄██ ▒██    ▒██ ░██░▓██▒  ▐▌██▒░▓█  ██▓   ▒██░    ░██░░▓█ ░██ ░██░▒██     ▒██   ");
        System.out.println("          ▒██▒ ░ ░ ████▓▒░       ▒██████▒▒ ▓█   ▓██▒░██████▒▓█   ▓██▒▒██▒   ░██▒░██░▒██░   ▓██░░▒▓███▀▒   ░██████▒░██░░▓█▒░██▓░██░▒██▒    ░██▒  ");
        System.out.println("         ▒ ░░   ░ ▒░▒░▒░         ============================================================================================================   ");
        System.out.println("           ░      ░ ▒ ▒░         ░ ░▒  ░ ░  ▒   ▒▒ ░░ ░ ▒  ░ ▒   ▒▒ ░░  ░      ░ ▒ ░░ ░░   ░ ▒░  ░   ░    ░ ░ ▒  ░ ▒ ░ ▒ ░▒░ ░ ▒ ░░  ░      ░   ");
        System.out.println("         ░      ░ ░ ░ ▒          ░  ░  ░    ░   ▒     ░ ░    ░   ▒   ░      ░    ▒ ░   ░   ░ ░ ░ ░   ░      ░ ░    ▒ ░ ░  ░░ ░ ▒ ░░      ░      ");
        System.out.println("                  ░ ░           ░        ░  ░    ░  ░     ░  ░       ░    ░           ░       ░        ░  ░ ░   ░  ░  ░ ░         ░             ");
        System.out.println("                                                                                                                                           ");
        System.out.println("                                                   ~------~ WHERE MYTHS BREATHE, AND SHADOWS MOVE ~------~                                      ");
        System.out.println("                                                       ~------~ IN A MYSTERIOUS HIDDEN REALM ~------~                                          ");




/*
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                                             ___________                                                     |");
        System.out.println("|  __      __       .__                                      |____   ____|                               .__                  |");
        System.out.println("| /  \\    /  \\ ____ |  |  _____  ____  _____   _____             |   |  ______  ______ ___     ___ _____ |  |  _____  ______  |");
        System.out.println("| \\   \\/\\/   // __ \\|  | /  ___\\/  _ \\/     \\_/  __ \\            |   |_/  __  \\/   _   |\\ \\   /  //  __ \\|  | /  __ \\/  __  \\ |");
        System.out.println("|  \\        /\\  ___/|  |_\\  \\__(  <_> )  Y Y  \\  ___/            |   | |  / \\_/\\  <_>  | \\ \\_/  / \\  ___/|  |_\\  ___/|  / \\_/ |");
        System.out.println("|   \\__/\\  /  \\___  >____/\\___  >____/|__|_|  /\\___  >           |__ | |_ |     \\___/| |  \\   _/   \\___  >____/\\___ >_  |     |");
        System.out.println("|        \\/       \\/          \\/            \\/     \\/               \\/   \\/           \\/   \\/          \\/      \\/     \\/      |");
        System.out.println("|                                                           __                                                                |");
        System.out.println("|                                                          |  |                                                               |");
        System.out.println("|                                                        __|  |__                                                             |");
        System.out.println("|                                                       |__   __|  ____                                                       |");
        System.out.println("|                                                          |  |  /  _  \\                                                      |");
        System.out.println("|                                                          |  | (  <->  )                                                     |");
        System.out.println("|        ____                                /\\            |__|  \\_____/      .__    /\\        /\\              ___            |");
        System.out.println("|       /    \\        .__                    \\/                               |  |   \\/ __     \\/              | |            |");
        System.out.println("|      /  /___/ ______|  |   ______  ______ ___ _____  ______                 |  |   __|  |    __ ______       | |            |");
        System.out.println("|     \\___  \\ /   -   |  | /   _   |/      \\| |/     \\/   _   \\               |  |___| |  |__ | |/      \\      | |            |");
        System.out.println("|      /  /  /\\  <->  |  |_\\  <->  |   Y Y  | |  Y\\  |   ()   |               |      | |  Y  \\| |  Y Y   |     \\_/            |");
        System.out.println("|     \\____  > \\___/| |____/\\___/| |__|_|  /|_|__| | |\\____/| |               |___  /|_|___/\\ |_|__|_|  /                     |");
        System.out.println("|          \\/        \\/           \\/     \\/        \\/  (_____/                    \\/         \\/       \\/       (_)            |");
        System.out.println("|                                                                                                                             |");
        System.out.println("|                                ~------~ WHERE MYTHS BREATHE, AND SHADOWS MOVE ~------~                                      |");
        System.out.println("|                                     ~------~ IN A MYSTERIOUS HIDDEN REALM ~------~                                          |");
        System.out.println("|                                                                                                                             |");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------+");


 */
        System.out.println();
        System.out.println("Prepare yourself -- your journey begins now!");
        DialogueUtils.pause();


        System.out.println("+============================================================+");
        System.out.println("|                          SYNOPSIS                          |");
        System.out.println("+============================================================+");
        System.out.println();
        System.out.println("Hidden between the lull of civilization and the thick mountains of the countryside lies a place of wonder and mystique.");
        System.out.println("A shining metropolis glittering with so much gold and riches you could hardly believe it exists.");
        System.out.println();
        System.out.println("This mystical place is BIRINGAN CITY, a melting pot of creatures once thought to be only folklore.");
        System.out.println("Great lumbering Kapres and screeching Manananggals roam the streets.");
        System.out.println();
        System.out.println("But in this once peaceful city, TROUBLE BEGINS TO BREW.");
        System.out.println("The Babaylans seek to take control of all mythical creatures, and bring Biringan City to its knees.");
        System.out.println();
        System.out.println("Amidst the chaos, a spark of JUSTICE is awakened.");
        System.out.println("Out of the ashes... A HERO APPEARS.");
        System.out.println();
        System.out.println("+=============================================================+");
        DialogueUtils.pause();
    }
}
