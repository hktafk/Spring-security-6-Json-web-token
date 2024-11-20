package vn.iotstar.demo_sitemesh_thymeleaf.repository;

@Repository
public class UserRepository extends JpaRepository<Users, Long>{
	 @Query("SELECT u FROM Users u WHERE u.username = :username")
	 public Users getUserByUsername(@Param("username") String username);
	 Optional<Users> findByEmail(String email);
	 Optional<Users> findByUsernameOrEmail(String username, String email);
	 Optional<Users> findByUsername(String username);
	 Boolean existsByUsername(String username);
	 Boolean existsByEmail(String email)
}
