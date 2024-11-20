package vn.iotstar.demo_sitemesh_thymeleaf.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor 
@NoArgsConstructor
@Data
public class LoginUserModel {
	private String email;
	private String password;
}
