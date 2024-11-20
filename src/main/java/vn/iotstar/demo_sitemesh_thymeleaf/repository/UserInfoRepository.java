package vn.iotstar.demo_sitemesh_thymeleaf.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserInfoRepository extends JpaRepository<UserInfo, Integer>{
	Optional<UserInfo> findByName(String Username);
}
