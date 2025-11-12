package Classes;

import Core.Enemy;
import Core.ClassArchetype;
import java.util.Random;

public class Assassin implements ClassArchetype {
    public int getBonusHp() {
        return 85;
    }
    public int getBonusMana() {
        return 80;
    }
    public String getClassName() {
        return "Assassin";
    }

    public void useSkill(String playerName, Enemy target) {
        System.out.println(playerName + " does Swift Blink!");
        int dmg = new Random().nextInt(11) + 25;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println(playerName + " deals " + netDmg + " physical damage to " + target.name + "!");
    }

    public void useSpecial(String playerName, Enemy target) {
        System.out.println(playerName + " does Last Words!");
        int dmg = new Random().nextInt(31) + 55;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println(playerName + " deals " + netDmg + " critical damage to " + target.name + "!");
    }

    public int getSkillManaCost() { return 20; }
    public int getSpecialManaCost() { return 40; }
    public int getSkillCooldown() { return 2; }
    public int getSpecialCooldown() { return 3; }

}
