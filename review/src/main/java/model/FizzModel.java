package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FizzModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int FizzID;
	
	private String Name;
	private String Bio;
}
