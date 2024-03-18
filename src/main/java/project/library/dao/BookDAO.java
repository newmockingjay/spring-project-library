package project.library.dao;

import jakarta.persistence.EntityManagerFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import project.library.models.Book;
import project.library.models.Person;

import java.util.List;
import java.util.Optional;

@Component
public class BookDAO {
//    private final EntityManagerFactory entityManagerFactory;
//
//    @Autowired
//    public BookDAO(EntityManagerFactory entityManagerFactory) {
//        this.entityManagerFactory = entityManagerFactory;
//    }

//    public List<Book> catalog(){
//        return jdbcTemplate.query("SELECT * FROM Book", new BeanPropertyRowMapper<>(Book.class));
//    }
//
//    public Book show(int id){
//        return jdbcTemplate.query("SELECT * FROM Book WHERE book_id=?",
//                new Object[]{id}, new BeanPropertyRowMapper<>(Book.class))
//                .stream().findAny().orElse(null);
//    }
//
//    public void save(Book book){
//        jdbcTemplate.update("INSERT INTO Book(name, author, year) VALUES (?, ?, ?)",
//                book.getName(), book.getAuthor(), book.getYear());
//    }
//
//    public void update(int id, Book book){
//        jdbcTemplate.update("UPDATE Book SET name=?, author=?, year=? WHERE book_id=?",
//                book.getName(), book.getAuthor(), book.getYear(), id);
//    }
//
////    public void updatePersonId(int id, int personId){
////        jdbcTemplate.update("UPDATE Book SET person_id=? WHERE book_id=?",
////                personId, id);
////    }
//
//    public void delete(int id){
//        jdbcTemplate.update("DELETE FROM Book WHERE book_id=?", id);
//    }
//
//
//    // Join'им таблицы Book и Person и получаем человека, которому принадлежит книга с указанным id
//    public Optional<Person> getBookOwner(int id) {
//        // Выбираем все колонки таблицы Person из объединенной таблицы
//        return jdbcTemplate.query("SELECT Person.* FROM Book JOIN Person ON Book.person_id = Person.person_id " +
//                        "WHERE Book.book_id = ?", new Object[]{id}, new BeanPropertyRowMapper<>(Person.class))
//                .stream().findAny();
//    }

    // Освбождает книгу (этот метод вызывается, когда человек возвращает книгу в библиотеку)
//    public void release(int id) {
//        entityManagerFactory.
//                update("UPDATE Book SET person_id=NULL WHERE book_id=?", id);
//    }
//
//    // Назначает книгу человеку (этот метод вызывается, когда человек забирает книгу из библиотеки)
//    public void assign(int id, Person selectedPerson) {
//        jdbcTemplate.update("UPDATE Book SET person_id=? WHERE book_id=?", selectedPerson.getPersonId(), id);
//    }
}
