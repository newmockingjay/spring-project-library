package project.library.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;

public class Book {
    private int bookId;

   // private int personId;
    @NotEmpty(message = "Поле имени не должно быть пустым")
    private String name;
    @NotEmpty(message = "Поле с именем автора не должно быть пустым")
    private String author;
    @Min(value = 0, message = "Год не может быть отрицательным")
    private int year;

    public Book(String name, String author, int year) {
        // this.bookId = id;
        //this.personId = person_id;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public Book() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

//    public int getPersonId() {
//        return personId;
//    }

//    public void setPersonId(int personId) {
//        this.personId = personId;
//    }
}
