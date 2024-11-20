package vn.iotstar.demo_sitemesh_thymeleaf.repository;

@Repository
public class RoleRepository extends JpaRepository<Role, Long> {
	@Query("SELECT u FROM Role u WHERE u.name = :name")
	 public Role getUserByName(@Param("name") String name);
	 Optional<Role> findByName(String name);
}
