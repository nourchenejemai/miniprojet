package com.nour.acteurs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nour.acteurs.entities.Acteur;
import com.nour.acteurs.entities.film;
import com.nour.acteurs.repos.ActeurRepository;


@Service
public class ActeurServiceImpl implements ActeurService {
	
	@Autowired
	ActeurRepository acteurRepository;

	public Acteur saveActeur(Acteur a) {
		return acteurRepository.save(a);
	}

	public Acteur updateActeur(Acteur a) {
		return acteurRepository.save(a);

	}

	public void deleteActeur(Acteur a) {
		 acteurRepository.delete(a);
		
	}

	public void deleteActeurById(Long id) {
		 acteurRepository.deleteById(id);
		
	}

	public Acteur getActeur(Long id) {
		return acteurRepository.findById(id).get();

	}

	public List<Acteur> getAllActeurs() {
		return acteurRepository.findAll();

	}

	@Override
	public List<Acteur> findByNomActeur(String nom) {
		return acteurRepository.findByNomActeur(nom);
	}

	@Override
	public List<Acteur> findByNomActeurContains(String nom) {
		return acteurRepository.findByNomActeurContains(nom);
	}

	@Override
	public List<Acteur> findByNomAge(String nom, int age) {
		return acteurRepository.findByNomAge(nom, age);
	}

	@Override
	public List<Acteur> findByfilm(film film) {
		return acteurRepository.findByFilm(film);
	}

	@Override
	public List<Acteur> findByFilmId(Long id) {
		return acteurRepository.findByFilmIdF(id);
	}

	@Override
	public List<Acteur> findByOrderByNomActeurAsc() {
		return acteurRepository.findByOrderByNomActeurAsc();
	}

	@Override
	public List<Acteur> TrierActeursNomsAge() {
		return acteurRepository.findByOrderByNomActeurAsc();
	}

}
