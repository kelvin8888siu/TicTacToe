package com.example.TicTacToe.ORM;

import com.example.TicTacToe.Model.Game;
import com.example.TicTacToe.Model.Move;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GameDAO {
    protected ConnManager connManager;

    public GameDAO() {
        this.connManager = new ConnManager();
    }

    public Game create(Game game) throws SQLException {
        String insertPlayer = "INSERT INTO Game(player_one_id, player_one_piece, player_two_id, game_size, game_status) VALUES(?,?,?,?,?);";
        Connection connection = null;
        PreparedStatement insertStmt = null;
        try {
            connection = connManager.getConnection();
            insertStmt = connection.prepareStatement(insertPlayer);
            insertStmt.setInt(1, game.getPlayerOneId());
            insertStmt.setObject(2, game.getPlayerOnePiece());
            insertStmt.setInt(3, game.getPlayerTwoId());
            insertStmt.setInt(4, game.getGameSize());
            insertStmt.setObject(5, game.getGameStatus());
            insertStmt.executeUpdate();
            return game;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (insertStmt != null) {
                insertStmt.close();
            }
        }
    };

    public ArrayList<Game> searchAllGamesByPlayerId(int playerId) throws SQLException {
        String selectStmt = "SELECT * FROM Game WHERE player_one_id = ?;";
        Connection connection = null;
        PreparedStatement select = null;
        ResultSet result = null;

        try {
            connection = connManager.getConnection();
            select = connection.prepareStatement(selectStmt);
            select.setInt(1, playerId);
            result = select.executeQuery();
            ArrayList<Game> gameList = new ArrayList<Game>();

            while (result.next()) {
                int id = result.getInt("id");
                int player_one_id = result.getInt("player_one_id");
                Game.PlayerOnePieceEnum player_one_piece = Game.PlayerOnePieceEnum.fromValue(result.getString("player_one_piece"));
                int player_two_id = result.getInt("player_two_id");
                int game_size = result.getInt("game_size");
                Game.GameStatusEnum game_status = Game.GameStatusEnum.fromValue(result.getString("game_status"));
                Game game = new Game(id, player_one_id, player_one_piece, player_two_id, game_size, game_status);
                gameList.add(game);
            }
            return gameList;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (select != null) {
                select.close();
            }
            if (result != null) {
                result.close();
            }
        }
    }

    public int delete(Integer gameId) throws SQLException {
        String delete = "DELETE FROM Game WHERE id = ?";
        Connection connection = null;
        PreparedStatement deleteStmt = null;
        try {
            connection = connManager.getConnection();
            deleteStmt = connection.prepareStatement(delete);
            deleteStmt.setInt(1, gameId);
            int result = deleteStmt.executeUpdate();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (deleteStmt != null) {
                deleteStmt.close();
            }
        }
    };
}
