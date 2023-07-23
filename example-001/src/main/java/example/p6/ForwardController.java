package example.p6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ForwardController {
    //根据 返回String 字符串进行转发
    @RequestMapping("t6_1")
    public String testForward1(){
        //返回要跳转的jsp文件名。因为配置了视图解析器。因此不需要后缀和前面路径
        return "forward";
        //
        //return "foward:foward";
    }

    //通过request进行转发
    @RequestMapping("t6_2")
    public void testForward2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("k", "通过request进行转发过来");
        request.getRequestDispatcher("/innerfoward").forward(request, response);
    }

    //通过ModelAndView进行转发
    @RequestMapping("t6_3")
    public ModelAndView testForward3(ModelAndView modelAndView) {
        modelAndView.addObject("k", "通过ModelAndView进行转发过来");
        modelAndView.setViewName("forward");
        return modelAndView;
    }
}
