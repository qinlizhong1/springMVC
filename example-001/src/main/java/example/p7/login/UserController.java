package example.p7.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

// 默认情况下，Controller 是单例的。也就是说，在应用程序中只会创建一个 UserController 实例
@Controller
public class UserController {
    Map<String, String> usersMap = new HashMap<>(){{put("admin", "123456"); put("a", "123456");}};
    @RequestMapping("/login")
    public String login(HttpSession httpSession, String name, String password)  {
        if(usersMap.containsKey(name) && usersMap.get(name).equals(password)){
            System.out.println(name + ": 成功登录\n");
            httpSession.setAttribute("username", name);
            return "login/ssucces";
        }else {
            System.out.println("用户名或密码错误");
            return "/login/error";
        }
    }

    @RequestMapping("/add")
    public String login() {
        System.out.println("----------  执行增加用户操作 --------\n");
        return "login/pass";
    }

    @RequestMapping("/del")
    public String del() {
        System.out.println("----------  执行删除用户操作 --------\n");
        return "login/pass";
    }

    @RequestMapping("/logout")
    public void logout(HttpSession session) {
        session.invalidate();
        System.out.println("----------  退出登录 --------\n");
    }
}
