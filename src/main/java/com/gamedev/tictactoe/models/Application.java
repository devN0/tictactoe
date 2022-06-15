package com.gamedev.tictactoe.models;

import com.gamedev.tictactoe.controllers.GameController;
import com.gamedev.tictactoe.models.enums.PlayerType;
import com.gamedev.tictactoe.strategies.botplaying_strategies.RandomBotPlayingStrategy;
import com.gamedev.tictactoe.strategies.gamewinning_strategies.GameWinningStrategy;
import com.gamedev.tictactoe.strategies.gamewinning_strategies.OrderOneGameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        GameController controller = new GameController();
//        Inputs for controller to create game
        Player player1 = new HumanPlayer(new Symbol('X'), new User());
        Player player2 = new BotPlayer(new Symbol('O'), new RandomBotPlayingStrategy());
        List<Player> players = List.of(player1, player2);
        List<GameWinningStrategy> gameWinningStrategies = List.of(new OrderOneGameWinningStrategy());

        Game game1 = controller.createGame(3, players, gameWinningStrategies);

        Move move1 = new Move(new Cell(0, 0), new Symbol('O'));
        controller.makeMove(game1, move1);
    }
}
