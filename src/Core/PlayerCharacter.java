package Core;

public class PlayerCharacter {
    public String name, race, charClass;
    public int hp, mana, defense = 11;
    private Race raceType;
    public ClassArchetype classType;
    private final int manaRegen = 10;

    // Cooldown counters
    private int skillCooldown = 0;
    private int specialCooldown = 0;

    public PlayerCharacter(String name, Race raceType, ClassArchetype classType) {
        this.name = name;
        this.raceType = raceType;
        this.classType = classType;
        this.race = raceType.getRaceName();
        this.charClass = classType.getClassName();
        this.hp = raceType.getBaseHp() + classType.getBonusHp();
        this.mana = raceType.getBaseMana() + classType.getBonusMana();
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public int dealDamage(Enemy target) {
        System.out.println(raceType.getAttackDesc());
        int rawDamage = raceType.attack();
        int netDamage = Math.max(1, rawDamage - target.defense);
        target.hp -= netDamage;
        System.out.println(name + " deals " + netDamage + " damage to " + target.name + "!");
        return netDamage;
    }

    public void useSkill(Enemy target) {
        if (skillCooldown > 0) {
            System.out.println("Skill is on cooldown for " + skillCooldown + " more turn(s).");
            return;
        }
        if (mana < classType.getSkillManaCost()) {
            System.out.println("Not enough mana to use skill.");
            return;
        }
        mana -= classType.getSkillManaCost();
        classType.useSkill(name, target);
        skillCooldown = classType.getSkillCooldown();
    }

    public void useSpecial(Enemy target) {
        if (specialCooldown > 0) {
            System.out.println("Special is on cooldown for " + specialCooldown + " more turn(s).");
            return;
        }
        if (mana < classType.getSpecialManaCost()) {
            System.out.println("Not enough mana to use special.");
            return;
        }
        mana -= classType.getSpecialManaCost();
        classType.useSpecial(name, target);
        specialCooldown = classType.getSpecialCooldown();
    }

    public void regenerateMana() {
        int before = mana;
        mana = Math.min(mana + manaRegen, raceType.getBaseMana() + classType.getBonusMana());
        System.out.println(name + " regenerates " + (mana - before) + " mana.");
    }

    public void reduceCooldowns() {
        if (skillCooldown > 0) skillCooldown--;
        if (specialCooldown > 0) specialCooldown--;
    }

    public void displayStats() {
        System.out.println("\n📜 Character Preview");
        System.out.println("──────────────────────────────");
        System.out.printf("Name      : %s\n", name);
        System.out.printf("Race      : %s\n", race);
        System.out.printf("Class     : %s\n", charClass);
        System.out.println("──────────────────────────────");
        System.out.printf("HP        : %d\n", hp);
        System.out.printf("Mana      : %d\n", mana);
        System.out.printf("Defense   : %d (Passive)\n", defense);
        System.out.println("──────────────────────────────\n");
        //Insert inventory list

    }
}

