package de.credit.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import de.credit.card.model.CreditCard;
import de.credit.card.model.CreditScoreDto;
import de.credit.card.repo.CreditCardRepository;

@RestController
public class CreditCardController {
	
	@Autowired
	private CreditCardRepository repo;

	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/issuecard")
	public boolean issueCard(@RequestBody CreditCard card) {
	
		if(getScore(card.getSsn())>= 700) {
			repo.save(card);
			return true;
		}
		return false;
	}
	
	
	private int getScore(String ssn) {
		
		CreditScoreDto creditScore = restTemplate.getForObject("http://localhost:8080/creditscore/creditscores/"+ssn, CreditScoreDto.class);
		
		return creditScore.getScore();
		
	}
	
}

