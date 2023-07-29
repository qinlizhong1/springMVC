package example.p3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TypeConvertController {
    @RequestMapping("/t3_1")
    public String testParameter1(User user){
        System.out.println("name---->" + user.getName());
        System.out.println("birthday---->" + user.getBirthday());

        return "success";
    }
}
