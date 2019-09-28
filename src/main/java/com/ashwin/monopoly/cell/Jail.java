package com.ashwin.monopoly.cell;

import com.ashwin.monopoly.constants.MonopolyConstants;

public class Jail implements CellInterface {

    private String name = MonopolyConstants.JAIL;

    public String getName() {
        return name;
    }

    public Object performAction() {
        return null;
    }
}


