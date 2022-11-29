package com.nour.acteurs.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class film {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long idF;
		private String nomF;
		private String descriptionF;
		
		@OneToMany(mappedBy = "film")
		@JsonIgnore
		private List<Acteur> acteurs;
public film(String nomF,String descriptionF,List<Acteur> acteurs)
{
super();
this.nomF = nomF;
this.descriptionF = descriptionF;
this.acteurs = acteurs;
}
public Long getIdF() {
	return idF;
}
public void setIdF(Long idF) {
	this.idF = idF;
}
public String getNomF() {
	return nomF;
}
public void setNomF(String nomF) {
	this.nomF = nomF;
}
public String getDescriptionF() {
	return descriptionF;
}
public void setDescriptionF(String descriptionF) {
	this.descriptionF = descriptionF;
}
public List<Acteur> getActeurs() {
	return acteurs;
}
public void setActeurs(List<Acteur> acteurs) {
	this.acteurs = acteurs;
}

}
