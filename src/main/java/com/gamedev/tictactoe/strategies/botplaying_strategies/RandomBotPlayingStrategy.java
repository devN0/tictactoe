package com.gamedev.tictactoe.strategies.botplaying_strategies;

import com.gamedev.tictactoe.models.Cell;
import com.gamedev.tictactoe.models.Move;
import com.gamedev.tictactoe.models.Symbol;

public class RandomBotPlayingStrategy implements BotPlayingStrategy {
    public Move getNxtMove(Cell cell, Symbol symbol){
        return new Move(cell, symbol);
    }
}
