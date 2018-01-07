package com.basant.spring.profile.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "USER")
@Setter
@Getter
@AllArgsConstructor
@ToString
public class User {
	@Id
	private int id;
	private String name;

	public User() {
		super();
	}

}
