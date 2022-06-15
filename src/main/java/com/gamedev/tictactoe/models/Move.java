package com.gamedev.tictactoe.models;

public class Move {
    private Player player;
    private Symbol symbol;
    private Cell cell;
    public Move(Cell cell, Symbol symbol){
        this.cell = cell;
        this.symbol = symbol;
    }
    public Player getPlayer() {
        return player;
    }
    public Symbol getSymbol() {
        return symbol;
    }
    public Cell getCell() {
        return cell;
    }
}
