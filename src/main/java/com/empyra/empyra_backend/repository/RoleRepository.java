package com.empyra.empyra_backend.repository;

import javax.management.relation.Role;

import org.springframework.stereotype.Repository;

import com.empyra.empyra_backend.entities.Roles;

@Repository
public interface RoleRepository extends org.springframework.data.jpa.repository.JpaRepository<Roles, Long> {
	// This interface will automatically provide CRUD operations for Role entities.
	// You can add custom query methods if needed.
	//	Why You Do This:
	//		Tells Spring how to perform CRUD operations (save, findById, findAll, etc.) for Role objects.
	//		The findByName(String name) method lets you search for roles like "ADMIN" when assigning to a user.
	
	Roles findByName(String name); // Example of a custom query method to find a role by its name

	Roles save(Roles newRole);

}
