package Core;

import java.util.*;

public class EnemyFactory {
    public static List<Enemy> spawnEnemies(EnemyType type, int count) {
        List<Enemy> enemies = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            String name = type.typeName + " " + i;
            int hp = 50 + new Random().nextInt(21);   // 50–70 HP
            enemies.add(new Enemy(name, type, hp));
        }
        return enemies;
    }
}