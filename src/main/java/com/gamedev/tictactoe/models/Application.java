package com.gamedev.tictactoe.models;

import com.gamedev.tictactoe.models.enums.PlayerType;
import com.gamedev.tictactoe.strategies.botplaying_strategies.RandomBotPlayingStrategy;
import com.gamedev.tictactoe.strategies.gamewinning_strategies.OrderOneGameWinningStrategy;

public class Application {
    public static void main(String[] args) {
        try{
            Game newGame = Game.create()
                    .withBoard(new Board(3))
                    .addPlayer(new HumanPlayer(new Symbol('x'), new User()))
                    .addPlayer(new BotPlayer(new Symbol('0'), new RandomBotPlayingStrategy()))
                    .addGameWinningStrategies(new OrderOneGameWinningStrategy())
                    .build();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
