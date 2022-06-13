package com.gamedev.tictactoe.models;

import com.gamedev.tictactoe.models.enums.PlayerType;
import com.gamedev.tictactoe.strategies.botplaying_strategies.BotPlayingStrategy;

public class BotPlayer extends Player {
    private BotPlayingStrategy botPlayingStrategy;
    BotPlayer(Symbol symbol, BotPlayingStrategy botPlayingStrategy){
        super(PlayerType.BOT, symbol);
        this.botPlayingStrategy = botPlayingStrategy;
    }
}
