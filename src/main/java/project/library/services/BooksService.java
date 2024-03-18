package project.library.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.library.models.Book;
import project.library.models.Person;
import project.library.repositories.BooksRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class BooksService {

    private final BooksRepository booksRepository;

    @Autowired
    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> findAll(){
        return booksRepository.findAll();
    }

    public Book findOne(int id){
        Optional<Book> book = booksRepository.findById(id);
        return  book.orElse(null);
    }

    @Transactional
    public void save(Book book){
        booksRepository.save(book);
    }

    @Transactional
    public void update(int id, Book updatedBook){
        updatedBook.setBookId(id);
        booksRepository.save(updatedBook);
    }

    @Transactional
    public void delete(int id){
        booksRepository.deleteById(id);
    }

    public Optional<Person> getOwner(int id){
        return booksRepository.findById(id).map(Book::getOwner);
    }

    @Transactional
    public void release(int id) {
                ///update("UPDATE Book SET person_id=NULL WHERE book_id=?", id);
        booksRepository.findById(id).ifPresent(
                book -> {
                    book.setOwner(null);
                }
        );
    }


    // Назначает книгу человеку (этот метод вызывается, когда человек забирает книгу из библиотеки)
    @Transactional
    public void assign(int id, Person selectedPerson) {
        //update("UPDATE Book SET person_id=? WHERE book_id=?", selectedPerson.getPersonId(), id);
        booksRepository.findById(id).ifPresent(
                book -> {
                    book.setOwner(selectedPerson);
                }
        );
    }
}
