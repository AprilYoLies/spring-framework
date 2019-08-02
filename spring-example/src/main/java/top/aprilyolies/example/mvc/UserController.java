package top.aprilyolies.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/hello")
	public ModelAndView hello() {
		System.out.println("accessed....");
		User user = new User();
		user.setName("eva");
		User user1 = new User();
		user1.setName("johnson");
		ArrayList<User> users = new ArrayList<>();
		users.add(user);
		users.add(user1);
		ModelAndView mv = new ModelAndView("userlist", "users", users);
		return mv;
	}
}
