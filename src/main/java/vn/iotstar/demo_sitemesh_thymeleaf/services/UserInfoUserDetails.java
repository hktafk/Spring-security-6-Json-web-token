package vn.iotstar.demo_sitemesh_thymeleaf.services;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoUserDetails implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private String password;
	private List<GrantedAuthority> authorities;
	public UserInfoUserDetails (UserInfo userInfo) {
	}
	name userInfo.getName();
	password= userInfo.getPassword();
	authorities Arrays.stream(userInfo.getRoles().split(","))
	@Override
	.map(SimpleGrantedAuthority::new) .collect(Collectors.toList());
	public Collection<? extends GrantedAuthority> getAuthorities() { return authorities;
	}
	@Override
	public String getPassword() {
	return password;
	@Override
	public String getUsername() {
	}
	return name;
	@Override
	public boolean isAccountNonExpired() { return true;
	}
	@Override
	public boolean isAccountNonLocked() { return true;
	}
	@Override
	public boolean isCredentialsNonExpired() { return true;
	}
	@Override
	public boolean isEnabled() {
	}
	}
	return true;
}
