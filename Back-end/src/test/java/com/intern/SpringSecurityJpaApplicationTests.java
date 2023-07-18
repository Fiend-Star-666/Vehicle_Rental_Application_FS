package com.intern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
public class SpringSecurityJpaApplicationTests {

    //@Autowired
    //UserRepository userRepo;
    @Test
    public void contextLoads() {
    }
	/*
	@Test
	public void addingAccount() {
		User user1=new User();
		
		user1.setUserName("Fiend");
		user1.setPassword("Star");
		user1.setRoles("ROLE_ADMIN");
		user1.setActive(true);
		
		User user2=new User();
		
		user2.setUserName("Gursimran");
		user2.setPassword("Singh");
		user2.setRoles("ROLE_USER");
		user2.setActive(true);
		
		userRepo.save(user1);
		userRepo.save(user2);
	}
	*/

}
