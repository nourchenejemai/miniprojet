package com.nour.acteurs.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomActeur",types = {Acteur.class})
public interface ActeurProjection {
public String getNomActeur();
}
