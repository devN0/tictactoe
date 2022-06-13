package com.gamedev.tictactoe.models;

import java.util.List;

public class Board {
    private int dimension; // nxn
    private List<List<Cell>> grid;
    public Board(int dimension){
        this.dimension = dimension;
    }
}
