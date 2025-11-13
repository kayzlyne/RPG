package Storyline.World2;

import Core.*;
import Storyline.DialogueUtils;

import java.util.List;
import java.util.Scanner;

public class W2Mission2 {
    public static boolean w2mission2(PlayerCharacter player) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("================================================");
        System.out.println("          MISSION 2:  TO SAVE A FRIEND ");
        System.out.println("================================================");
        System.out.println();

        System.out.println(
                "As you search for medicinal herbs, you come across a marsh with strange mushrooms growing around.\n");
        System.out.println("You immediately go near and inspect the mushrooms.\n");
        DialogueUtils.pause();

        // select opt 1 (take mushroom, random (-5/-10)) or opt 2 (avoid mushroom, looks

        System.out.println("Press 1: Take the mushrooms. It could be the cure {-5/-10 hp}\n" +
                "Press 2: Avoid the mushrooms and look for something else. It looks poisonous. \n");
        int choice = scan.nextInt();
        if (choice == 1){
            System.out.println("???: You’ve just brought yourself closer to death.\n");
        } else {
            System.out.println("???: You have keen eyes and a good survival instinct.\n");
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
        System.out.println("The Tambalan nods, and you take him to the small boulder where you left Andrea.\nThe color of her skin has turned very pale, and her eyes are nearly closed.\n");
        scan.nextLine();
        System.out.println(player.name + ": Andrea! Stay awake!\n");
        scan.nextLine();
        System.out.println("You rush to Andrea’s side and make sure she stays awake. The tambalan approaches and kneels down to inspect her condition.\nHe then reaches for a potion in his bag and opens it for Andrea to drink, tilting it against her lips carefully.\nAndrea swallows weakly, her body trembling. Color slowly returns to her cheeks, though her eyes remain closed.\n");
        scan.nextLine();
        System.out.println("Tambalan: She will live. But your debt begins now.");
        scan.nextLine();
        System.out.println("Breathing out a sigh of relief, you slump in exhaustion next to Andrea's prone form. You allow yourself to rest as you think about what to do next.");
        scan.nextLine();
        player.rest();
        System.out.println("A few moments later, your brief respite is interrupted as a sudden shriek cuts through the marshlands, high and guttural. From the treeline, a shape emerges—elongated limbs,\na mouth split too wide, dripping with black rot and fresh blood. An Aswang, its body shifting grotesquely between forms,\ncrawls toward you with murderous intent. Its eyes lock not on you, but on the Tambalan.\n");
        scan.nextLine();
        System.out.println("Tambalan: It comes for me. They know I aided you, and they would see me dead for that crime.\nIf you wish for your friend to live, you must keep me alive.\n");
        scan.nextLine();
        System.out.println("The Aswang snarls, wings unfurling with a crack of sinew. It takes to the sky and the shadows unnaturally bend around its sinister form.\n");
        scan.nextLine();
        System.out.println("Andrea stirs weakly behind you, whispering your name, her voice too frail to rise above the Aswang’s shrieks.\nThe Tambalan stands his ground, clutching his satchel of herbs, but you know one thing: his fate now lies in your hands.\n");
        DialogueUtils.pause();

        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.ASWANG, 1);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 2, false);

        if (!survived) {
            return false;
        }
        System.out.println("\uD83D\uDCB0 You earned 15 barya for winning the battle!");
        scan.nextLine();
        player.addBarya(15);

        System.out.println("With one final strike, you drive the creature back. The Aswang lets out a keening howl before collapsing.\nIts body twists and contorts one last time, then dissolves into the black waters of the marsh.\n");
        scan.nextLine();
        System.out.println("The silence after the Aswang’s defeat lingers like a festering wound. You lower yourself to the ground, giving your tired legs a moment of rest");
        scan.nextLine();
        System.out.println("Andrea leans against the boulder,\nher breath steady but weak, her eyes barely open. You feel relief wash over you, but it’s cut short by the Tambalan’s voice.\n");
        scan.nextLine();
        System.out.println("Tambalan: Saving her life was only the first step. If you intend for your friend to survive Mogul, she cannot face it unarmed.\n");
        scan.nextLine();
        System.out.println("You glance at Andrea. Even in her state, you know she won’t accept being left behind. Her will is iron, but her body is failing.\n");
        scan.nextLine();
        System.out.println(player.name + ": Then tell me. How do we arm her?\n");
        scan.nextLine();
        System.out.println("Tambalan: There is only one weapon fit for her hands, forged not of mortal steel but of Mogul’s own essence.\nMy friend, a Pandai, guards it still. But he does not give freely.\n");
        scan.nextLine();
        System.out.println("The Tambalan’s eyes narrow, the wrinkles on his face tightening like carved stone.\n");
        scan.nextLine();
        System.out.println("Tambalan: Find him, and convince him. Only then will Andrea wield a weapon strong enough to cut through Mogul’s nightmares.\n Get some rest first. You must set out at the break of dawn.\n");
        DialogueUtils.pause();
        player.rest();
        DialogueUtils.pause();
        System.out.println("You're up at the first hint of bleak light across the dreary sky, wincing as your weary bones protest the endeavour.\n");
        scan.nextLine();
        System.out.println("Andrea forces herself to sit up, grimacing in pain.\n");
        scan.nextLine();
        System.out.println("Andrea: Don’t… don’t go alone. I’ll catch up… once I can stand.\n");
        scan.nextLine();
        System.out.println("You nod, tightening your grip on your weapon before setting out to find the Pandai.\n");
        scan.nextLine();
        player.rest();
        scan.nextLine();
        System.out.println("[\t                                   \t\t\t\t\t\t]");
        System.out.println("[\tCongratulations! You’re no longer friendless! (\u2060 \u2060ꈍ\u2060ᴗ\u2060ꈍ\u2060)\t]");
        System.out.println("[\tAndrea joins you on your adventure!\t\t\t\t\t\t]");
        System.out.println("[\t                                   \t\t\t\t\t\t]\n\n");
        DialogueUtils.pause();

        return true;
    }
}
