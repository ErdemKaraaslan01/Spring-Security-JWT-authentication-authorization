package com.erdemkaraaslan.springsecurity;

import com.erdemkaraaslan.springsecurity.entities.Role;
import com.erdemkaraaslan.springsecurity.entities.User;
import com.erdemkaraaslan.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringsecurityApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityApplication.class, args);
	}

	public void run(String... args) throws Exception {
		User adminAccount = userRepository.findByRole(Role.ADMIN);

		if (adminAccount == null) {
			User user = new User();

			user.setEmail("admin@gmail.com");
			user.setFirstname("Admin");
			user.setSecondname("Admin");
			user.setRole(Role.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));

			userRepository.save(user);

		}
	}
}
