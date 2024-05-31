package com.sunlife.hakathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class PersonalFinanceManagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalFinanceManagementAppApplication.class, args);
		System.out.println("Personal Finance App Started!!");
	}
	
	  @Bean
	    public CorsFilter corsFilter() {
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        CorsConfiguration config = new CorsConfiguration();
	        config.setAllowCredentials(true);
	        // Update the allowed origins to your frontend URL or use "*" for all origins
	        config.addAllowedOrigin("http://localhost:3000");
	        config.addAllowedHeader("*");
	        config.addAllowedMethod("*");
	        source.registerCorsConfiguration("/**", config);
	        return new CorsFilter(source);
	    }
}
