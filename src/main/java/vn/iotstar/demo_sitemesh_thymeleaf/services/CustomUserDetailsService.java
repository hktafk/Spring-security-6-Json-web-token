package vn.iotstar.demo_sitemesh_thymeleaf.services;

import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	private UserRepository userRepository;

	public CustomUserDetailsService (UserRepository userRepository) {
	}this.userRepository=userRepository;

	@Override
	public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException { 
		Users user =

	userRepository.findByUsernameOr Email (usernameOr Email, username Or Email) .orElse Throw(() ->
	}

	}}}new UsernameNotFoundException("User not found with username or email:"+usernameOrEmail));return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),

	mapRoles ToAuthorities (user.getRoles()));

	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Set<Role> roles) {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
}
