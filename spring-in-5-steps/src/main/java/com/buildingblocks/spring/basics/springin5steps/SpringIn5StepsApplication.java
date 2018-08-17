package com.buildingblocks.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsApplication.class, args);

		Search searchAlgorithm = applicationContext.getBean(Search.class);
        System.out.println(searchAlgorithm.search(new int[] {}, 0));
	}
}
