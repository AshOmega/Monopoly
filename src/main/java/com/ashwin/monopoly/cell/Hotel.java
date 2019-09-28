package com.ashwin.monopoly.cell;

import com.ashwin.monopoly.entity.Player;

public class Hotel implements CellInterface {

    private Player owner =  null;

    public void performAction(Player player) {

        if(owner == null){
            owner = player;
            player.deductMoney(200.0);
            player.addToPossessionList(this);
        }
        else
        {
            player.deductMoney(50.0);
            owner.addMoney(50.0);
        }
    }
}
