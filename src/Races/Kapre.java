package Races;

import Core.Race;

import java.util.Random;

public class Kapre implements Race {
    public int getBaseHp() { return 100; }
    public int getBaseMana() { return 70; }
    public String getRaceName() { return "Kapre"; }

    public int attack(){
        return new Random().nextInt(11) + 5;
    }

    public String getAttackDesc(){
        return "engulfs the enemy with smoke!";
    }
}
