package com.ashwin.monopoly.cell;

import com.ashwin.monopoly.constants.MonopolyConstants;
import com.ashwin.monopoly.entity.Player;

public class Treasure implements CellInterface {

    public void performAction(Player player) {
        player.addMoney(200.0);
    }
}
