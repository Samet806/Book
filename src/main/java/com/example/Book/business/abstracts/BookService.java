package com.example.Book.business.abstracts;

import com.example.Book.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

     List<Book> getAllBooks() ;
    Optional< Book> getBookByTitle(String title);

     Book addBook(Book book) ;

     Book updateBook(Long id, Book book) ;

     void deleteBook(Long id) ;

}
