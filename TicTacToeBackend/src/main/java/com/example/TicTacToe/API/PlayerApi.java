/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.3).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.TicTacToe.API;

import com.example.TicTacToe.Model.InlineResponse201;
import com.example.TicTacToe.Model.Player;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-09T10:21:32.498099-05:00[America/Toronto]")

@Validated
@Api(value = "player", description = "the player API")
public interface PlayerApi {

    default PlayerApiDelegate getDelegate() {
        return new PlayerApiDelegate() {};
    }

    /**
     * POST /player : Creates a player
     * Player or user creation
     *
     * @param player  (required)
     * @return Player Successfully Added (status code 201)
     *         or Bad Request (status code 400)
     */
    @ApiOperation(value = "Creates a player", nickname = "createPlayer", notes = "Player or user creation", response = InlineResponse201.class, tags={ "player", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Player Successfully Added", response = Player.class),
        @ApiResponse(code = 400, message = "Bad Request") })
    @RequestMapping(value = "/player",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Player> createPlayer(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Player player) {
        return getDelegate().createPlayer(player);
    }


    /**
     * GET /player/{username} : Searches for id of player based on username
     * Id of player will be read
     *
     * @param username Username of player (required)
     * @return Successful Operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Username not found (status code 404)
     */
    @ApiOperation(value = "Searches for id of player based on username", nickname = "searchIdOfPlayer", notes = "Id of player will be read", response = Player.class, tags={ "player", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = Player.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Username not found") })
    @RequestMapping(value = "/player/{username}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Integer> searchIdOfPlayer(@ApiParam(value = "Username of player",required=true) @PathVariable("username") String username) {
        return getDelegate().searchIdOfPlayer(username);
    }

}
