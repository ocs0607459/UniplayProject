package net.codejava;

import java.util.List;

import org.springframework.data.domain.Page;

public interface UserService {
	
	User getUserById(long id);
	void deleteUserById(long id);
	
}
