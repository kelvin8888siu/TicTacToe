package com.example.TicTacToe.API;

import com.example.TicTacToe.Model.Game;
import com.example.TicTacToe.Model.Move;
import com.example.TicTacToe.ORM.GameDAO;
import com.example.TicTacToe.ORM.MoveDAO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;

@Service
public class GameApiDelegateImpl implements GameApiDelegate{

    @Override
    public ResponseEntity<Void> createGame(Game game) {
        GameDAO gameDAO = new GameDAO();
        Game gameObject = new Game(game.getPlayerOneId(), game.getPlayerOnePiece(), game.getPlayerTwoId(), game.getGameSize(), game.getGameStatus());
        try {
            gameDAO.create(gameObject);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Game> deleteGame(Integer id) {
        GameDAO dao = new GameDAO();
        try {
            dao.delete(id);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<ArrayList<Game>> searchAllGamesOfPlayer(Integer playerOneId) {
        GameDAO dao = new GameDAO();
        ArrayList<Game> game = null;
        try {
            game = dao.searchAllGamesByPlayerId(playerOneId);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return ResponseEntity.ok(game);
    }
}
