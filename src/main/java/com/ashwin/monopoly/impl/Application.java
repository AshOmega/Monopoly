package com.ashwin.monopoly.impl;

import com.ashwin.monopoly.cell.CellInterface;
import com.ashwin.monopoly.constants.MonopolyConstants;
import com.ashwin.monopoly.entity.Board;
import com.ashwin.monopoly.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Application {

    static Integer currentIndex = 0;
    public static void main(String args[]){
        System.out.println("Initializing app");
        Board board = new Board();
        board.initializeBoard();
        Integer playerCount = MonopolyConstants.PLAYER_COUNT;
        Integer rounds = MonopolyConstants.ROUNDS;
        List<Player> playerList = new ArrayList<>();

        for(int index = 1; index <= playerCount; index++){
            Player player = new Player(1000.0, "Player"+index);
            player.setPosition(0);
            playerList.add(player);
        }

        //sample dice rolls
        List<Integer> diceList = Arrays.asList(1,2,2,3,2,4,3,3,1);

        for(int roundCount = 1; roundCount <= rounds; roundCount++){
            playerList.stream().forEach( player -> {
                player.move(diceList.get(currentIndex++));
                Integer position = player.getPosition();
                CellInterface cell =  board.getBoardCells().get(position-1);
                cell.performAction(player);
            });

            System.out.println("\nROUND ::" + roundCount + " completed .... \nStatus");

            playerList.stream().forEach(player -> System.out.println(player.getMoney() + player.getPossessionList().size()*200));

        }



    }
}
