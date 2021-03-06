package wooteco.subway.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import wooteco.subway.web.prehandler.BearerAuthInterceptor;
import wooteco.subway.web.prehandler.LoginMemberMethodArgumentResolver;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    private final BearerAuthInterceptor bearerAuthInterceptor;
    private final LoginMemberMethodArgumentResolver loginMemberArgumentResolver;

    public WebMvcConfig(
        BearerAuthInterceptor bearerAuthInterceptor,
        LoginMemberMethodArgumentResolver loginMemberArgumentResolver) {
        this.bearerAuthInterceptor = bearerAuthInterceptor;
        this.loginMemberArgumentResolver = loginMemberArgumentResolver;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(bearerAuthInterceptor).
            addPathPatterns("/**");
    }

    @Override
    public void addArgumentResolvers(List argumentResolvers) {
        argumentResolvers.add(loginMemberArgumentResolver);
    }
}
