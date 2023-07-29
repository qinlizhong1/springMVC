package example.p7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {
    @RequestMapping("t7_1")
    public String testInterceptor(){
        System.out.println("Interceptor test!!");
        return "success";
    }

    @RequestMapping("t7_2")
    public String testInterceptor2(){
        System.out.println("Interceptor test2!!");
        return "success";
    }
}
