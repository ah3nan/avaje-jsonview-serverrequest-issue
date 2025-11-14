package org.ah3nan;

import io.avaje.http.api.Controller;
import io.avaje.http.api.Get;
import io.avaje.http.api.Path;
import io.helidon.webserver.http.ServerRequest;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;

@Controller
@Path("/persons-serverrequest")
@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class PersonServerRequestController {
    private final ServerRequest serverRequest;
    @Get("/")
    public String get() {
        return "server-request";
    }
}
