package de.credit.card.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import de.credit.card.model.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {
	CreditCard findBySsn(String ssn);

}
