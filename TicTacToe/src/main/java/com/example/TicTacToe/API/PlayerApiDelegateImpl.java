package com.example.TicTacToe.API;

import com.example.TicTacToe.Model.Player;
import com.example.TicTacToe.ORM.PlayerDAO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class PlayerApiDelegateImpl implements PlayerApiDelegate {
    @Override
    public ResponseEntity<Integer> searchIdOfPlayer(String username) {
        PlayerDAO dao = new PlayerDAO();
        Integer id = null;
        try {
            id = dao.searchId(username);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return ResponseEntity.ok(id);
    }

    @Override
    public ResponseEntity<Void> createPlayer(Player player) {
        PlayerDAO playerDAO = new PlayerDAO();
        Player playerObject = new Player(player.getUsername(), player.getPassword());
        try {
            playerDAO.create(playerObject);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
