package com.empyra.empyra_backend.config;

import java.util.Date;
import java.util.List;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.empyra.empyra_backend.entities.Roles;
import com.empyra.empyra_backend.entities.User;
import com.empyra.empyra_backend.enums.UserRoles;
import com.empyra.empyra_backend.enums.UserStatus;
import com.empyra.empyra_backend.repository.RoleRepository;
import com.empyra.empyra_backend.repository.UserRepository;

@Component
public class DataInitializer implements CommandLineRunner {
	
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private UserRepository userRepository;
	

	@Override
	public void run(String... args) throws Exception {
		// This method will be called after the application context is loaded.
		// You can initialize your data here.
		
		// Example: Initialize roles, users, etc.
		// This is where you would typically call your repository methods to save initial data.
		
		//Seed roles (Translation: inserting roles into the database without using SQL/database scripts)
		if (roleRepository.count() == 0) {
			for(UserRoles role : UserRoles.getAllRoles()) {
				Roles newRole = new Roles();
				newRole.setRoleName(role.toString());
				roleRepository.save(newRole);
			}
			System.out.println("✅ Roles seeded.");
		}
		
		
		
		//seed default admin user
		if(userRepository.count() == 0) {
			//get admin role in role repository. get admin role in the database
			Roles adminRole = roleRepository.findByName(UserRoles.ADMIN.toString());
			
			User admin = new User();
			admin.setUsername("EmpyraAdmin");
			admin.setPassword("admin"); // Password should be hashed in a real application
			admin.setEmail("empyraAdmin@mooglemail-ishgard.com");
			admin.setUserFirstName("Essinaya");
			admin.setUserMiddleName("Caelumrisch");
			admin.setUserLastName("-De Borel");
			admin.setRole(adminRole.getId().intValue()); // Assuming role is stored as an ID
			admin.setEnabled(UserStatus.ACTIVE.getDescription());
			admin.setCreatedAt(new Date());//might need to change format
			
			roleRepository.save(adminRole);
			System.out.println("✅ Admin user seeded.");
			
		}
	}
	
		
	
}
