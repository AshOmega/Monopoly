package com.ashwin.monopoly.entity;

import com.ashwin.monopoly.cell.CellInterface;
import com.ashwin.monopoly.data.BoardData;

import java.util.ArrayList;
import java.util.List;

public class Board {

   private List<CellInterface> boardCells = new ArrayList<>();

   public void initializeBoard(){
       BoardData boardData = new BoardData();
       boardData.initializeData();
       boardCells = boardData.getCells();
   }

    public List<CellInterface> getBoardCells() {
        return boardCells;
    }
}
