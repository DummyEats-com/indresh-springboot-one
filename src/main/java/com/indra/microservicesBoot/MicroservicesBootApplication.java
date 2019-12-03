package com.indra.microservicesBoot;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.indra.microservicesBoot.dao.TeamDao;
import com.indra.microservicesBoot.entity.Player;
import com.indra.microservicesBoot.entity.Team;

@SpringBootApplication
public class MicroservicesBootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootApplication.class, args);
	}

	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroservicesBootApplication.class);
	}

	@PostConstruct
	public void init() {
		Set<Player> player = new HashSet<>();
		player.add(new Player("indra", "1"));
		player.add(new Player("naga", "2"));
		player.add(new Player("asif", "3"));
		player.add(new Player("amrit", "4"));
		Team team = new Team("india-One", "india", "Bangalore", player);
		teamDao.save(team);
	}

	@Autowired
	TeamDao teamDao;
}
