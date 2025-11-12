package Core;

import java.util.Random;

public class Enemy {
    public String name;
    public int hp;
    public final int defense = 3;
    public final EnemyType type;

    public Enemy(String name, EnemyType type, int hp) {
        this.name = name;
        this.type = type;
        this.hp = hp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    //adjust enemy damage since I noticed constant 1 ra siya, something might be wrong sa rawDamage - target.defense sa netDamage
    public int dealDamage(PlayerCharacter target) {
        System.out.println(name + " " + type.attackDescription + "!");
        int rawDamage = new Random().nextInt(type.maxDamage - type.minDamage + 1) + type.minDamage;
        int netDamage = Math.max(1, rawDamage - target.defense);
        target.hp -= netDamage;
        System.out.println("Deals " + netDamage + " damage to " + target.name + "!");
        return netDamage;
    }

}

