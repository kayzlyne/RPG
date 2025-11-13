public class NOTES_HERE {

    /*

    TO DO!!!:
    -Insert Boss Battles
        -Rest every after fight (recover hp and mana) [done] (I made the method rest na, just have to insert it after every fight)
        -add option 4 (drink potion if naay sulod inventory)
        -adjust enemy attack damage
    -Implement a reward system so the player can earn barya [ongoing - k] (I made a method addBarya, just need to add it after missions/battles)
    -Level up system [on going - st]
    -implement story [on going - st]
    -fix distance and spacing [ongoing for world 1 - k]
    -design and stuff (including alignment) [ongoing - k] (just need to redesign Mogul and Mt. Kanatuan)
    -Implement the choices in World 3: Mission 3 & Mission 5
    -display starting barya as 20 [done - a]
    -display barya every reward event [done - a]
    - minus barya after player agrees to give sir khai money [done - a]
    - HP recovery [done - a]

    - Test Run Game (I think Player is too op) maybe need i buff ang enemies


        (guys I added an extra parameter when calling the battlesystem. (currentworld) kay need i keep track so that if naas world 3 sir khai can 
        only revive once, but unli sa world 1 and 2) -a
        (changed the methods with fight scenes from void to bool to continuously check if buhi pa ang player and end the game if di) -a

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

     */
}
