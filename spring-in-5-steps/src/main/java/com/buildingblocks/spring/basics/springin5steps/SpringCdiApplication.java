package com.buildingblocks.spring.basics.springin5steps;

import com.buildingblocks.spring.basics.springin5steps.cdi.scope.CdiPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCdiApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringCdiApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext =
				SpringApplication.run(SpringCdiApplication.class, args);

        CdiPersonDAO cdiPersonDAO = applicationContext.getBean(CdiPersonDAO.class);


        LOGGER.info("--------------------------------------------------------------------------");
        LOGGER.info("{}", cdiPersonDAO);
        LOGGER.info("{}", cdiPersonDAO.getCdiJdbcConnection());
        LOGGER.info("--------------------------------------------------------------------------");

	}
}
