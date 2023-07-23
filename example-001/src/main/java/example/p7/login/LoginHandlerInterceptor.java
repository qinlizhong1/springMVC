package example.p7.login;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //这里可以写具体要执行的拦截功能，如权限验证等，这里就简单的打印一句话

        //未登录，跳转到登录界面
        if (StringUtils.isEmpty((String)request.getSession().getAttribute("username"))){
            response.sendRedirect(request.getContextPath() + "/login.jsp");
            return false;
        }
        System.out.println("已经登录过，放行");
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @org.springframework.lang.Nullable org.springframework.web.servlet.ModelAndView modelAndView) throws Exception {
        System.out.println("MyHandlerInterceptor.postHandle()");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @org.springframework.lang.Nullable Exception ex) throws Exception {
        System.out.println("MyHandlerInterceptor.afterCompletion");
    }
}
