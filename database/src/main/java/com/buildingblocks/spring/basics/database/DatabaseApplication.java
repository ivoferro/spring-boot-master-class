package com.buildingblocks.spring.basics.database;

import com.buildingblocks.spring.basics.database.data.PersonJdbcDao;
import com.buildingblocks.spring.basics.database.entities.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) {
		List<Person> persons = personJdbcDao.findAll();
		logger.info("All persons -> {}", persons);

		Person person100001 = personJdbcDao.findById(100001);
		logger.info("Person with id 100001 -> {}", person100001);

		int deletedRows = personJdbcDao.deleteById(100002);
        logger.info("Deleting person with id 100002 -> {}", deletedRows);
        persons = personJdbcDao.findAll();
        logger.info("All persons -> {}", persons);

        Person newPerson = new Person(100004, "Pedro", "Gaia", new Date());
        int insertedRows = personJdbcDao.insert(newPerson);
        logger.info("Inserting new person -> {}", insertedRows);
        persons = personJdbcDao.findAll();
        logger.info("All persons -> {}", persons);

        Person person100004 = personJdbcDao.findById(100004);
        person100004.setLocation("Porto");
        int updatedRows = personJdbcDao.update(person100004);
        logger.info("Updating person 100004 -> {}", updatedRows);
        persons = personJdbcDao.findAll();
        logger.info("All persons -> {}", persons);
        persons = personJdbcDao.findAllWithPersonRowMapper();
        logger.info("All persons -> {}", persons);
	}
}
