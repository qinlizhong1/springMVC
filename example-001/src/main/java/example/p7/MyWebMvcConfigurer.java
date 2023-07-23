package example.p7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    private final MyHandlerInterceptor myHandlerInterceptor;

    @Autowired
    public MyWebMvcConfigurer(MyHandlerInterceptor myInterceptor) {
        this.myHandlerInterceptor = myInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 可以添加多个拦截器，先添加的拦截器，先被应用
        registry.addInterceptor(myHandlerInterceptor)
                .addPathPatterns("/t7_2");              // 应用到所有 URL 上
                //.excludePathPatterns("/error")        // 表示需要排除的 URL。
    }
}
