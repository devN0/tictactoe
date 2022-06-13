package com.gamedev.tictactoe.strategies.botplaying_strategies;

import com.gamedev.tictactoe.models.Board;
import com.gamedev.tictactoe.models.Move;
import com.gamedev.tictactoe.models.Symbol;

public class RandomBotPlayingStrategy implements BotPlayingStrategy {
    public Move getNxtMove(Board board, Symbol symbol){
        return new Move();
    }
}
