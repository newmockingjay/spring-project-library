package project.library.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import project.library.models.Book;
import project.library.models.Person;

import java.util.List;
import java.util.Optional;

@Component
public class PersonDAO {
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public PersonDAO(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public List<Person> catalog(){
//        return jdbcTemplate.query("SELECT * FROM Person", new PersonMapper());
//    }
//
//    public Person show(int id){
//        return jdbcTemplate.query("SELECT * FROM Person WHERE person_id=?",
//                        new Object[]{id}, new PersonMapper())
//                .stream().findAny().orElse(null);
//    }
//
//    //
//    public Person show(String name){
//        return jdbcTemplate.query("SELECT * FROM Person WHERE full_name=?",
//                        new Object[]{name}, new PersonMapper())
//                .stream().findAny().orElse(null);
//    }
//
//    public void save(Person person){
//        jdbcTemplate.update("INSERT INTO Person(full_name, birth_year) VALUES(?, ?)",
//                person.getFullName(), person.getBirthYear());
//    }
//
//    public void update(int id, Person updatedPerson){
//        jdbcTemplate.update("UPDATE Person SET full_name=?, birth_year=? WHERE person_id=?",
//                updatedPerson.getFullName(), updatedPerson.getBirthYear(), id);
//    }
//
//    public void delete(int id){
//        jdbcTemplate.update("DELETE FROM Person WHERE person_id=?", id);
//    }
//
//    public List<Book> getBooksByPersonId(int id){
//        return jdbcTemplate.query("SELECT * FROM Book WHERE person_id = ?",
//                new Object[]{id}, new BeanPropertyRowMapper<>(Book.class));
//    }
//

}
