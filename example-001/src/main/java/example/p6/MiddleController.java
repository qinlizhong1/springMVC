package example.p6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class MiddleController {
    @RequestMapping("innerfoward")
    public void f(HttpServletRequest request, HttpServletResponse response){
        System.out.println("k--->" + request.getAttribute("k"));
    }

    @RequestMapping("innerredict")
    public void fd(HttpServletRequest request, HttpSession httpSession){
        System.out.println("k--->" + httpSession.getAttribute("k"));
    }
}
