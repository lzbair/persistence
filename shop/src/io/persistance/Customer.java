package io.persistance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String name;

	public Customer(String email, String name) {
		this(null, email, name);
	}

	public Customer(Long id, String email, String name) {
		this.id = id;
		this.email = email;
		this.name = name;
	}

	public Customer() {
		// JPA
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

}
