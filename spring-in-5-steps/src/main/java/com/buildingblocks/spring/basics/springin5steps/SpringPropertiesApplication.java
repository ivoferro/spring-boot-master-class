package com.buildingblocks.spring.basics.springin5steps;

import com.buildingblocks.spring.basics.springin5steps.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringPropertiesApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringPropertiesApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringPropertiesApplication.class);

        SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);


        LOGGER.info("--------------------------------------------------------------------------");
        LOGGER.info("{}", someExternalService);
        LOGGER.info("{}", someExternalService.getUrl());
        LOGGER.info("--------------------------------------------------------------------------");

	}
}
