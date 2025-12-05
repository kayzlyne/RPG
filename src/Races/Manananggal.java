package Races;

import Core.Race;
import java.util.Random;

public class Manananggal extends Race {
    public int getBaseHp() { return 90; }
    public int getBaseMana() { return 100; }
    public String getRaceName() { return "Manananggal"; }

    public int attack(){
        return new Random().nextInt(11) + 5;
    }

    public String getAttackDesc(){
        return "swoops down with razor-sharp claws!";
    }
}
