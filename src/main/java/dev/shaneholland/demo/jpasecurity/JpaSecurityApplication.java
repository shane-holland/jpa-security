package dev.shaneholland.demo.jpasecurity;

import dev.shaneholland.demo.jpasecurity.model.Post;
import dev.shaneholland.demo.jpasecurity.model.User;
import dev.shaneholland.demo.jpasecurity.repository.PostRepository;
import dev.shaneholland.demo.jpasecurity.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class JpaSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaSecurityApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(final PostRepository posts, final UserRepository users, final PasswordEncoder encoder) {
		return args -> {
			users.save(new User("user", encoder.encode("password"), "ROLE_USER"));
			users.save(new User("admin", encoder.encode("password"), "ROLE_USER,ROLE_ADMIN"));
			posts.save(new Post("Hello World", "hello-world", "Welcome to my blog!", "Shane Holland"));
		};
	}

}
