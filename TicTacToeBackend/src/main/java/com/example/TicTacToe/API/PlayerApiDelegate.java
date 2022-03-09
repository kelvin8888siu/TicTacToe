package com.example.TicTacToe.API;

import com.example.TicTacToe.Model.InlineResponse201;
import com.example.TicTacToe.Model.Player;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link PlayerApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-09T10:21:32.498099-05:00[America/Toronto]")

public interface PlayerApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /player : Creates a player
     * Player or user creation
     *
     * @param player  (required)
     * @return Player Successfully Added (status code 201)
     *         or Bad Request (status code 400)
     * @see PlayerApi#createPlayer
     */
    default ResponseEntity<Player> createPlayer(Player player) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /player/{username} : Searches for id of player based on username
     * Id of player will be read
     *
     * @param username Username of player (required)
     * @return Successful Operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Username not found (status code 404)
     * @see PlayerApi#searchIdOfPlayer
     */
    default ResponseEntity<Integer> searchIdOfPlayer(String username) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"password\" : \"1234GG3\", \"id\" : 12345, \"username\" : \"kelvin97siu\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
