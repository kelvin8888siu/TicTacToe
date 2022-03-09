package com.example.TicTacToe.API;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-09T10:21:32.498099-05:00[America/Toronto]")

@Controller
@RequestMapping("${openapi.simpleTicTacToe.base-path:}")
public class GameApiController implements GameApi {

    private final GameApiDelegate delegate;

    public GameApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) GameApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new GameApiDelegate() {});
    }

    @Override
    public GameApiDelegate getDelegate() {
        return delegate;
    }

}
