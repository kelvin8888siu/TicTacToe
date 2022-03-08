package com.example.TicTacToe.ORM;

import com.example.TicTacToe.Model.Game;
import com.example.TicTacToe.Model.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PlayerDAO {
    protected ConnManager connManager;

    public PlayerDAO() {this.connManager = new ConnManager();}

    public Player create(Player player) throws SQLException {
        String insertPlayer = "INSERT INTO Player(username, password) VALUES(?,?);";
        Connection connection = null;
        PreparedStatement insertStmt = null;
        try {
            connection = connManager.getConnection();
            insertStmt = connection.prepareStatement(insertPlayer);
            insertStmt.setString(1, player.getUsername());
            insertStmt.setString(2, player.getPassword());
            insertStmt.executeUpdate();
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
