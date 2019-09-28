package com.ashwin.monopoly.data;

import com.ashwin.monopoly.cell.CellInterface;

import java.util.ArrayList;
import java.util.List;

public class BoardData {

    List<CellInterface> cells = new ArrayList<>();

    public void initializeData(){


    }

    public List<CellInterface> getCells() {
        return cells;
    }
}
