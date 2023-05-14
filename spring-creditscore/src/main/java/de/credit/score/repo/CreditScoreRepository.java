package de.credit.score.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import de.credit.score.model.CreditScore;

public interface CreditScoreRepository extends JpaRepository<CreditScore, Integer> {
	CreditScore findById(String ssn);

}
