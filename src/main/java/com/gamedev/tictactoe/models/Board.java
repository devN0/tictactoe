package com.gamedev.tictactoe.models;

import java.util.List;

public class Board {
    private int dimension; // nxn
    private List<List<Cell>> grid;

    public Board(int dimension){
        this.dimension = dimension;
    }

    public int getDimension() {
        return dimension;
    }
    public List<List<Cell>> getGrid() {
        return grid;
    }
    public Cell getCell(int row, int col){
        return this.grid.get(row).get(col);
    }
    public void setCell(int row, int col, Cell cell){
        this.grid.get(row).set(col, cell);
    }
}
