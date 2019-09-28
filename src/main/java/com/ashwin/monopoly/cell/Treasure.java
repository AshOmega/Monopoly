package com.ashwin.monopoly.cell;

import com.ashwin.monopoly.constants.MonopolyConstants;

public class Treasure implements CellInterface {

    private String name = MonopolyConstants.TREASURE;

    public String getName() {
        return name;
    }

    public Object performAction() {
        return null;
    }
}
