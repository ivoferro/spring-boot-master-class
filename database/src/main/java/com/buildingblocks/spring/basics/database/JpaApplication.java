package com.buildingblocks.spring.basics.database;

import com.buildingblocks.spring.basics.database.entities.Person;
import com.buildingblocks.spring.basics.database.jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PersonJpaRepository personJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	@Override
	public void run(String... args) {
        logger.info("-----------------------------------------------------------------------");

		Person person100001 = personJpaRepository.findById(100001);
		logger.info("Person with id 100001 -> {}", person100001);

        Person newPerson = new Person("Pedro", "Porto", new Date());
        Person person = personJpaRepository.insert(newPerson);
        logger.info("Inserted person -> {}", person);

        person.setLocation("Gaia");
        Person updatedPerson = personJpaRepository.update(person);
        logger.info("Updated person -> {}", updatedPerson);

        personJpaRepository.deleteById(100002);

        logger.info("All persons -> {}", personJpaRepository.findAll());

        logger.info("-----------------------------------------------------------------------");
	}
}
