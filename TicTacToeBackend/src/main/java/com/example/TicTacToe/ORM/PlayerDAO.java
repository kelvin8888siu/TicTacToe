package com.example.TicTacToe.ORM;

import com.example.TicTacToe.Model.Game;
import com.example.TicTacToe.Model.InlineResponse201;
import com.example.TicTacToe.Model.Player;

import java.sql.*;
import java.util.ArrayList;

public class PlayerDAO {
    protected ConnManager connManager;

    public PlayerDAO() {this.connManager = new ConnManager();}

    public Player create(Player player) throws SQLException {
        String insertPlayer = "INSERT INTO Player(username, password) VALUES(?,?);";
        Connection connection = null;
        PreparedStatement insertStmt = null;
        InlineResponse201 response = new InlineResponse201();
        try {
            connection = connManager.getConnection();
            insertStmt = connection.prepareStatement(insertPlayer, Statement.RETURN_GENERATED_KEYS);
            insertStmt.setString(1, player.getUsername());
            insertStmt.setString(2, player.getPassword());
            insertStmt.executeUpdate();

            ResultSet rs = insertStmt.getGeneratedKeys();
            if (rs.next()){
                player.setId(rs.getInt(1));
            }

            rs = insertStmt.getResultSet();

            if(rs != null && rs.next()) {
                do {
                    player.setUsername(rs.getString(2));
                    player.setPassword(rs.getString(3));
                } while (rs.next());
                rs.close();
            }
            return player;
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

    public Integer searchId(String username) throws SQLException {
        String selectStmt = "SELECT id FROM Player WHERE username = ?;";
        Connection connection = null;
        PreparedStatement select = null;
        ResultSet result = null;

        try {
            connection = connManager.getConnection();
            select = connection.prepareStatement(selectStmt);
            select.setString(1, username);
            result = select.executeQuery();
            Integer id = null;
            if(result.next()) {
                id = result.getInt("id");
            }
            return id;
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
