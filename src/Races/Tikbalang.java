package Races;

import Core.Race;
import java.util.Random;

public class Tikbalang implements Race {
    public int getBaseHp() { return 95; }
    public int getBaseMana() { return 80; }
    public String getRaceName() { return "Tikbalang"; }

    public int attack(){
        return new Random().nextInt(11) + 5;
    }

    public String getAttackDesc(){
        return " charges with thunderous hooves!";
    }
}
