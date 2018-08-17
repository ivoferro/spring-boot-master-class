package com.buildingblocks.spring.basics.springin5steps;

import com.buildingblocks.spring.basics.springin5steps.basic.Search;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringBasicApplication {

	public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringBasicApplication.class);

        System.out.println("------------------------------------------------------");
		Search searchAlgorithm = applicationContext.getBean(Search.class);
        System.out.println(searchAlgorithm.search(new int[] {}, 0));
        System.out.println("------------------------------------------------------");

        applicationContext.close();
	}
}
