package code_SCH.project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")// 모든 origin 허용, 필요에 따라 특정 origin만 허용할 수도 있음
                .allowedOrigins("https://to-do-list-client-two.vercel.app", "http://192.168.0.108:3000", "http://192.168.0.104:3000", "https://code-sch-client.vercel.app")
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 허용할 HTTP 메서드 지정
                .allowedHeaders("*"); // 모든 헤더 허용

    }
    /*@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/user/{userId}").setViewName("forward:/index.html");
    }*/


}
