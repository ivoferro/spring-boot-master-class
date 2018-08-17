package com.buildingblocks.spring.basics.springin5steps;

import com.buildingblocks.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringScopeApplication.class);

        PersonDAO aPersonDAO = applicationContext.getBean(PersonDAO.class);
        PersonDAO anotherPersonDAO = applicationContext.getBean(PersonDAO.class);


        LOGGER.info("--------------------------------------------------------------------------");
        LOGGER.info("{}", aPersonDAO);
        LOGGER.info("{}", aPersonDAO.getJdbcConnection());
        LOGGER.info("{}", anotherPersonDAO);
        LOGGER.info("{}", anotherPersonDAO.getJdbcConnection());
        LOGGER.info("--------------------------------------------------------------------------");

	}
}
