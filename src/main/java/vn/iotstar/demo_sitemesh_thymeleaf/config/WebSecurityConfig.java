package vn.iotstar.demo_sitemesh_thymeleaf.config;

import org.springframework.context.annotation.Configuration;

import vn.iotstar.demo_sitemesh_thymeleaf.controllers.Customer.EnableMethodSecurity;

@Configuration
@EnableMethodSecurity
@EnableMethodSecurity
public class WebSecurityConfig {
	@Autowired
	private CustomUserDetailsService userDetailsService;
	@Bean
	public UserDetailsService userDetails

	Service() { return new UserServiceImpl();
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthentication Provider

	authenticationProvider() {
	DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider(); authProvider.setUserDetailsService (userDetailsService()); authProvider.setPasswordEncoder (passwordEncoder());
	return authProvider;
	}

	protected void configure(AuthenticationManagerBuilder auth) throws Exception { auth.userDetailsService (userDetailsService)
	}.passwordEncoder(passwordEncoder());
}
