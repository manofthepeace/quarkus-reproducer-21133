package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.smallrye.mutiny.Uni;

@Path("/hello")
public class ReactiveGreetingResource {

    @RestClient
    PotatoService svc;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Potato> hello() {
        return svc.getPotato();
    }
}