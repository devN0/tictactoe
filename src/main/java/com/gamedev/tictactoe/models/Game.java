package com.gamedev.tictactoe.models;

import com.gamedev.tictactoe.exceptions.MultipleBotsException;
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

        public Builder addGameWinningStrategies(GameWinningStrategy gameWinningStrategy) {
            this.gameWinningStrategies.add(gameWinningStrategy);
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
            if(!checkIfSingleBot()){
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
