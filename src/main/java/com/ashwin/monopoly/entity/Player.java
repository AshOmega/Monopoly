package com.ashwin.monopoly.entity;

import com.ashwin.monopoly.cell.CellInterface;
import com.ashwin.monopoly.cell.Hotel;
import javafx.scene.control.Cell;

import java.util.ArrayList;
import java.util.List;

public class Player {

   private Double money;
   private List<CellInterface> possessionList;
   private Enum status;
   private Integer position;
   private String playerName;

   public Double getMoney() {
      return money;
   }

   public Player(Double money, String playerName) {
      this.money = money;
      this.playerName = playerName;
      possessionList = new ArrayList();
   }

   public void addMoney(Double money) {
      this.money = this.money + money;
   }

   public void deductMoney(Double money) {
      this.money = this.money - money;
   }

   public List getPossessionList() {
      return possessionList;
   }

   public void addToPossessionList(CellInterface cell) {
      this.possessionList.add(cell);
   }

   public Enum getStatus() {
      return status;
   }

   public void setStatus(Enum status) {
      this.status = status;
   }

   public Integer getPosition() {
      return position;
   }

   public void setPosition(Integer position) {
      this.position = position;
   }

   public void move(Integer steps){
      this.position += steps;
   }
}
