package com.buildingblocks.spring.basics.springin5steps;

import com.buildingblocks.spring.basics.springin5steps.basic.Search;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBasicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(SpringBasicApplication.class, args);

		Search searchAlgorithm = applicationContext.getBean(Search.class);
        System.out.println(searchAlgorithm.search(new int[] {}, 0));
	}
}
