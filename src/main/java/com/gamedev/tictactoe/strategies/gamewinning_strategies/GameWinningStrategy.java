package com.gamedev.tictactoe.strategies.gamewinning_strategies;

import com.gamedev.tictactoe.models.Board;
import com.gamedev.tictactoe.models.Cell;

public interface GameWinningStrategy {
    boolean checkIfWon(Board board, Cell lastMoveCell);
}
