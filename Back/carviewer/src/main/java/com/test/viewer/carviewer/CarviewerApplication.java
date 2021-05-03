package com.test.viewer.carviewer;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@ComponentScan(basePackages = {"com.test.viewer.carviewer.services"})
@ComponentScan({"com.delivery.request"})
@EntityScan("com.test.viewer.carviewer.model")
@EnableJpaRepositories("com.test.viewer.carviewer.repository")
@SpringBootApplication
public class CarviewerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarviewerApplication.class, args);
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

	    // Register resource handler for images
	    registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/images/")
	            .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CarviewerApplication.class);
    }

}
