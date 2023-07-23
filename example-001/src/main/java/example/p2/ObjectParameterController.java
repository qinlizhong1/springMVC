package example.p2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ObjectParameterController {
    @RequestMapping("/t3")
    public String testParameter1(User user){
        System.out.println("name---->" + user.getName());
        System.out.println("age---->" + user.getAge());

        return "success";
    }
}
