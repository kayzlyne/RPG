package World2;

import Core.PlayerCharacter;
import java.util.Scanner;

public class W2Mission2 {
    public static void w2mission2(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("================================================");
        System.out.println("          MISSION 2:  TO SAVE A FRIEND ");
        System.out.println("================================================");
        System.out.println();

        System.out.println(
                "As you search for medicinal herbs, you come across a marsh with strange mushrooms growing around.\n");
        System.out.println("You immediately go near and inspect the mushrooms.\n");
        System.out.println(">> Press ENTER to continue...");
        scan.nextLine();
        // select opt 1 (take mushroom, random (-5/-10)) or opt 2 (avoid mushroom, looks
        // poisonous)
        // opt 1 dialogue, opt 2 dialogue
        System.out.println("Press 1: Take the mushrooms. It could be the cure {-5/-10 hp}\n" +
                "Press 2: Avoid the mushrooms and look for something else. It looks poisonous. \n");
        int choice = scan.nextInt();
        if (choice == 1){
            System.out.println("???: You’ve just brought yourself closer to death.");
        } else {
            System.out.println("???: You have keen eyes and a good survival instinct.");
        }
        scan.nextLine();
        System.out.println(
                "You hear a voice from beside you, and you see an old man dressed in leather and leaves, matching the colors of the marsh.\n");
        System.out.println("A bag is slung across his chest and his leather belt, carrying herbs and a potion bottle.\n");
        scan.nextLine();
        System.out.println(player.name + ": Who are you?\n");
        scan.nextLine();
        System.out.println("???: You don’t need to know who I am, but I think you need to know what I do.\n");
        scan.nextLine();
        System.out.println(player.name + ": And… What do you do?\n");
        scan.nextLine();
        if (choice == 1){
            System.out.println("???: I’m a Tambalan. Although I can give you the antidote to the mushroom’s potion, I will not. That serves as your lesson in life.\n");
            System.out.println(player.name + ": Wait, you’re a Tambalan? Sir, you don’t need to give me the antidote. Instead, please save my friend. She’s dying.\n");
        } else if (choice == 2){
            System.out.println("???: I’m a Tambalan. It looks like you need some help.");
            System.out.println(player.name + ": Wait, you’re a Tambalan? Sir, please save my friend. She’s dying.\n");
        }
        scan.nextLine();
        System.out.println("Tambalan: Hmm… I see. Well, I can save your friend. But you must do something for me in return.\n");
        scan.nextLine();
        System.out.println(player.name + ": Alright, I will. Just please save my friend.\n");
        scan.nextLine();
        System.out.println("The Tambalan nods, and you take him to the small boulder where you left Andrea. The color of her skin has turned very pale, and her eyes are nearly closed.\n");
        scan.nextLine();
        System.out.println(player.name + ": Andrea! Stay awake!\n");
        scan.nextLine();
        System.out.println("You rush to Andrea’s side and make sure she stays awake. The tambalan approaches and kneels down to inspect her condition. He then reaches for a potion in his bag and opens it for Andrea to drink, tilting it against her lips carefully. Andrea swallows weakly, her body trembling.Color slowly returns to her cheeks, though her eyes remain closed.\n");
        scan.nextLine();
        System.out.println("Tambalan: She will live. But your debt begins now.");
        scan.nextLine();
        System.out.println("A sudden shriek cuts through the marshlands, high and guttural. From the treeline, a shape emerges—elongated limbs, a mouth split too wide, dripping with black rot and fresh blood. An Aswang, its body shifting grotesquely between forms, crawls toward you with murderous intent. Its eyes lock not on you, but on the Tambalan.\n");
        scan.nextLine();
        System.out.println("Tambalan: It comes for me. They know I aided you, and they would see me dead for that crime. If you wish for your friend to live, you must keep me alive.\n");
        scan.nextLine();
        System.out.println("The Aswang snarls, wings unfurling with a crack of sinew. It takes to the sky and the shadows unnaturally bend around its sinister form.\n");
        scan.nextLine();
        System.out.println("Andrea stirs weakly behind you, whispering your name, her voice too frail to rise above the Aswang’s shrieks. The Tambalan stands his ground, clutching his satchel of herbs, but you know one thing: his fate now lies in your hands.\n");
        System.out.print(">> Press ENTER to continue...");
        scan.nextLine();
    }
}
