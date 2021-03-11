package net.codejava;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
	@Query("SELECT u FROM User u WHERE u.email = ?1")
	public User findByEmail(String email);
	
	
	@Query("SELECT p FROM User p WHERE CONCAT(p.firstName,p.email,p.PhoneNumber) LIKE %?1%")
	public List<User> search(String keyword);
	
}
