package com.example.TicTacToe.API;

import com.example.TicTacToe.Model.Game;
import com.example.TicTacToe.Model.Move;
import com.example.TicTacToe.Model.Player;
import com.example.TicTacToe.ORM.GameDAO;
import com.example.TicTacToe.ORM.MoveDAO;
import com.example.TicTacToe.ORM.PlayerDAO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;

@Service
public class MoveApiDelegateImpl implements MoveApiDelegate{

    @Override
    public ResponseEntity<Move> createMove(Move move) {
        MoveDAO moveDAO = new MoveDAO();
        System.out.print(move.getBoardColumn());
        Move moveObject = new Move(move.getPlayerId(), move.getGameId(), move.getBoardRow(), move.getBoardColumn());
        Move response = null;
        try {
            response = moveDAO.create(moveObject);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        System.out.print(response.toString());
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<ArrayList<Move>> searchAllMovesOfGame(Integer gameId) {
        MoveDAO dao = new MoveDAO();
        ArrayList<Move> move = null;
        try {
            move = dao.searchAllMoveByGameId(gameId);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return ResponseEntity.ok(move);
    }
}
