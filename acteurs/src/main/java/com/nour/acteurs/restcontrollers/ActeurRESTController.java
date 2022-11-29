package com.nour.acteurs.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nour.acteurs.entities.Acteur;
import com.nour.acteurs.service.ActeurService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ActeurRESTController {
	
	@Autowired
	ActeurService actService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	List<Acteur>getAllActeurs(){
		return actService.getAllActeurs();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Acteur getActeurById(@PathVariable("id") Long id) {
		return actService.getActeur(id);
	}
	@RequestMapping(method = RequestMethod.POST)
	public Acteur createActeur(@RequestBody Acteur a) {
	return actService.saveActeur(a);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Acteur updateActeur(@RequestBody Acteur a) {
	return actService.updateActeur(a);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteActeur(@PathVariable("id") Long id)
	{
	actService.deleteActeurById(id);
	}
	
	@RequestMapping(value="/actsf/{idF}",method = RequestMethod.GET)
	public List<Acteur> getActeurByfId(@PathVariable("idF") Long idF) {
	return actService.findByFilmId(idF);
	}

}
