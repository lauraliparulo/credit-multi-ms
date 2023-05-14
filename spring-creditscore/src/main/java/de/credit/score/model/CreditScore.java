package de.credit.score.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CreditScore {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	private String firstName;
	private String lastName;
	private int score;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
