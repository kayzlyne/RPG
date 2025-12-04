package Storyline.World3;

import Core.*;
import Storyline.DialogueUtils;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;



public class W3Mission1 {
    public static boolean w3mission1 (PlayerCharacter player){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("================================================");
        System.out.println("       MISSION 1:  KNOWING THE MOUNTAIN ");
        System.out.println("================================================");
        System.out.println();

        System.out.println("After persevering through Mogul’s suffocating darkness for days on end, Mt. Kanatuan’s gentle sunrise leaves you nearly blinded.");
        System.out.println("The world here feels impossibly alive. A breathtaking contrast to the graveyard realm you’ve just escaped from.");
        System.out.println("Where Biringan City gleams with its golden towers and Mogul festers in its decay, Mt. Kanatuan blooms as a living paradise\nradiant enough to make even the Garden of Eden blush with envy.");
        System.out.println("Birdsong fills the air like a hymn of rebirth. Tiny sparrows dart between canopies teeming with fruit, while jeweled insects\nhover lazily above blossoms painted in every hue of creation.");
        System.out.println("Sampaguita, ylang-ylang, and wild orchids weave their fragrance together in a perfume of divine creation.");
        System.out.println("Even the snakes, their scales glistening like ribbons of silk, coil peacefully among dew-kissed branches, basking in the warmth of the newborn sun.");
        sc.nextLine();

        System.out.println("Tired from the journey, you and Andrea sit down for a while, savoring the rare peace.");
        sc.nextLine();

        player.rest();
        DialogueUtils.pause();

        System.out.println("You breathe deeply, and for a fleeting moment, the pain, exhaustion, and fear of Mogul seem to melt away.");
        sc.nextLine();

        System.out.println("But then, beneath the floral sweetness, something unsettles your senses. A faint metallic tang of blood, sharp and intrusive,\nmingles with the thick syrupy scent of venom. The paradise shimmers, but the air carries a quiet warning:\nMt. Kanatuan may shine like heaven, but even paradise can wear the mask of hell.");
        sc.nextLine();
        System.out.println("\nAndrea: We should search our surroundings for clues and any signs of life.\n");
        sc.nextLine();
        System.out.println("You nod and begin to search for any clues and materials that could be of help. As you walk down the mountain,\nyou notice claw marks on the trees.\nYou and Andrea begin to cautiously follow the trail and eventually end up with a small clearing with a fallen tree in the middle.\nYou scan the area and see a small, ragged satchel beside the tree trunk. You inspect it and find Recovery potions and a pack of pet feed.\n");
        sc.nextLine();

        Item hpPotion = new Item("Health Potion", 0, "Restores HP to full", ItemType.HEALTH);
        Item manaPotion = new Item("Mana Potion", 0, "Restores Mana to full", ItemType.MANA);
        Item petFood = new Item("Pet Food", 0, "Increases pet's healing power", ItemType.PET_FOOD);

        player.addItem(hpPotion);
        player.addItem(manaPotion);

        if (player.hasPet()) {
            player.getPet().increaseHealingPower(5);
            System.out.println("🍖 You found Pet Food! Your pet's healing power has increased by 5 HP!");
        } else {
            System.out.println("🍖 You found Pet Food, but you don't have a pet. The item is discarded.");
        }

        System.out.println("🧪 You found a Health Potion and a Mana Potion!\n");
        System.out.println("Andrea: That’s a nice find!\n");
        sc.nextLine();
        System.out.println(player.name + ": Indeed. We should go explore the mountain some more.\n");
        sc.nextLine();
        System.out.println("As you and Andrea walk further into the heart of the mountain, she grips your hand, effectively halting your progress.\nShe gestures towards the thickening cloud of mist in front of you.\n");
        sc.nextLine();
        System.out.println("Andrea: That's enchanted mist. It will boil the skin off your bones. Whatever you do, don't let it touch you.\n");
        sc.nextLine();
        System.out.println("Instinctively, you take a step back, moving away from the deadly mist.\nYou trust that Andrea would know what she's talking about. She is a diwata, after all.\nShe would feel most at home in the forest.\n");
        System.out.println("But your blood runs cold when you hear the chilling wails of infants behind you.\nThe crying soon morphs into cruel, mischievous laughter, and you come face-to-face with the bane of your kind's existence: a tiyanak.");
        System.out.println("Backing away, you hiss when the mist comes into contact with just a small patch of your skin.\nThe tiyanak's laughter rises in pitch when more of its friends come out of the bushes to join it.\nFour of them now stand before you, their sharp black teeth glinting with viscera. Andrea raises her blessed steel,\nand you know exactly what she's thinking: you have no choice but to fight these creatures.");
        sc.nextLine();
        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.TIYANAK, 3);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 3, false);

        if (!survived) {
            return false;
        }

        sc.nextLine();

        if (player.isAlive()) {
            System.out.println("After the tedious fight with the tiyanak, you and Andrea sit by the side of a stream to recuperate and recover your energy.\n");
            sc.nextLine();

            player.rest();
            DialogueUtils.pause();

            System.out.println("But after only an hour or two, your peaceful respite is interrupted by the sound of footsteps from a distance.\n");
            sc.nextLine();
            System.out.println("???: Over there!!! Spread out and search the area. That traitor couldn't have gone far.\n");
            sc.nextLine();
            System.out.println("Before they can come any closer, you and Andrea move to take cover in a secluded area behind some thick bushes.\nSimultaneously, you and Andrea still your breaths when you hear footsteps stop right in front of your hiding place.\n");
            sc.nextLine();
            System.out.println("???: What will we do with Kheila when we find her, Commander?\n");
            sc.nextLine();
            System.out.println("Commander: Don't even say that name in front of me.\n");
            sc.nextLine();
            System.out.println("You hear the commander seemingly spitting in disgust at the traitor they speak of.\n");
            sc.nextLine();
            System.out.println("Commander: Trashy lowlife sympathiser! She will be brought to her knees in front of the mistress and executed for her crimes.\n");
            sc.nextLine();
            System.out.println("???: Commander, we've found some tracks heading south.\n");
            sc.nextLine();
            System.out.println("Commander: Alright, move out. We must catch that traitor!\n");
            sc.nextLine();
            System.out.println("You wait for a few more minutes after they leave before getting out of your hiding place.\n");
            sc.nextLine();
            System.out.println("Andrea: Those were Babaylans. They said they were looking for a traitor.\nDo you think we should look for whoever that Kheila is and ask for her help?\nShe might have some information against the Babaylans.\n");
            sc.nextLine();
            System.out.println(player.name + ": Let’s go. It’s definitely worth a try.\n");
            sc.nextLine();
            System.out.println("You follow the tracks of deep footprints, broken branches,\nand streaks of blood winding down a narrow path into the lower forest.\nThe air grows dense with mist, and the once-cheerful songs of birds fade into silence.\n");
            sc.nextLine();
            System.out.println("After several minutes, you spot flickering lights ahead—a camp.\n");
            System.out.println("You crouch behind a fallen log. In the clearing, several Babaylans circle a campfire.\nBound and gagged near the flames sits a woman with matted hair and bruised wrists.\n");
            sc.nextLine();
            System.out.println("Andrea: That must be her… Kheila.\n");
            sc.nextLine();
            System.out.println("Commander: Tighten her bonds! The Mistress will be pleased once we drag this traitor back to the altar.\n");

            while (true) {
                try {
                    System.out.println("[Press 1] Create a distraction while Andrea frees Kheila");
                    System.out.println("[Press 2] Stealth attack the Babaylans before they notice you");
                    System.out.print("Enter your choice: ");

                    int choice = sc.nextInt();

                    if (choice == 1) {
                        System.out.println("You throw a stone to the far side of the camp. A few Babaylans turn to investigate the noise. Andrea slips through the shadows toward Kheila, cutting the ropes binding her wrists.");
                        break;
                    } else if (choice == 2) {
                        System.out.println("You and Andrea move in silently, striking fast. The nearest Babaylan falls before he can even shout. Kheila’s eyes widen in shock as Andrea slices through her bindings.");
                        break;
                    } else {
                        System.out.println("❌ Invalid choice. Please enter 1 or 2.\n");

                    }
                } catch (InputMismatchException e) {
                    System.out.println("❌ Invalid input. Please enter 1 or 2.\n");
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("⚠️ An unexpected error occurred: " + e.getMessage());
                    sc.nextLine();
                }
            }


            System.out.println("Commander: Intruders! Stop them!\n");
            sc.nextLine();

            List<Enemy> enemies2 = EnemyFactory.spawnEnemies(EnemyType.BABAYLANS, 3);
            BattleManager battle2 = new BattleManager();
            survived = battle2.startBattle(player, enemies2, 3, false);

            if (!survived) {
                return false;
            }

            if (player.isAlive()) {
                System.out.println("You and Andrea finish off the last of the enemies. The remaining Babaylans scatter into the forest.\n");
                System.out.println("You kneel beside the rescued woman. She’s breathing heavily, clutching at her raw wrists.\n");
                sc.nextLine();
                System.out.println(player.name + ": You’re safe now. You’re Kheila, right?\n");
                sc.nextLine();
                System.out.println("Kheila: I.. I thought I was done for. Thank you. I don’t know who you are, but the Babaylans will hunt you for this.\n");
                sc.nextLine();
                System.out.println("Andrea: Let them. We’re looking for them anyway. Why were they after you?\n");
                sc.nextLine();
                System.out.println("Kheila: I was one of them. I helped with their rituals until I learned what they were truly planning.\n" +
                                   "They want to merge the powers of Mogul and the mortal world so they can make\nthe Babaylan Mistress the ruler of Biringan City and control all the powers and riches it has to offer.\nI tried to warn the others, but they called me a traitor.\n");
                sc.nextLine();
                System.out.println(player.name + ": Tria mentioned something. A “Babaylan’s plan.” So it’s true, then?\n");
                sc.nextLine();
                System.out.println("Kheila: Yes, but all is not lost. I stole this from their leader before I ran away.\n");
                sc.nextLine();
                System.out.println("Kheila reaches into her tattered cloak and pulls out a worn, ancient scroll, its edges blackened as if burned.\n");
                sc.nextLine();
                System.out.println("Kheila: This contains a clue to find the Babaylan’s best-kept secret:\na weapon that has the power to destroy even the strongest of them all.\n");

            } else {
                System.out.println("Skill issue. Please try again.");
            }
        } else {
            System.out.println("Skill issue. Please try again.");
        }
        DialogueUtils.pause();

        return true;
    }
}
