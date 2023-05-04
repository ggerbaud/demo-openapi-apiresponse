package fr.mabreizh.openapi.apiresponse;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.reactivestreams.Publisher;

public interface MyEndpoint {

    @ApiResponse(responseCode = "200", description = "All is ok")
    @ApiResponse(responseCode = "404", description = "Data is missing")
    Publisher<String> getData();
}
