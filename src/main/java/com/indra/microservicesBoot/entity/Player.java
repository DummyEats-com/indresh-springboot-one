package com.indra.microservicesBoot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name, position;

	public Player(String name, String position) {
		this();
		this.name = name;
		this.position = position;
	}

	public Player(long id, String name, String position) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
	}

	public Player() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", position=" + position + "]";
	}

}
