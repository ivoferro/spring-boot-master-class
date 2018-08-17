package com.buildingblocks.spring.basics.springin5steps;

import com.buildingblocks.spring.basics.springin5steps.cdi.scope.CdiPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringCdiApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringCdiApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringCdiApplication.class);

        CdiPersonDAO cdiPersonDAO = applicationContext.getBean(CdiPersonDAO.class);


        LOGGER.info("--------------------------------------------------------------------------");
        LOGGER.info("{}", cdiPersonDAO);
        LOGGER.info("{}", cdiPersonDAO.getCdiJdbcConnection());
        LOGGER.info("--------------------------------------------------------------------------");

	}
}
