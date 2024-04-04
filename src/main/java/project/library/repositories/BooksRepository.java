package project.library.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.library.models.Book;
import project.library.models.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
    //List<Book> findByOwner(int id);
    Page<Book> findAll(Pageable var);
    List<Book> findAll(Sort var1);

    List<Book> findByNameStartingWith(String start);
}
