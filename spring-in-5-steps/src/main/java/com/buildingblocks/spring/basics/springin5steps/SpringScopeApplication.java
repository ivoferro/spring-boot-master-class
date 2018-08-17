package com.buildingblocks.spring.basics.springin5steps;

import com.buildingblocks.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext =
				SpringApplication.run(SpringScopeApplication.class, args);

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
