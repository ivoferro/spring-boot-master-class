package com.buildingblocks.spring.basics.database.springdata;

import com.buildingblocks.spring.basics.database.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataJpaRepository extends JpaRepository<Person, Integer> {
}
