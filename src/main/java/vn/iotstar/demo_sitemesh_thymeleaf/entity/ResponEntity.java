package vn.iotstar.demo_sitemesh_thymeleaf.entity;

public class ResponEntity {
	// add check for username exists in a DB
	if(userRepository.existsByUsername(signUpDto.getUsername()))
	{
	}return new ResponseEntity<>("Username is already taken!",HttpStatus.BAD_REQUEST);
	// add check for email exists in DB
	if(userRepository.existsByEmail(signUpDto.getEmail()))
	{
	}return new ResponseEntity<>("Email is already taken!",HttpStatus.BAD_REQUEST);
	// create user object
	Users user = new Users();user.setName(signUpDto.getName());user.setUsername(signUpDto.getUsername());user.setEmail(signUpDto.getEmail());user.setEnabled(true);user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));
	Role roles = roleRepository.findByName("USER")
			.get();user.setRoles(Collections.singleton(roles));userRepository.save(user);

	return new ResponseEntity<>("User registered successfully", HttpStatus.OK);
}
