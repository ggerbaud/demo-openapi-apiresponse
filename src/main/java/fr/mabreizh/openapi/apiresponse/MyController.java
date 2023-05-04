package fr.mabreizh.openapi.apiresponse;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.reactivestreams.Publisher;

@Controller
public class MyController implements MyEndpoint {

    @Get("/data")
    @Override
    public Publisher<String> getData() {
        return null;
    }
}
