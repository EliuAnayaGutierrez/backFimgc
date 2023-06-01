package edu.unsch.figmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	
	/*@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:5173/").allowedMethods("*").allowedHeaders("*");
		}
		};
	}*/
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:5173").allowedMethods("*").allowedHeaders("*");
			}
		};
	}
	
	/*  @Bean
	  public WebMvcConfigurer corsConfigurer() {
	    return new WebMvcConfigurer() {
	      
	    	@Override
	    	public void addCorsMappings(CorsRegistry registry) {
	    			registry.addMapping("/api/**")
	                .allowedOrigins("*")
	                .allowedMethods("GET", "POST", "PUT", "DELETE")
	                .allowedHeaders("*")
	                .exposedHeaders("Authorization")
	                .allowCredentials(true)
	                .maxAge(3600);
	      }
	  };
	}*/
	  
	
	
}