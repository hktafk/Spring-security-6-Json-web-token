package vn.iotstar.demo_sitemesh_thymeleaf.config;

import org.springframework.context.annotation.Configuration;

@Configuration 
@EnableWebSecurity
public class SecurityConfig {
	@Bean
	// authentication
	public UserDetailsService userDetailsService (PasswordEncoder encoder) {
		UserDetails admin = User.withUsername("trung")
	}
			.password (encoder.encode("123"))
			.roles ("ADMIN")
			.build();
		UserDetails user = User.withUsername("user")
			.password (encoder.encode("123"))
			.roles ("USER")
			.build();
	return new InMemoryUserDetails Manager (admin, user);
}
	@Bean
	PasswordEncoder passwordEncoder() { 
		return new BCryptPasswordEncoder();
}
