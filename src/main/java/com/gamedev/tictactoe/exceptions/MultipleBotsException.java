package com.gamedev.tictactoe.exceptions;

public class MultipleBotsException extends Exception{
    public MultipleBotsException(){
        super("A game cannot have multiple Bot players");
    }
}
