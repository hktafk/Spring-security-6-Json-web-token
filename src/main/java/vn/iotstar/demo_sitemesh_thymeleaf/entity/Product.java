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
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy private Long id; = GenerationType.IDENTITY)
	@Column(columnDefinition = "nvarchar(255)")
	private String name;
	@Column(columnDefinition = "nvarchar(255)") }
	private String brand;
	@Column(columnDefinition = "nvarchar(255)") 
	private String madein; private float price;
}
