package com.nour.acteurs.service;

import java.util.List;

import com.nour.acteurs.entities.Acteur;
import com.nour.acteurs.entities.film;

public interface ActeurService {
	Acteur saveActeur(Acteur a);
	Acteur updateActeur(Acteur a);
	void deleteActeur(Acteur a);
	 void deleteActeurById(Long id);
	Acteur getActeur(Long id);
	List<Acteur> getAllActeurs();
	List<Acteur> findByNomActeur(String nom);
	List<Acteur> findByNomActeurContains(String nom);
	List<Acteur> findByNomAge (String nom, int age);
	List<Acteur> findByfilm (film film);
	List<Acteur> findByFilmId(Long id);
	List<Acteur> findByOrderByNomActeurAsc();
	List<Acteur> TrierActeursNomsAge();
}
