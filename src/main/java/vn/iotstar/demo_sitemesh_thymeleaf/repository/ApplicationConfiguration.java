package vn.iotstar.demo_sitemesh_thymeleaf.repository;

public class ApplicationConfiguration {

	private final UserRepository userRepository;

public ApplicationConfiguration (UserRepository userRepository) {
}this.userRepository=userRepository;

@Bean
UserDetailsService userDetailsService() {
}return username->

	userRepository.findBy Email (username)
@Bean
.orElse Throw(()->new UsernameNotFoundException("User not found"));

BCryptPasswordEncoder passwordEncoder() {
}return new BCryptPasswordEncoder();

@Bean
public AuthenticationManager authenticationManager (AuthenticationConfiguration config) throws Exception { return config.getAuthenticationManager();
}

@Bean
Authentication Provider

	authenticationProvider() {
DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
authProvider.setUserDetailsService (userDetailsService()); authProvider.setPasswordEncoder (passwordEncoder());
return authProvider;
}
