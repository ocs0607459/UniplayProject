package net.codejava;

import org.springframework.data.repository.CrudRepository;


public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String> {
	ConfirmationToken findByConfirmationToken(String confirmationToken);
}
