package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.smallrye.mutiny.Uni;

@RegisterRestClient(configKey = "potato-api")
public interface PotatoService {

    @GET
    @Path("/hello")
    Uni<Potato> getPotato();

}
