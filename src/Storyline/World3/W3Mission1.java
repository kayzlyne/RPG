package Storyline.World3;

import Core.PlayerCharacter;
import java.util.Scanner;

public class W3Mission1 {
    public static void w3mission1 (PlayerCharacter player){
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

        System.out.println("You breathe deeply, and for a fleeting moment, the pain, exhaustion, and fear of Mogul seem to melt away.");
        sc.nextLine();

        System.out.println("But then, beneath the floral sweetness, something unsettles your senses. A faint metallic tang of blood, sharp and intrusive,\nmingles with the thick syrupy scent of venom. The paradise shimmers, but the air carries a quiet warning:\nMt. Kanatuan may shine like heaven, but even paradise can wear the mask of hell.");
        System.out.println("\nAndrea: We should search our surroundings for clues and any signs of life.\n");
        System.out.println("You nod and begin to search for any clues and materials that could be of help. As you walk down the mountain,\nyou notice claw marks on the trees.\nYou and Andrea begin to cautiously follow the trail and eventually end up with a small clearing with a fallen tree in the middle.\nYou scan the area and see a small, ragged satchel beside the tree trunk. You inspect it and find Recovery potions and a pack of pet feed.\n");
        //Player obtains HP Potion, MANA Potion, PET Feed
        System.out.println("Andrea: That’s a nice find!\n");
        System.out.println(player.name + ": Indeed. We should go explore the mountain some more.\n");
        System.out.println("As you and Andrea walk further into the heart of the mountain, she grips your hand, effectively halting your progress.\nShe gestures towards the thickening cloud of mist in front of you.\n");
        System.out.println("Andrea: That's enchanted mist. It will boil the skin off your bones. Whatever you do, don't let it touch you.\n");
        System.out.println("Instinctively, you take a step back, moving away from the deadly mist.\nYou trust that Andrea would know what she's talking about. She is a diwata, after all.\nShe would feel most at home in the forest.\n");
        System.out.println("But your blood runs cold when you hear the chilling wails of infants behind you.\nThe crying soon morphs into cruel, mischievous laughter, and you come face-to-face with the bane of your kind's existence: a tiyanak.");
        System.out.println("Backing away, you hiss when the mist comes into contact with just a small patch of your skin.\nThe tiyanak's laughter rises in pitch when more of its friends come out of the bushes to join it.\nFour of them now stand before you, their sharp black teeth glinting with viscera. Andrea raises her blessed steel,\nand you know exactly what she's thinking: you have no choice but to fight these creatures.");
        //Player fights 4 Tiyanaks

    }
}
