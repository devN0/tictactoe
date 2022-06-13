package com.gamedev.tictactoe.strategies.gamewinning_strategies;

import com.gamedev.tictactoe.models.Board;
import com.gamedev.tictactoe.models.Cell;

public class OrderOneGameWinningStrategy implements GameWinningStrategy {
    @Override
    public boolean checkIfWon(Board board, Cell lastMoveCell) {
        return false;
    }
}
