package top.aprilyolies.example.tx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.UUID;

public class TxApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-tx.xml");
		UserService userService = (UserService) context.getBean("userService");
		User user = new User();
		user.setSex("man");
		user.setName("eva");
		user.setAge(23);
		userService.save(user);
	}
}
