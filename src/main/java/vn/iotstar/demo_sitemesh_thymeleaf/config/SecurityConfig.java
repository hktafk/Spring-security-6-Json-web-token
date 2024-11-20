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
	}return new UserInfoService(repository);

	@Bean
	PasswordEncoder passwordEncoder() {
	}

	@Bean
	return new BCryptPasswordEncoder();
	AuthenticationProvider authenticationProvider(){
	DaoAuthenticationProvider authenticationProvider=new
	DaoAuthenticationProvider();
	}authenticationProvider.setUserDetailsService(userDetailsService()); authenticationProvider.setPasswordEncoder (passwordEncoder());
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

	private final AuthenticationProvider authenticationProvider;
	private final JwtAuthenticationFilter jwtAuthenticationFilter;

public SecurityConfiguration(
) {
}

	JwtAuthenticationFilter jwtAuthenticationFilter, AuthenticationProvider authenticationProvider this.authentication Provider authenticationProvider;this.jwtAuthenticationFilter=jwtAuthenticationFilter;

	// Configuring HttpSecurity
	@Bean
	public SecurityFilterChain filterChain (HttpSecurity httpSecurity) throws Exception {
	return httpSecurity
	.csrf(csrf-> csrf.disable())
	}.authorizeHttpRequests(auth->auth
	// .requestMatchers("/**").permitAll()
	.requestMatchers("/auth/**").permitAll().requestMatchers("/login**").permitAll().requestMatchers("/user/**").permitAll()).requestMatchers(new AntPathRequestMatcher("/images/**")).permitAll().requestMatchers(new AntPathRequestMatcher("/js/**")).permitAll().anyRequest().authenticated().sessionManagement(management->management.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).authenticationProvider(authenticationProvider).addFilterBefore(jwtAuthenticationFilter,

	Username PasswordAuthenticationFilter.class).build();

	@Bean
	CorsConfigurationSource corsConfigurationSource() {
	CorsConfiguration configuration = new CorsConfiguration();
	configuration.setAllowedOrigins (List.of("http://localhost:8005"));

	configuration.setAllowed Methods (List.of("HEAD", "GET", "POST", "PUT", "DELETE", "PATCH"));
	configuration.setAllowCredentials(true);
	configuration.setAllowedHeaders (List.of("Authorization", "Content-Type", "Cache-Control"));
	UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	source.registerCorsConfiguration("/**", configuration);
	return source;
	}
}}
