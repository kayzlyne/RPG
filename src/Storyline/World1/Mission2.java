package Storyline.World1;

import Core.PlayerCharacter;
import Storyline.DialogueUtils;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Mission2 {

    public static boolean helpedBeggar = false;

    public static void mission2(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);

        System.out.println("            ===================================================================================================================================");
        System.out.println(
                         "            ░▀▄░░▀▄░░░░█▄█░▀█▀░█▀▀░█▀▀░▀█▀░█▀█░█▀█░░░▀▀▄░░░░░░░█▀█░░░▄▀▄░░█░█░█▀▀░█▀▀░▀█▀░▀█▀░█▀█░█▀█░░░█▀█░█▀▀░░░█░█░█▀█░█▀█░█▀█░█▀▄░░░░▄▀░░▄▀\n"
                        +"            ░░▄▀░░▄▀░░░█░█░░█░░▀▀█░▀▀█░░█░░█░█░█░█░░░▄▀░░░▀░░░░█▀█░░░█\\█░░█░█░█▀▀░▀▀█░░█░░░█░░█░█░█░█░░░█░█░█▀▀░░░█▀█░█░█░█░█░█░█░█▀▄░░░▀▄░░▀▄\n"
                        +"            ░▀░░░▀░░░░░▀░▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀▀▀░▀░▀░░░▀▀▀░░▀░░░░▀░▀░░░░▀\\░░▀▀▀░▀▀▀░▀▀▀░░▀░░▀▀▀░▀▀▀░▀░▀░░░▀▀▀░▀░░░░░▀░▀░▀▀▀░▀░▀░▀▀▀░▀░▀░░░░░▀░░░▀"
        );
        System.out.println("            ===================================================================================================================================");

        scan.nextLine();

        System.out.println("After your encounter with Sean, your spirits are high.");
        System.out.println("Your heart soars with hope at the thought of being able to help someone, but you still have a long day ahead of you.");
        System.out.println("It is now time to make your way to the Information Guild, in order to get to the bottom of the strange air swirling around Biringan City.");
        System.out.println("You decide to take a shortcut through an empty alley.");
        scan.nextLine();
        System.out.println("But as you round the corner, you see that this alley was not quite as empty as you had thought.");
        System.out.println("There is a man sprawled in a heap on the floor, seemingly down on his luck.");
        System.out.println("You wrinkle your nose as the stains and the stench of the grimy streets have seemingly merged with the tattered clothing the man wears.");
        System.out.println("His head whips toward you the moment you walk by, and he holds out an open palm.");
        DialogueUtils.pause();

        System.out.println("Beggar: Please, kind stranger, do you have any barya to spare?");
        scan.nextLine();
        System.out.println("Beggar: I have been sick for days, but I do not have the twenty barya needed to pay for medicine.");
        scan.nextLine();
        System.out.println("Beggar: Won’t you spare a poor beggar some mercy?");
        scan.nextLine();

        System.out.println("The man starts coughing halfway through his last sentence, his body shaking violently as he’s overwhelmed by the coughing fit,");
        System.out.println("and you fight the urge to say yes to him immediately. You may not be stricken with a terrible illness, but you are not much better off");
        System.out.println("than this beggar, either, for you only have twenty pesos to your name. But you know that in this part of the city, it’s every man for himself.");
        System.out.println("If you do not help him, no one else will, and he will be a dead man by tomorrow.");
        scan.nextLine();

        while(true) {

            System.out.println(">> Do you give away your only money to help a begging stranger?");
            System.out.println("[1] Yes");
            System.out.println("[2] No");
            System.out.println();
            System.out.print("Enter your choice: ");

            try {
                int choice = scan.nextInt();
                if (choice == 2) {
                    System.out.println();
                    System.out.println("You have chosen not to help the beggar.");
                    System.out.println();
                    scan.nextLine();
                    System.out.println(player.name + ": I’m sorry, friend, but I do not have the money to spare. Best of luck to you.");
                    scan.nextLine();
                    System.out.println("With those parting words, you walk away. The crestfallen look on the man’s face stays with you as you make your way towards the Information Guild,");
                    System.out.println("but you quickly put it out of your mind. Great adventures await, after all.");
                    break;
                } else if (choice == 1){
                    helpedBeggar = true;
                    System.out.println();
                    System.out.println("You have chosen to help the beggar.");
                    scan.nextLine();
                    System.out.println(player.name + ": Here’s " + player.getBarya() + " pesos. I’m sorry, it’s all I have, but I do hope you can use it to seek treatment for your illness.");
                    scan.nextLine();
                    System.out.println("Beggar: You would offer me all the money you have?");
                    scan.nextLine();
                    System.out.println(player.name + ": Why, of course. You seem to need it more than I do. It’s only the right thing to do.");
                    scan.nextLine();
                    System.out.println("To your astonishment, the beggar surges upward with surprising strength, despite his earlier condition, and envelopes you in a hug.");
                    scan.nextLine();
                    System.out.println("Beggar: Thank you so much! I have been wasting away in this alley for a week, and you are the first to ever offer me kindness.");
                    scan.nextLine();
                    System.out.println(player.name + ": It was no problem, truly. I must go, though, for I am on a mission. Best of luck to you, my friend.");
                    scan.nextLine();
                    System.out.println("Beggar: And to you. May the Gods bless you.");
                    System.out.println();

                    DialogueUtils.pause();
                    System.out.println("Smiling warmly, you walk away from the alley and towards the Information Guild.");
                    System.out.println("That is when you remember that you had some suman tucked away in your pocket for lunch.");
                    System.out.println("You think of the beggar and decide that he needs it more than you do.");
                    System.out.println("But when you reach into your pocket, what greets your hand is not just the decadent suman, but the feeling of cold, hard coins as well.");
                    System.out.println();
                    System.out.println("Taking it out, you find coins worth 25 barya — ");
                    System.out.println("when before you were certain all your money was given away to the beggar.");
                    System.out.println("And when you look back at the alley, it now appears completely empty.");
                    System.out.println("Did you just get played by an encanto?");
                    System.out.println("Shaking your head, you try to put the previous encounter out of your thoughts and instead focus on your mission.");
                    DialogueUtils.pause();

                    //player.setBarya(player.getBarya() + 50);
                    player.addBarya(25);
                    System.out.println("💰 You received 25 barya!");
                    System.out.println("🏦 Total barya: " + player.getBarya());
                    break;
                } else {
                    System.out.println("❌ Invalid choice. Please enter 1 or 2.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input. Please enter 1 or 2.\n");
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("⚠️ An unexpected error occurred: " + e.getMessage());
                scan.nextLine();
            }
        }


        System.out.println("An hour later, you find yourself standing in the looming shadow of the Information Guild.");
        System.out.println("Its heavy oak doors, carved with runes of protection, creak as you push them open.");
        System.out.println();
        System.out.println("Inside, the air hums with the thick scent of ink, parchment, and candlewax.");
        System.out.println("Shelves groan under the weight of ancient scrolls, tomes, and artifacts that murmur faintly");
        System.out.println("in varying tongues of Bisaya, Waray, Tagalog, and even some ancient languages now lost to time.");
        System.out.println("Watchful slitted eyes follow you as you step forward.");
        System.out.println();
        System.out.println("An elderly Tamawo scribe greets you. Despite his age, his pale, handsome face and sparkling skin radiate a disarming allure.");
        scan.nextLine();
        System.out.println("Scribe: You carry the scent of the alleyways with you, child.");
        scan.nextLine();
        System.out.println("Scribe: You must have travelled far just to find our humble guild.");
        scan.nextLine();
        System.out.println("Scribe: Tell me, what knowledge do you seek?");
        scan.nextLine();
        System.out.println(player.name + ": I am investigating the recent increase in illicit happenings around the city.");
        scan.nextLine();
        System.out.println(player.name + ": My friend Sean told me that there have been rumors of Diwatas and Encantos going missing lately.");
        scan.nextLine();
        System.out.println(player.name + ": He told me that you would be able to offer me more information about that.");
        scan.nextLine();
        System.out.println("Scribe: Oh, you know Sean?");
        scan.nextLine();
        System.out.println(player.name + ": I kinda saved him from being robbed in broad daylight just before coming here.");
        scan.nextLine();
        System.out.println("Scribe: Thank you! Sean is a valued member of our guild. Here, have this as a small token of our gratitude.");
        scan.nextLine();
        //player.setBarya(player.getBarya() + 50);
        player.addBarya(25);
        System.out.println("💰 You received 25 barya!");
        System.out.println("🏦 Total barya: " + player.getBarya());

        scan.nextLine();
        System.out.println("Scribe: The vanishings are no mere rumor. Our informants speak of Bungisngis prowling the outskirts of the city.");
        scan.nextLine();
        System.out.println("Scribe: These laughing beasts, though dim of wit, are bound by new masters.");
        scan.nextLine();
        System.out.println("Scribe: They work with tiyanaks who drag Enkantos and Diwatas into the Dark Forest, where they are carted off like mere cattle and brought to the land of the Aswangs.");
        scan.nextLine();
        System.out.println("He presses a worn map into your hand, the edges trembling faintly as though the parchment itself feared what it depicted.");
        scan.nextLine();
        System.out.println("Scribe: If you truly wish to stand against them, then steel yourself. It is not named the Dark Forest for no reason.");
        scan.nextLine();
        System.out.println("Scribe: The forest is alive. And it does not forgive trespassers easily.");
        scan.nextLine();
        System.out.println("The chamber grows colder as the candles flicker low.");
        System.out.println("Outside, the wind howls, carrying with it faint echoes of laughter—low, booming, and unending.");
        System.out.println();
        System.out.println("Your next step is clear. The Dark Forest awaits.");
        DialogueUtils.pause();
    }
}
