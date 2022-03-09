package com.example.TicTacToe.ORM;

import com.example.TicTacToe.Model.Game;
import com.example.TicTacToe.Model.Move;
import com.example.TicTacToe.Model.Player;

import java.sql.*;
import java.util.ArrayList;

public class MoveDAO {
    protected ConnManager connManager;

    public MoveDAO() {this.connManager = new ConnManager();}

    public Move create(Move move) throws SQLException {
        String insertPlayer = "INSERT INTO Move(player_id, game_id, board_row, board_column) VALUES(?,?,?,?);";
        Connection connection = null;
        PreparedStatement insertStmt = null;
        try {
            connection = connManager.getConnection();
            insertStmt = connection.prepareStatement(insertPlayer, Statement.RETURN_GENERATED_KEYS);
            insertStmt.setInt(1, move.getPlayerId());
            insertStmt.setInt(2, move.getGameId());
            insertStmt.setInt(3, move.getBoardRow());
            insertStmt.setInt(4, move.getBoardColumn());
            insertStmt.executeUpdate();


            ResultSet rs = insertStmt.getGeneratedKeys();
            if (rs.next()){
                move.setId(rs.getInt(1));
            }

            rs = insertStmt.getResultSet();

            if(rs != null && rs.next()) {
                do {
                    move.setPlayerId(rs.getInt(2));
                    move.setGameId(rs.getInt(3));
                    move.setBoardRow(rs.getInt(4));
                    move.setBoardColumn(rs.getInt(5));
                    move.setTimeOfMove(rs.getDate(6).toString());
                } while (rs.next());
                rs.close();
            }
            return move;
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

    public ArrayList<Move> searchAllMoveByGameId(int gameId) throws SQLException {
        String selectStmt = "SELECT * FROM Move WHERE player_one_id = ?;";
        Connection connection = null;
        PreparedStatement select = null;
        ResultSet result = null;

        try {
            connection = connManager.getConnection();
            select = connection.prepareStatement(selectStmt);
            select.setInt(1, gameId);
            result = select.executeQuery();
            ArrayList<Move> moveList = new ArrayList<Move>();

            while (result.next()) {
                int playerId = result.getInt("player_id");
                int boardRow = result.getInt("board_row");
                int boardCol = result.getInt("board_column");
                Move game = new Move(playerId, gameId, boardRow, boardCol);
                moveList.add(game);
            }
            return moveList;
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
}
