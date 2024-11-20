package vn.iotstar.demo_sitemesh_thymeleaf.config;

import org.springframework.context.annotation.Configuration;

@Configuration 
@EnableWebSecurity
public class SecurityConfig {
	@Autowired
	UserInfoRepository repository;
	// authentication
	@Bean
	UserDetailsService userDetailsService() {
	}
	return new UserInfoService (repository);
	@Bean
	PasswordEncoder passwordEncoder() {
	}
	@Bean
	return new BCryptPasswordEncoder();
	AuthenticationProvider authenticationProvider(){
	DaoAuthenticationProvider authenticationProvider=new
	DaoAuthenticationProvider();
	}
	authenticationProvider.setUserDetailsService (userDetailsService()); authenticationProvider.setPasswordEncoder (passwordEncoder());
	return authenticationProvider;
	//security 6.1+
	@Bean
	SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {
	return http.csrf(csrf -> csrf.disable())
	.authorizeHttpRequests (auth -> auth
	.requestMatchers("/user/new"). permitAll()
	.requestMatchers ("/").permitAll()
	.requestMatchers("/customer/**").authenticated()
	//.anyRequest().authenticated()
	.formLogin(Customizer.withDefaults())
	.build();
	}
}
