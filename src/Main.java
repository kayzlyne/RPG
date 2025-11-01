import Core.*;
import java.util.*;

import Storyline.World1.*;

public class Main {
    public static void main(String[] args) {

        Opening.opening();
        PlayerCharacter player = PlayerSelection.createPlayer();
        Intro1.intro1(player);


        // 👹 Spawn enemies (e.g., 5 Duwendes)
        List<Enemy> enemies = EnemyFactory.spawnEnemies(EnemyType.DUWENDE, 5);

        // ⚔️ Start battle
        BattleManager battle = new BattleManager();
        battle.startBattle(player, enemies);
    }
}
