package com.gamedev.tictactoe.strategies.botplaying_strategies;

import com.gamedev.tictactoe.models.Board;
import com.gamedev.tictactoe.models.Move;
import com.gamedev.tictactoe.models.Symbol;

public interface BotPlayingStrategy {
    Move getNxtMove(Board board, Symbol symbol);
}
