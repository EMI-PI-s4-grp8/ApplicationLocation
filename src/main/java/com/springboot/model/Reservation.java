package com.springboot.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id ;
	//@NotEmpty
	private Long clientId ;
	//@NotEmpty
	private Long logementId ;
	//@NotEmpty
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date arrival_date ; 
	//@NotEmpty
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date departure_date ; 
	//@NotEmpty
	private Long number_of_adult ;
	//@NotEmpty
	private Long number_of_children ;
	//@NotEmpty
	private Long number_of_room ;
	//@NotEmpty
	private String email ;
	//@NotEmpty
	private Long numero_telephone ;
	
	
	
	public Long getNumber_of_children() {
		return number_of_children;
	}



	public void setNumber_of_children(Long number_of_children) {
		this.number_of_children = number_of_children;
	}



	public Long getNumber_of_room() {
		return number_of_room;
	}



	public void setNumber_of_room(Long number_of_room) {
		this.number_of_room = number_of_room;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Long getNumero_telephone() {
		return numero_telephone;
	}



	public void setNumero_telephone(Long numero_telephone) {
		this.numero_telephone = numero_telephone;
	}



	
	
	
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getClientId() {
		return clientId;
	}



	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}



	public Long getLogementId() {
		return logementId;
	}



	public void setLogementId(Long logementId) {
		this.logementId = logementId;
	}



	public Date getArrival_date() {
		return arrival_date;
	}



	public void setArrival_date(Date arrival_date) {
		this.arrival_date = arrival_date;
	}



	public Date getDeparture_date() {
		return departure_date;
	}



	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}



	public Long getNumber_of_adult() {
		return number_of_adult;
	}



	public void setNumber_of_adult(Long number_of_adult) {
		this.number_of_adult = number_of_adult;
	}


	
	public Reservation() {
		super();
	}


	public Reservation(Long id,  Long clientId, Long logementId,  Date arrival_date,
			 Date departure_date,  Long number_of_adult,  Long number_of_children,
			 Long number_of_room,  String email,  Long numero_telephone) {
		super();
		this.id= id;
		this.clientId = clientId;
		this.logementId = logementId;
		this.arrival_date = arrival_date;
		this.departure_date = departure_date;
		this.number_of_adult = number_of_adult;
		this.number_of_children = number_of_children;
		this.number_of_room = number_of_room;
		this.email = email;
		this.numero_telephone = numero_telephone;
	}



	


	
	

}
