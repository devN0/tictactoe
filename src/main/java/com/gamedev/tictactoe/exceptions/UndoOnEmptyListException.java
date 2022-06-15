package com.gamedev.tictactoe.exceptions;

public class UndoOnEmptyListException extends Exception{
    public UndoOnEmptyListException(){
        super("There are no moves to undo");
    }
}
