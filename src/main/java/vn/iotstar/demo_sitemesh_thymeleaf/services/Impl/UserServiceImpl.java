package vn.iotstar.demo_sitemesh_thymeleaf.services.Impl;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

	@Autowired
	private UserRepository userRepository;

	}

@Override

	public UserDetails loadUserByUsername(String username)

	throws UsernameNotFoundException {

	Users user = userRepository.getUserByUsername (username);
	9 public class MyUserService implements UserDetails {

	private static final long serialVersionUID
	private Users user;
	public MyUserService (Users user) {
	this.user = user;
	@Override
	1L;
	public Collection<? extends GrantedAuthority> getAuthorities() { Set<Role> roles = user.getRoles();
	List<SimpleGrantedAuthority> authorities = new ArrayList<>(); for (Role role: roles) {
	authorities.add(new SimpleGrantedAuthority (role.getName()));

	}

	if (user == null) {

	return authorities;

	throw new UsernameNotFoundException("Could not find user");
	}

	}
	@Override

	public String getPassword() {

	@Override

	return new MyUserService(user);

	}
	}
}

	public String getUsername() {

	}

	return user.getPassword();@Override

	}return user.getUsername();

	@Override
	public boolean isAccountNonExpired() { return true;
	}

	@Override
	public boolean isAccountNonLocked() { return true;

	@Override
	public boolean isCredentials

	Non Expired() {
	}return true;

	public boolean isEnabled() {

	return user.isEnabled();

	}
}}
