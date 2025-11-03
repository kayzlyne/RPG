import Core.*;

import Storyline.Opening;
import Storyline.PlayerSelection;
import Storyline.World1.*;
import Storyline.World2.*;
import Storyline.World3.*;

public class Main {
    public static void main(String[] args) {

        Opening.opening();
        PlayerCharacter player = PlayerSelection.createPlayer();

        Intro1.intro1(player);
        Mission1.mission1(player);
        Mission2.mission2(player);
        Mission3.mission3(player);

        Intro2.intro(player);
        W2Mission1.w2mission1(player);
        W2Mission2.w2mission2(player);
        W2Mission3.w2mission3(player);
        W2Mission4.w2mission4(player);
        W2Mission5.w2mission5(player);

        Intro3.intro3(player);
        W3Mission1.w3mission1(player);
        W3Mission2.w3mission2(player);
        W3Mission3.w3mission3(player);
        W3Mission4.w3mission4(player);
        W3Mission5.w3mission5(player);
        W3Mission6.w3mission6(player);
    }
}
