package com.example.TicTacToe.API;

import com.example.TicTacToe.Model.Move;
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
 * A delegate to be called by the {@link MoveApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-09T10:21:32.498099-05:00[America/Toronto]")

public interface MoveApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /move : Creates a new move in a game
     * New move creation
     *
     * @param move  (required)
     * @return Move Successfully Added (status code 201)
     *         or Bad Request (status code 400)
     * @see MoveApi#createMove
     */
    default ResponseEntity<Move> createMove(Move move) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"player_id\" : 12345, \"board_row\" : 3, \"time_of_move\" : \"time_of_move\", \"id\" : 12345, \"board_columnn\" : 3, \"game_id\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /move/{game_id} : Searches for all moves for a particular game
     * All moves of a specific game is read
     *
     * @param gameId ID of game (required)
     * @return Successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Moves not found (status code 404)
     * @see MoveApi#searchAllMovesOfGame
     */
    default ResponseEntity<ArrayList<Move>> searchAllMovesOfGame(Integer gameId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"player_id\" : 12345, \"board_row\" : 3, \"time_of_move\" : \"time_of_move\", \"id\" : 12345, \"board_columnn\" : 3, \"game_id\" : 12345 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
