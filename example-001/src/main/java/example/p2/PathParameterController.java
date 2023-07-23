package example.p2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathParameterController {
    @RequestMapping("/t4/{name}/{age}")
    public String testParameter1(@PathVariable("name") String name, @PathVariable("age") Integer age){
        System.out.println("name---->" + name);
        System.out.println("age---->" + age);

        return "success";
    }
}
