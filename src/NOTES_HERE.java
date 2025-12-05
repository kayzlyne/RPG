public class NOTES_HERE {

    /*
    note: temporarily converted some of the battle implementations to comments para easier ang pag run through sa program while checking -ef

    TO DO!!!:

    -make sure mana regen is not negative and random. Must be constant.
    - ehrm ga sige ug plus ang max hp ug max mana when u level up but during battle if mo dako na kayo mana kay mo reset sha to starting na maxmana
    gituyo ni sha?
    - Test Run Game0
    -fix distance and spacing [ongoing for world 3 - k]
    player.resetCooldowns();

------------------------------------------------------------------

    For the story transfer, Make appropriate file/package.

    if you need player's name in the story, make the method:
    public static void TITLE(ex.M1)(PlayerCharacter player) {}
    else
    public static void TITLE(ex.M1)() {}

    To use in Main:
    ClassName.methodName(parameter);
    Example:
     Opening.opening();
     Intro1.intro1(player);

    For the name btw:
    use player.name
    Example: println(player.name + "");
    not + name +

    Spawn enemies (e.g., 5 Duwendes):
    List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.DUWENDE, 5);

    Start battle:
    BattleManager battle = new BattleManager();
    battle.startBattle(player, enemies);

    ✅ DONE !!!
    -make sure pet food has max, to avoid abuse of pet healing (can be max 4 or so pet food) -a
    -position rest wisely in story instead of every after fight (napansin nko na unnatural siya if every after especially if naay boss fight) -a
    -pet healing must be after enemies' turn every after 2 rounds -a
    - implement World 3 Mission 1 PLayer finds items -a
    -display starting barya as 20 [changed it to 0 to add more sentimental weight to the beggar dilemma -ef]
    -Implement a reward system so the player can earn barya [-ef]
    -display barya every reward event [-ef]
    -add option 4 (drink potion if naay sulod inventory) [-ef]
    -Rest every after fight (recover hp and mana) [ongoing - k] (I made the method rest na, just have to insert it after every fight)
            [added some dialogue and inserted the method rest into areas where i think it would make sense -ef]
    -adjust enemy attack damage [- k]
    -make new method for resetting cooldown of skills [-k]
    -display starting barya as 20 [done - a]
    -display barya every reward event [done - a]
    - minus barya after player agrees to give sir khai money [done - a]
    - HP recovery [done - a]

    -implement try-catch in decision moment in world2, mission 2 [-ef]
    -world1 mission3 missing some story parts, need to recover [-ef]
    -Implement the choices in World 3: Mission 3 (sacrifice barya or armor) [-ef]
    -Implement the choices in World 3: Mission 5 (sacrifice hp or mana) [-ef]
    -settle on a uniform format (re: emojis used and phrasing for try-catch scenarios) [-ef]
    -adjust barya/rewards system (redundancy in barya earnings after battle) [-a]
    -Insert Boss Battles (tria and erika) / done
    -insert battles in world 3: mission 6 / done


    note: nag-conflict sa pag-upload namo ni andrea pero we basically did the same tasks so i merged the changes nalang -ef

    (guys I added an extra parameter when calling the battlesystem. (currentworld) kay need i keep track so that if naas world 3 sir khai can
        only revive once, but unli sa world 1 and 2) -a
        (changed the methods with fight scenes from void to bool to continuously check if buhi pa ang player and end the game if di) -a



     */
}
