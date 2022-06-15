package com.gamedev.tictactoe.controllers;

import com.gamedev.tictactoe.models.*;
import com.gamedev.tictactoe.models.enums.GameStatus;
import com.gamedev.tictactoe.strategies.gamewinning_strategies.GameWinningStrategy;

import java.util.List;

public class GameController {
    // All the actions to be performed on the game should not directly occur via the main method instead it must occur via a controller
//    whereas the main method/application class should only be responsible for taking inputs and creating objects by passing those inputs into methods of the controller which would further call methods of relevant models.
//    Actions:
//    start game
//    make move
//    undo
//    checkWinner
//    getCurrentBoard
    public Game createGame(int dimension, List<Player> players, List<GameWinningStrategy> gameWinningStrategies){
        Game newGame = null;
        try{
            newGame = Game.create()
                    .withBoard(new Board(dimension))
// addPlayer in main() would become addPlayers in controller since createGame is a more generic method which don't know in advance how many players would be added in the game.
                    .addPlayers(players)
                    .addGameWinningStrategies(gameWinningStrategies)
                    .build();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return newGame;
    }
//    Q) Instead of passing game instance into makemove and undo wouldn't it make more sense to have these methods inside game class so that it would belong to the particular game instance
//    A) game class will also have all these methods and those methods will take 'this' as the game instance(i.e. itself).
//    So a good controller doesn't implement the methods themselves but works like a middleware to delegate the work by referencing to the methods inside the relevant class/model.
    public boolean undo(Game game){
        boolean result = false;
        try{
            result = game.undo();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public boolean makeMove(Game game, Move move){
        return game.makeMove(move);
    }
    public boolean checkWinner(Game game) {
        return false;
    }
    public GameStatus getGameStatus(){
        return GameStatus.ENDED;
    }
}
