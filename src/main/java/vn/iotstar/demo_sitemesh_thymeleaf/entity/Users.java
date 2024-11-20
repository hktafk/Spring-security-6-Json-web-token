package vn.iotstar.demo_sitemesh_thymeleaf.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
@Entity
@Table(name = "users")
public class Users {
		@Id
		@Column(name = "user_id")
		@Column(length 60, columnDefinition = "nvarchar(50) not null")
		private String name;
		private String password;
		@GeneratedValue(strategy
		private Long id;
		private String username;
		@Email
		private boolean enabled;
		@ManyToMany(cascade CascadeType.ALL, fetch FetchType.EAGER) @JoinTable(
		name = "users_roles",
		joinColumns= @JoinColumn(name = "user_id"),
		inverseJoinColumns= @JoinColumn(name = "role_id")
		private Set<Role> roles = new HashSet<>();
	}
}
