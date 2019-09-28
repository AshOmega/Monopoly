package com.ashwin.monopoly.cell;

import com.ashwin.monopoly.constants.MonopolyConstants;

public class Empty implements CellInterface {

    private String name = MonopolyConstants.EMPTY;

    public String getName() {
        return name;
    }

    public Object performAction() {
        return null;
    }
}
