package com.example.TicTacToe.Model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Move
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-07T15:12:03.616186-05:00[America/Toronto]")

public class Move   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("player_id")
  private Integer playerId;

  @JsonProperty("game_id")
  private Integer gameId;

  @JsonProperty("board_row")
  private Integer boardRow;

  @JsonProperty("board_column")
  private Integer boardColumn;

  @JsonProperty("time_of_move")
  private String timeOfMove;

  public Move(int playerId, int gameId, int boardRow, int boardColumn){
    this.playerId = playerId;
    this.gameId = gameId;
    this.boardRow = boardRow;
    this.boardColumn = boardColumn;
  }

  public Move id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * minimum: 0
   * @return id
  */
  @ApiModelProperty(example = "12345", value = "")

@Min(0)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Move playerId(Integer playerId) {
    this.playerId = playerId;
    return this;
  }

  /**
   * Get playerId
   * minimum: 0
   * @return playerId
  */
  @ApiModelProperty(example = "12345", required = true, value = "")
  @NotNull

@Min(0)
  public Integer getPlayerId() {
    return playerId;
  }

  public void setPlayerId(Integer playerId) {
    this.playerId = playerId;
  }

  public Move gameId(Integer gameId) {
    this.gameId = gameId;
    return this;
  }

  /**
   * Get gameId
   * minimum: 0
   * @return gameId
  */
  @ApiModelProperty(example = "12345", required = true, value = "")
  @NotNull

@Min(0)
  public Integer getGameId() {
    return gameId;
  }

  public void setGameId(Integer gameId) {
    this.gameId = gameId;
  }

  public Move boardRow(Integer boardRow) {
    this.boardRow = boardRow;
    return this;
  }

  /**
   * Get boardRow
   * @return boardRow
  */
  @ApiModelProperty(example = "3", required = true, value = "")
  @NotNull

  public Integer getBoardRow() {
    return boardRow;
  }

  public void setBoardRow(Integer boardRow) {
    this.boardRow = boardRow;
  }

  public Move boardColumn(Integer boardColumn) {
    this.boardColumn = boardColumn;
    return this;
  }

  /**
   * Get boardColumn
   * @return boardColumn
  */
  @ApiModelProperty(example = "3", required = true, value = "")
  @NotNull

  public Integer getBoardColumn() {
    return boardColumn;
  }

  public void setBoardColumn(Integer boardColumn) {
    this.boardColumn = boardColumn;
  }

  public Move timeOfMove(String timeOfMove) {
    this.timeOfMove = timeOfMove;
    return this;
  }

  /**
   * Get timeOfMove
   * @return timeOfMove
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTimeOfMove() {
    return timeOfMove;
  }

  public void setTimeOfMove(String timeOfMove) {
    this.timeOfMove = timeOfMove;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Move move = (Move) o;
    return Objects.equals(this.id, move.id) &&
        Objects.equals(this.playerId, move.playerId) &&
        Objects.equals(this.gameId, move.gameId) &&
        Objects.equals(this.boardRow, move.boardRow) &&
        Objects.equals(this.boardColumn, move.boardColumn) &&
        Objects.equals(this.timeOfMove, move.timeOfMove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, playerId, gameId, boardRow, boardColumn, timeOfMove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Move {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    boardRow: ").append(toIndentedString(boardRow)).append("\n");
    sb.append("    boardColumn: ").append(toIndentedString(boardColumn)).append("\n");
    sb.append("    timeOfMove: ").append(toIndentedString(timeOfMove)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

