package com.gamedev.tictactoe.models;

import com.gamedev.tictactoe.models.enums.PlayerType;

public class HumanPlayer extends Player{
    User user;
    public HumanPlayer(Symbol symbol, User user){
        super(PlayerType.HUMAN, symbol);
        this.user = user;
    }
}
