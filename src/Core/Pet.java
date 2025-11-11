package Core;

public class Pet {
    private int healingPower;

    public Pet(int healingPower) {
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void increaseHealingPower(int amount) {
        this.healingPower += amount;
    }
}

