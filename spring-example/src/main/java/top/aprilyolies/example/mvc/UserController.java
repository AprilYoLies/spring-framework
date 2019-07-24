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
//public class UserController extends AbstractController {
public class UserController {
    //    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("---------UserController--------");
        List<User> users = new ArrayList<User>();

        User user1 = new User();
        user1.setPassword("kuaile1..");
        user1.setUsername("张胜1" + UUID.randomUUID().toString().substring(0, 3));
        user1.setPhone(UUID.randomUUID().toString().substring(0, 12));
        user1.setEmail(UUID.randomUUID().toString().substring(0, 10) + "@1qq.com");
        user1.setCreated(new Date());
        user1.setUpdated(new Date());

        User user2 = new User();
        user2.setUsername("张胜2" + UUID.randomUUID().toString().substring(0, 3));
        user2.setPhone(UUID.randomUUID().toString().substring(0, 12));
        user2.setPassword("kuaile1..");
        user2.setCreated(new Date());
        user2.setEmail(UUID.randomUUID().toString().substring(0, 10) + "@2qq.com");
        user2.setUpdated(new Date());

        users.add(user1);
        users.add(user2);
        return new ModelAndView("userlist", "users", users);
    }


    //    @ResponseBody
    @RequestMapping("/hello")
    public ModelAndView hello() {
        System.out.println("accessed....");
        User user = new User();
        user.setUsername("eva");
        User user1 = new User();
        user1.setUsername("hua");
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        ModelAndView mv = new ModelAndView("userlist", "users", users);
        return mv;
    }
}
