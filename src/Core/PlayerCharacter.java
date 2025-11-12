package Core;

import java.util.ArrayList;
import java.util.List;

public class PlayerCharacter {
    public String name, race, charClass;
    public int hp, mana, defense = 11;
    private Race raceType;
    public ClassArchetype classType;
    private final int manaRegen = 10;
    private int armorLevel = 0;
    public int maxHp;
    public int maxMana;


    // New fields
    private int barya = 100;
    private List<Item> inventory = new ArrayList<>();

    public List<Item> getInventory() {
        return inventory;
    }

    // Pet support
    private Pet pet;
    private boolean hasPet = false;

    // Cooldown counters
    private int skillCooldown = 0;
    private int specialCooldown = 0;

    public PlayerCharacter(String name, Race raceType, ClassArchetype classType) {
        this.name = name;
        this.raceType = raceType;
        this.classType = classType;
        this.race = raceType.getRaceName();
        this.charClass = classType.getClassName();
        this.maxHp = raceType.getBaseHp() + classType.getBonusHp();
        this.maxMana = raceType.getBaseMana() + classType.getBonusMana();
        this.hp = maxHp;
        this.mana = maxMana;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void dealDamage(Enemy target) {
        System.out.println(name + " " + raceType.getAttackDesc());
        int rawDamage = raceType.attack();
        int netDamage = Math.max(1, rawDamage - target.defense);
        target.hp -= netDamage;
        System.out.println(name + " deals " + netDamage + " damage to " + target.name + "!");
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
        System.out.printf("HP        : %d/%d\n", hp, maxHp);
        System.out.printf("Mana      : %d/%d\n", mana, getMaxMana());
        System.out.printf("Defense   : %d (Passive)\n", defense);
        System.out.println("──────────────────────────────\n");
    }

    // NEW METHODS BELOW THIS LINE -ef

    // ----- Inventory -----

    public void addItem(Item item) {
        inventory.add(item);
    }

    public void showInventory() {
        System.out.println("\n=== 🎒 Inventory ===");
        if (inventory.isEmpty()) {
            System.out.println("You have no items.");
        } else {
            for (int i = 0; i < inventory.size(); i++) {
                System.out.println((i + 1) + ". " + inventory.get(i).getName());
            }
        }
    }

    public void useItem(Item item) {
        switch (item.getName()) {

            case "Health Potion":
                hp = maxHp;
                inventory.remove(item);
                System.out.println("🧪 You used a Health Potion -- the elixir of life! HP fully restored.");
                break;

            case "Mana Potion":
                mana = maxMana;
                inventory.remove(item);
                System.out.println("🔮 You used a Mana Potion -- the elixir of power! Mana fully restored.");
                break;

            default:
                System.out.println("❌ You can't use this item.");
        }
    }

    // ----- Barya -----

    public int getBarya() { return barya; }

    public void setBarya(int amount) { this.barya = amount; }

    // ----- Mana and Defense setters/getters for Shop -----

    public int getMaxMana() {
        return raceType.getBaseMana() + classType.getBonusMana();
    }

    public void setMana(int mana) {
        this.mana = Math.min(mana, getMaxMana());
    }

    public int getDefense() { return defense; }

    public void setDefense(int defense) { this.defense = defense; }

    // ----- Pet system -----

    public boolean hasPet() { return hasPet; }

    public Pet getPet() { return pet; }

    public void setPet(Pet pet) {
        this.pet = pet;
        this.hasPet = true;
    }

    public void petHeal() {
        if (hasPet && pet != null) {
            hp += pet.getHealingPower();

            // cap HP so it doesn't exceed max
            int maxHp = raceType.getBaseHp() + classType.getBonusHp();
            if (hp > maxHp) hp = maxHp;

            System.out.println("🐾 Your pet heals you for " + pet.getHealingPower() + " HP!\n");
        }
    }

    public void buyArmor() {
        armorLevel++;

        int addedDefense = 0;

        if (armorLevel == 1) {
            addedDefense = 2;
        } else if (armorLevel == 2) {
            addedDefense = 3;
        } else if (armorLevel == 3) {
            addedDefense = 5;
        } else {
            // Optional: scale beyond level 3
            addedDefense = 5; // or any formula you like
        }

        defense += addedDefense;

        System.out.println("🛡️ Armor upgraded! Defense +" + addedDefense +
                " (Total Defense: " + defense + ")");
    }


}


/* added some new methods to implement shop and pet. gonna leave this og class here for future purposes just in case -ef

package Core;

import java.util.ArrayList;
import java.util.List;

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

    private int barya = 100; // or whatever starting amount
    private List<Item> inventory = new ArrayList<>();

    public int getBarya() {
        return barya;
    }
    public void setBarya(int barya) {
        this.barya = barya;
    }

    public void addItem(Item item) {
        inventory.add(item);
    }

    public void showInventory() {
        System.out.println("\n=== 🎒 Inventory ===");
        if (inventory.isEmpty()) {
            System.out.println("You have no items.");
        } else {
            for (Item i : inventory) {
                System.out.println("- " + i.getName());
            }
        }
    }

} */

