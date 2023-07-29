package example.p2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParameterController {
    @RequestMapping("/t1")
    public String testParameter1(String name, Integer age){
        System.out.println("name---->" + name);
        System.out.println("age---->" + age);

        return "success";
    }

    @RequestMapping("/t2")
    public String testParameter2(@RequestParam("nickname") String name, Integer age){
        System.out.println("name---->" + name);
        System.out.println("age---->" + age);

        return "success";
    }
}
