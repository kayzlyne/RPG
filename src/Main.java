import Core.*;

import Storyline.Opening;
import Storyline.PlayerSelection;
import Storyline.World1.*;
import Storyline.World2.*;
import Storyline.World3.*;

public class Main {
    public static void main(String[] args) {

        int currentWorld = 1;
        Opening.opening();
        PlayerCharacter player = PlayerSelection.createPlayer();
        //Shop.enterShop(player);
        //InventoryMenu.open(player);
        Intro1.intro1(player);
        Mission1.mission1(player);
        Mission2.mission2(player);
        Shop.enterShop(player);
        InventoryMenu.open(player);
        if (!Mission3.mission3(player)) return;
        Shop.enterShop(player);

        currentWorld = 2;
        if (!Intro2.intro(player)) return;
        W2Mission1.w2mission1(player);
        Shop.enterShop(player);
        if (!W2Mission2.w2mission2(player)) return;
        Shop.enterShop(player);
        if (!W2Mission3.w2mission3(player)) return;
        Shop.enterShop(player);
        W2Mission4.w2mission4(player);
        Shop.enterShop(player);
        if (!W2Mission5.w2mission5(player)) return;
        Shop.enterShop(player);

        currentWorld = 3;
        Intro3.intro3(player);
        if (!W3Mission1.w3mission1(player)) return;
        Shop.enterShop(player);
        W3Mission2.w3mission2(player);
        Shop.enterShop(player);
        W3Mission3.w3mission3(player);
        Shop.enterShop(player);
        if (!W3Mission4.w3mission4(player)) return;
        Shop.enterShop(player);
        W3Mission5.w3mission5(player);
        Shop.enterShop(player);
        W3Mission6.w3mission6(player);
    }
}
