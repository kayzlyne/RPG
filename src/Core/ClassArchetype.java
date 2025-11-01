package Core;

public interface ClassArchetype {
    int getBonusHp();
    int getBonusMana();
    String getClassName();
    void useSkill(String playerName, Enemy target);
    void useSpecial(String playerName, Enemy target);
    int getSkillManaCost();
    int getSpecialManaCost();
    int getSkillCooldown();
    int getSpecialCooldown();

}

