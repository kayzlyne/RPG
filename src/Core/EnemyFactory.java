package Core;

import java.util.*;

public class EnemyFactory {
    public static List<Enemy> spawnEnemies(EnemyType type, int count) {
        List<Enemy> enemies = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            String name = type.typeName + " " + i;
            int hp = 50 + new Random().nextInt(17);   // 55–67 HP
            enemies.add(new Enemy(name, type, hp));
        }
        return enemies;
    }
    //make a Boss version of spawnEnemies
    public static List<Enemy> spawnBosses(EnemyType type, int count) {
        List<Enemy> bosses = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            String name = "Boss " + type.typeName + " " + i;
            int hp = 100 + new Random().nextInt(50); // 100–150 HP
            bosses.add(new Enemy(name, type, hp));
        }
        return bosses;
    }

}