package Storyline.World3;

import Core.*;
import Storyline.DialogueUtils;
import java.util.List;
import java.util.Scanner;

public class W3Mission6 {
    public static boolean w3mission6(PlayerCharacter player) {
        Scanner sc = new Scanner(System.in);
        //UNEDITED
        System.out.println("===============================================");
        System.out.println("      MISSION 6: THE MISTRESS OF DARKNESS  ");
        System.out.println("===============================================");
        System.out.println("Your party descends the stairs, alert and vigilant of any ambushes. You reached another floor,\n" +
                "dark and empty. Only the light on the stairs brightens the place. Your party prepares in your attack\n" +
                "stances as you feel that you’re surrounded in the shadows. You turn to Kheila with a knowing look, she\n" +
                "nods in understanding and raises her staff. She casts a spell of light and the Babaylans hiding in the\n" +
                "shadows are revealed.\n");
        sc.nextLine();
        System.out.println("[You have encountered 10 Babaylans. Please choose a target and an attack.]");
        //insert battle
        System.out.println("The last Babaylan crouches in defeat. She looks up at Kheila weakly but with a resentful glare.\n");
        sc.nextLine();
        System.out.println("Babaylan: Traitor! We’ll never forgive you! Mistress Erika will never forgive you! She trusted you\n" +
                "above all! You…\n");
        sc.nextLine();
        System.out.println("The Babaylan coughs out blood and collapses without finishing her last words. Kheila looks at the\n" +
                "Babaylan with mixed emotions, but one emotion rises among them… guilt. Both you and Andrea notice this.\n");
        sc.nextLine();
        System.out.println("Andrea: Don’t listen to her, Kheila! You’re doing the right thing. You don’t need anyone’s forgiveness.\n");
        sc.nextLine();
        System.out.println("Kheila looks at Andrea weakly then nods her head with conviction.\n");
        sc.nextLine();
        System.out.println(player.name + ": Andrea’s right, Kheila. But will you be alright when facing Erika? If that Babaylan\n" +
                "is to be believed, it appears the two of you were close.\n");
        sc.nextLine();
        System.out.println("Kheila: We used to be the best of friends. But I’ll be alright. I can’t let Erika continue down this road.\n");
        sc.nextLine();
        System.out.println(player.name + ": We better brace ourselves. She’ll be behind this room.\n");
        sc.nextLine();
        System.out.println("Your grip tightens on the sword. Andrea exchanges weighted stares with you and Kheila before opening the door.\n");
        sc.nextLine();
        System.out.println("There, you see Erika in the middle of the room, surrounded by herbs and the ingredients for a ritual.\n");
        sc.nextLine();
        System.out.println("Kheila: She’s casting the spell! Erika! You must stop this madness.\n");
        sc.nextLine();
        System.out.println("Kheila's shout catches her attention, and Erika looks up, her eyes burning with divine fury.\n");
        sc.nextLine();
        //MEET BOSS EVENT FIGHT (ERIKA, THE MISTRESS OF THE BABAYLANS)

        System.out.println("Erika: So… you’re the Fool wielding the goddess’s toy. Do you even know whose war you’re fighting?\n");
        sc.nextLine();
        System.out.println("Kheila: You betrayed our kin! You were supposed to protect the balance, not destroy it!\n");
        sc.nextLine();
        System.out.println("Erika: Balance? Do you still believe in that? The humans promised us liberation. A world where\n" +
                "we’re no longer scorned, no longer hidden!\n");
        sc.nextLine();
        System.out.println("Andrea: And you believed them?\n");
        sc.nextLine();
        System.out.println("Erika lets out a bitter howl of laughter at that question.\n");
        sc.nextLine();
        System.out.println("Erika: You think they lied? They offered us power. A chance to rule beside them!\n");
        sc.nextLine();
        System.out.println("The ground shakes. The symbols on the walls shift from blue to a blood-red hue.\n");
        sc.nextLine();
        System.out.println(player.name + ": Power in exchange for obedience. You’ve been used, Erika.\n");
        sc.nextLine();
        System.out.println("Erika: Ridiculous!\n"); //changed content
        sc.nextLine();
        System.out.println("Andrea: They were never your allies, Erika. They were waiting to take it all. Mogul, Biringan,\n" +
                "even your people.\n");
        sc.nextLine();
        System.out.println("Erika thinks for a moment, then screams.\n");
        sc.nextLine();
        System.out.println("Erika: Then I’ll burn everything to the ground!\n");
        sc.nextLine();
        System.out.println("The ritual circle flares, her body absorbing corrupted power. She becomes monstrous.\n" +
                "A chimera that's part woman, part shadow flame.\n");
        sc.nextLine();
        //[You have angered the leader of the Babaylans. Choose your attack.]

        System.out.println("The Blade of Bulan glows fiercely, resonating with your heart. You strike, each blow cutting through\n" +
                "layers of darkness.\n");
        sc.nextLine();
        System.out.println("As Erika collapses, the corruption begins to peel away. Her voice trembles.\n");
        sc.nextLine();
        System.out.println("Erika: I… was supposed to rule everything…\n");
        sc.nextLine();
        System.out.println("Her body turns to silver dust, scattering into the air like moonlight.\n");
        sc.nextLine();
        System.out.println("A sudden voice echoes from above. Cold, mechanical, and human.\n");
        sc.nextLine();
        System.out.println("???: The operation is complete. Terminate all surviving Babaylans and invading mythical creatures. Begin Phase Two.\n");
        sc.nextLine();
        System.out.println("The runes flare. From the walls emerge armored silhouettes. Human soldiers wielding weapons that glow with stolen magic.\n");
        sc.nextLine();
        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.HUMANS, 3);
        BattleManager battle = new BattleManager();
        boolean survived = battle.startBattle(player, enemies, 3);

        if (!survived) {
            return false;
        }

        System.out.println("After defeating the last of the wretched human soldiers, Kheila sways on weak legs and falls to her knees\n" +
                "on the ground, tears running like a violent downpour from her eyes.\n");
        sc.nextLine();
        System.out.println("Kheila: The humans played us all. The Babaylans, the creatures of Mogul, even the goddess’s light.\n");
        sc.nextLine();
        System.out.println("Andrea: Then our war isn’t over. We stopped the Mistress, but the real enemy is still out there.\n");
        sc.nextLine();
        System.out.println(player.name + ": Then we fight them next. For Mogul. For Biringan. For all of us.\n");
        sc.nextLine();
        System.out.println("The Sanctum crumbles. The moonlight above dims and is soon replaced by the red glow of human war\n" +
                "machines rising over the horizon.\n");
        DialogueUtils.pause();

        return true;
    }
}
