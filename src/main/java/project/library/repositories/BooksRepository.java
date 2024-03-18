package project.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.library.models.Book;
import project.library.models.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
    //List<Book> findByOwner(int id);

    Optional<Person> findByOwner_PersonId(int id);
}
