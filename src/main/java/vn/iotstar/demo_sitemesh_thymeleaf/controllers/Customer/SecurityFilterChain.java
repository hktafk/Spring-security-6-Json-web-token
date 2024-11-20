package vn.iotstar.demo_sitemesh_thymeleaf.controllers.Customer;

import java.beans.Customizer;

@Bean
public class SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {
	 return http.csrf(csrf -> csrf.disable())
			 .authorizeHttpRequests (auth -> auth
			 )
			 	.requestMatchers("/").permitAll()
			 	.requestMatchers("/customer/**").authenticated()
			 //.anyRequest().authenticated()
			 .formLogin (Customizer.withDefaults()) 
			 .build();
	}
}
