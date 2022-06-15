package com.gamedev.tictactoe.models;

import com.gamedev.tictactoe.models.enums.PlayerType;

public abstract class Player {
    private PlayerType playerType;
    private Symbol symbol;

    Player(PlayerType playerType, Symbol symbol){
        this.playerType = playerType;
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
