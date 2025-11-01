package Classes;

import Core.Enemy;
import Core.ClassArchetype;
import java.util.Random;

public class Druid implements ClassArchetype {
    public int getBonusHp() {
        return 100;
    }
    public int getBonusMana() {
        return 85;
    }
    public String getClassName() {
        return "Druid";
    }

    public void useSkill(String playerName, Enemy target) {
        System.out.println(playerName + " casts Constricting Ivy!");
        int dmg = new Random().nextInt(11) + 25;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println("Deals " + netDmg + " physical damage!");
    }

    public void useSpecial(String playerName, Enemy target) {
        System.out.println(playerName + " casts Wildshape!");
        int dmg = new Random().nextInt(31) + 55;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println("Deals " + netDmg + " critical damage!");
    }
    public int getSkillManaCost() { return 20; }
    public int getSpecialManaCost() { return 40; }
    public int getSkillCooldown() { return 2; }
    public int getSpecialCooldown() { return 3; }


}
