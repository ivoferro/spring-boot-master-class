package com.buildingblocks.spring.basics.springin5steps;

import com.buildingblocks.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.buildingblocks.spring.basics.componentscan")
public class SpringComponentApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringComponentApplication.class);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);


        LOGGER.info("--------------------------------------------------------------------------");
        LOGGER.info("{}", componentDAO);
        LOGGER.info("--------------------------------------------------------------------------");

	}
}
