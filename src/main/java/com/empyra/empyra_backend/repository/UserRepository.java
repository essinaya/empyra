package com.empyra.empyra_backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empyra.empyra_backend.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	// This interface will automatically provide CRUD operations for User entities.
	// You can add custom query methods if needed.
	// Example: findByEmail(String email) to find a user by their email address.
	
	User findByEmail(String email); // Example of a custom query method to find a user by their email
	
	Optional<User> findByUsername(String username); // Example of a custom query method to find a user by their username
	/* 
	Why You Do This:
	Optional<T> is a wrapper object introduced in Java 8. It represents a value that may or may not be present.

	So:

	If a User with that username exists, the method returns:
	Optional<User> → containing the user

	If no user is found, it returns:
	Optional.empty() → meaning nothing was found
	
	
	Why Use Optional Instead of Just User?
		1. ✅ Avoids NullPointerExceptions
		2. ✅ Encourages You to Handle Missing Data
		3. ✅ Works Well with Functional Style
		
	🧠 Summary
		Concept	Explanation
		Optional<T>	A container that may hold a value or be empty
		Why use it?	To avoid null checks and NullPointerException
		When used?	When a result may not exist (e.g., user not found)
	 */
	

}
