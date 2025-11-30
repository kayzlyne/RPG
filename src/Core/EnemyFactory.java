package Core;

import java.util.*;

public class EnemyFactory {
    public static List<Enemy> spawnEnemies(EnemyType type, int count) {
        List<Enemy> enemies = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            String name = type.typeName + " " + i;
            int hp = 55 + new Random().nextInt(12);   // 55–67 HP
            enemies.add(new Enemy(name, type, hp));
        }
        return enemies;
    }

    //make a Boss version of spawnEnemies
}