package com.example.Book.controller.abstracts;

import com.example.Book.entities.Book;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface BookController {
    List<Book> getAllBooks() ;
    Book getBookByTitle(String title);

    Book addBook(Book book) ;

    Book updateBook(Long id, Book book) ;

    void deleteBook(Long id) ;
}
