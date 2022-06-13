package com.gamedev.tictactoe.controllers;

import com.gamedev.tictactoe.models.Game;
import com.gamedev.tictactoe.models.Move;
import com.gamedev.tictactoe.models.enums.GameStatus;

public class GameController {
    // All the actions to be performed on the game should not directly occur via the main method instead it must occur via a controller
//    Actions:
//    start game
//    make move
//    undo
//    checkWinner
//    getCurrentBoard
    public Game createGame(){
        return null;
    }
//    Q) Instead of passing game instance into makemove and undo wouldn't it make more sense to have these methods inside game class so that it would belong to the particular game instance
//    A) game class will also have all these methods and those methods will take 'this' as the game instance(i.e. itself)
    public boolean makeMove(Game game, Move move){
        return false;
    }
    public void undo(Game game){

    }
    public boolean checkWinner(Game game) {
        return false;
    }
    public GameStatus getGameStatus(){
        return GameStatus.ENDED;
    }
}
