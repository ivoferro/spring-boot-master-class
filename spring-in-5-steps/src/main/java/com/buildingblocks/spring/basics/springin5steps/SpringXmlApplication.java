package com.buildingblocks.spring.basics.springin5steps;

import com.buildingblocks.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringXmlApplication.class);

	public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);


        LOGGER.info("--------------------------------------------------------------------------");
        LOGGER.info("Loaded beans: {}",
                (Object)applicationContext.getBeanDefinitionNames());

        LOGGER.info("{}", xmlPersonDAO);
        LOGGER.info("{}", xmlPersonDAO.getXmlJdbcConnection());
        LOGGER.info("--------------------------------------------------------------------------");

	}
}
