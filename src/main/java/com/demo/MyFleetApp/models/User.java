package com.demo.MyFleetApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
		
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
	private int id;
	private String username;
	private String password;
	
	public String getUsername() {
		
		return username;
	}

	public String getPassword() {
		return password;
	}
}
