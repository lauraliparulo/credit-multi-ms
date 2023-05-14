package de.credit.score.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import de.credit.score.model.CreditScore;
import de.credit.score.repo.CreditScoreRepository;

@RestController
public class CreditScoreController {

	@Autowired
	CreditScoreRepository repo;

	@GetMapping("/creditscores/{ssn}")
	public CreditScore getCreditScore(@PathVariable("ssn") String ssn) {
		return repo.findById(ssn);
		
	}
}
