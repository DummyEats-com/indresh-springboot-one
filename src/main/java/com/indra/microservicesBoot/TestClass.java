package com.indra.microservicesBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indra.microservicesBoot.dao.TeamDao;
import com.indra.microservicesBoot.entity.Team;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/rest")
public class TestClass {

	private Team team;

	@Autowired
	TeamDao teamDao;

	@RequestMapping(value = {"/teams/{name}"},produces = {"application/XML","application/JSON"})
	public Team testMethod(@PathVariable String name) {
		team=teamDao.findByName(name);
		return team;
	}

}
