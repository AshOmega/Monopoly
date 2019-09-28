package com.ashwin.monopoly.cell;

import com.ashwin.monopoly.entity.Player;

public class Jail implements CellInterface {

    public void performAction(Player player) {
        player.deductMoney(150.0);
    }
}


