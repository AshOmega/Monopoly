package com.ashwin.monopoly.entity;

import java.util.ArrayList;
import java.util.List;

public class Player {

   private Double money;
   private List possessionList = new ArrayList<>();
   private Enum status;

   public Double getMoney() {
      return money;
   }

   public void setMoney(Double money) {
      this.money = money;
   }

   public List getPossessionList() {
      return possessionList;
   }

   public void setPossessionList(List possessionList) {
      this.possessionList = possessionList;
   }

   public Enum getStatus() {
      return status;
   }

   public void setStatus(Enum status) {
      this.status = status;
   }
}
