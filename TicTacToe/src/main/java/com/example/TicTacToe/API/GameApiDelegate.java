package com.example.TicTacToe.API;

import com.example.TicTacToe.Model.Game;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link GameApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-07T15:12:03.616186-05:00[America/Toronto]")

public interface GameApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /game : Creates a new game
     * New game creation
     *
     * @param game  (required)
     * @return Game Successfully Created (status code 201)
     * @see GameApi#createGame
     */
    default ResponseEntity<Void> createGame(Game game) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /game/{id} : Delete a game for a player
     * Delete a game
     *
     * @param id id of the game (required)
     * @return Successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Game not found (status code 404)
     * @see GameApi#deleteGame
     */
    default ResponseEntity<Game> deleteGame(Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"game_status\" : \"IN_PROGRESS\", \"player_one_piece\" : \"X\", \"game_size\" : 3, \"player_two_id\" : 5, \"id\" : 12345, \"player_one_id\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /game/{player_one_id} : Searches for all existing games based on a player
     * All existing games by a player will be read
     *
     * @param playerOneId ID of player (required)
     * @return Successful Operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Games not found (status code 404)
     * @see GameApi#searchAllGamesOfPlayer
     */
    default ResponseEntity<ArrayList<Game>> searchAllGamesOfPlayer(Integer playerOneId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"game_status\" : \"IN_PROGRESS\", \"player_one_piece\" : \"X\", \"game_size\" : 3, \"player_two_id\" : 5, \"id\" : 12345, \"player_one_id\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
