package com.example.TicTacToe.API;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-09T10:21:32.498099-05:00[America/Toronto]")

@Controller
@RequestMapping("${openapi.simpleTicTacToe.base-path:}")
public class MoveApiController implements MoveApi {

    private final MoveApiDelegate delegate;

    public MoveApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) MoveApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new MoveApiDelegate() {});
    }

    @Override
    public MoveApiDelegate getDelegate() {
        return delegate;
    }

}
