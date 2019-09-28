package com.ashwin.monopoly.cell;

import com.ashwin.monopoly.constants.MonopolyConstants;

public class Hotel implements CellInterface {

    private String name = MonopolyConstants.HOTEL;

    public String getName() {
        return name;
    }

    public Object performAction() {
        return null;
    }
}
