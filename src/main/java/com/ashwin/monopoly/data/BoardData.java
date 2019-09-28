package com.ashwin.monopoly.data;

import com.ashwin.monopoly.cell.*;

import java.util.ArrayList;
import java.util.List;

public class BoardData {

    List<CellInterface> list = new ArrayList<>();

    public void initializeData(){


//        list.add(new Empty());
//        list.add(new Jail());
//        list.add(new Hotel());
//        list.add(new Treasure());


        list.add(new Empty());
        list.add(new Empty());
        list.add(new Jail());
        list.add(new Hotel());
        list.add(new Empty());
        list.add(new Treasure());
        list.add(new Jail());
        list.add(new Treasure());
        list.add(new Empty());
        list.add(new Empty());
        list.add(new Hotel());
        list.add(new Jail());
        list.add(new Treasure());
    }

    public List<CellInterface> getCells() {
        return list;
    }
}
