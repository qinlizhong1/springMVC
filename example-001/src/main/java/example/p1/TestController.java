package example.p1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/p1")
    public String first(){
        System.out.println("-----我的第一个springMVC程序执行了--");
        return "hello";
    }
}
