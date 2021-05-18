package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Favoris {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id ;
//	private Long client_Id ;
//	private Long logement_Id ;
	private String intitule;
	private String description;
	private double prix;
	private String image;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Favoris() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Favoris(Long id, String intitule, String description, double prix, String image) {
		super();
		this.id = id;
		this.intitule = intitule;
		this.description = description;
		this.prix = prix;
		this.image = image;
	}
	
}
