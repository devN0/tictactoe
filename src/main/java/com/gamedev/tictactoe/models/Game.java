package com.gamedev.tictactoe.models;

import com.gamedev.tictactoe.exceptions.MultipleBotsException;
import com.gamedev.tictactoe.exceptions.UndoOnEmptyListException;
import com.gamedev.tictactoe.models.enums.GameStatus;
import com.gamedev.tictactoe.models.enums.PlayerType;
import com.gamedev.tictactoe.strategies.gamewinning_strategies.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private List<GameWinningStrategy> gameWinningStrategies;
    private GameStatus gameStatus;
    private Player winner;

    public static Builder create() {
        return new Builder();
    }
    public boolean undo() throws UndoOnEmptyListException{
//        move - player,symbol,cell
//        board - dimension, cell grid[][]
        if(this.moves.isEmpty()){
            throw new UndoOnEmptyListException();
        }
        Cell lastCell = this.moves.get(moves.size()-1).getCell();
//        cell - row, col, symbol
//        lastCell.setSymbol(new Symbol(' ')); instead of this create a clearCell method inside Cell class
        lastCell.clearCell();
        this.moves.remove(moves.size()-1);
//        after removing the last move we also need to update the board
        return true;
    }
    public boolean makeMove(Move move){
        Cell cell = move.getCell();
        int row = cell.getRow();
        int col = cell.getColumn();
        this.board.setCell(row, col, cell);
        return true;
    }

    public static class Builder {
        private Board board;
        private List<Player> players;
        private List<Move> moves;
        private List<GameWinningStrategy> gameWinningStrategies;
        private GameStatus gameStatus;
        private Player winner;

        public Builder(){
            this.players = new ArrayList<>();
            this.gameWinningStrategies = new ArrayList<>();
        }

        public Builder withBoard(Board board) {
            this.board = board;
            return this;
        }

        public Builder addPlayer(Player player) {
            this.players.add(player);
            return this;
        }

        public Builder addPlayers(List<Player> players){
            this.players.addAll(players);
            return this;
        }

        public Builder addGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
            this.gameWinningStrategies.add(gameWinningStrategy);
            return this;
        }
        public Builder addGameWinningStrategies(List<GameWinningStrategy> gameWinningStrategies){
            this.gameWinningStrategies.addAll(gameWinningStrategies);
            return this;
        }

        public boolean checkIfSingleBot(){
            int count = 0;
            for(Player player : this.players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    count++;
                }
            }
            return count<=1;
        }

        public Game build() throws MultipleBotsException{
            if(!checkIfSingleBot()){ // validation before object creation via builder
                throw new MultipleBotsException();
            }
            Game game = new Game();
            game.board = this.board;
            game.players = this.players;
            game.gameWinningStrategies = this.gameWinningStrategies;
            return game;
        }
    }
}
