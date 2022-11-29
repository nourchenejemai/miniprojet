package com.nour.acteurs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Acteur {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idActeur;
    private String nomActeur;
    private String prActeur;
    private int ageActeur;
    
    @ManyToOne
    private film film;
    
	public Long getIdActeur() {
		return idActeur;
	}
	public void setIdActeur(Long idActeur) {
		this.idActeur = idActeur;
	}
	public String getNomActeur() {
		return nomActeur;
	}
	public void setNomActeur(String nomActeur) {
		this.nomActeur = nomActeur;
	}
	public String getPrActeur() {
		return prActeur;
	}
	public void setPrActeur(String prActeur) {
		this.prActeur = prActeur;
	}
	public int getAgeActeur() {
		return ageActeur;
	}
	public void setAgeActeur(int ageActeur) {
		this.ageActeur = ageActeur;
	}
	
	public film getFilm() {
		return film;
	}
	public void setFilm(film film) {
		this.film = film;
	}
	public Acteur() {
		super();
	}
	public Acteur(String nomActeur, String prActeur, int ageActeur) {
		super();
		this.nomActeur = nomActeur;
		this.prActeur = prActeur;
		this.ageActeur = ageActeur;
	}
	@Override
	public String toString() {
		return "Acteur [idActeur=" + idActeur + ", nomActeur=" + nomActeur + ", prActeur=" + prActeur + ", ageActeur="
				+ ageActeur + "]";
	}
	
}
