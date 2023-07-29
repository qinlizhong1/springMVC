package example.p7;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHandlerInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws java.lang.Exception {
        //这里可以写具体要执行的拦截功能，如权限验证等，这里就简单的打印一句话
        System.out.println("拦截器放行通过");
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @org.springframework.lang.Nullable org.springframework.web.servlet.ModelAndView modelAndView) throws java.lang.Exception {
        System.out.println("MyHandlerInterceptor.postHandle()");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @org.springframework.lang.Nullable java.lang.Exception ex) throws java.lang.Exception {
        System.out.println("MyHandlerInterceptor.afterCompletion");
    }
}
