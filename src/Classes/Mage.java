package Classes;

import Core.Enemy;
import Core.ClassArchetype;
import java.util.Random;

public class Mage implements ClassArchetype {
    public int getBonusHp() { return 75; }
    public int getBonusMana() { return 100; }
    public String getClassName() { return "Mage"; }

    public void useSkill(String playerName, Enemy target) {
        System.out.println(playerName + " casts Fireball!");
        int dmg = new Random().nextInt(11) + 25;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println("Deals " + netDmg + " fire damage to " + target.name + "!");
    }

    public void useSpecial(String playerName, Enemy target) {
        System.out.println(playerName + " casts Lightning Storm!");
        int dmg = new Random().nextInt(31) + 55;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println("Deals " + netDmg + " lightning damage to " + target.name + "!");
    }

    public int getSkillManaCost() { return 20; }
    public int getSpecialManaCost() { return 40; }
    public int getSkillCooldown() { return 2; }
    public int getSpecialCooldown() { return 3; }
}

