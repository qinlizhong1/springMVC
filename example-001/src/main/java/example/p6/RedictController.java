package example.p6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class RedictController {
    //根据 返回String 字符串进行重定向
    @RequestMapping("t6_4")
    public String testRedict1(){
        return "redirect:/innerredict";
    }

    //通过response进行重定向
    @RequestMapping("t6_5")
    public void testRedict2(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession) throws ServletException, IOException {
        httpSession.setAttribute("k", "通过request进行重定向过来");
        response.sendRedirect( request.getContextPath() + "/innerredict");
    }

    //通过ModelAndView进行重定向
    @RequestMapping("t6_6")
    public ModelAndView testRedict3(HttpServletRequest request, ModelAndView modelAndView) {
        modelAndView.addObject("k", "通过ModelAndView进行转发过来");
        modelAndView.setViewName("redirect:/innerredict");
        //modelAndView.setViewName("redirect:" + request.getContextPath() + "/redict");
        return modelAndView;
    }
}
