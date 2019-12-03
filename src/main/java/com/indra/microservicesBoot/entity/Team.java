package com.indra.microservicesBoot.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name, location, mascotte;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "teamId")
	Set<Player> player;

	public Team() {
		super();
	}

	public Team(String name, String location, String mascotte, Set<Player> player) {
		this();
		this.name = name;
		this.location = location;
		this.mascotte = mascotte;
		this.player = player;
	}

	public Team(long id, String name, String location, String mascotte, Set<Player> player) {
		this();
		this.id = id;
		this.name = name;
		this.location = location;
		this.mascotte = mascotte;
		this.player = player;
	}

	public Set<Player> getPlayer() {
		return player;
	}

	public void setPlayer(Set<Player> player) {
		this.player = player;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMascotte() {
		return mascotte;
	}

	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", location=" + location + ", mascotte=" + mascotte + ", player="
				+ player + "]";
	}

}
