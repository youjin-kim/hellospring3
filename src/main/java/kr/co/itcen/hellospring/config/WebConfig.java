package kr.co.itcen.hellospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc  // 자동으로 기본 HandlerMapping, ViewResolver, MessageConverter를 만들어줌, if 있으면 만들어져 있는 걸 사용
@ComponentScan({"kr.co.itcen.hellospring.controller"}) // auto scan
public class WebConfig {

	/*
	@Bean // User 객체가 하나 생김
	public User user() {
		return new User();
	}
	*/
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setExposeContextBeansAsAttributes(true);
		
		return viewResolver;
	}
}
