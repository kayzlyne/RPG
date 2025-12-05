package Classes;

import Core.Enemy;
import Core.ClassArchetype;
import java.util.Random;

public class Archer implements ClassArchetype {
    public int getBonusHp(){
        return 70;
    }
    public int getBonusMana(){
        return 85;
    }
    public String getClassName(){
        return "Archer";
    }
    private int specialBonusDamage = 0;
    public void useSkill(String playerName, Enemy target) {
        System.out.println(playerName + " shoots Triad of Arrows!");
        int dmg = new Random().nextInt(11) + 15;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println(playerName + " deals " + netDmg + " piercing damage to " + target.name + "!");
    }

    public void useSpecial(String playerName, Enemy target) {
        System.out.println(playerName + " shoots Rain of Arrows!");
        int dmg = new Random().nextInt(31) + 25 + specialBonusDamage;;
        int netDmg = Math.max(1, dmg - target.defense);
        target.hp -= netDmg;
        System.out.println(playerName + " deals " + netDmg + " piercing damage to " + target.name + "!");
    }

    public int getSkillManaCost() { return 20; }
    public int getSpecialManaCost() { return 40; }
    public int getSkillCooldown() { return 2; }
    public int getSpecialCooldown() { return 3; }
    @Override
    public void increaseSpecialDamage(int amount) {
        specialBonusDamage += amount;
    }
}

