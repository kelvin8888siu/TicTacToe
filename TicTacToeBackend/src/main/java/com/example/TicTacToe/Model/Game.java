package com.example.TicTacToe.Model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Game
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-07T15:12:03.616186-05:00[America/Toronto]")

public class Game   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("player_one_id")
  private Integer playerOneId;

  /**
   * Gets or Sets playerOnePiece
   */
  public enum PlayerOnePieceEnum {
    X("X"),
    
    O("O");

    private String value;

    PlayerOnePieceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PlayerOnePieceEnum fromValue(String value) {
      for (PlayerOnePieceEnum b : PlayerOnePieceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("player_one_piece")
  private PlayerOnePieceEnum playerOnePiece;

  @JsonProperty("player_two_id")
  private Integer playerTwoId;

  @JsonProperty("game_size")
  private Integer gameSize;

  /**
   * Gets or Sets gameStatus
   */
  public enum GameStatusEnum {
    IN_PROGRESS("IN_PROGRESS"),
    
    WIN("WIN"),
    
    LOSS("LOSS");

    private String value;

    GameStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GameStatusEnum fromValue(String value) {
      for (GameStatusEnum b : GameStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("game_status")
  private GameStatusEnum gameStatus;

  public Game(){

  }

  public Game(int id, int playerOneId, PlayerOnePieceEnum playerOnePiece, int playerTwoId, int gameSize, GameStatusEnum gameStatus){
    this.id = id;
    this.playerOneId = playerOneId;
    this.playerOnePiece = playerOnePiece;
    this.playerTwoId = playerTwoId;
    this.gameSize = gameSize;
    this.gameStatus = gameStatus;
  }

  public Game(int playerOneId, PlayerOnePieceEnum playerOnePiece, int playerTwoId, int gameSize, GameStatusEnum gameStatus){
    this.id = id;
    this.playerOneId = playerOneId;
    this.playerOnePiece = playerOnePiece;
    this.playerTwoId = playerTwoId;
    this.gameSize = gameSize;
    this.gameStatus = gameStatus;
  }

  public Game id(Integer id) {
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

  public Game playerOneId(Integer playerOneId) {
    this.playerOneId = playerOneId;
    return this;
  }

  /**
   * Get playerOneId
   * minimum: 0
   * @return playerOneId
  */
  @ApiModelProperty(example = "12345", required = true, value = "")
  @NotNull

@Min(0)
  public Integer getPlayerOneId() {
    return playerOneId;
  }

  public void setPlayerOneId(Integer playerOneId) {
    this.playerOneId = playerOneId;
  }

  public Game playerOnePiece(PlayerOnePieceEnum playerOnePiece) {
    this.playerOnePiece = playerOnePiece;
    return this;
  }

  /**
   * Get playerOnePiece
   * @return playerOnePiece
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public PlayerOnePieceEnum getPlayerOnePiece() {
    return playerOnePiece;
  }

  public void setPlayerOnePiece(PlayerOnePieceEnum playerOnePiece) {
    this.playerOnePiece = playerOnePiece;
  }

  public Game playerTwoId(Integer playerTwoId) {
    this.playerTwoId = playerTwoId;
    return this;
  }

  /**
   * Get playerTwoId
   * minimum: 0
   * @return playerTwoId
  */
  @ApiModelProperty(example = "5", required = true, value = "")
  @NotNull

@Min(0)
  public Integer getPlayerTwoId() {
    return playerTwoId;
  }

  public void setPlayerTwoId(Integer playerTwoId) {
    this.playerTwoId = playerTwoId;
  }

  public Game gameSize(Integer gameSize) {
    this.gameSize = gameSize;
    return this;
  }

  /**
   * Get gameSize
   * minimum: 3
   * @return gameSize
  */
  @ApiModelProperty(example = "3", required = true, value = "")
  @NotNull

@Min(3)
  public Integer getGameSize() {
    return gameSize;
  }

  public void setGameSize(Integer gameSize) {
    this.gameSize = gameSize;
  }

  public Game gameStatus(GameStatusEnum gameStatus) {
    this.gameStatus = gameStatus;
    return this;
  }

  /**
   * Get gameStatus
   * @return gameStatus
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public GameStatusEnum getGameStatus() {
    return gameStatus;
  }

  public void setGameStatus(GameStatusEnum gameStatus) {
    this.gameStatus = gameStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Game game = (Game) o;
    return Objects.equals(this.id, game.id) &&
        Objects.equals(this.playerOneId, game.playerOneId) &&
        Objects.equals(this.playerOnePiece, game.playerOnePiece) &&
        Objects.equals(this.playerTwoId, game.playerTwoId) &&
        Objects.equals(this.gameSize, game.gameSize) &&
        Objects.equals(this.gameStatus, game.gameStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, playerOneId, playerOnePiece, playerTwoId, gameSize, gameStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Game {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    playerOneId: ").append(toIndentedString(playerOneId)).append("\n");
    sb.append("    playerOnePiece: ").append(toIndentedString(playerOnePiece)).append("\n");
    sb.append("    playerTwoId: ").append(toIndentedString(playerTwoId)).append("\n");
    sb.append("    gameSize: ").append(toIndentedString(gameSize)).append("\n");
    sb.append("    gameStatus: ").append(toIndentedString(gameStatus)).append("\n");
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

