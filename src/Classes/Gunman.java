package Classes;

import Core.Enemy;
import Core.ClassArchetype;
import java.util.Random;

public class Gunman implements ClassArchetype {
    public int getBonusHp() {
        return 80;
    }
    public int getBonusMana() {
        return 70;
    }
    public String getClassName() {
        return "Gunman";
    }

    public void useSkill(String playerName, Enemy target) {
        System.out.println(playerName + " throws Smoke Grenade!");
        int dmg = new Random().nextInt(11) + 25;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println(playerName + " deals " + netDmg + " lung damage to " + target.name + "!");
    }

    public void useSpecial(String playerName, Enemy target) {
        System.out.println(playerName + " shoots Steam Canon!");
        int dmg = new Random().nextInt(31) + 55;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println(playerName + " deals " + netDmg + " thermal damage to " + target.name + "!");
    }
    public int getSkillManaCost() { return 20; }
    public int getSpecialManaCost() { return 40; }
    public int getSkillCooldown() { return 2; }
    public int getSpecialCooldown() { return 3; }

}