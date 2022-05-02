package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test_data")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public TestData[] hello() {

        return new TestData[] {new TestData(23,12,48.5,124.4,"Sample Point",312.4)};
    }
}