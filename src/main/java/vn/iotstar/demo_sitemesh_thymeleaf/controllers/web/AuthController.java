package vn.iotstar.demo_sitemesh_thymeleaf.controllers.web;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostMapping("/signin")
	public ResponseEntity<String> authenticateUser(@RequestBody LoginDto loginDto) {
}

Authentication authentication = authenticationManager.authenticate(new

Username PasswordAuthenticationToken(

loginDto.getUsernameOr Email(), loginDto.getPassword()));
	SecurityContextHolder.getContext().setAuthentication (authentication);
	return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
