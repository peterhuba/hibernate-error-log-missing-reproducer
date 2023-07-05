package com.example;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/context")
public class FruitResource {

    @Inject
    ContextRepository contextRepository;

    @GET
    public Long list() {
        return contextRepository.findByContextId("1").map(ContextEntity::getContextId).orElse(null);
    }
}