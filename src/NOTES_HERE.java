public class NOTES_HERE {

    /*

    TO DO!!!:
    -Insert Boss Battles
        -try catch for skills or try again feature when choosing a skill under cooldown
        -Rest every after fight (recover hp and mana)
        -fix battle system spacing and options
        -add option 4 (drink potion if naay sulod inventory)
    -Make shop system [✅ DONE -ef]
        -items class?
    -Figure out boss battles and make them
    -Level up system [on going - st]
    -implement story [on going - st]
        -fix distance and spacing
        -pauses each dialogue
        -design and stuff (including alignment)
    -Insert confirmation after name input [✅ DONE -ef]
    -What happens when player dies (Sir Khai event) (✅ DONE -a) 
            -> //triggers everytime player dies between World 1 and 2 but will only trigger once in World 3

        (guys I added an extra parameter when calling the battlesystem. (currentworld) kay need i keep track so that if naas world 3 sir khai can 
        only revive once, but unli sa world 1 and 2) -a
        (changed the methods with fight scenes from void to bool to continuously check if buhi pa ang player and end the game if di) -a

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
