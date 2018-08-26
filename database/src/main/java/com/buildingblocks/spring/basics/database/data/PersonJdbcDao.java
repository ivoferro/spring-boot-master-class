package com.buildingblocks.spring.basics.database.data;

import com.buildingblocks.spring.basics.database.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private class PersonRowMapper implements RowMapper<Person> {
        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new Person(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("location"),
                rs.getTimestamp("birthdate")
            );
        }
    }

    public List<Person> findAll() {
        return jdbcTemplate.query("SELECT * FROM PERSON", new BeanPropertyRowMapper<>(Person.class));
    }

    public List<Person> findAllWithPersonRowMapper() {
        return jdbcTemplate.query("SELECT * FROM PERSON", new PersonRowMapper());
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM PERSON WHERE id = ?",
                new Object[] {id},
                new BeanPropertyRowMapper<>(Person.class));
    }

    public int deleteById(int id) {
        return jdbcTemplate.update(
                "DELETE FROM PERSON WHERE id = ?",
                new Object[] {id});
    }

    public int insert(Person person) {
        return jdbcTemplate.update(
                "INSERT INTO PERSON (id, name, location, birthdate) " +
                    "VALUES (?, ?, ?, ?)",
                new Object[] { person.getId(), person.getName(), person.getLocation(),
                        new Timestamp(person.getBirthdate().getTime())});
    }

    public int update(Person person) {
        return jdbcTemplate.update(
                "UPDATE PERSON " +
                    "SET name = ?, location = ?, birthdate = ? " +
                    "WHERE id = ?",
                new Object[] { person.getName(), person.getLocation(),
                        new Timestamp(person.getBirthdate().getTime()),
                        person.getId()});
    }
}
