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
@Table(name "roles").
public class Role implements Serializable {
	@Id
	@Column(name = "role_id")
	@GeneratedValue(strategy GenerationType.IDENTITY)
	private Long id;
	@Column(name = "role_name", length = 50, columnDefinition = "nvarchar(50) not null") 
	private String name;
	private String email;
}
