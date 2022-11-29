package com.nour.acteurs;



import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nour.acteurs.entities.Acteur;
import com.nour.acteurs.entities.film;
import com.nour.acteurs.repos.ActeurRepository;

@SpringBootTest
class ActeursApplicationTests {

	@Autowired
	private ActeurRepository acteurRepository;
	@Test
	public void testCreateActeur() {
		Acteur act = new Acteur("Leonardo","DiCaprio",48);
		acteurRepository.save(act);
	}
	@Test
	public void testFindActeurs()
	{
	Acteur a = acteurRepository.findById(1L).get(); 
	System.out.println(a);
	}
	
	@Test
	public void testUpdateActeur()
	{
	Acteur a = acteurRepository.findById(1L).get();
	a.setAgeActeur(50);
	acteurRepository.save(a);
	}
	@Test
	public void testDeleteActeur()
	{
	acteurRepository.deleteById(4L);;
	}
	@Test
	public void testListerTousActeurs()
	{
	List <Acteur> acts = acteurRepository.findAll();
	for (Acteur a : acts)
	{
	System.out.println(a);
	}
	}
	
	@Test
	public void testFindByNomActeur()
	{
	List<Acteur> acts = acteurRepository.findByNomActeur("Morgan");
	for (Acteur a : acts)
	{
	System.out.println(a);
	}
	}
	@Test
	public void testFindByNomActeurContains ()
	{
	List<Acteur> acts=acteurRepository.findByNomActeurContains("Morgan");
	for (Acteur a : acts)
	{
	System.out.println(a);
	} 
	}	
	@Test
	public void testfindByNomAge()
	{
	List<Acteur> acts = acteurRepository.findByNomAge("Morgan", 50);
	for (Acteur p : acts)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByfilm()
	{
	film fil = new film();
	fil.setIdF(1L);
	List<Acteur> acts = acteurRepository.findByFilm(fil);
	for (Acteur p : acts)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void findByFilmIdF()
	{
	List<Acteur> acts = acteurRepository.findByFilmIdF(1L);
	for (Acteur p : acts)
	{
	System.out.println(p);
	}
	 }
	
	@Test
	public void testfindByOrderByNomActeurAsc()
	{
	List<Acteur> acts = 
	acteurRepository.findByOrderByNomActeurAsc();
	for (Acteur p : acts)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testTrierActeursNomsAge()
	{
	List<Acteur> acts = acteurRepository.trierActeursNomsAge();
	for (Acteur p : acts)
	{
	System.out.println(p);
	}
	}
	

}
