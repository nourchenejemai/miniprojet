package com.nour.acteurs.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nour.acteurs.entities.Acteur;
import com.nour.acteurs.entities.film;


@RepositoryRestResource(path = "rest")
public interface ActeurRepository extends JpaRepository<Acteur, Long>{
 List <Acteur> findByNomActeur(String nom);
 List <Acteur> findByNomActeurContains(String nom);
 
 @Query("select p from Acteur p where p.nomActeur like %?1 and p.ageActeur > ?2")
 List<Acteur> findByNomAge (String nom, int age);
/* @Query("select p from Produit p where p.nomActeur like %:nomActeur and p.ageActeur > :ageActeur")
 List<Acteur> findByNomAge (@Param("nom") String nom,@Param("age") int age);*/
 
 @Query("select p from Acteur p where p.film = ?1")
 List<Acteur> findByFilm (film film);
 
 List<Acteur> findByFilmIdF(Long id);
 
 List<Acteur> findByOrderByNomActeurAsc();
 
 @Query("select p from Acteur p order by p.nomActeur ASC, p.ageActeur DESC")
 List<Acteur> trierActeursNomsAge ();



 }
